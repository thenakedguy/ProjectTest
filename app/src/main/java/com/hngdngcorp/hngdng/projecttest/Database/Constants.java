package com.hngdngcorp.hngdng.projecttest.Database;

public class Constants {
    public static final boolean isDEBUG = true ;
    public static final String RANDOMIZE_TABLE= "RANDOMIZE";
    public static final String RANDOMIZE_ID = "ID";
    public static final String RANDOMIZE_DATE = "DATE";
    public static final String RANDOMIZE_RESULT = "RESULT";


    public static final String DICE_TABLE= "DICE";
    public static final String DICE_ID = "ID";
    public static final String DICE_DATE = "DATE";
    public static final String DICE_RESULT = "RESULT";


    public static final String FLIP_TABLE= "FLIP";
    public static final String FLIP_ID = "ID";
    public static final String FLIP_DATE = "DATE";
    public static final String FLIP_RESULT = "RESULT";

//    public static final String CREATE_RANDOMIZE_TABLE = "CREATE TABLE " +
//            RANDOMIZE_TABLE + " (" +
//            RANDOMIZE_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
//            RANDOMIZE_DATE + " TEXT NOT NULL, " +
//            RANDOMIZE_RESULT +" TEXT NOT NULL " +
//            ");" ;
    public  static final  String CREATE_RANDOMIZE_TABLE = "CREATE TABLE "+RANDOMIZE_TABLE +" (" +
    RANDOMIZE_ID +" Integer, "+
    RANDOMIZE_DATE + " TEXT, "+
    RANDOMIZE_RESULT +" TEXT)";
//    final String createDB = "CREATE TABLE " +
//            SinhVienEntry.TABLE_NAME + " (" +
//            SinhVienEntry.COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
//            SinhVienEntry.COL_MASV + " TEXT NOT NULL, " +
//            SinhVienEntry.COL_TENSV + " TEXT NOT NULL " +
//            ");";
//        db.execSQL(createDB);

//    public static final String CREATE_DICE_TABLE = "CREATE TABLE " + DICE_TABLE + "(" +
//            " " + DICE_ID +" NVARCHAR (50)," +
//            " " + DICE_DATE +" NVARCHAR (50)," +
//            " " + DICE_RESULT +" NCHAR (50)," +
//            ")" ;
//
//    public static final String CREATE_FLIP_TABLE = "CREATE TABLE " + FLIP_TABLE + "(" +
//            " " + FLIP_ID +" NVARCHAR (50)," +
//            " " + FLIP_DATE +" NVARCHAR (50)," +
//            " " + FLIP_RESULT +" NCHAR (50)," +
//            ")" ;
}
