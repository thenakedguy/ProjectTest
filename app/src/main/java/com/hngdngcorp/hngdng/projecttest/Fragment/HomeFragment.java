package com.hngdngcorp.hngdng.projecttest.Fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.hngdngcorp.hngdng.projecttest.R;



public class HomeFragment extends Fragment  {
    private TextView mRoll;
    private TextView mHistory;
    private TextView mDice;
    private TextView mHistoryDice;
    private TextView mCoin;
    private TextView mHistorycoin;

    // Chưa tìm được cách chuyển fragment + thay icon navigation bar
    BottomNavigationView mBottomNavigationView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        mRoll =  view.findViewById(R.id.roll);

        mHistory = view.findViewById(R.id.history);
        mDice = view.findViewById(R.id.dice);
        mHistoryDice = view.findViewById(R.id.historyDice);
        mCoin = view.findViewById(R.id.coin);
        mHistorycoin = view.findViewById(R.id.historycoin);
        mBottomNavigationView =  view.findViewById(R.id.nav_view);


        mRoll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment someFragment = new RandomizeFragment();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, someFragment );
                transaction.commit();

                // lỗi ở đoạn này 
                int index = R.id.navigation_randomize;
                mBottomNavigationView.setSelectedItemId(index);
            }
        });
        mDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment someFragment = new DiceFragment();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, someFragment );
                transaction.commit();

//                mBottomNavigationView.getMenu().findItem(R.id.navigation_dice).setChecked(true);
            }
        });
        mCoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment someFragment = new FlipFragment();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, someFragment );
                transaction.commit();

//                mBottomNavigationView.getMenu().findItem(R.id.navigation_flip).setChecked(true);
            }
        });
        return view;

    }

}
