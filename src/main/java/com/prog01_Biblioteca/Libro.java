package com.prog01_Biblioteca;

import com.prog01_Interfaces.Inventariable;

public class Libro extends Lectura implements Inventariable {
    protected String autor;
    protected int nPag;
    protected String codInventario;

    //definir constructor
    public Libro(String autor, int nPag,String titulo, String editor,int ano, String codInventario) {
        this.autor = autor;
        this.nPag = nPag;
        this.titulo = titulo;
        this.editor = editor;
        this.ano = ano;
        this.codInventario = codInventario;
    }

    @Override
    public String getCodigoInventario() {
        return codInventario;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "autor='" + autor + '\'' +
                ", nPag=" + nPag +
                ", ano=" + ano +
                ", editor='" + editor + '\'' +
                ", titulo='" + titulo + '\'' +
                ", codigo inventario='" + codInventario + '\'' +
                '}';
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
