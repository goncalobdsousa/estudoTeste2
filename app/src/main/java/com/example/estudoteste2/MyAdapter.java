package com.example.estudoteste2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {
    ArrayList<Conferencia> conferencias;
    MyViewHolder myViewHolder;

    public MyAdapter(ArrayList<Conferencia> conferenciasList) {
        conferencias = conferenciasList;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;

        view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.layoutrv, parent, false);

        myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        myViewHolder.textViewTitulo.setText(conferencias.get(position).getTitulo());
        myViewHolder.textViewDia.setText("" + conferencias.get(position).getDiaDoMes());
    }

    @Override
    public int getItemCount() {
        return conferencias.size();
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }
}
