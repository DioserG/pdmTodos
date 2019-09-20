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

    private Spinner spinner_estado;
    private TextView nomeSelecionado;
    private ListView lv_cidade;

    String [] estado = {"RS","SC","PR"};
    String [] cidadeRS = {"Santa Cruz","Venãncio Aires","Santa Maria"};
    String [] cidadeSC = {"Criciúma","Chapecó","Blumenau"};
    String [] cidadePR = {"Londrina","Pinhais","Curitiba"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aula6_2);

        // Trazendo valor para o textView
        Bundle extras = getIntent().getExtras();
        nomeSelecionado = findViewById(R.id.textView_aula6_2);
        nomeSelecionado.setText((String)extras.get("selecionado"));

        // Colocando valor no Spinner
        spinner_estado = findViewById(R.id.sp_aula6_2_estado);

        ArrayAdapter<String> adaptSpinnerEstado = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1, estado);

        spinner_estado.setAdapter(adaptSpinnerEstado);
        spinner_estado.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                String estadosSelecionados = estado[position];

                // Colocando valor na listView
                lv_cidade = findViewById(R.id.lv_aula6_2_cidade);
                if(estadosSelecionados == "RS"){
                    ArrayAdapter<String> adaptListCidade = new ArrayAdapter(getApplicationContext(),
                            android.R.layout.simple_list_item_1, Arrays.asList(cidadeRS));
                            lv_cidade.setAdapter(adaptListCidade);
                }else if (estadosSelecionados == "SC"){
                    ArrayAdapter<String> adaptListCidade = new ArrayAdapter(getApplicationContext(),
                            android.R.layout.simple_list_item_1, Arrays.asList(cidadeSC));
                            lv_cidade.setAdapter(adaptListCidade);
                }else if (estadosSelecionados == "PR"){
                    ArrayAdapter<String> adaptListCidade = new ArrayAdapter(getApplicationContext(),
                            android.R.layout.simple_list_item_1, Arrays.asList(cidadePR));
                            lv_cidade.setAdapter(adaptListCidade);
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
    }
}
