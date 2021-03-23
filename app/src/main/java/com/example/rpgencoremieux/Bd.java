package com.example.rpgencoremieux;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class Bd extends SQLiteOpenHelper {
    private Context context;
    private static final String DATABASE_NAME = "dbDuRPGtropbien";

    private static final int DATABASE_VERSION = 1;
    private static final String TABLE_NAME = "Sauvegarde";
    private static final String COLUMN_ID = "joueur";
    private static final String Level = "Level";

    public Bd(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query =
                "CREATE TABLE " + TABLE_NAME + " (" + COLUMN_ID + " INTEGER PRIMARY KEY, " + Level + " INTEGER" + ");";
        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int o, int il) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }

    public void CreationSauvegarde()
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("joueur", 1);
        cv.put("level", 1);
        db.insert("Sauvegarde", null, cv);
    }
}
