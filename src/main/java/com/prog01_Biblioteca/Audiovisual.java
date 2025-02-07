package com.prog01_Biblioteca;

import com.prog01_Interfaces.Inventariable;

abstract class Audiovisual extends Producto implements Inventariable {

    protected String compania;
    protected String codInventario;

    public String getCodigoInventario () {
        return codInventario;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }
}
