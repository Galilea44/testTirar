package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Ventana extends JFrame{
    private JLabel lblNombre;
    private JTextField txtNombre;
    private JButton boton;
    private JComboBox combo;
    private NombreModeloCombo modelo;

    public Ventana(String title) throws HeadlessException {
        super(title);
        this.setSize(400,400);
        setLayout(new FlowLayout()); //se alinean al centro
        lblNombre = new JLabel("Ingresa un nombre");
        this.getContentPane().add(lblNombre); //lo agrego
        txtNombre = new JTextField(30);
        this.getContentPane().add(txtNombre);
        boton = new JButton("Agregar");
        this.getContentPane().add(boton);
        //Configurar el modelo
        modelo = new NombreModeloCombo();
        modelo.agregarNombre("Diana");
        modelo.agregarNombre("Diego");
        modelo.agregarNombre("Susana");
        combo = new JComboBox(modelo);
        this.getContentPane().add(combo);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        boton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String nuevo = txtNombre.getText();
                modelo.agregarNombre(nuevo); //modelo es el reponsable de notificarle a la lista
                txtNombre.setText("");
            }
        });
        combo.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(combo.getSelectedIndex());
                System.out.println(combo.getSelectedItem()); //este metodo del cmboBox le consulta al modelo quien es el seleccionado
                JOptionPane.showMessageDialog(null, "Hola" + combo.getSelectedItem());
            }
        });
    }
}
