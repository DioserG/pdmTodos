package com.m79196.pdmaula3;


import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class aula11_1 extends AppCompatActivity {
   private DatabaseHelper helper;
   private EditText modelo, valor, ano;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aula11_1);

        modelo = (EditText) findViewById(R.id.modelo_aula11_1);
        valor  = (EditText) findViewById(R.id.valor_aula11_1);
        ano    = (EditText) findViewById(R.id.ano_aula11_1);

        helper = new DatabaseHelper(this);
    }

    public void salvar_aula11_1(View view) {
        SQLiteDatabase db = helper.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put("modelo", modelo.getText().toString());
        values.put("ano", Integer.parseInt(ano.getText().toString()));
        values.put("valor", Double.parseDouble(valor.getText().toString()));

        long resultado = db.insert("carro", null, values);
        if(resultado != -1) {
            Toast.makeText(getApplicationContext(), "Registro Salvo com Sucesso", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(getApplicationContext(), "Fracasso ao Salvar", Toast.LENGTH_SHORT).show();
        }
    }


    @Override
    protected void onDestroy() {
        helper.close();
        super.onDestroy();
    }
}
