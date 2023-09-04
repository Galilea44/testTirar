package org.example;

public class NodoDoble {
    public int valor;          //Defino mis variables
    public NodoDoble siguiente;
    public NodoDoble anterior;


    public NodoDoble(int elemento, NodoDoble s, NodoDoble a){ //este es un constructor para cuando ya tenga nodos
        valor = elemento;
        siguiente =s;
        anterior = a;
    }
    public NodoDoble(int elemento) {   //contructor para cuando no tengo datos
        this (elemento, null, null ); //creo los apuntadores
    }

    public int getValor() {
        return this.valor;
    }

    public NodoDoble getSiguiente() {
        return this.siguiente;
    }

    public void setSiguiente(NodoDoble s) {
        this.siguiente = s;
    }

    public NodoDoble getAnterior() {
        return this.anterior;
    }

    public void setAnterior(NodoDoble a) {
        this.anterior = a;
    }
}
