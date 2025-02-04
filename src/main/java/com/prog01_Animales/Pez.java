package com.prog01_Animales;

public class Pez extends Animal{

    private String color;
    private String tamano;

    public Pez(int edad, String nombre, String color, String tamano) {
        super(edad, nombre);
        this.color = new String(color);
        this.tamano = tamano;
    }

    @Override
    public void saludar() {
        System.out.println("¡BLUB BLUB!");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    @Override
    public String toString() {
        return "Pez:\nNombre: " + getNombre() + "\nEdad: " + getEdad() + "\nColor: " + color + "\nTamaño: " + tamano +
                "\n-------------------------------";
    }
}
