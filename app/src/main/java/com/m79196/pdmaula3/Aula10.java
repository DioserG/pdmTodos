package com.m79196.pdmaula3;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.loopj.android.http.*;

import org.json.JSONArray;
import org.json.JSONObject;

import cz.msebera.android.httpclient.Header;

import java.security.spec.ECField;
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

      /*  JSONObject res = new JSONObject(result);
        JSONArray array = res.getJSONArray("weather");
        for (int i = 0; i < array.length();i++){
            JSONObject json = array.getJSONObject(i);
            String temperatura = json.get("temperatura").toString();
            String humidade = json.get("humidade").toString();
            String pressao = json.get("pressao_atm").toString();
            String data_hora = json.get("data_hora").toString();
        }*/


        // código a seguir rereferente ao loopj
        String url = "http://ghelfer.net/la/weather.json";
        RequestParams params = new RequestParams();
        params.add("weather","1");

        AsyncHttpClient client = new AsyncHttpClient();
        client.post(url, params, new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] response) {
                try {
                    String data = new String(response, "UTF-8");
                   // res.setText(data);

                }catch (Exception ex){
                    Log.e("URL", ex.getMessage());
                };
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
                    Log.e("URL", error.toString());
            }
        });



    }
}
