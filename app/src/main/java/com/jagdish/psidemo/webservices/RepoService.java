package com.jagdish.psidemo.webservices;

import com.jagdish.psidemo.data.PsiResponse;
import com.jagdish.psidemo.utility.AppConstants;

import io.reactivex.Single;
import retrofit2.http.Field;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface RepoService {

    @Headers("Accept: application/json")
    @GET(AppConstants.BASE_URL)
    Single<PsiResponse> getPSIData(@Query("date_time") String date_time, @Query("date") String date);

}
