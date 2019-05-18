package com.code.autoservice.views.fragments;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import com.code.autoservice.MainActivity;
import com.code.autoservice.R;
import com.code.autoservice.adapters.RecyclerViewAdapter;
import com.code.autoservice.models.Car;
import com.code.autoservice.models.CarsOnline;
import com.code.autoservice.viewModels.CarsViewModel;

import java.util.List;

public class CarsFragment extends Fragment {
    View view;
    private RecyclerView recyclerView;
    ProgressBar progress;
    public SwipeRefreshLayout swipeRefreshLayout;
    private RecyclerViewAdapter adapter;
    public GridLayoutManager gridLayoutManager;
    private CarsViewModel model;
    public CarsFragment() {
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
 model= ViewModelProviders.of(this).get(CarsViewModel.class);
        CarsViewModel.getCarsOnlineFromRepo()
                .observe(this, new Observer<CarsOnline>() {
                    @Override
                    public void onChanged(@Nullable CarsOnline response) {
                        if (response != null) {
                            init();
                            List<Car> cars = response.getCars();
                            gridLayoutManager = new GridLayoutManager(getContext(), 2);
                            recyclerView.setLayoutManager(gridLayoutManager);
                            adapter = new RecyclerViewAdapter(getContext(),cars);
                            recyclerView.setAdapter(adapter);





                        }
                    }
                });



    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater , @Nullable ViewGroup container , @Nullable Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.car_fragment,container,false);
        init();
    return view;
    }
    private void init(){
recyclerView=getActivity().findViewById(R.id.Rv_RecyclerView);
progress=getActivity().findViewById(R.id.progress);

    }
}
