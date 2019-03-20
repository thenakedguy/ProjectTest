package com.hngdngcorp.hngdng.projecttest.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.hngdngcorp.hngdng.projecttest.HistoryActivity;
import com.hngdngcorp.hngdng.projecttest.R;


public class FlipFragment extends Fragment {
    private Button mBtnRoll;
    private TextView mTvHistory;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_flip, container, false);

        mBtnRoll = view.findViewById(R.id.btnRoll);
        mTvHistory = view.findViewById(R.id.tvHistory);

        mTvHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getActivity(), HistoryActivity.class);
                startActivity(intent);
            }
        });

        return view;
    }


}
