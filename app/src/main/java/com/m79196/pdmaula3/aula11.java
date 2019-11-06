package com.m79196.pdmaula3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;

public class aula11 extends AppCompatActivity {

    private  DatabaseHelper helper;
    private EditText modelo, valor, ano;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aula11);

       // modelo  = (EditText) findViewById(R.id.modelo);
       // valor  = (EditText) findViewById(R.id.valor);
        ano  = (EditText) findViewById(R.id.ano);

        helper = new DatabaseHelper(this);
    }

    public void buscar(View view) {

    }

    public void adicionar(View view) {
        Intent intent  = new Intent(aula11.this,
                aula11_1.class);
        startActivity(intent);
    }
}
