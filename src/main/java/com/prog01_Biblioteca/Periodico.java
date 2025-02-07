package com.prog01_Biblioteca;

import java.time.LocalDate;

public class Periodico extends Lectura{

    protected LocalDate fechaPublic;

    public Periodico(LocalDate fechaPublic, String titulo, String editor, int ano) {
        this.fechaPublic = fechaPublic;
        this.titulo = titulo;
        this.editor = editor;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Periodico{" +
                "fechaPublic=" + fechaPublic +
                ", ano=" + ano +
                ", editor='" + editor + '\'' +
                ", titulo='" + titulo + '\'' +
                '}';
    }

    public LocalDate getFechaPublic() {
        return fechaPublic;
    }

    public void setFechaPublic(LocalDate fechaPublic) {
        this.fechaPublic = fechaPublic;
    }
}
