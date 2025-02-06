package com.prog01_Biblioteca;

public class Libro extends Lectura{
    protected String autor;
    protected int nPag;

    //definir constructor
    public Libro(String autor, int nPag,String titulo, String editor,int ano) {
        this.autor = autor;
        this.nPag = nPag;
        this.titulo = titulo;
        this.editor = editor;
        this.ano = ano;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getnPag() {
        return nPag;
    }

    public void setnPag(int nPag) {
        this.nPag = nPag;
    }
}
