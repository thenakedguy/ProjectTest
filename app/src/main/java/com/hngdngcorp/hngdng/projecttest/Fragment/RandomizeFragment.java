package com.hngdngcorp.hngdng.projecttest.Fragment;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;
import com.hngdngcorp.hngdng.projecttest.HistoryActivity;
import com.hngdngcorp.hngdng.projecttest.MainActivity;
import com.hngdngcorp.hngdng.projecttest.R;



public class RandomizeFragment extends Fragment {
    private TextInputEditText mEdtMin;
    private TextInputEditText mEdtMax;
    private Button mBtnRoll;

    private TextView mTvHistory;





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_randomize, container, false);
        mEdtMin = view.findViewById(R.id.edtMin);
        mEdtMax = view.findViewById(R.id.edtMax);
        mBtnRoll = view.findViewById(R.id.btnRoll);
        mBtnRoll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
            }
        });

        mTvHistory = view.findViewById(R.id.tvHistory);
        mTvHistory.setOnClickListener(new View.OnClickListener() {
                                          @Override
                                          public void onClick(View v) {
                                              Intent intent =new Intent(getActivity(), HistoryActivity.class);
                                              startActivity(intent);
                                          }
                                      }
        );
        return view;
    }


}
