package com.m79196.pdmaula3;

import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.provider.ContactsContract;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class aula8 extends AppCompatActivity {

    private String[] estados = {"RS", "SC", "PR"};
    private String[] cidades = {"Santa Cruz do Sul", "Vera Cruz", "Rio Pardo", "Balneario Camboriú", "Joinville", "Floripa", "Curitiba", "Foz do Iguaçu", "Londrina"};

    String[] de = {"ImagemAula8", "matricula", "nome"};
    int[] para = {R.id.ImagemAula8, R.id.matricula, R.id.nome};

    private ListView listView;
    private List<Map<String,Object>> lista;
    SimpleAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aula8);

        Spinner est = (Spinner) findViewById(R.id.sp_aula8_estado);
        ArrayAdapter <String> adapter_est = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, estados);
        est.setAdapter(adapter_est);

        Spinner cid = (Spinner) findViewById(R.id.sp_aula8_cidade);
        ArrayAdapter <String> adapter_cid = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, cidades);
        cid.setAdapter(adapter_cid);


    //     listView = findViewById(R.id.listView);
    //     lista = new ArrayList<>();
    //    adapter = new MeuAdpter(getApplicationContext(), lista, R.layout.linha_campeonato, de, para);

    //    listView.setAdapter(adapter);


     //   for (int i = 0; i < img.length; i++) {
     //       Map<String,Object> itens = new HashMap<>();
     //       itens.put("escudoTime", img[i]);
     //       itens.put("nomeTime", clubes[i]);
     //       itens.put("pontuacaoTime", pontos[i]);
     //       lista.add(itens);//  }
     //   adapter.notifyDataSetChanged();

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 123 && resultCode == RESULT_OK) {

            //retorno da camera
            super.onActivityResult(requestCode, resultCode, data);
            Bitmap bm;
            ImageView imagem  = (ImageView) findViewById(R.id.imagem);
            if (requestCode == 123 & resultCode == RESULT_OK) {
                bm = (Bitmap) data.getExtras().get("data");
                imagem.setImageBitmap(bm);
                imagem.setScaleType(ImageView.ScaleType.FIT_XY);
            }
        }
    }

    public void capturar(View view) {
        Intent it = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(it,123);
    }

    public void adicionar(View view) {




    }
}
