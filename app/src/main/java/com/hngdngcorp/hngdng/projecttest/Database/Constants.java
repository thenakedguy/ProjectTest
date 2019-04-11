package com.hngdngcorp.hngdng.projecttest.Database;

public class Constants {
    public static final boolean isDEBUG = true ;
    public static final String RANDOMIZE_TABLE= "NGAU NHIEN";
    public static final String RANDOMIZE_INDEX = "INDEX";
    public static final String RANDOMIZE_DATE = "DATE";
    public static final String RANDOMIZE_RESULT = "RESULT";


    public static final String DICE_TABLE= "DICE";
    public static final String DICE_INDEX = "INDEX";
    public static final String DICE_DATE = "DATE";
    public static final String DICE_RESULT = "RESULT";


    public static final String FLIP_TABLE= "FLIP";
    public static final String FLIP_INDEX = "INDEX";
    public static final String FLIP_DATE = "DATE";
    public static final String FLIP_RESULT = "RESULT";

    public static final String CREATE_RANDOMIZE_TABLE = "CREATE TABLE " + RANDOMIZE_TABLE + "( " +
            " " + RANDOMIZE_INDEX +" NVARCHAR (50)," +
            " " + RANDOMIZE_DATE +" NVARCHAR (50)," +
            " " + RANDOMIZE_RESULT +" NCHAR (50)," +
            ")" ;

    public static final String CREATE_DICE_TABLE = "CREATE TABLE " + DICE_TABLE + "( " +
            " " + DICE_INDEX +" NVARCHAR (50)," +
            " " + DICE_DATE +" NVARCHAR (50)," +
            " " + DICE_RESULT +" NCHAR (50)," +
            ")" ;

    public static final String CREATE_FLIP_TABLE = "CREATE TABLE " + FLIP_TABLE + "( " +
            " " + FLIP_INDEX +" NVARCHAR (50)," +
            " " + FLIP_DATE +" NVARCHAR (50)," +
            " " + FLIP_RESULT +" NCHAR (50)," +
            ")" ;
}
