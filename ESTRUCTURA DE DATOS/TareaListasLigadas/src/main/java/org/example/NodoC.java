package org.example;

public class NodoC {
    private NodoC Sig;
    private int Dato;

    public NodoC (int Dato){   //Inicializo mis variables
        this.Dato = Dato;
        this.Sig = this;
    }

    public NodoC getSig() {
        return Sig;
    }

    public void setSig(NodoC sig) {
        this.Sig = sig;
    }

    public int getDato() {
        return Dato;
    }

    public void setDato(int Dato) {
        this.Dato = Dato;
    }
}
