package com.prog01_Animales;

public class Animal implements Saludable{
    private String nombre;
    private int edad;

    public Animal(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }

    @Override
    public void saludar() {

    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
