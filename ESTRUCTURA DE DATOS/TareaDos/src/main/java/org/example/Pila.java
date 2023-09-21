package org.example;


import java.util.Scanner;

public class Pila {
    Scanner Entrada = new Scanner(System.in);
    Nodo cabeza; //Mi variable será del tipo Nodo (tendrá mi dato y el apuntador)
    public Pila (){
        cabeza= null;
    }

    //FUNCIONA COMO EL PUSH
    public void ingresarNodo(){
        Nodo nuevo = new Nodo (); //agrego nuevo nodo a la pila y le pido por teclado un dato al usuario
        System.out.println("Ingrese un dato:");
        nuevo.dato = Entrada.nextInt();

        nuevo.next = cabeza; //el nuevo nodo tiene un apuntador hacia next (apuntando a null)
        cabeza = nuevo;
    }

    //FUNCIONA COMO PEEK (me muestra el valor de la cabeza, o cualquier otro valor de mi lista)
    public void buscarNodo(){  //recorro la pila para buscar el nodo
        Nodo actual = new Nodo();          //actual = es el nodo recorredor
        actual = cabeza;
        boolean encontrado = false;
        System.out.println("¿Qué dato busca?");
        int nodoBuscado = Entrada.nextInt();
        if (cabeza != null){
            while (actual != null && encontrado != true) { //si esto es correcto, seguir recorriendo la pila
                if (actual.dato == nodoBuscado) {
                    System.out.println("\n El dato se encontró, y es: " + nodoBuscado);
                    encontrado = true;
                }
                actual = actual.next; //saltar de un nodo a otro dentro de la pila, hasta llegar al null ()el final de la pila
            }
                if (!encontrado){
                    System.out.println("\n Este dato no sse encuentra en la Pila\n");
                }

        }else{
            System.out.println("La pila está vacia, ingrese nuevos datos");
        }

    }

    public void modificarNodo() {
        Nodo actual = new Nodo();          //actual = es el nodo recorredor
        actual = cabeza;
        boolean encontrado = false;
        System.out.println("¿Qué dato desea modificar?");
        int nodoBuscado = Entrada.nextInt();
        if (cabeza != null) {
            while (actual != null && encontrado != true) { //si esto es correcto, seguir recorriendo la pila
                if (actual.dato == nodoBuscado) {
                    System.out.println("\n El dato encontrado es: " + nodoBuscado);
                    System.out.println("Introduzca el nuevo valor: ");
                    actual.dato = Entrada.nextInt();
                    System.out.println("Se ha modificado con exito");
                    encontrado = true;
                }
                actual = actual.next; //saltar de un nodo a otro dentro de la pila, hasta llegar al null ()el final de la pila
            }
            if (!encontrado) {
                System.out.println("\n Este dato no sse encuentra en la Pila\n");
            }
        } else {
            System.out.println("La pila está vacia, ingrese nuevos datos");
        }
    }

    //FUNCIONA COMO POP (pero tambien puede eliminar otros valores ademas de mi cabeza)
    public void eliminarNodo(){
        Nodo actual = new Nodo();
        actual = cabeza;
        Nodo anterior = new Nodo ();
        anterior = null;
        boolean encontrado = false;
        System.out.println("¿Qué dato desea eliminar?");
        int nodoBuscado = Entrada.nextInt();
        if (cabeza != null){
            while (actual != null && encontrado != true) {
                if (actual.dato == nodoBuscado) {
                    if (actual == cabeza) {
                        cabeza = cabeza.next;
                    }else {
                        anterior.next = actual.next;
                    }
                    System.out.println("\n El dato " + nodoBuscado + " ha sido eliminado");
                    encontrado = true;
                }
                anterior = actual;
                actual = actual.next;
            }
                if (!encontrado){
                    System.out.println("\n Este dato no sse encuentra en la Pila\n");
                }

        }else{
            System.out.println("La pila está vacia, ingrese nuevos datos");
        }
    }


    public void mostrarPila (){   //name desplegarPila
        Nodo actual = new Nodo();          //actual = es el nodo recorredor
        actual = cabeza;
        if (cabeza != null){
            while (actual != null){ //si esto es correcto, seguir recorriendo la pila
                System.out.println(" " + actual.dato);
                actual = actual.next; //saltar de un nodo a otro dentro de la pila, hasta llegar al null ()el final de la pila
            }
        }else{
            System.out.println("La pila está vacia, ingrese nuevos datos");
        }
    }


}
