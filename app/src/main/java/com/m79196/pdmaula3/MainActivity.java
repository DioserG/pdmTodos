package com.m79196.pdmaula3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnAula1(View view) {
        Intent intent  = new Intent(MainActivity.this,
                aula1.class);
        startActivity(intent);
    }

    public void btnAula2(View view) {
        Intent intent  = new Intent(MainActivity.this,
                aula2.class);
        startActivity(intent);
    }

    public void btnAula3(View view) {
        Intent intent  = new Intent(MainActivity.this,
                Main2Activity.class);
        startActivity(intent);
    }

    public void btnAula4(View view) {
        Intent intent  = new Intent(MainActivity.this,
                aula4.class);
        startActivity(intent);
    }

    public void btnAula6(View view) {
        Intent intent  = new Intent(MainActivity.this,
                aula6.class);
        startActivity(intent);
    }
}
