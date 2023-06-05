package org.example.vista;

import javax.swing.*;
import java.awt.*;

public class VentanaDeportes extends JFrame {
    private JLabel lblId;
    private JLabel lblurl;
    private JLabel lblNombre;
    private JLabel lblClasificacion;
    private JLabel lblOrigen;
    private JLabel lblAditamentos;
    private JTextField txtId;
    private JTextField txturl;
    private JTextField txtNombre;
    private JTextField txtClasificacion;
    private JTextField txtOrigen;
    private JTextField txtAditamentos;
    private JButton btnAgregar;
    private JButton btnCargar;
    private JTable tblDeportesExtremos;
    private JScrollPane scrollPane;
    private GridLayout layout;
    private JPanel panel1; //formulario para capturar datos
    private JPanel panel2; //Tabla para mostrar la base de datos
    private JPanel panel3; //Imagenes
    private JPanel panel4; //Campos para realizar cambios a la tabla y la base de datos
    private JLabel imagenDeporte;
    //Componentes panel 4 (Four)
    private JLabel lblEliminarE;
    private JLabel lblActualizarE;
    private JLabel lblEliminarIdf;
    private JLabel lblIdF;
    private JLabel lblurlF;
    private JLabel lblNombreF;
    private JLabel lblClasificacionF;
    private JLabel lblOrigenF;
    private JLabel lblAditamentosF;
    private JTextField txtEliminarIdF;
    private JTextField txtIdF;
    private JTextField txturlF;
    private JTextField txtNombreF;
    private JTextField txtClasificacionF;
    private JTextField txtOrigenF;
    private JTextField txtAditamentosF;
    private JButton btnEliminar;
    private JButton btnActualizar;


    public VentanaDeportes(String title) throws HeadlessException {
        super(title);
        this.setSize(800, 800);
        layout = new GridLayout(2, 2);
        this.getContentPane().setLayout(layout);
        //panel 1
        panel1 = new JPanel(new FlowLayout());
        panel1.setBackground(new Color(152, 224, 211));
        lblId = new JLabel("Id:");
        lblurl = new JLabel("URL:");
        lblNombre = new JLabel("Nombre:");
        lblClasificacion = new JLabel("Clasificacion:");
        lblOrigen = new JLabel("Origen:");
        lblAditamentos = new JLabel("Aditamentos:");
        txtId = new JTextField(3);
        txtId.setText("0");
        txtId.setEnabled(false); //Así no se puede utilizar este control
        txturl = new JTextField(35);
        txtNombre = new JTextField(10);
        txtClasificacion = new JTextField(10);
        txtOrigen = new JTextField(10);
        txtAditamentos = new JTextField(10);
        btnAgregar = new JButton("Agregar");
        panel1.add(lblId);
        panel1.add(txtId);
        panel1.add(lblurl);
        panel1.add(txturl);
        panel1.add(lblNombre);
        panel1.add(txtNombre);
        panel1.add(lblClasificacion);
        panel1.add(txtClasificacion);
        panel1.add(lblOrigen);
        panel1.add(txtOrigen);
        panel1.add(lblAditamentos);
        panel1.add(txtAditamentos);
        panel1.add(btnAgregar);


        //panel 2
        panel2 = new JPanel(new FlowLayout());
        panel2.setBackground(new Color(239, 231, 184));
        btnCargar = new JButton("Cargar");
        panel2.add(btnCargar);
        tblDeportesExtremos = new JTable();
        scrollPane = new JScrollPane(tblDeportesExtremos);
        panel2.add(scrollPane);

        //panel 3
        panel3 = new JPanel(new FlowLayout());
        panel3.setBackground(new Color(195, 164, 250));
        imagenDeporte = new JLabel("...");
        panel3.add(imagenDeporte);

        //panel 4
        panel4 = new JPanel(new FlowLayout());
        panel4.setBackground(new Color(225, 184, 205));
        lblEliminarE = new JLabel("<---------------------------------ELIMINAR-------------------------------->");
        lblEliminarIdf = new JLabel("Eliminar el elemento No.:");
        lblActualizarE = new JLabel("<---------------------------------ACTUALIZAR-------------------------------->");
        lblIdF = new JLabel("Elemento No.:");
        lblurlF = new JLabel("URL:");
        lblNombreF = new JLabel("Nombre:");
        lblClasificacionF = new JLabel("Clasificacion:");
        lblOrigenF = new JLabel("Origen:");
        lblAditamentosF = new JLabel("Aditamentos:");
        txtEliminarIdF = new JTextField(10);
        txtIdF = new JTextField(10);
        txturlF = new JTextField(35);
        txtNombreF = new JTextField(10);
        txtClasificacionF = new JTextField(10);
        txtOrigenF = new JTextField(10);
        txtAditamentosF = new JTextField(10);
        btnEliminar = new JButton("Eliminar");
        btnActualizar = new JButton("Actualizar");

        panel4.add(lblEliminarE);
        panel4.add(lblEliminarIdf);
        panel4.add(txtEliminarIdF);
        panel4.add(btnEliminar);
        panel4.add(lblActualizarE);
        panel4.add(lblIdF);
        panel4.add(txtIdF);
        panel4.add(lblurlF);
        panel4.add(txturlF);
        panel4.add(lblNombreF);
        panel4.add(txtNombreF);
        panel4.add(lblClasificacionF);
        panel4.add(txtClasificacionF);
        panel4.add(lblOrigenF);
        panel4.add(txtOrigenF);
        panel4.add(lblAditamentosF);
        panel4.add(txtAditamentosF);
        panel4.add(btnActualizar);


        //agrego los paneles a la ventana principal
        this.getContentPane().add(panel1, 0);
        this.getContentPane().add(panel2, 1);
        this.getContentPane().add(panel3, 2);
        this.getContentPane().add(panel4, 3);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public JLabel getLblId() {
        return lblId;
    }

    public void setLblId(JLabel lblId) {
        this.lblId = lblId;
    }

    public JLabel getLblurl() {
        return lblurl;
    }

    public void setLblurl(JLabel lblurl) {
        this.lblurl = lblurl;
    }

    public JLabel getLblNombre() {
        return lblNombre;
    }

    public void setLblNombre(JLabel lblNombre) {
        this.lblNombre = lblNombre;
    }

    public JLabel getLblClasificacion() {
        return lblClasificacion;
    }

    public void setLblClasificacion(JLabel lblClasificacion) {
        this.lblClasificacion = lblClasificacion;
    }

    public JLabel getLblOrigen() {
        return lblOrigen;
    }

    public void setLblOrigen(JLabel lblOrigen) {
        this.lblOrigen = lblOrigen;
    }

    public JLabel getLblAditamentos() {
        return lblAditamentos;
    }

    public void setLblAditamentos(JLabel lblAditamentos) {
        this.lblAditamentos = lblAditamentos;
    }

    public JTextField getTxtId() {
        return txtId;
    }

    public void setTxtId(JTextField txtId) {
        this.txtId = txtId;
    }

    public JTextField getTxturl() {
        return txturl;
    }

    public void setTxturl(JTextField txturl) {
        this.txturl = txturl;
    }

    public JTextField getTxtNombre() {
        return txtNombre;
    }

    public void setTxtNombre(JTextField txtNombre) {
        this.txtNombre = txtNombre;
    }

    public JTextField getTxtClasificacion() {
        return txtClasificacion;
    }

    public void setTxtClasificacion(JTextField txtClasificacion) {
        this.txtClasificacion = txtClasificacion;
    }

    public JTextField getTxtOrigen() {
        return txtOrigen;
    }

    public void setTxtOrigen(JTextField txtOrigen) {
        this.txtOrigen = txtOrigen;
    }

    public JTextField getTxtAditamentos() {
        return txtAditamentos;
    }

    public void setTxtAditamentos(JTextField txtAditamentos) {
        this.txtAditamentos = txtAditamentos;
    }

    public JButton getBtnAgregar() {
        return btnAgregar;
    }

    public void setBtnAgregar(JButton btnAgregar) {
        this.btnAgregar = btnAgregar;
    }

    public JTable getTblDeportesExtremos() {
        return tblDeportesExtremos;
    }

    public void setTblDeportesExtremos(JTable tblDeportesExtremos) {
        this.tblDeportesExtremos = tblDeportesExtremos;
    }

    public JScrollPane getScrollPane() {
        return scrollPane;
    }

    public void setScrollPane(JScrollPane scrollPane) {
        this.scrollPane = scrollPane;
    }

    @Override
    public GridLayout getLayout() {
        return layout;
    }

    public void setLayout(GridLayout layout) {
        this.layout = layout;
    }

    public JPanel getPanel1() {
        return panel1;
    }

    public void setPanel1(JPanel panel1) {
        this.panel1 = panel1;
    }

    public JPanel getPanel2() {
        return panel2;
    }

    public void setPanel2(JPanel panel2) {
        this.panel2 = panel2;
    }

    public JPanel getPanel3() {
        return panel3;
    }

    public void setPanel3(JPanel panel3) {
        this.panel3 = panel3;
    }

    public JPanel getPanel4() {
        return panel4;
    }

    public void setPanel4(JPanel panel4) {
        this.panel4 = panel4;
    }

    public JButton getBtnCargar() {
        return btnCargar;
    }

    public JLabel getImagenDeporte() {
        return imagenDeporte;
    }

    public void setImagenDeporte(JLabel imagenDeporte) {
        this.imagenDeporte = imagenDeporte;
    }

    public JLabel getLblEliminarE() {
        return lblEliminarE;
    }

    public void setLblEliminarE(JLabel lblEliminarE) {
        this.lblEliminarE = lblEliminarE;
    }

    public JLabel getLblActualizarE() {
        return lblActualizarE;
    }

    public void setLblActualizarE(JLabel lblActualizarE) {
        this.lblActualizarE = lblActualizarE;
    }

    public JLabel getLblEliminarIdf() {
        return lblEliminarIdf;
    }

    public void setLblEliminarIdf(JLabel lblEliminarIdf) {
        this.lblEliminarIdf = lblEliminarIdf;
    }

    public JLabel getLblIdF() {
        return lblIdF;
    }

    public void setLblIdF(JLabel lblIdF) {
        this.lblIdF = lblIdF;
    }

    public JLabel getLblurlF() {
        return lblurlF;
    }

    public void setLblurlF(JLabel lblurlF) {
        this.lblurlF = lblurlF;
    }

    public JLabel getLblNombreF() {
        return lblNombreF;
    }

    public void setLblNombreF(JLabel lblNombreF) {
        this.lblNombreF = lblNombreF;
    }

    public JLabel getLblClasificacionF() {
        return lblClasificacionF;
    }

    public void setLblClasificacionF(JLabel lblClasificacionF) {
        this.lblClasificacionF = lblClasificacionF;
    }

    public JLabel getLblOrigenF() {
        return lblOrigenF;
    }

    public void setLblOrigenF(JLabel lblOrigenF) {
        this.lblOrigenF = lblOrigenF;
    }

    public JLabel getLblAditamentosF() {
        return lblAditamentosF;
    }

    public void setLblAditamentosF(JLabel lblAditamentosF) {
        this.lblAditamentosF = lblAditamentosF;
    }

    public JTextField getTxtEliminarIdF() {
        return txtEliminarIdF;
    }

    public void setTxtEliminarIdF(JTextField txtEliminarIdF) {
        this.txtEliminarIdF = txtEliminarIdF;
    }

    public JTextField getTxtIdF() {
        return txtIdF;
    }

    public void setTxtIdF(JTextField txtIdF) {
        this.txtIdF = txtIdF;
    }

    public JTextField getTxturlF() {
        return txturlF;
    }

    public void setTxturlF(JTextField txturlF) {
        this.txturlF = txturlF;
    }

    public JTextField getTxtNombreF() {
        return txtNombreF;
    }

    public void setTxtNombreF(JTextField txtNombreF) {
        this.txtNombreF = txtNombreF;
    }

    public JTextField getTxtClasificacionF() {
        return txtClasificacionF;
    }

    public void setTxtClasificacionF(JTextField txtClasificacionF) {
        this.txtClasificacionF = txtClasificacionF;
    }

    public JTextField getTxtOrigenF() {
        return txtOrigenF;
    }

    public void setTxtOrigenF(JTextField txtOrigenF) {
        this.txtOrigenF = txtOrigenF;
    }

    public JTextField getTxtAditamentosF() {
        return txtAditamentosF;
    }

    public void setTxtAditamentosF(JTextField txtAditamentosF) {
        this.txtAditamentosF = txtAditamentosF;
    }

    public JButton getBtnEliminar() {
        return btnEliminar;
    }

    public void setBtnEliminar(JButton btnEliminar) {
        this.btnEliminar = btnEliminar;
    }

    public JButton getBtnActualizar() {
        return btnActualizar;
    }

    public void setBtnActualizar(JButton btnActualizar) {
        this.btnActualizar = btnActualizar;
    }

    public void setBtnCargar(JButton btnCargar) {
        this.btnCargar = btnCargar;
    }
//para limpiar campos del campo uno
    public void limpiar() {
        txturl.setText("");
        txtNombre.setText("");
        txtClasificacion.setText("");
        txtOrigen.setText("");
        txtAditamentos.setText("");
    }
//para limpiar campos del panel 4
    public void limpiar2() {
        txtEliminarIdF.setText("");
    }

    public void limpiar3() {
        txtIdF.setText("");
        txturlF.setText("");
        txtNombreF.setText("");
        txtClasificacionF.setText("");
        txtOrigenF.setText("");
        txtAditamentosF.setText("");

    }

}
