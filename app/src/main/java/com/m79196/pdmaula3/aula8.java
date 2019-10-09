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
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;


public class aula8 extends AppCompatActivity {

    private String[] estados = {"RS", "SC", "PR"};
    private String[] cidades = {"Santa Cruz do Sul", "Vera Cruz", "Rio Pardo", "Balneario Camboriú", "Joinville", "Floripa", "Curitiba", "Foz do Iguaçu", "Londrina"};

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
