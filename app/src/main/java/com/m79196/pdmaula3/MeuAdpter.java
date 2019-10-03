package com.m79196.pdmaula3;

import android.content.Context;
import android.graphics.Color;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.List;
import java.util.Map;

class MeuAdpter extends SimpleAdapter {
    public MeuAdpter(Context applicationContext, List<Map<String, String>> lista, int linha_campeonato, String[] de, int[] para) {
        super(applicationContext,lista,linha_campeonato, de, para);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View v = super.getView(position, convertView, parent);
        String tag = "Log Dioser";


        TextView tv1 = v.findViewById(R.id.nomeTime);
        TextView tv2 = v.findViewById(R.id.pontuacaoTime);

        if (position <= 5) {
            Log.d(tag, "passou por aqui");
            //tv1.setTextColor(Color.YELLOW);
            //tv2.setTextColor(Color.YELLOW);
            v.setBackgroundColor(Color.YELLOW);
        } else if (position >= 16) {
            Log.d(tag, "passou por aqui");
            //tv1.setTextColor(Color.YELLOW);
            //tv2.setTextColor(Color.YELLOW);
            v.setBackgroundColor(Color.RED);
        }
        else {
            if(position %2 == 0){
                v.setBackgroundColor(Color.GRAY);
            }else{
                v.setBackgroundColor(Color.WHITE);
            }
        }
        return v;
    }
}
