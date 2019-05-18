package com.code.autoservice.webservices;

import com.code.autoservice.models.CarsOnline;

import retrofit2.Call;
import retrofit2.http.GET;

public interface CarsApi {
    @GET("carsonline")
    Call<CarsOnline> getCarsInfo();
}
