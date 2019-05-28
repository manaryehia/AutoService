package com.code.autoservice;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ProgressBar;

import com.code.autoservice.adapters.RecyclerViewAdapter;
import com.code.autoservice.adapters.ViewPagerAdapter;
import com.code.autoservice.viewModels.CarsViewModel;
import com.code.autoservice.views.fragments.AddCarFragment;
import com.code.autoservice.views.fragments.CarsFragment;
import com.code.autoservice.views.fragments.FavoriteFragment;
import com.code.autoservice.views.fragments.MapsFragment;
import com.code.autoservice.views.fragments.MenuFragment;

public class MainActivity extends AppCompatActivity {
    ViewPager viewPager;
    TabLayout tabLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout=findViewById(R.id.tabLayout);
        viewPager=findViewById(R.id.pager);
        ViewPagerAdapter pagerAdapter=new ViewPagerAdapter(getSupportFragmentManager());
        pagerAdapter.addFragment(new MenuFragment(),"Menu");
        pagerAdapter.addFragment(new FavoriteFragment(),"Favorite");
        pagerAdapter.addFragment(new AddCarFragment(),"Add");
        pagerAdapter.addFragment(new MapsFragment(),"Maps");
        pagerAdapter.addFragment(new CarsFragment(),"Cars");

        viewPager.setAdapter(pagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(4).setIcon(R.drawable.cars_tab);
        tabLayout.getTabAt(1).setIcon(R.drawable.favorite_tab);
        tabLayout.getTabAt(2).setIcon(R.drawable.add_tab);
        tabLayout.getTabAt(3).setIcon(R.drawable.maps_tab);
        tabLayout.getTabAt(0).setIcon(R.drawable.menu_tab);
        tabLayout.getTabAt(4).select();
    }
}
