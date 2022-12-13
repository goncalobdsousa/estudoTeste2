package com.example.estudoteste2;

public class Conferencia {
    private String Titulo;
    private int diaDoMes;
    private String Descricao;
    private String Comentarios;

    public Conferencia(String Titulo, int diaDoMes, String Descricao, String Comentarios) {
        this.Titulo = Titulo;
        this.diaDoMes = diaDoMes;
        this.Descricao = Descricao;
        this.Comentarios = Comentarios;
    }

    public String getTitulo() {
        return Titulo;
    }

    public int getDiaDoMes() {
        return diaDoMes;
    }

    public String getDescricao() {
        return Descricao;
    }

    public String getComentarios() {
        return Comentarios;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public void setDiaDoMes(int diaDoMes) {
        this.diaDoMes = diaDoMes;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public void setComentarios(String Comentarios) {
        this.Comentarios = Comentarios;
    }

    public String toString() {
        return "Titulo: " + Titulo + " Dia: " + diaDoMes + " Descrição: " + Descricao + " Comentários: " + Comentarios;
    }

}
