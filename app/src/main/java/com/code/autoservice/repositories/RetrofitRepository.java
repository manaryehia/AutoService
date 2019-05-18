package com.code.autoservice.repositories;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.util.Log;

import com.code.autoservice.models.CarsOnline;
import com.code.autoservice.webservices.CarsApi;

import java.io.IOException;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitRepository {


    private static RetrofitRepository instance;
    private CarsApi carsApi;
    List<CarsOnline> carList;

    private RetrofitRepository() {
        Retrofit retrofit = new Retrofit.Builder().baseUrl("http://api.emiratesauction.com/v2/")
                .addConverterFactory(GsonConverterFactory.create()).build();
        carsApi = retrofit.create(CarsApi.class);
    }

    public static RetrofitRepository getInstance() {
        if (instance == null) {
            synchronized (RetrofitRepository.class) {
                if (instance == null) {
                    instance = new RetrofitRepository();
                }
            }
        }
        return instance;
    }

    public LiveData<CarsOnline> getCarsOnline() {
        final LiveData<CarsOnline> onlineLiveData = new MutableLiveData<>();

        Call<CarsOnline> call = carsApi.getCarsInfo();
        call.enqueue(new Callback<CarsOnline>() {
            @Override
            public void onResponse(Call<CarsOnline> call , Response<CarsOnline> response) {

                if (response.isSuccessful()) {
                    CarsOnline carsOnlines = response.body();
                    ((MutableLiveData<CarsOnline>) onlineLiveData).setValue(carsOnlines);
                } else {
                    try {
                        Log.e("error" , response.errorBody().string());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }

            @Override
            public void onFailure(Call<CarsOnline> call , Throwable t) {

            }
        });
        return onlineLiveData;
    }
}