package org.example;

public class Cola {
    NodoC inicio=null;
    NodoC fin = null;
    int tamano;

    public void enqueue (int datoC){
        NodoC nuevo = new NodoC();
        nuevo.datoC=datoC;
        nuevo.anterior=null;
        nuevo.next=null;
        if(inicio !=null){
            inicio.anterior=nuevo;
            nuevo.next=inicio;
            inicio=nuevo;
        }else {
            inicio=nuevo;
            fin=nuevo;
        }
    }
    public int dequeue(){
        int aux= inicio.datoC;
        inicio=inicio.next;
        tamano--;
        return aux;
    }

    public int peek () {
        if (inicio != null) {
            return inicio.datoC;
        }
        return 0;
    }
    public void mostrarCola (){
        NodoC actual = new NodoC();
        actual = inicio;
        if (inicio != null){
            while (actual != null){ //si esto es correcto, seguir recorriendo la cola
                System.out.println(" " + actual.datoC);
                actual = actual.next;
            }
        }else{
            System.out.println("La cola está vacia, ingrese nuevos datos");
        }
    }
}
