package com.prog01_Biblioteca;

abstract class Lectura extends Producto{
    protected String editor;
    protected int ano;

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }
}
