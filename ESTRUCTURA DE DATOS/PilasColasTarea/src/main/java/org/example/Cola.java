package org.example;

public class Cola {
    Nodo inicio = null;
    Nodo fin = null;

    public void enqueue(int dato) {
        Nodo nuevo = new Nodo();
        nuevo.dato = dato;
        nuevo.anterior = null;
        nuevo.next = null;
        if (inicio == null) {
            inicio.anterior = nuevo;
            nuevo.next = inicio;
            inicio = nuevo;
        } else {
            inicio = nuevo;
            fin = nuevo;
        }
    }

    public int dequeue() {
        if (fin != null) {
            Nodo auxd = new Nodo();
            auxd = fin;

            if (inicio == fin) {
                inicio = null;
                fin = null;
            } else {
                fin.next = null;
                fin = fin.anterior;
            }
            auxd.next = null;
            auxd.anterior = null;
            return auxd.dato;
        }else{
            return 0;
        }
    }
    public int peek () {
        if (inicio != null) {
            return inicio.dato;
        }
        return 0;
    }

    public void mostrar(){
        Nodo auxd=inicio;
        while (auxd !=null){
            System.out.println(auxd.dato);
            auxd=auxd.next;
        }
    }

}

