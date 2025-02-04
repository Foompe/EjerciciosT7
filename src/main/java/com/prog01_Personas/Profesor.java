package com.prog01_Personas;

public class Profesor extends Persona{
    protected int nuss;
    protected int tlfn;
    protected String horario;

    //constructor con todos los datos
    public Profesor (String nombre,String apellidos, int edad, int nuss, int tlfn,String horario) {
        super(nombre,apellidos,edad);
        this.nuss=nuss;
        this.tlfn=tlfn;
        this.horario=horario;
    }

    @Override
    public String toString() {
        return "Datos profesor:\nNombre: " + nombre + "\nApellidos: " + apellidos +
                "\nEdad: " + edad + "\nnuss: " + nuss + "\nTelefono: " + tlfn +
                "\nHorario: " + horario + "\n--------------------------------------------------";
    }
}
