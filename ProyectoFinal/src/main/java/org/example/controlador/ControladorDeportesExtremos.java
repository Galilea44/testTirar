package org.example.controlador;

import org.example.modelo.DeportesExtremos;
import org.example.modelo.ModeloTablaDeportes;
import org.example.persistencia.ConexionSingleton;
import org.example.vista.VentanaDeportes;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.MalformedURLException;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ControladorDeportesExtremos extends MouseAdapter { //Tambien puedo usar el MouseListener pero tendría metodos vacios
    private VentanaDeportes view; //representa la vista
    private ModeloTablaDeportes modelo; //con esto voy a poder interactuar con el modelo, y del modelo a la base de datos


    public ControladorDeportesExtremos(VentanaDeportes view) {
        this.view = view;
        modelo = new ModeloTablaDeportes();
        this.view.getTblDeportesExtremos().setModel(modelo);
        this.view.getBtnCargar().addMouseListener(this);
        this.view.getBtnAgregar().addMouseListener(this);
        this.view.getTblDeportesExtremos().addMouseListener(this);
        this.view.getBtnEliminar().addMouseListener(this);
        this.view.getBtnActualizar().addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == this.view.getBtnCargar()){
            modelo.cargarDatos(); //con esto cargo los datos desde la Bd
            this.view.getTblDeportesExtremos().setModel(modelo);
            this.view.getTblDeportesExtremos().updateUI();

        }

        if (e.getSource() == this.view.getBtnAgregar()){
            DeportesExtremos deporte = new DeportesExtremos();
            deporte.setId(0);
            deporte.setUrl(this.view.getTxturl().getText());
            deporte.setNombre(this.view.getTxtNombre().getText());
            deporte.setClasificacion(this.view.getTxtClasificacion().getText());
            deporte.setOrigen(this.view.getTxtOrigen().getText());
            deporte.setAditamentos(this.view.getTxtAditamentos().getText());
            if (modelo.agregarDeporte(deporte)){
                ImageIcon icono = new ImageIcon("imag1.png");
                JOptionPane.showMessageDialog(view, "Se agrego correctamente", "Aviso", JOptionPane.INFORMATION_MESSAGE, icono);
                //obligar que la tabla se actualice
                this.view.getTblDeportesExtremos().updateUI();
            }else{
                JOptionPane.showMessageDialog(view, "No se pudo agregar a la base de datos. Revisar la conexion",
                        "Error al insertar", JOptionPane.ERROR_MESSAGE);
            }
            this.view.limpiar();
        }
        if (e.getSource() == this.view.getTblDeportesExtremos()){
            System.out.println(" Evento sobre la tabla ");
            int index = this.view.getTblDeportesExtremos().getSelectedRow();
            DeportesExtremos tmp = modelo.getDeporteAtIndex(index);
            try {
                this.view.getImagenDeporte().setIcon(tmp.getImagen());
                this.view.getImagenDeporte().setText("");
            }catch (MalformedURLException mfue){
                System.out.println(e.toString());
            }

        }

        if (e.getSource() == this.view.getBtnEliminar()){
            int i = JOptionPane.showConfirmDialog(view, "¿Desea continuar?", "Eliminar", JOptionPane.YES_NO_OPTION);
            if (i == 0){
                String eliminar = "DELETE FROM deportes WHERE id = ? ;"; //este lo use en Deportes DAO
                PreparedStatement pstm = null;
                try {
                    pstm = ConexionSingleton.getInstance("DeportesDB.db").getConnection().prepareStatement(eliminar);
                }catch (SQLException sqle){
                    throw new RuntimeException(sqle);
                }
                try {
                    pstm.setInt(1, Integer.parseInt(this.view.getTxtEliminarIdF().getText()));
                    this.view.getTblDeportesExtremos().updateUI(); //obligar que la tabla se actualice
                    ImageIcon icono = new ImageIcon("imag3.png");
                    JOptionPane.showMessageDialog(view, "Se guardaron los cambios", "Notificacion", JOptionPane.INFORMATION_MESSAGE,icono);
                }catch (NumberFormatException nfe){
                    JOptionPane.showMessageDialog(view, "No se pudo realizar la operacion", "Notificacion", JOptionPane.ERROR_MESSAGE);
                }catch (SQLException sqle){
                    System.out.println(sqle.getMessage());
                }
                try {
                    pstm.executeUpdate();
                }catch (SQLException sqle) {
                    JOptionPane.showMessageDialog(view, "Error en el id", "Notificacion", JOptionPane.INFORMATION_MESSAGE);
                    throw new RuntimeException(sqle);
                }finally {
                    this.view.limpiar2();
                }



            }
        }
        if (e.getSource() == this.view.getBtnActualizar()){
            int i = JOptionPane.showConfirmDialog(view, "¿Desea continuar con la actualizacion?", "Actualizar", JOptionPane.YES_NO_OPTION);
            if (i == 0){
                DeportesExtremos deportes = new DeportesExtremos();
                deportes.setId(Integer.parseInt((String) this.view.getTxtIdF().getText()));
                deportes.setUrl(this.view.getTxturlF().getText());
                deportes.setNombre(this.view.getTxtNombreF().getText());
                deportes.setClasificacion(this.view.getTxtClasificacionF().getText());
                deportes.setOrigen(this.view.getTxtOrigenF().getText());
                deportes.setAditamentos(this.view.getTxtAditamentosF().getText());
                this.view.getTblDeportesExtremos().updateUI();
                if (modelo.actualizar(deportes)){
                    ImageIcon icono = new ImageIcon("imag3.png");
                    JOptionPane.showMessageDialog(view, "Se guardaron los cambios", "Notificacion", JOptionPane.INFORMATION_MESSAGE,icono);
                    this.view.getTblDeportesExtremos().updateUI();  //obligar que la tabla se actualice
                }else {
                    JOptionPane.showMessageDialog(view, "Error al actualizar", "Notificacion", JOptionPane.ERROR_MESSAGE);
                }
                this.view.limpiar3();
            }else {this.view.limpiar3();}
        }

    }

}
