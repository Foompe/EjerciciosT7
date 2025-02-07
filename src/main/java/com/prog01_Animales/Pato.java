package com.prog01_Animales;

import com.prog01_Interfaces.Caminable;
import com.prog01_Interfaces.Nadable;

public class Pato extends Animal implements Caminable, Nadable {

    private double peso;

    public Pato (String nombre, int edad, double peso) {
        super(edad, nombre);
        this.peso = peso;
    }

    @Override
    public void caminar() {
        System.out.println("El pato camina");
    }

    @Override
    public void nadar() {
        System.out.println("El pato nada");
    }

    @Override
    public String toString() {
        return "Pato:\nNombre: " + getNombre() + "\nEdad: " + getEdad() + "\nPeso: " + peso +
                "\n-------------------------------";
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
