package org.example.iu;

import org.example.iu.eventos.EventosRaton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Principal extends Frame { //para que sea ventana hago que herede de la clase frame de awt
    private Label lblNombre;
    private TextField txtNombre;    //estoy haciendo composicion
    private Button btnBoton1;

    public Principal(String title) throws HeadlessException {
        super(title);
        this.setSize(800, 600); //parametros del tamaño
        this.setLayout(new FlowLayout());//conforme los voy agregando se ponen uno detras del otro
        //configuro  mi interfaz (primero mis layouts) para ir viendo como se van ajustando los elementos a la pantalla

        //Crear los objetos e irlos poniendo en la interfaz gráfica
        lblNombre = new Label("Nombre"); //acepta un string vacio
        this.add(lblNombre); //lo agrego a la interfaz gráfica

        txtNombre = new TextField(30); //agrego el campo de texto (aquí inicializo)
        this.add(txtNombre);           //aquí agrego al contenedor
        btnBoton1 = new Button("Saludar");
        //IMP.- Al boton le agrego el oyente
        //btnBoton1.addMouseListener(new EventosRaton());
        //el emisor es el raton cuando se le de clic lanza un objeto de tipo evento,
        // y habrá un oyente que sepa cuando ocurra el evento se mande un string a la salida y diga se dió clic
        btnBoton1.addMouseListener(new MouseAdapter() {
            @Override          //solo ocupo el que me interesa
            public void mouseClicked(MouseEvent e) {
                System.out.println(txtNombre.getText());
                JOptionPane.showMessageDialog(null, "Hola "+txtNombre.getText());
                //es una clase de la tecnol. swing que crea ventanas de dialogo
            }
        });
        this.add(btnBoton1);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        this.setVisible(true); //indicar que esta ventana que ya configure se vea


    }
}
