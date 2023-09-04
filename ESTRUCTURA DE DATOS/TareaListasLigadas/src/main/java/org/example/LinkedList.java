package org.example;

public class LinkedList {
    private Nodo cabeza;

    //agregar nodos a final de la lista
    public void AgregarFinal(int valor){
        //checar si la lista está vacia, si es que sí el nodo que agregue será la cabeza
        if (vacia()==true){
            cabeza= new Nodo(valor);
            return;
        }
        //si lo anterior no pasa, itero en la lista hasta encontrar el nodo que tiene como sig. nodo null (ultimo elemento)
        Nodo mensajero= cabeza;
        while (mensajero.siguiente!=null){
            mensajero=mensajero.siguiente;
        }
            //mientras tanto que el nodo sig. es distinto de null, seguir iterando.
        mensajero.siguiente=new Nodo(valor);
    }

    public void AgregarInicio(int valor){
        //checar si la lista está vacía
        if(vacia()){
            cabeza=new Nodo(valor);
            return;
        }
        //si lo anterior no pasa 1. creo un nodo
        Nodo nuevo=new Nodo(valor);
        nuevo.siguiente=cabeza;
        cabeza=nuevo;
    }

    public void eliminarValor(int valor){
        //checar que la lista enlazada está vacía
        if(vacia())
            return; //1.si esta vacia, salimos
        if(cabeza.valor==valor){  //2.si la cabeza tiene el valor que quiero quitar, entonces..
            cabeza=cabeza.siguiente; //aqui la cabeza le dará su lugar al que le sigue, para así no borrar la lista completa
            return;
        }
        //3.iterar desde la cabeza y parar un nodo antes del que quiero eliminar
        Nodo mensajero = cabeza; //el mensajero es el que itera e inicia desde la cabeza
        while (mensajero.siguiente!=null){
            if (mensajero.siguiente.valor==valor){
                mensajero.siguiente=mensajero.siguiente.siguiente;    //quiero que cambie de nodo
                return;
            }
            //4.si aún no lo encuentro sigo iterando hasta el final (hasta encontrarlo)
            mensajero=mensajero.siguiente;
        }
    }
    public void mostrar(){
        //verificar si la lista esta vacía
        if(vacia()){
            System.out.println("La lista está vacía, por favor agregue valores");
            return;
        }
        Nodo mensajero=cabeza;
        while (mensajero!=null){
            System.out.println("\n"+mensajero.valor);
            mensajero=mensajero.siguiente;
        }
    }

    public void revertir(){
        if(cabeza== null || cabeza.siguiente == null ){
            return;
        }
        Nodo previo = null;
        Nodo actual = cabeza;
        Nodo sig = null;
        while (actual != null){
            sig = actual.siguiente;
            actual.siguiente=previo;
            previo = actual;
            actual=sig;
        }
        cabeza = previo;
    }
    private boolean vacia(){
        //puedo verificar esto diciendo que si no hay parte cabecera esta vacia
        if(cabeza==null)
            return true;
        else
            return false;
    }
}
