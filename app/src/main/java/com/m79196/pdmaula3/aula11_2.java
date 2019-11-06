package com.m79196.pdmaula3;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class aula11_2 extends AppCompatActivity {

    String idDados = "";
    private DatabaseHelper helper;
    private EditText modelo, valor, ano;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aula11_2);

        modelo = (EditText) findViewById(R.id.modelo_aula11_2);
        valor  = (EditText) findViewById(R.id.valor_aula11_2);
        ano    = (EditText) findViewById(R.id.ano_aula11_2);

        Bundle extras = getIntent().getExtras();
        idDados =  extras.getString("idDados");

        helper = new DatabaseHelper(this);
        preencherCampos();

    }

    public void preencherCampos(){
        SQLiteDatabase db = helper.getReadableDatabase();
        Cursor cursor = db.rawQuery(String.format("SELECT * FROM carro WHERE id =%s", idDados), null);
        cursor.moveToFirst();
        modelo.setText(cursor.getString(1));
        ano.setText(String.valueOf(cursor.getInt(2)));
        valor.setText(String.valueOf(cursor.getInt(3)));
        cursor.close();
    }

    public void excluir_aula11_2(View view) {
        SQLiteDatabase db = helper.getWritableDatabase();
        String where [] = new String[] {idDados};

        long resultado = db.delete("carro", "id = ?", where);
        if (resultado != -1){
            Toast.makeText(this, "Registro excluidos com sucesso!", Toast.LENGTH_SHORT).show();
            super.onBackPressed();
        }else{
            Toast.makeText(this, "Erro ao excluir!", Toast.LENGTH_SHORT).show();
        }
    }

    public void atualizar_aula11_2(View view) {
    }
}
