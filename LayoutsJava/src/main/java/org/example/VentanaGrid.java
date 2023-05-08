package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class VentanaGrid extends Frame {
    private Label lblEtiqueta1;
    private Label lblEtiqueta2;
    private TextField txtCuadro1;
    private TextField txtCuadro2;
    private Button boton1;
    private GridLayout layout;

    public VentanaGrid(String title) throws HeadlessException {
        super(title);
        layout = new GridLayout(3,2); //renglones y columnas. Creo y agrego el layout
        this.setSize(800, 600);
        this.setLayout(layout);
        //agrego los elementos
        lblEtiqueta1 = new Label("Etiqueta 1");
        this.add(lblEtiqueta1, 0); //pongo las posición
        txtCuadro1 = new TextField(30);
        this.add(txtCuadro1, 1);
        lblEtiqueta2 = new Label("Etiqueta 2");
        this.add(lblEtiqueta2, 2); //agrego etiqueta dos en posicion 2
        txtCuadro2 = new TextField(30);
        this.add(txtCuadro2, 3);
        boton1 = new Button("Presioname");
        this.add(boton1, 4);

        //pongo los eventos
        boton1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String texto = txtCuadro1.getText() + " " +txtCuadro2.getText(); //concateno el texto de la etiqueta del cadro 1 con el dos
                JOptionPane.showMessageDialog(null, texto); //pongo un cuadro de dialoo
            }
        });

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        this.setVisible(true); //lo hago visible


    }
}
