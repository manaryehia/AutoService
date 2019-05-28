package com.code.autoservice.views.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.code.autoservice.R;
import com.code.autoservice.views.activities.LoginActivity;
import com.code.autoservice.views.activities.MyCarListActivity;
import com.code.autoservice.views.activities.NearPlacesActivity;

public class MenuFragment extends Fragment {
    View view;
    private TextView nearPlaces;
    private TextView myCarList;
    private TextView logOut;
    private Button login_register;
    public MenuFragment() {
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        nearPlaces=getActivity().findViewById(R.id.TV_nearPlaces);
        myCarList=getActivity().findViewById(R.id.TV_myCarList);
        logOut=getActivity().findViewById(R.id.TV_logOut);
        login_register=getActivity().findViewById(R.id.btn_logn_register);


        login_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(), LoginActivity.class);
               startActivity(intent);
            }
        });

        myCarList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(), MyCarListActivity.class);
                startActivity(intent);
            }
        });

        nearPlaces.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(), NearPlacesActivity.class);
                startActivity(intent);
            }
        });

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater , @Nullable ViewGroup container , @Nullable Bundle savedInstanceState) {
       view=inflater.inflate(R.layout.menu_fragment,container,false);
        return view;
    }
}
