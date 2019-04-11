package com.hngdngcorp.hngdng.projecttest.Database;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;
import com.hngdngcorp.hngdng.projecttest.Database.Constants;
import com.hngdngcorp.hngdng.projecttest.Model.Randomize;

import static com.hngdngcorp.hngdng.projecttest.Database.Constants.CREATE_DICE_TABLE;
import static com.hngdngcorp.hngdng.projecttest.Database.Constants.CREATE_FLIP_TABLE;
import static com.hngdngcorp.hngdng.projecttest.Database.Constants.CREATE_RANDOMIZE_TABLE;

public class DBHelper extends SQLiteOpenHelper  {
    private final String DB_NAME = "History";
    
    public DBHelper(@Nullable Context context) {
        super(context, "History", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_RANDOMIZE_TABLE);
        db.execSQL(CREATE_DICE_TABLE);
        db.execSQL(CREATE_FLIP_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public void insertRandomizeResult(Randomize randomize){
//        ContentValues contentValues= new ContentValues();
//
//        contentValues.put(USER_USER_NAME,user.USER_USER_NAME);
//        contentValues.put(USER_USER_PASSWORD,user.USER_PASSWORD);
//        contentValues.put(USER_PHONE_NUMBER,user.USER_PHONE);
//        contentValues.put(USER_FULL_NAME,user.USER_FULL_NAME);
//
//        // XIN QUYEN GHI
//        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
//        result = sqLiteDatabase.insert(USER_TABLE,null,contentValues);
//        sqLiteDatabase.close();

    }

}
