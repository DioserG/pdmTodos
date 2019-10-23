package com.m79196.pdmaula3;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Aula10 extends AppCompatActivity {

    private ListView listView;
    private List<Map<String,Object>> lista;
    private MeuAdpter adapter;
    private String[] de = {"temperatura", "humidade", "pressao_atm", "data_hora"};
    private int[] para = {R.id.txTemperatura, R.id.txHumidade, R.id.txPressao, R.id.txData_Hora};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aula10);
    }

    public void btnBusca(View view) {

        listView = findViewById(R.id.list_view_aula10);
        lista = new ArrayList<>();
        adapter = new MeuAdpter(getApplicationContext(), lista, R.layout.linha_clima, de, para);
        listView.setAdapter(adapter);

        // código a seguir rereferente ao loopj
        String url = "http://ghelfer.net/la/weather.json";



    }
}
