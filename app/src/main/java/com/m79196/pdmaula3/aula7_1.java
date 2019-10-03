package com.m79196.pdmaula3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class aula7_1 extends AppCompatActivity {

    //String tag = "Log Dioser";
    //Log.d(tag, "passou por aqui");
    private ListView listView;
    private List<Map<String,String>> lista;
    SimpleAdapter adapter;

    String[] de = {"escudoTime", "nomeTime", "pontuacaoTime"};
    int[] para = {R.id.escudoTime, R.id.nomeTime, R.id.pontuacaoTime};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aula7_1);

        listView = findViewById(R.id.listView);
        lista = new ArrayList<>();
        adapter = new MeuAdpter(getApplicationContext(), lista, R.layout.linha_campeonato, de, para);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Map<String,String> map = lista.get(i);
            }
        });

        // motrando os times e pontuações
        int[] img = {R.drawable.inter, R.drawable.sao, R.drawable.pal, R.drawable.fla, R.drawable.gre, R.drawable.cam, R.drawable.cru, R.drawable.san, R.drawable.flu, R.drawable.cor, R.drawable.ame, R.drawable.vit, R.drawable.bah, R.drawable.cap, R.drawable.bot, R.drawable.vas, R.drawable.spt, R.drawable.cea, R.drawable.cha, R.drawable.par};
        String[] clubes = {"Grêmio", "São Paulo", "Palmeiras", "Flamengo", "Paraná Clube", "Atlético-MG", "Cruzeiro", "Santos", "Fluminense", "Corinthians", "América-MG", "Vitória", "Bahia", "Atlético-PR", "Botafogo", "Vasco", "Sport", "Ceará", "Chapecoense", "Internacional"};
        int[] pontos = {89, 49, 46, 44, 41, 38, 33, 31, 31, 30, 30, 29, 28, 27, 26, 24, 24, 24, 22, 16};


        for (int i = 0; i < img.length; i++) {
            Map<String,String> itens = new HashMap<>();
            itens.put("escudoTime", String.valueOf(img[i]));
            itens.put("nomeTime", clubes[i]);
            itens.put("pontuacaoTime", String.valueOf(pontos[i]));
            lista.add(itens);
        }
        adapter.notifyDataSetChanged();
    }
}
