package org.example;

public class Pila {
    Nodo inicio = null;

    public void push (int dato){
        Nodo nuevo = new Nodo();
        nuevo.dato = dato;
        nuevo.next = null;
        if(inicio==null){
            inicio = nuevo;
        }else {
            nuevo.next = inicio;
            inicio=nuevo;
        }
    }
    public int pop (){
        if (inicio != null){
            Nodo aux = inicio;
            inicio = inicio.next;
            aux.next=null;
            return aux.dato;
        }
        else {
            return 0;
        }
    }
    public int peek (){
        if (inicio != null){
            return inicio.dato;
        }
        return 0;
    }
    public void mostrarPila (){
        Nodo actual = new Nodo();
        actual = inicio;
        if (inicio != null){
            while (actual != null){ //si esto es correcto, seguir recorriendo la pila
                System.out.println(" " + actual.dato);
                actual = actual.next;
            }
        }else{
            System.out.println("La pila está vacia, ingrese nuevos datos");
        }
    }
}
