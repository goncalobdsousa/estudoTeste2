package com.example.estudoteste2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    private static ArrayList<Conferencia> conferencias;
    private TextView textViewConf;
    private int dia;
    private MyAdapter myAdapter;
    private RecyclerView recyclerView;
    private LinearLayoutManager layoutManager;

    @Override
    protected void onResume() {
        super.onResume();
        if (searchDayConf(dia) != null) {
            textViewConf.setText(searchDayConf(dia).toString());
        } else {
            textViewConf.setText("Não há conferências hoje");
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        conferencias = new ArrayList<>();


        insertConferencias();


        myAdapter = new MyAdapter(conferencias);



        recyclerView = findViewById(R.id.rv);
        recyclerView.setAdapter(myAdapter);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        textViewConf = findViewById(R.id.textView);

        dia = diaAtual();
        if(searchDayConf(dia) != null){
            textViewConf.setText(searchDayConf(dia).toString());
        }
        else{
            textViewConf.setText("Não há conferências hoje");
        }
    }


    private int diaAtual(){
        return Calendar.getInstance().get(Calendar.DAY_OF_MONTH);

    }

    private Conferencia searchDayConf(int dia){
        for (int i = 0; i < conferencias.size(); i++) {
            if (conferencias.get(i).getDiaDoMes() == dia){
                return conferencias.get(i);
            }
        }
        return null;
    }

    public void onClickConf(View view){
        LinearLayout l = (LinearLayout) view;
        TextView tv = (TextView) l.getChildAt(1);
        Intent intent = new Intent(this, Activ2.class);
        intent.putExtra("conferencia", Integer.parseInt(tv.getText().toString()));
        startActivity(intent);


    }


    private void insertConferencias(){
        Conferencia conferencia1 = new Conferencia("Conferencia 1", 9, "Descrição 1", "Comentários 1");
        Conferencia conferencia2 = new Conferencia("Conferencia 2", 11, "Descrição 2", "Comentários 2");
        conferencias.add(conferencia1);
        conferencias.add(conferencia2);
    }

    public static Conferencia getConferencia(int dia){
        for (Conferencia c : conferencias) {
            if (c.getDiaDoMes() == dia){
                return c;
            }
        }
        return null;
    }
}