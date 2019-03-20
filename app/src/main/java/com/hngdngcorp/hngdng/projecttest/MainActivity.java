package com.hngdngcorp.hngdng.projecttest;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.hngdngcorp.hngdng.projecttest.Fragment.DiceFragment;
import com.hngdngcorp.hngdng.projecttest.Fragment.FlipFragment;
import com.hngdngcorp.hngdng.projecttest.Fragment.HomeFragment;
import com.hngdngcorp.hngdng.projecttest.Fragment.RandomizeFragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new HomeFragment()).commit();
    }
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment selectedFragment = null;
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    selectedFragment = new HomeFragment();
                    break;
                case R.id.navigation_randomize:
                    selectedFragment = new RandomizeFragment();
                    break;
                case R.id.navigation_dice:
                    selectedFragment = new DiceFragment();
                    break;
                case R.id.navigation_flip:
                    selectedFragment = new FlipFragment();
                    break;
            }
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,selectedFragment).commit();

            return true;
        }

    };



}
