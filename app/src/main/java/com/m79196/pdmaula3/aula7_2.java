package com.m79196.pdmaula3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class aula7_2 extends AppCompatActivity {
    private TextView posicaoSelecionado;
    private TextView nomeSelecionado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aula7_2);

        Bundle extras = getIntent().getExtras();
        nomeSelecionado = findViewById(R.id.nomeTimes);
        nomeSelecionado.setText((String)extras.get("time"));

        posicaoSelecionado = findViewById(R.id.posicao);
        posicaoSelecionado.setText((String)extras.get("posicao"));
    }
}
