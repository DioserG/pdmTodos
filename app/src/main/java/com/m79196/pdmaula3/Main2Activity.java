package com.m79196.pdmaula3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void btnImagem1(View view) {
        Intent intent  = new Intent(Main2Activity.this,
                Main3Activity.class);
        startActivity(intent);
    }

    public void btnImagem2(View view) {
        Intent intent  = new Intent(Main2Activity.this,
                Main4Activity.class);
        startActivity(intent);
    }

    public void btnImagem3(View view) {
        Intent intent  = new Intent(Main2Activity.this,
                Main5Activity.class);
        startActivity(intent);
    }

    public void btnImagem4(View view) {
        Intent intent  = new Intent(Main2Activity.this,
                Main6Activity.class);
        startActivity(intent);
    }
}
