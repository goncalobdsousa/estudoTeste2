package com.example.estudoteste2;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {
    TextView textViewTitulo;
    TextView textViewDia;
    TextView textViewDescricao;
    TextView textViewComentarios;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        textViewTitulo = itemView.findViewById(R.id.textViewTitulo);
        textViewDia = itemView.findViewById(R.id.textViewDia);
    }

}

