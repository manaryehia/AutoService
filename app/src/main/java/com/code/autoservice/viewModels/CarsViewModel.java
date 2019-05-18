package com.code.autoservice.viewModels;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import com.code.autoservice.models.CarsOnline;
import com.code.autoservice.repositories.RetrofitRepository;

public class CarsViewModel extends ViewModel {
    public CarsViewModel() {
    }

    public static LiveData<CarsOnline> getCarsOnlineFromRepo(){
        return RetrofitRepository.getInstance().getCarsOnline();
    }

}
