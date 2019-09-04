package com.m79196.pdmaula3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class aula2_1 extends AppCompatActivity {

    final String TAG = "mensagem";
    private TextView texto1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aula2_1);

        Bundle extra = getIntent().getExtras();
        String  texto = extra.getString("fa");
        Toast.makeText(this,texto, Toast.LENGTH_SHORT).show();
        texto1 = (TextView) findViewById(R.id.texto);
        texto1.setText(texto);

        //A activity está sendo criada
        Log.d(TAG, "onCreate");
    }

    public void voltaCelsius(View view) {
        Intent intent  = new Intent(aula2_1.this,
                aula2.class);
        startActivity(intent);
    }
}
