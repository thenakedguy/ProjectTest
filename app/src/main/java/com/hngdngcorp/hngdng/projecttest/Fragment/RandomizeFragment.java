package com.hngdngcorp.hngdng.projecttest.Fragment;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.hngdngcorp.hngdng.projecttest.Database.DBHelper;
import com.hngdngcorp.hngdng.projecttest.HistoryActivity;
import com.hngdngcorp.hngdng.projecttest.MainActivity;
import com.hngdngcorp.hngdng.projecttest.Model.Randomize;
import com.hngdngcorp.hngdng.projecttest.R;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;


public class RandomizeFragment extends Fragment {
    private TextInputEditText mEdtMin;
    private TextInputEditText mEdtMax;
    private Button mBtnRoll;
    int min,max;
    private TextView mTvHistory;
    private TextView mTvResult;





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_randomize, container, false);


        mEdtMin = view.findViewById(R.id.edtMin);
        mEdtMax = view.findViewById(R.id.edtMax);
        mBtnRoll = view.findViewById(R.id.btnRoll);
        mTvResult = view.findViewById(R.id.tvResult);
        mTvHistory = view.findViewById(R.id.tvHistory);

        mBtnRoll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check();
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


    // cái này để check số
    public void check(){
        min = Integer.parseInt(mEdtMin.getText().toString());
        max = Integer.parseInt(mEdtMax.getText().toString());
        if(min < 0 ){
            Toast.makeText(getContext(),"Minimum must be higher than 0",Toast.LENGTH_LONG).show();
        }else if (min >= max){
            Toast.makeText(getContext(),"Maxium must be higher than Minumum",Toast.LENGTH_LONG).show();
        }else{
            roll();
        }
    }

    private void roll() {
        min = Integer.parseInt(mEdtMin.getText().toString());
        max = Integer.parseInt(mEdtMax.getText().toString());

        final int random = new Random().nextInt((max - min) + 1) + min;
        mTvResult.setText(String.valueOf(random));
        mTvResult.setVisibility(View.VISIBLE);
        Randomize randomize = new Randomize();
        String dateStr = "04/05/2010";

        SimpleDateFormat curFormater = new SimpleDateFormat("dd/MM/yyyy");
        Date dateObj = null;
        try {
            dateObj = curFormater.parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        SimpleDateFormat postFormater = new SimpleDateFormat("MMMM dd, yyyy");

        randomize.date = postFormater.format(dateObj);
        randomize.result = random;
        DBHelper dbHelper = new DBHelper(getContext());
        dbHelper.insertRandomizeResult(randomize);

    }

}
