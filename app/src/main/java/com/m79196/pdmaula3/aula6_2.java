package com.m79196.pdmaula3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.TextView;

import java.util.Arrays;

public class aula6_2 extends AppCompatActivity {

    private Spinner spinner_aula6_3;
    private TextView nomeSelecionado;

    String [] estados = {"RS","SC"};
    String [] cidade = {"Santa Cruz","Camburiú"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aula6_2);


        spinner_aula6_3 = findViewById(R.id.spinner_estado_aula6_3);

        Bundle extras = getIntent().getExtras();
        nomeSelecionado = findViewById(R.id.textView_aula6_3);
        nomeSelecionado.setText((String)extras.get("selecionado"));

        ArrayAdapter<String> adaptSpinnerEstado = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1, estados);
        
        spinner_aula6_3.setAdapter(adaptSpinnerEstado);

        spinner_aula6_3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        ArrayAdapter<String> adaptList = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1, Arrays.asList(cidade));


    }



}
