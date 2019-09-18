package com.m79196.pdmaula3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.Arrays;

public class aula6 extends AppCompatActivity {

    private ListView meuListView;
    private Spinner meuSpinner;

    String [] values = {"Luz","Água","Telefone","Internet","Aluguel","Academia","Luz","Água","Telefone","Internet","Aluguel","Academia"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aula6);

        meuSpinner = findViewById(R.id.meuSpinner);
        meuListView = findViewById(R.id.meuListView);

        ArrayAdapter<String> adaptSpinner = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1, values);

        meuSpinner.setAdapter(adaptSpinner);
        meuSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view,
                                       int i, long l) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


        ArrayAdapter<String> adaptList = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1, Arrays.asList(values));

        meuListView.setAdapter(adaptList);
    }

    public void ExemploClick(View view) {
        Intent intent = new Intent(aula6.this,ExemploActivity.class);
        startActivity(intent);
    }
}
