package com.prog01_Personas;

import java.util.List;

public class Alumno extends Persona{
    protected List<String> modulos;

    //constructor con todos los datos
    public Alumno (List<String> modulos,String nombre,String apellido, int edad) {
        super(nombre,apellido,edad);
        this.modulos=modulos;
    }

    @Override
    public void saludar() {
        System.out.println("Hola, soy " + nombre + " y soy alumno");
    }

    public String toString() {
        return "Datos Alumno:\nNombre: " + nombre + "\nApellidos: " + apellidos +
                "\nEdad: " + edad + "\nModulos: " + modulos + "\n--------------------------------------------------";
    }
}
