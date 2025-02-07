package com.prog01_Empleados;

import com.prog01_Interfaces.Responsable;

public class Encargado extends Empleado implements Responsable {

    public Encargado(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
    }

    @Override
    public String toString() {
        return "Datos encargado:\n - Nombre: " + nombre + "\n - Apellido: " + apellido + "\n - Edad: " +edad;
    }

    @Override
    public void gestionarTareas() {
        System.out.println(nombre + " esta gestionando tareas");
    }

    @Override
    public void tomarDecisiones() {
        System.out.println(nombre + " esta tomando decisiones");
    }

    public void supervisar() {
        System.out.println("El encargado esta supervisando el trabajo del equipo");
    }
}
