package org.example;

import java.util.Scanner;

public class Cola {
    Nodo cabeza;
    Nodo ultimo;
    Scanner teclado = new Scanner(System.in);

    public Cola(){
        cabeza = null;
        ultimo = null;
    }
    public void insertarNodo(){
        Nodo nuevo = new Nodo();
        System.out.println("Ingrese un dato:");
        nuevo.dato = teclado.nextInt();
        if (cabeza ==null){
            cabeza = nuevo;
            cabeza.next=null;
            ultimo = nuevo;
        }else{
            ultimo.next=nuevo;
            nuevo.next=null;
            ultimo=nuevo;
        }
    }
    public void buscarNodo(){
        Nodo actual = new Nodo();
        actual=cabeza;
        boolean encontrado = false;
        System.out.println("¿Qué dato busca?");
        int nodoBuscado = teclado.nextInt();

        if(cabeza != null){
            while (actual != null && encontrado != true){
                if(actual.dato == nodoBuscado){
                    System.out.println("El dato se encontró y es: " + nodoBuscado);
                    encontrado = true;
                }
                actual = actual.next;
            }
            if(!encontrado){
                System.out.println("Este dato no se encuentra en la Cola");
            }
        }else{
            System.out.println("La cola está vacia, ingrese nuevos datos");
        }
    }
    public void modificarNodo(){
        Nodo actual = new Nodo();
        actual=cabeza;
        boolean encontrado = false;
        System.out.println("¿Qué dato desea modificar?");
        int nodoBuscado = teclado.nextInt();

        if(cabeza != null){
            while (actual != null && encontrado != true){
                if(actual.dato == nodoBuscado){
                    System.out.println("El dato se encontró y es: " + nodoBuscado);
                    System.out.println("Introduzca el nuevo valor:");
                    actual.dato =teclado.nextInt();
                    System.out.println("Se ha modificado con exito");
                    encontrado = true;
                }
                actual = actual.next;
            }
            if(!encontrado){
                System.out.println("Este dato no se encuentra en la Cola");
            }
        }else{
            System.out.println("La cola está vacia, ingrese nuevos datos");
        }
    }
    public void eliminarNodo(){
        Nodo actual = new Nodo();
        actual=cabeza;
        Nodo anterior = new Nodo();
        anterior = null;

        boolean encontrado = false;
        System.out.println("¿Qué dato desea eliminar?");
        int nodoBuscado = teclado.nextInt();
        if(cabeza != null){
            while (actual != null && encontrado != true){
                if(actual.dato == nodoBuscado){
                    if (actual == cabeza){
                        cabeza= cabeza.next;
                    }else if (actual == ultimo){
                        anterior.next = null;
                        ultimo = anterior;
                    }else{
                       anterior.next = actual.next;
                    }
                    System.out.println("Se eliminó correctamente");
                    encontrado = true;
                }
                anterior=actual;
                actual = actual.next;
            }
            if(!encontrado){
                System.out.println("Este dato no se encuentra en la Cola");
            }
        }else{
            System.out.println("La cola está vacia, ingrese nuevos datos");
        }
    }
    public void mostrarCola(){
        Nodo actual = new Nodo();
        actual=cabeza;
        if(cabeza != null){
           while (actual != null){
               System.out.println(" " + actual.dato);
               actual = actual.next;
           }
        }else{
            System.out.println("La cola está vacia, ingrese nuevos datos");
        }
    }
}
