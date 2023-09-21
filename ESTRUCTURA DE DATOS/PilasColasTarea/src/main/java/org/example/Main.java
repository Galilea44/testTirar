package org.example;

import java.util.Scanner;

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


    }
}