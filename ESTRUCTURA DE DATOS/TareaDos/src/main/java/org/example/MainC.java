package org.example;

import java.util.Scanner;

public class MainC {
    public static void main(String[] args){
        Cola cola = new Cola();
        Scanner teclado = new Scanner(System.in);
        int opcionMenu = 0;
        do {
            System.out.println("\n |------------------------------|");
            System.out.println("\n |       METODOS DE COLA        |");
            System.out.println("\n |--------------|---------------|");
            System.out.println("\n |1.Insertar    |   4. Eliminar |");
            System.out.println("\n |2.Buscar      |   5.Desplegar |");
            System.out.println("\n |3.Modifitar   |   6. Salir    |");
            System.out.println("Seleccione una opción: ");
            opcionMenu = teclado.nextInt();
            switch (opcionMenu){
                case 1:
                    System.out.println("\n\n Insertar Nodo \n");
                    cola.insertarNodo();
                    break;
                case 2:
                    System.out.println("\n\n Buscar Nodo \n");
                    cola.buscarNodo();
                    break;
                case 3:
                    System.out.println("\n\n Modificar Nodo \n");
                    cola.modificarNodo();

                    break;
                case 4:
                    System.out.println("\n\n Eliminar Nodo \n");
                    cola.eliminarNodo();

                    break;
                case 5:
                    System.out.println("\n\n Mostrar Nodo \n");
                    cola.mostrarCola();
                    break;
                case 6:
                    System.out.println("\n\n Programa finalizado... \n");
                    break;
                default:
                    System.out.println("\n\n Opcion no valida \n");
                    break;
            }
        }
        while (opcionMenu !=6 );
    }
}
