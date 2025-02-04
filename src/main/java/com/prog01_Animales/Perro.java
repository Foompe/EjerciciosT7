package com.prog01_Animales;

public class Perro extends Animal {

    private String raza;
    private String tamano;

    public Perro(int edad, String nombre, String tamano, String raza) {
        super(edad, nombre);
        this.tamano = tamano;
        this.raza = raza;
    }

    @Override
    public void saludar() {
        System.out.println("¡GUAU!");
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    @Override
    public String toString() {
        return "Perro:\nNombre: " + getNombre() + "\nEdad: " + getEdad() + "\nRaza: " + raza + "\nTamaño: " + tamano +
                "\n-------------------------------";
    }
}
