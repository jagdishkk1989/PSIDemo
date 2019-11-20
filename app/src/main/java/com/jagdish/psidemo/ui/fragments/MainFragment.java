package com.jagdish.psidemo.ui.fragments;

import android.arch.lifecycle.ViewModelProviders;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.jagdish.psidemo.R;
import com.jagdish.psidemo.base.BaseFragment;
import com.jagdish.psidemo.data.Items;
import com.jagdish.psidemo.data.LabelLocation;
import com.jagdish.psidemo.data.PsiResponse;
import com.jagdish.psidemo.data.Readings;
import com.jagdish.psidemo.data.RegionMetaData;
import com.jagdish.psidemo.di.util.ViewModelFactory;
import com.jagdish.psidemo.di.viewmodel.MainViewModel;

import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;

public class MainFragment extends BaseFragment implements OnMapReadyCallback {

    private static final String TAG = MainFragment.class.getName();

    @BindView(R.id.tv_error)
    TextView errorTextView;

    @BindView(R.id.loading_view)
    View loadingView;

    private GoogleMap mMap;

    @Inject
    ViewModelFactory viewModelFactory;
    private MainViewModel viewModel;


    @Override
    protected int layoutRes() {
        return R.layout.fragment_main;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        viewModel = ViewModelProviders.of(this, viewModelFactory).get(MainViewModel.class);

        initMapFragment();

        observableViewModel();
    }

    // Init map fragment
    private void initMapFragment() {
        SupportMapFragment mapFragment = (SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(MainFragment.this);
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Move camera to singapore location
        LatLng singaporeLatLng = new LatLng(1.352083, 103.819839);
        //  LatLngBounds singaporeBound = new LatLngBounds(new LatLng(1.352083, 103.81983), new LatLng(1.46145, 104.0828713));
        googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(singaporeLatLng, 10.0f));
        //googleMap.setLatLngBoundsForCameraTarget(singaporeBound);

    }


    private void observableViewModel() {
        viewModel.getPSiData().observe(this, psiResponse -> {
            if (psiResponse != null) {
                // Log.d(TAG, "jk got response successfully");
                setPsiData(psiResponse);
            } else {
                errorTextView.setText(getActivity().getResources().getString(R.string.error_data_not_available));
            }
        });

        viewModel.getError().observe(this, isError -> {
            if (isError != null) if (isError) {
                errorTextView.setVisibility(View.VISIBLE);
                errorTextView.setText(getActivity().getResources().getString(R.string.error_on_load_data));
            } else {
                errorTextView.setVisibility(View.GONE);
                errorTextView.setText(null);
            }
        });

        viewModel.getLoading().observe(this, isLoading -> {
            if (isLoading != null) {
                loadingView.setVisibility(isLoading ? View.VISIBLE : View.GONE);
                if (isLoading) {
                    errorTextView.setVisibility(View.GONE);
                }
            }
        });
    }

    private void setPsiData(final PsiResponse psiResponse) {
        if (mMap == null)
            return;

        List<RegionMetaData> regionMetaDataList = psiResponse.getRegionMetaData();
        List<Items> itemsList = psiResponse.getItems();

        if (regionMetaDataList != null) {
            for (RegionMetaData regionMetaData : regionMetaDataList) {
                String name = regionMetaData.getName();
                LabelLocation labelLocation = regionMetaData.getLabelLocation();

                String readingValue = "";
                if (itemsList != null && itemsList.size() > 0) {
                    Readings readings = itemsList.get(0).getReadings();
                    readingValue = getReading(name, readings);
                }

                if (labelLocation != null) {
                    LatLng locationLatLng = new LatLng(labelLocation.getLatitude(), labelLocation.getLongitude());

                    mMap.addMarker(new MarkerOptions()
                            .position(locationLatLng).snippet(readingValue)
//                        .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_marker_blue)) // set custom marker
                            .title(name));
                }
            }
        }
        mMap.setInfoWindowAdapter(new GoogleMap.InfoWindowAdapter() {

            @Override
            public View getInfoWindow(Marker arg0) {
                return null;
            }

            @Override
            public View getInfoContents(Marker marker) {

                LinearLayout info = new LinearLayout(getActivity());
                info.setOrientation(LinearLayout.VERTICAL);

                TextView title = new TextView(getActivity());
                title.setTextColor(Color.BLACK);
                title.setGravity(Gravity.CENTER);
                title.setTypeface(null, Typeface.BOLD);
                title.setText(marker.getTitle());

                TextView snippet = new TextView(getActivity());
                snippet.setTextColor(Color.GRAY);
                snippet.setText(marker.getSnippet());

                info.addView(title);
                info.addView(snippet);

                return info;
            }
        });
    }

    // get reading values based on name
    private String getReading(String name, Readings readings) {
        String reading = "";
        switch (name) {
            case "west":
                reading = readings.getWestValue();
                break;
            case "national":
                reading = readings.getNationalValue();
                break;
            case "east":
                reading = readings.getEastValue();
                break;
            case "central":
                reading = readings.getCentralValue();
                break;
            case "south":
                reading = readings.getSouthValue();
                break;
            case "north":
                reading = readings.getNorthValue();
                break;
        }
        return reading;
    }

}
