package com.prog01_Biblioteca;

import com.prog01_Interfaces.Inventariable;

public class Revista extends Lectura implements Inventariable {

    protected String tema;
    protected int nEdicion;
    protected String codInventario;

    public Revista(int nEdicion, String tema,String titulo, String editor, int ano, String codInventario) {
        this.nEdicion = nEdicion;
        this.tema = tema;
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
        return "Revista{" +
                "nEdicion=" + nEdicion +
                ", tema='" + tema + '\'' +
                ", ano=" + ano +
                ", editor='" + editor + '\'' +
                ", titulo='" + titulo + '\'' +
                ", codigo inventario='" + codInventario + '\'' +
                '}';
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
