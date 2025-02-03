package com.prog01_Principal;

public class Padre{
    Padre() {
        System.out.println("En el constructor sin parametros del padre");
    }
    Padre (String mensaje){
        System.out.println("En el constructor con mensaje del padre: " +mensaje);
    }
    Padre (int numero){
        System.out.println("En el constructor con numero del padre: " + numero);
    }
}

