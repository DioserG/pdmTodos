package com.m79196.pdmaula3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.Arrays;

public class aula6_1 extends AppCompatActivity {

    private ListView meuListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aula6_1);

        meuListView = findViewById(R.id.meuListView);

        String [] listas = {"Dioser","Guilherme","Anderson","Felipe","Leonardo","Sabrina","Rodrigo","Sergio","Sirio","Luiz"};

        ArrayAdapter<String> adaptList = new ArrayAdapter(this, android.R.layout.simple_list_item_1, Arrays.asList(listas));

        meuListView.setAdapter(adaptList);
    }
}
