package com.m79196.pdmaula3;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String banco_dados = "revenda";
    private static int versao = 3;

    public DatabaseHelper(Context context) {
        super(context, banco_dados, null, versao);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE carro (" +
                   "id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, " +
                   "modelo TEXT, " +
                   "ano TEXT, " +
                   "valor DOUBLE);");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS carro");
    }

}
