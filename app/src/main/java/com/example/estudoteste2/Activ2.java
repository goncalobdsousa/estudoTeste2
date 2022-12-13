package com.example.estudoteste2;

import static com.example.estudoteste2.MainActivity.getConferencia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Activ2 extends AppCompatActivity {
    private TextView textViewTitulo;
    private EditText editTextAlt;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activ2);
        intent = getIntent();
        textViewTitulo = findViewById(R.id.textView2);
        textViewTitulo.setText(getConferencia(intent.getIntExtra("conferencia", 0)).toString());
        int dia = intent.getIntExtra("conferencia", 0);

    }

    public void finish(View v){
        finish();
    }

    public void onClick(View v){
        int dia = intent.getIntExtra("conferencia", 0);
        editTextAlt = findViewById(R.id.editTextTextPersonName);
        String comentarioAlt = editTextAlt.getText().toString();
        String comentario = getConferencia(dia).getComentarios() + "\n" + comentarioAlt;
        getConferencia(dia).setComentarios(comentario);
        textViewTitulo.setText(getConferencia(intent.getIntExtra("conferencia", 0)).toString());
    }


}