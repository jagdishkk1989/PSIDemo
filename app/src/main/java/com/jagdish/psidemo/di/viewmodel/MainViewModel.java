package com.jagdish.psidemo.di.viewmodel;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import com.jagdish.psidemo.data.PsiResponse;
import com.jagdish.psidemo.utility.Utility;
import com.jagdish.psidemo.webservices.RepoRepository;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.observers.DisposableSingleObserver;
import io.reactivex.schedulers.Schedulers;

public class MainViewModel extends ViewModel {

    private final RepoRepository repoRepository;
    private CompositeDisposable disposable;

    private final MutableLiveData<PsiResponse> psiResponse = new MutableLiveData<>();
    private final MutableLiveData<Boolean> repoLoadError = new MutableLiveData<>();
    private final MutableLiveData<Boolean> loading = new MutableLiveData<>();

    @Inject
    public MainViewModel(RepoRepository repoRepository) {
        this.repoRepository = repoRepository;
        disposable = new CompositeDisposable();

        String datetime = Utility.getDateTime();
        String date = Utility.getDate();
        fetchPSiData(datetime, date);
    }

   public LiveData<PsiResponse>  getPSiData() {
        return psiResponse;
    }

    public  LiveData<Boolean> getError() {
        return repoLoadError;
    }

    public LiveData<Boolean> getLoading() {
        return loading;
    }

    private void fetchPSiData(String datetime, String date) {
        loading.setValue(true);
        disposable.add(repoRepository.getPSIData(datetime, date).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread()).subscribeWith(new DisposableSingleObserver<PsiResponse>() {
                    @Override
                    public void onSuccess(PsiResponse value) {
                        repoLoadError.setValue(false);
                        psiResponse.setValue(value);
                        loading.setValue(false);
                    }

                    @Override
                    public void onError(Throwable e) {
                        repoLoadError.setValue(true);
                        loading.setValue(false);
                        e.printStackTrace();
                    }
                }));
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        if (disposable != null) {
            disposable.clear();
            disposable = null;
        }
    }
}
