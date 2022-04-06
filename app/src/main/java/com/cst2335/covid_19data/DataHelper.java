package com.cst2335.covid_19data;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.cst2335.covid_19data.Data;

import java.util.ArrayList;
import java.util.List;

public class DataHelper extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "contactsManager";
    private static final String TABLE_DATA = "covid_19_data";
    private static final String KEY_CITY_CODE = "CITY_CODE";
    private static final String KEY_STATUS = "STATUS";
    private static final String KEY_COUNTRY = "COUNTRY";
    private static final String KEY_LON = "LON";
    private static final String KEY_CITY = "CITY";
    private static final String KEY_COUNTRY_CODE = "COUNTRY_CODE";
    private static final String KEY_PROVINCE = "PROVINCE";
    private static final String KEY_LAT = "LAT";
    private static final String KEY_CASES = "CASES";
    private static final String KEY_DATE = "DATE";

    public DataHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        //3rd argument to be passed is CursorFactory instance
    }
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String CREATE_TABLE = "CREATE TABLE " + TABLE_DATA +
                "(" +
                KEY_DATE + " TEXT PRIMARY KEY,"
                + KEY_CITY_CODE + " TEXT," + KEY_STATUS + " TEXT," + KEY_COUNTRY + " TEXT,"
                + KEY_LON + " TEXT," + KEY_CITY + " TEXT,"
                + KEY_COUNTRY_CODE + " TEXT," + KEY_PROVINCE + " TEXT,"
                + KEY_LAT + " TEXT," + KEY_CASES + " INTEGER" +
                ")";
        sqLiteDatabase.execSQL(CREATE_TABLE);
    }


    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
        if (oldVersion != newVersion) {
            // Simplest implementation is to drop all old tables and recreate them
            sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TABLE_DATA);
            onCreate(sqLiteDatabase);
        }
    }

}
