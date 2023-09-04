package org.example;

import javax.swing.*;

public class LinkedCList {
    private NodoC Primero;
    public LinkedCList (){
        Primero = null;
    }
    public boolean Vacia (){  //checar si la lista está vacia
        return (Primero!= null);
    }
    public void Agregar(int data){
        NodoC nuevo = new NodoC(data);
        if (Vacia()){
            nuevo.setSig(Primero.getSig());
            Primero.setSig(nuevo);
        }
        Primero = nuevo;
    }

    public void Mostrar (){
        NodoC aux = Primero;
        if (Vacia()){
            do {
                System.out.println(" " + aux.getDato());
                aux = aux.getSig(); //para que se vaya recorriendo la lista
            }while (aux!=Primero);
        }
    }
    public boolean eliminar(int dato) {
        NodoC p = Primero;
        NodoC aux;
    boolean encontrado = false;
    if (Vacia()){
        while (p.getSig() != Primero && !encontrado){
            aux= p.getSig();
            encontrado = (aux.getDato()==dato);
            if(!encontrado){
                p=p.getSig();
            }
        }
        aux= p.getSig();
        encontrado=(aux.getDato()==dato);
        if(encontrado){
            if(Primero == Primero.getSig()){
                Primero=null;
            }else {
                if (aux==Primero){
                    Primero = p;
                }
                p.setSig(aux.getSig());
                aux=null;
            }
        }
    }
    return encontrado;
    }
}
