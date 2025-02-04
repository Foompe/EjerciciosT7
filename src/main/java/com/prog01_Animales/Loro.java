package com.prog01_Animales;

public class Loro extends Animal{

    private String color;

    public Loro(int edad, String nombre, String color) {
        super(edad, nombre);
        this.color = color;
    }

    @Override
    public void saludar() {
        System.out.println("¡HOLA HOLA!");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Loro:\nNombre: " + getNombre() + "\nEdad: " + getEdad() + "\nColor: " + color +
                "\n-------------------------------";
    }
}
