package org.example.modelo;

import org.example.persistencia.DeportesDAO;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.sql.SQLException;
import java.util.ArrayList;

public class ModeloTablaDeportes extends DeportesDAO implements TableModel {
    public static final int COLUMNS = 6;
    private ArrayList<DeportesExtremos> datos;
    private DeportesDAO ldao;

    public ModeloTablaDeportes() {
        ldao = new DeportesDAO();
        datos = new ArrayList<>();
    }

    public ModeloTablaDeportes(ArrayList<DeportesExtremos> datos) {
        this.datos = datos;
        ldao = new DeportesDAO();  //Lo instancio en el constructor
    }


    @Override
    public int getRowCount() {
        return datos.size();
    }

    @Override
    public int getColumnCount() {
        return COLUMNS;
    }

    @Override
    public String getColumnName(int columnIndex) {
        switch (columnIndex){
            case 0:
                return "Id";
            case 1:
                return "URL";
            case 2:
                return "Nombre";
            case 3:
                return "Clasificación";
            case 4:
                return "Origen";
            case 5:
                return "Aditamentos";

        }
        return null;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex){
            case 0:
                return Integer.class;
            case 1:
                return String.class;
            case 2:
                return String.class;
            case 3:
                return String.class;
            case 4:
                return String.class;
            case 5:
                return String.class;

        }

        return null;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        DeportesExtremos tmp = datos.get(rowIndex);
        switch (columnIndex){
            case 0:
                return tmp.getId();
            case 1:
                return tmp.getUrl();
            case 2:
                return tmp.getNombre();
            case 3:
                return tmp.getClasificacion();
            case 4:
                return tmp.getOrigen();
            case 5:
                return tmp.getAditamentos();
        }
        return null;
    }

    @Override
    public void setValueAt(Object o, int rowIndex, int columnIndex) {
        switch (columnIndex){
            case 0:
                //datos.get(rowIndex).setId(0);
                break;
            case 1:
                datos.get(rowIndex).setUrl((String) o);
                break;
            case 2:
                datos.get(rowIndex).setNombre((String) o);
                break;
            case 3:
                datos.get(rowIndex).setClasificacion((String) o);
                break;
            case 4:
                datos.get(rowIndex).setOrigen((String) o);
                break;
            case 5:
                datos.get(rowIndex).setAditamentos((String) o);
                break;
            default:
                System.out.println("No se modifica nada");
        }
    }

    @Override
    public void addTableModelListener(TableModelListener l) {

    }

    @Override
    public void removeTableModelListener(TableModelListener l) {

    }

    public void cargarDatos(){
        try {
            ArrayList<DeportesExtremos> tirar = ldao.obtenerTodo();
            System.out.println(tirar);
            datos = ldao.obtenerTodo();
        }catch (SQLException sqle){
            System.out.println(sqle.getMessage()); //Para ver el posible error
        }

    }
    public boolean agregarDeporte(DeportesExtremos deporte){
        boolean resultado = false;
        try {
            if (ldao.insetar(deporte)){
                datos.add(deporte); //para que lo que esta en base de datos y en modelo tengan la misma info.
                resultado = true;
            }else{
                resultado = false;
            }
        }catch (SQLException sqle){
            System.out.println(sqle.getMessage());
        }
        return resultado;
    }
    public DeportesExtremos getDeporteAtIndex(int idx){
        return datos.get(idx);
    }
    public boolean actualizar (DeportesExtremos deporte){
        boolean resultado = false;
        try {
            if (ldao.update(deporte)){
                datos.add(deporte); //para que lo que esta en base de datos y en modelo tengan la misma info.
                resultado = true;
            }else{
                resultado = false;
            }
        }catch (SQLException sqle){
            System.out.println(sqle.getMessage());
        }
        return resultado;

    }
    public boolean eliminar (DeportesExtremos deporte){
        boolean resultado = false;
        try {
            if (ldao.delete(String.valueOf(deporte))){
                datos.add(deporte); //para que lo que esta en base de datos y en modelo tengan la misma info.
                resultado = true;
            }else{
                resultado = false;
            }
        }catch (SQLException sqle){
            System.out.println(sqle.getMessage());
        }
        return resultado;

    }
}
