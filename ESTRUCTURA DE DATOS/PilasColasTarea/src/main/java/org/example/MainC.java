package org.example;

public class MainC {
    public static void main(String[] args) {
        System.out.println("-------COLA-------");
        Cola cola = new Cola();
        cola.enqueue(3);
        cola.enqueue(7);
        cola.enqueue(8);
        cola.enqueue(22);
        cola.mostrar();
    }
}
