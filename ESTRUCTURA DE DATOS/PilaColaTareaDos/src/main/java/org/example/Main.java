package org.example;

import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        Pila pila = new Pila();
        System.out.println("-------PILA-------");
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);
        System.out.println("PUSH ");
        pila.mostrarPila();
        System.out.println("PEEK");
        System.out.println(pila.peek());
        pila.pop();
        System.out.println("POP ");
        pila.mostrarPila();
        System.out.println("PEEK");
        System.out.println(pila.peek());

        System.out.println("-----COLA------");
        Cola cola = new Cola();
        cola.enqueue(2);
        cola.enqueue(8);
        cola.enqueue(4);
        cola.enqueue(9);
        cola.enqueue(3);
        System.out.println("ENQUEUE");
        cola.mostrarCola();
        System.out.println("DEQUEUE");
        int valoreliminado = cola.dequeue();
        System.out.println(valoreliminado);
        System.out.println("Lista actualizada despues de DEQUEUE");
        cola.mostrarCola();
        System.out.println("PEEK");
        System.out.println(cola.peek());
    }
}