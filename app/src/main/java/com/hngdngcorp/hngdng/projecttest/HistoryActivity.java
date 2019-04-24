package com.hngdngcorp.hngdng.projecttest;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.hngdngcorp.hngdng.projecttest.Adapter.RandomizeAdapter;
import com.hngdngcorp.hngdng.projecttest.Model.Randomize;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class HistoryActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private Spinner mSpinner;
    private RecyclerView mLvHistory;
    private Button mBtnClear;
    private SQLiteDatabase sqLiteDatabase;
    private List<Randomize> randomizes = new ArrayList<>();
    private RandomizeAdapter randomizeAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);
        mSpinner = findViewById(R.id.spinner);
        mLvHistory = findViewById(R.id.lvHistory);
        mBtnClear = findViewById(R.id.btnClear);
        mSpinner.setOnItemSelectedListener(this);
        List<String> categories = new ArrayList<String>();
        categories.add("Randomize");
        categories.add("Dice");
        categories.add("Flip");


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,categories);
        adapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        mSpinner.setAdapter(adapter);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
     String item = parent.getItemAtPosition(position).toString();
     switch (item) {
         case "Randomize" :
             Toast.makeText(this,"Rd",Toast.LENGTH_LONG).show();
             randomizeAdapter = new RandomizeAdapter(this,randomizes);
             RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
             mLvHistory.setLayoutManager(layoutManager);
             mLvHistory.setAdapter(randomizeAdapter);
             break;
         case "Dice" :
             Toast.makeText(this,"dice",Toast.LENGTH_LONG).show();
             break;
         case "Flip" :
             Toast.makeText(this,"Flip",Toast.LENGTH_LONG).show();
             break;

     }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
