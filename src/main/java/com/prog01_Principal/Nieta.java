package com.prog01_Principal;

public class Nieta extends Hija {
    Nieta() {
        super(); //este constructor no es necesario llamarlo ya que existe por defecto
        System.out.println("En el constructor sin parámetros de la clase nieta");
    }
    Nieta (String mensaje){
        super(mensaje);
        System.out.println("En el constructor con mensaje de la clase nieta: " +mensaje);
    }
    Nieta (int numero){
        super(numero);
        System.out.println("En el constructor con número de la clase nieta: " + numero);
    }
}

