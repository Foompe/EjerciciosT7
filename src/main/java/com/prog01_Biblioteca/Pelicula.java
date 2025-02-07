package com.prog01_Biblioteca;

public class Pelicula extends Audiovisual{

    protected String director;
    protected int duracion;

    public Pelicula(String director, int duracion,String compania, String titulo, String codInventario) {
        this.director = director;
        this.duracion = duracion;
        this.compania = compania;
        this.titulo = titulo;
        this.codInventario = codInventario;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "director='" + director + '\'' +
                ", duracion=" + duracion +
                ", compania='" + compania + '\'' +
                ", titulo='" + titulo + '\'' +
                ", codigo inventario='" + codInventario + '\'' +
                '}';
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
