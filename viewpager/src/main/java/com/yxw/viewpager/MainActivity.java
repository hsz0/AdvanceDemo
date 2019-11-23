package com.yxw.viewpager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private List<Fragment> fragments;
    private MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager =findViewById(R.id.viewPager);
        fragments = new ArrayList<>();
        fragments.add(new OneFrg());
        fragments.add(new TwoFrg());
        fragments.add(new ThreeFrg());
        myAdapter = new MyAdapter(getSupportFragmentManager(),fragments);
        viewPager.setAdapter(myAdapter);
    }
}
