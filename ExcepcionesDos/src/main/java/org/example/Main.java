package org.example;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        LeerArchivo lectura = new LeerArchivo();
        //por el throws IOExceptio hago un try catch aquí
        //ya que obligo al metodo que mando a llamar a leer (este main), a que implem. el metodo trycatch
        try {
            lectura.metodoUno("datos.txt"); //pila de llamadas
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}