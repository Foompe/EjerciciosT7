package com.prog01_Principal;
import com.prog01_Animales.*;
import com.prog01_Interfaces.Saludable;
import com.prog01_Personas.Alumno;
import com.prog01_Personas.Profesor;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Alumno alumno = new Alumno(Arrays.asList("Matematicas", "Historia"), "Carlos", "Suarez", 23);
        Profesor profesor = new Profesor("Ana", "Ramirez", 45, 5589628, 6565656, "Lunes a viernes 9:00 - 17:00");
/**     //creamos un array de persona
 Persona[] personas = {alumno,profesor};
 //recorremos el array
 for (Persona persona : personas) {
 System.out.println(persona);
 } **/

        Perro perro = new Perro(16, "Rocky", "Mediano", "Partor Aleman");
        Gato gato = new Gato(10, "Kira", "Comun Europeo");
        Loro loro = new Loro(5, "Federico", "Azul");
        Pez pez = new Pez(2, "jose", "Rojo", "Pequeño");
/**
        System.out.println(perro);
        System.out.println(gato);
        System.out.println(loro);
        System.out.println(pez);

        Animal[] animales = {perro, gato, loro, pez};
        for (Animal animal : animales) {
            animal.saludar();
        }


        Persona[] personas = {alumno, profesor};
        //recorremos el array
        for (Persona persona : personas) {
            persona.saludar();
        }
        */
        Saludable[] saludo = {perro,gato,pez,loro,alumno,profesor};
        for (Saludable saludar : saludo) {
            saludar.saludar();
        }
    }
}