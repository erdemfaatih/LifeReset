package com.fatiherdem.lifereset;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.google.android.material.tabs.TabLayout;

public class RestaurantSpecialss extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant_specialss);

        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.viewPager);

        tabLayout.setupWithViewPager(viewPager);

        Adapter adapter = new Adapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        adapter.addFragment(new MenuFragment(),"menu");
        adapter.addFragment(new LocationFragment(),"location");
        adapter.addFragment(new ReservationFragment(),"reservation");
        viewPager.setAdapter(adapter);
    }
}