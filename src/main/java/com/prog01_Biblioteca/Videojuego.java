package com.prog01_Biblioteca;

public class Videojuego extends Audiovisual{

    protected String plataforma;

    public Videojuego(String plataforma,String compania, String titulo) {
        this.plataforma = plataforma;
        this.compania = compania;
        this.titulo = titulo;
    }


    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }
}
