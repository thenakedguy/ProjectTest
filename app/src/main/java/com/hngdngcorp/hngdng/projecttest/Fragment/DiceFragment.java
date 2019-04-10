package com.hngdngcorp.hngdng.projecttest.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.google.android.material.textfield.TextInputEditText;
import com.hngdngcorp.hngdng.projecttest.HistoryActivity;
import com.hngdngcorp.hngdng.projecttest.R;

import java.util.Random;


public class DiceFragment extends Fragment {
    private LinearLayout mFragmentDice;
    private TextInputEditText mEdtMin;
    private Button mBtnRoll;
    private TextView mTvHistory;

    private ImageView mImgDice2;
    private ImageView mImgDice1;
    private ImageView mImgDice3;









    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_dice, container, false);
        mFragmentDice = view.findViewById(R.id.fragment_dice);
        mEdtMin = view.findViewById(R.id.edtMin);
        mBtnRoll = view.findViewById(R.id.btnRoll);
        mTvHistory = view.findViewById(R.id.tvHistory);
        mImgDice2 = view.findViewById(R.id.imgDice2);
        mImgDice1 = view.findViewById(R.id.imgDice1);
        mImgDice3 = view.findViewById(R.id.imgDice3);
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

    private void check() {
        int numb = Integer.parseInt(mEdtMin.getText().toString());
        if (numb <1 || numb >3){
            Toast.makeText(getContext(),"Mời nhập vào số lớn hơn 0 và nhỏ hơn 3",Toast.LENGTH_LONG).show();
        }else {
            switch ( numb) {



                    case 1:
                        roll(mImgDice1);
                        mImgDice1.setVisibility(View.VISIBLE);
                        break;




                    case 2:
                        roll(mImgDice1);
                        roll(mImgDice2);
                        mImgDice1.setVisibility(View.VISIBLE);
                        mImgDice2.setVisibility(View.VISIBLE);
                        break;




                    case 3:
                        roll(mImgDice1);
                        roll(mImgDice2);
                        roll(mImgDice3);
                        mImgDice1.setVisibility(View.VISIBLE);
                        mImgDice2.setVisibility(View.VISIBLE);
                        mImgDice3.setVisibility(View.VISIBLE);
                        break;
            }
        }
    }

    private void roll(ImageView img) {
        int randomNumber = new Random().nextInt(6) + 1;

        switch (randomNumber) {
            case 1:
                img.setImageResource(R.drawable.dice1);
                break;
            case 2:
                img.setImageResource(R.drawable.dice2);
                break;
            case 3:
                img.setImageResource(R.drawable.dice3);
                break;
            case 4:
                img.setImageResource(R.drawable.dice4);
                break;
            case 5:
                img.setImageResource(R.drawable.dice5);
                break;
            case 6:
                img.setImageResource(R.drawable.dice6);
                break;
        }
    }


}
