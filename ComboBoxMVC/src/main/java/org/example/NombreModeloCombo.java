package org.example;

import javax.swing.*;
import javax.swing.event.ListDataListener;
import java.util.ArrayList;

public class NombreModeloCombo implements ComboBoxModel {
    ArrayList<String> datos;  //administra la información que la vista va a mostrar
    String selected; //este objeto representa el elemnto seleccionado

    public NombreModeloCombo() {
        datos = new ArrayList<>();
    }

    public NombreModeloCombo(ArrayList<String> datos) {
        this.datos = datos;
    }

    @Override
    public void setSelectedItem(Object anItem) {
        this.selected =(String) anItem;

    }

    @Override
    public Object getSelectedItem() {
        return selected;
    }

    @Override
    public int getSize() {
        return datos.size(); //le respondemos a la lista cuantos hay que mostrar
    }

    @Override
    public Object getElementAt(int index) {  //elemento posición
        return datos.get(index);
    }

    @Override
    public void addListDataListener(ListDataListener l) {

    }

    @Override
    public void removeListDataListener(ListDataListener l) {

    }
    public void agregarNombre(String nom){
        datos.add(nom); //con esto agrego datos al modelo

    }
}
