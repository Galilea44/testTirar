package org.example;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.util.ArrayList;

public class ModeloTablaJuego implements TableModel {
    public static final int COLS = 6;
    ArrayList<VideoJuego> datos;

    public ModeloTablaJuego(ArrayList<VideoJuego> datos) {
        this.datos = datos;
    }


    @Override
    public int getRowCount() {
        return datos.size();
        //para sacar el no. de registros que va a mostrar lo obtengo del ArrayList datos
    }

    @Override
    public int getColumnCount() {
        return COLS;
    }

    @Override
    public String getColumnName(int columnIndex) {
        String columnName = "";
        switch (columnIndex) {
            case 0:
                columnName = "Id.";
                break;
            case 1:
                columnName = "Nombre";
                break;
            case 2:
                columnName = "Genero";
                break;
            case 3:
                columnName = "Peso en GB.";
                break;
            case 4:
                columnName = "Plataforma";
                break;
            case 5:
                columnName = "Desarrollador";
                break;
        }
        return columnName;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) { //tipo de clase que hay en cada columna
        switch (columnIndex){
            case 0:
                return Integer.class; //no hay break porque estamos regresando la respuesta del método
            case 1:
                return String.class;
            case 2:
                return String.class;
            case 3:
                return Double.class;
            case 4:
                return String.class;
            case 5:
                return String.class;

        }
        return null;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) { //que valores va en cada celda
        VideoJuego tmp = datos.get(rowIndex); //posición del renglón
        switch (columnIndex){
            case 0:
                return tmp.getId();
            case 1:
                return tmp.getNombre();
            case 2:
                return tmp.getGenero();
            case 3:
                return tmp.getPesoEnGB();
            case 4:
                return tmp.getPlataforma();
            case 5:
                return tmp.getDesarrollador();

        }
        return null;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {

    }

    @Override
    public void addTableModelListener(TableModelListener l) {

    }

    @Override
    public void removeTableModelListener(TableModelListener l) {

    }
    public void agregarJuego(VideoJuego juego){
        this.datos.add(juego); //podemos agregar un videojuego nuevo al modelo
    }
}