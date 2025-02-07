package com.prog01_Biblioteca;

public class Videojuego extends Audiovisual{

    protected String plataforma;

    public Videojuego(String plataforma,String compania, String titulo,String codInventario) {
        this.plataforma = plataforma;
        this.compania = compania;
        this.titulo = titulo;
        this.codInventario = codInventario;
    }

    @Override
    public String toString() {
        return "Videojuego{" +
                "plataforma='" + plataforma + '\'' +
                ", compania='" + compania + '\'' +
                ", titulo='" + titulo + '\'' +
                ", codigo inventario='" + codInventario + '\'' +
                '}';
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }
}
