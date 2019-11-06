package com.m79196.pdmaula3;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class aula11_1 extends AppCompatActivity {
   private DatabaseHelper helper;
   private EditText modelo, valor, ano;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aula11_1);
    }

    public void salvar_aula11_1(View view) {


        SQLiteDatabase db  = helper.getWritableDatabase();
    }
}
