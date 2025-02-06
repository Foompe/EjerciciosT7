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

    public LocalDate getFechaPublic() {
        return fechaPublic;
    }

    public void setFechaPublic(LocalDate fechaPublic) {
        this.fechaPublic = fechaPublic;
    }
}
