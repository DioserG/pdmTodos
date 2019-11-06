package com.m79196.pdmaula3;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper  extends SQLiteOpenHelper {

    private static final String BANCO_DADOS = "revenda";
    private static int VERSAO = 1;

    public  DatabaseHelper(Context context){
        super(context, BANCO_DADOS,null, VERSAO);
    }

    @Override
    public void  onCreate(SQLiteDatabase db){
        db.execSQL("CREATE TABLE carro(" +
                    "id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL," +
                    "modelo TEXT," +
                    "valor DOUBLE)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS carro");
    }
}

