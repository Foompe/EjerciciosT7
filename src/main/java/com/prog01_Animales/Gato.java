package com.prog01_Animales;

public class Gato extends Animal{

    private String raza;

    public Gato(int edad, String nombre, String raza) {
        super(edad, nombre);
        this.raza = raza;
    }

    @Override
    public void saludar() {
        System.out.println("¡MIAU!");
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Gato:\nNombre: " + getNombre() + "\nEdad: " + getEdad() + "\nRaza: " + raza +
                "\n-------------------------------";
    }
}
