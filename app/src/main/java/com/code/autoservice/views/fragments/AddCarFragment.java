package com.code.autoservice.views.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.code.autoservice.R;

public class AddCarFragment extends Fragment {
    View view;
    public AddCarFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater , @Nullable ViewGroup container , @Nullable Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.add_fragment,container,false);
        return view;
    }
}
