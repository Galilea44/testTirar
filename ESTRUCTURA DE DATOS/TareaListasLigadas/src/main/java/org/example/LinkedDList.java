package org.example;

import javax.swing.*;

public class LinkedDList {
    private NodoDoble inicio;
    private NodoDoble fin;

    public LinkedDList(){  //voy a inicializar las variables
        inicio =fin= null;
    }
    //checar si la lista está vacía
    public boolean EstaVacia(){ //si incio apunta a null está vacio
        return inicio ==null;
    }
    public void AgregarAlInicio(int elemento){
        if(!EstaVacia()){     //si no está vacía hago esto
            inicio = new NodoDoble(elemento, inicio, null);
            inicio.siguiente.anterior=inicio; //creo el doble enlace para el nodo de lo contrario..
        }else{
            inicio= fin=new NodoDoble(elemento);
        }
    }
    public void AgregarAlFinal(int elemento){
        if (!EstaVacia()){
            fin =new NodoDoble(elemento,null, fin);
            fin.anterior.siguiente=fin;
        }else{
            inicio=fin=new NodoDoble(elemento);
        }
    }

    public void MostrarListaDeInicioAFin(){
        if (!EstaVacia()){
            //si no está vacía
            String concatena ="--";
            NodoDoble aux = inicio;
            while (aux!=null){
                concatena= concatena + "[" + aux.valor + "]--";
                aux = aux.siguiente;
            }
            JOptionPane.showMessageDialog(null,concatena, "Mostrando datos de" +  " inicio al final de la lista", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    public void MostrarListaDelFinAlInicio(){
        if (!EstaVacia()){
            //si no está vacía
            String concatena ="--";
            NodoDoble aux = fin;
            while (aux!=null){
                concatena= concatena + "[" + aux.valor + "]--";
                aux = aux.anterior;
            }
            JOptionPane.showMessageDialog(null,concatena, "Mostrando datos del" +  " final al inicio de la lista", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    public int eliminarElementoDelInicio(){
        int elemento = inicio.valor;
        if (inicio==fin) {  //si incio es igual a fin quiere decir que en la lista solo hay un dato
            inicio=fin=null;
        }else{ //si no hay un solo dato, entonces...
            inicio =inicio.siguiente;// el puntero 1, ya no apuntará al dato 2, sino a la direccion de sig. del puntero 2 (este puntero 2, apunta al dato 3)
            inicio.anterior=null;
        }
        return elemento; //este es el dato que estoy eliminando
    }
    public int eliminarElementoDelFinal(){
        int elemento = fin.valor;
        if (inicio==fin) {  //si incio es igual a fin quiere decir que en la lista solo hay un dato
            inicio=fin=null;
        }else{ //si no hay un solo dato, entonces...
            fin =fin.anterior;
            fin.siguiente=null;
        }
        return elemento; //este es el dato que estoy eliminando
    }
    public void revertir (){
        if (inicio==null || inicio.siguiente== null){
            return;
        }
        NodoDoble actual = inicio;
        NodoDoble siguiente = null;
        while (actual != null){
            siguiente = actual.siguiente;
            actual.siguiente=actual.anterior;
            actual.anterior=siguiente;
            actual=siguiente;
        }
        NodoDoble temporal= inicio;
        inicio = fin;
        fin=temporal;
    }
    public void mostrar(){
        //verificar si la lista esta vacía
        if(EstaVacia()){
            System.out.println("La lista está vacía, por favor agregue valores");
            return;
        }
        NodoDoble mensajero=inicio;
        while (mensajero!=null){
            System.out.println("\n"+mensajero.valor);
            mensajero=mensajero.siguiente;
        }
    }

}
