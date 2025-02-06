package com.prog01_Biblioteca;

public class Revista extends Lectura{

    protected String tema;
    protected int nEdicion;

    public Revista(int nEdicion, String tema,String titulo, String editor, int ano) {
        this.nEdicion = nEdicion;
        this.tema = tema;
        this.titulo = titulo;
        this.editor = editor;
        this.ano = ano;
    }

    public int getnEdicion() {
        return nEdicion;
    }

    public void setnEdicion(int nEdicion) {
        this.nEdicion = nEdicion;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }
}
