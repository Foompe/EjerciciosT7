package com.prog01_Principal;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Empezamos");
        System.out.println("Constructor sin parametros");
        Nieta nieta=new Nieta();

        System.out.println("\nConstructor con mensaje");
        Nieta nieta2=new Nieta(" Hola mundo");

        System.out.println("\nConstructor con numero");
        Nieta nieta3 =new Nieta (-1);
    }

}