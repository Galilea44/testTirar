package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in); //

        //IMP. encerrar en un try catch el codigo que posiblemente  lance una excepcion
        try {
            int a = 10;
            int b = Integer.parseInt(scanner.nextLine()); // lo vamos a obtener como text. y convertir a entero
            System.out.println("Division:" + (a/b));
        }catch (ArithmeticException e){
            // el objeto e recopila toda la info de la excepcion y la pone en el catch
            //e.printStackTrace(); // te pinta toda la pila de errores
            System.out.println("No se puede dividir entre cero");
        }catch (NumberFormatException nfe){
            System.out.println("No capturaste el dato correctamente");
        } finally {   //cerrar recursos
            System.out.println("Siempre se ejecuta");
        }
        System.out.println("Fin del programa");
        //marca un error porque la división entre 0 se vuelve infinito
        //ocurre una excepcion
    }
}