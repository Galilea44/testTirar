package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.concurrent.Flow;

public class VentanaSwing extends JFrame { //heredo de javax.swing
    private JLabel etiqueta1;
    private JTextField txtgrados;
    private JButton boton;
    private JLabel lblResultado;
    private FlowLayout layout; //el layout si es de awt

    public VentanaSwing(String title) throws HeadlessException {
        super(title);
        this.setSize(800, 600);
        layout = new FlowLayout(); //uso el por defecto
        //creo un contenedor del tipo panel para acomodar mejor los componentes
        this.getContentPane().setLayout(layout); //obtengo el panel con el get y le establezco el setLayout
        etiqueta1 = new JLabel("Grados C."); //agrego los elementos
        this.getContentPane().add(etiqueta1);
        txtgrados = new JTextField(10);
        this.getContentPane().add(txtgrados);
        boton = new JButton("Convertir");
        this.getContentPane().add(boton);
        lblResultado = new JLabel("0.0 °F");
        this.getContentPane().add(lblResultado);
        this.boton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                double centigrados = Double.parseDouble(txtgrados.getText()); //nos convierte un string a este tipo de dato double
                double farenheit = (centigrados * 9.0/5.0) + 32.0;
                lblResultado.setText(farenheit + " °F");
            }
        });
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                JOptionPane.showMessageDialog(null, "Adios...");
                System.exit(0);
            }
        });
        this.setVisible(true);
    }
}
