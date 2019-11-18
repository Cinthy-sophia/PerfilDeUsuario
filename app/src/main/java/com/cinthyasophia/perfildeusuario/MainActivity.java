package com.cinthyasophia.perfildeusuario;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    private FragmentPageAdapter mifragmentPageAdapter;
    private ViewPager miViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TabLayout tabLayout = findViewById(R.id.tabs);
        mifragmentPageAdapter = new FragmentPageAdapter(getSupportFragmentManager());
        miViewPager = findViewById(R.id.Container);
        miViewPager.setAdapter(mifragmentPageAdapter);

        miViewPager.addOnPageChangeListener( new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener( new TabLayout.ViewPagerOnTabSelectedListener(miViewPager));

    }
}

