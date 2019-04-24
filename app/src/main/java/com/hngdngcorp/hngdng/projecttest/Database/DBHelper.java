package com.hngdngcorp.hngdng.projecttest.Database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.hngdngcorp.hngdng.projecttest.Model.Randomize;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.Nullable;

import static com.hngdngcorp.hngdng.projecttest.Database.Constants.CREATE_RANDOMIZE_TABLE;
import static com.hngdngcorp.hngdng.projecttest.Database.Constants.RANDOMIZE_DATE;
import static com.hngdngcorp.hngdng.projecttest.Database.Constants.RANDOMIZE_ID;
import static com.hngdngcorp.hngdng.projecttest.Database.Constants.RANDOMIZE_RESULT;
import static com.hngdngcorp.hngdng.projecttest.Database.Constants.RANDOMIZE_TABLE;

//import static com.hngdngcorp.hngdng.projecttest.Database.Constants.CREATE_DICE_TABLE;
//import static com.hngdngcorp.hngdng.projecttest.Database.Constants.CREATE_FLIP_TABLE;

public class DBHelper extends SQLiteOpenHelper  {
    private final String DB_NAME = "History";
    public DBHelper(@Nullable Context context) {
        super(context, "History", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
            //tạo bảng
         db.execSQL(CREATE_RANDOMIZE_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public void insertRandomizeResult(Randomize randomize){
        ContentValues contentValues= new ContentValues();

        contentValues.put(RANDOMIZE_ID,randomize.id);
        contentValues.put(RANDOMIZE_DATE,randomize.date);
        contentValues.put(RANDOMIZE_RESULT,randomize.result);
        // XIN QUYEN GHI
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        sqLiteDatabase.insert(RANDOMIZE_TABLE,null,contentValues);
        sqLiteDatabase.close();

    }
    public List<Randomize> allRdHistory(){
        List<Randomize> randomizes = new ArrayList<>();
        String s = "SELECT * FROM " + RANDOMIZE_TABLE;
        SQLiteDatabase database = this.getWritableDatabase();
        Cursor cursor = database.rawQuery(s,null);
        if (cursor.moveToFirst()){
            do{
                Randomize randomize = new Randomize();
                randomize.setDate(cursor.getString(1));
                randomize.setResult(cursor.getInt(2));
            }while (cursor.moveToNext());
        }
        database.close();
        return randomizes;
    }

}
