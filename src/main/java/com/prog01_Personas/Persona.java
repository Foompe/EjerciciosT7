package com.prog01_Personas;

import com.prog01_Animales.Saludable;

public class Persona implements Saludable {
    protected String nombre;
    protected String apellidos;
    protected int edad;

    //constructor con todos los datos
    protected Persona (String nombre,String apellidos,int edad) {
        this.nombre= nombre;
        this.apellidos=apellidos;
        this.edad=edad;
    }

    @Override
    public void saludar() {

    }
}
