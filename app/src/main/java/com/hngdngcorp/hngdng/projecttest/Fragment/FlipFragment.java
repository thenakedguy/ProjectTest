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

import java.util.Random;


public class FlipFragment extends Fragment {

    private Button btnRoll;
    private TextView tvRFlipsesult;
    private TextView tvHistory;





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_flip, container, false);

        btnRoll = view.findViewById(R.id.btnRoll);
        tvRFlipsesult = view.findViewById(R.id.tvRFlipsesult);
        tvHistory = view.findViewById(R.id.tvHistory);


        tvHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getActivity(), HistoryActivity.class);
                startActivity(intent);
            }
        });

        btnRoll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                roll();
            }
        });


        return view;
    }

    private void roll() {
        int randomNumber = new Random().nextInt(2) + 1;
        if (randomNumber == 1){
            tvRFlipsesult.setText("FLIPS");
            tvRFlipsesult.setVisibility(View.VISIBLE);
        }else {
            tvRFlipsesult.setText("TAILS");
            tvRFlipsesult.setVisibility(View.VISIBLE);
        }
    }


}
