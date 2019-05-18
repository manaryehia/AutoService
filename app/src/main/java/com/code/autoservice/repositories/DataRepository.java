package com.code.autoservice.repositories;

import android.arch.lifecycle.LiveData;

import com.code.autoservice.models.CarsOnline;

public class DataRepository {
    public DataRepository() {
    }
    public LiveData<CarsOnline> getCarOnlineFromServer() {
        return RetrofitRepository.getInstance().getCarsOnline();
    }
}
