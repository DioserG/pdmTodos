package com.m79196.pdmaula3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;

public class aula6_1 extends AppCompatActivity {

    private ListView meuListView;
    String [] listas = {"Dioser","Guilherme","Anderson","Felipe","Leonardo","Sabrina","Rodrigo","Sergio","Sirio","Luiz"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aula6_1);

        meuListView = findViewById(R.id.meuListView);
        final ArrayAdapter<String> adaptList = new ArrayAdapter(this, android.R.layout.simple_list_item_1, Arrays.asList(listas));

        meuListView.setAdapter(adaptList);

        /* Selecionar item da lista */
        meuListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){

                TextView textview = (TextView) view;
                String selecionado = (String) textview.getText();

                //Toast.makeText(getApplicationContext(),selecionado,Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(getApplicationContext(), aula6_2.class);
                intent.putExtra("selecionado", selecionado);
                startActivity(intent);

            }
        });

    }


}
