package com.hngdngcorp.hngdng.projecttest.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.google.android.material.textfield.TextInputEditText;
import com.hngdngcorp.hngdng.projecttest.HistoryActivity;
import com.hngdngcorp.hngdng.projecttest.R;


public class DiceFragment extends Fragment {
    private LinearLayout mFragmentDice;
    private TextInputEditText mEdtMin;
    private Button mBtnRoll;
    private TextView mTvHistory;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_dice, container, false);
        mFragmentDice = view.findViewById(R.id.fragment_dice);
        mEdtMin = view.findViewById(R.id.edtMin);
        mBtnRoll = view.findViewById(R.id.btnRoll);
        mTvHistory = view.findViewById(R.id.tvHistory);
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
