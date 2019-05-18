package com.code.autoservice.views.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.code.autoservice.R;

public class MenuFragment extends Fragment {
    View view;
    public MenuFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater , @Nullable ViewGroup container , @Nullable Bundle savedInstanceState) {
       view=inflater.inflate(R.layout.menu_fragment,container,false);
        return view;
    }
}
