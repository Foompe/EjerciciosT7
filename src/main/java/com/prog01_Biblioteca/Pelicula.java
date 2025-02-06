package com.prog01_Biblioteca;

public class Pelicula extends Audiovisual{

    protected String director;
    protected int duracion;

    public Pelicula(String director, int duracion,String compania, String titulo) {
        this.director = director;
        this.duracion = duracion;
        this.compania = compania;
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
}
