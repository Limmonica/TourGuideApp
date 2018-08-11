package com.example.limmonica.tourguideapp;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    // Bind the toolbar view inside the activity layout
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    // Bind the view pager that will allow the user to swipe between fragments
    @BindView(R.id.viewpager)
    ViewPager viewPager;
    // Find the tab layout that shows the tabs
    @BindView(R.id.tabs)
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set the content of the activity to use the activity_main.xml
        setContentView(R.layout.activity_main);

        // Bind the view
        ButterKnife.bind(this);

        // Set the Toolbar to act as the ActionBar for this Activity window.
        setSupportActionBar(toolbar);

        // Create an adapter that knows which fragment should be shown on each page
        ElementsPagerAdapter adapter = new ElementsPagerAdapter(this, getSupportFragmentManager());

        // Set the adapter onto the view pager
        viewPager.setAdapter(adapter);

        // Connect the layout with the view pager
        tabLayout.setupWithViewPager(viewPager);

    }
}
