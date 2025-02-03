package com.prog01_Principal;

public class Hija extends Padre {
    Hija() {
        super();
        System.out.println("En el constructor sin parámetros de la clase hija");
    }
    Hija (String mensaje){
        super(mensaje);
        System.out.println("En el constructor con mensaje de la clase hija: " +mensaje);
    }
    Hija (int numero){
        super(numero);
        System.out.println("En el constructor con número de la clase hija: " + numero);
    }
}

