package com.example.rpgencoremieux;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class RequeteBD extends SQLiteOpenHelper {
    private Context context;
    private static final String DATABASE_NAME = "dbDuRPGtropbien";

    private static final int DATABASE_VERSION = 1;
    private static final String TABLE_NAME = "Sauvegarde";
    private static final String COLUMN_ID = "joueur";
    private static final String Level = "Level";

    public RequeteBD(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query =
                "CREATE TABLE " + TABLE_NAME + " (" + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + Level + " INTEGER" + ");";
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
        cv.put("level", 1);
        db.insert("Sauvegarde", null, cv);
    }

    public void NouvelleSauvegarde()
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("level", 1);
        db.update(TABLE_NAME, cv, "joueur = " + 1, new String[]{});
    }

    public void Carte()
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("level", 2);
        db.update(TABLE_NAME, cv, "joueur = " + 1, new String[]{});
    }

    public void Foret()
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("level", 3);
        db.update(TABLE_NAME, cv, "joueur = " + 1, new String[]{});
    }

    public void Foret2()
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("level", 4);
        db.update(TABLE_NAME, cv, "joueur = " + 1, new String[]{});
    }


    Cursor LireFichier()
    {
        String query = "SELECT Level FROM Sauvegarde";
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = null;
        if (db != null)
        {
            cursor = db.rawQuery(query, null);
        }
        return cursor;
    }
}
