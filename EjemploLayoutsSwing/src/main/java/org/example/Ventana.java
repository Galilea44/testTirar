package org.example;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;
import java.net.URL;

public class Ventana extends JFrame {
    private JPanel panel1;
    private JButton botoPanel1;
    private JLabel etiquetaPanel1;
    private JPanel panel2;
    private JLabel etiquetaPanel2;
    private JPanel panel3;
    private JComboBox<String> comboBoxPanel3;
    private JPanel panel4;
    private GridLayout layout; //va a ser el layout principal

    public Ventana(String title) throws HeadlessException {
        super(title);
        this.setSize(800, 600);
        layout = new GridLayout(2, 2);
        this.getContentPane().setLayout(layout); //agrego el layout al panel
        //los paneles son clases del tipo conten.
        //panel 1
        panel1 = new JPanel();
        panel1.setBackground(new Color(192, 217, 231));
        panel1.setLayout(new FlowLayout(FlowLayout.LEFT)); // al panel le pongo su propio layout
        botoPanel1 = new JButton("Presioneme");
        panel1.add(botoPanel1);
        etiquetaPanel1= new JLabel(".....");
        panel1.add(etiquetaPanel1);
        botoPanel1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                etiquetaPanel1.setText("Hola presionaste el boton del panel 1"); //le mando un mensaje cuando aprietas el boton
            }
        });
        this.getContentPane().add(panel1, 0); //lo agrego al contentPane

        //panel 2
        String urlImagen = "https://i.pinimg.com/474x/6f/fd/2d/6ffd2d8eafce43d411bb42f8f084e9d6.jpg";

        panel2 = new JPanel();
        panel2.setBackground(new Color(231, 193, 192));
        panel2.setLayout(new FlowLayout()); //la dejo así para que la ima. este centrada
        //cargar la imagen de internet
        try {
            URL url = new URL(urlImagen);
            Image imagen = ImageIO.read(url); //cargo la imagen
            ImageIcon imageIcon = new ImageIcon(imagen);
            etiquetaPanel2 = new JLabel(imageIcon); // sin nada porque aquí ira la imagen
            panel2.add(etiquetaPanel2);
            this.getContentPane().add(panel2, 1);
        }catch (MalformedURLException me){
            System.out.println("Url no valida");
        }catch (Exception e){
            System.out.println("Error al cargar la imagen");
        }

        //panel 3
        panel3 = new JPanel();
        panel3.setBackground(new Color(241, 202, 244));

        panel3.setLayout(new FlowLayout(FlowLayout.RIGHT));
        String[] elementos = {"Opción 1", "Opción 2", "Opción 3", "Opción 4"};
        comboBoxPanel3 = new JComboBox<>(elementos); //indicar los elementos que llenaran el panel
        comboBoxPanel3.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(e.getSource().toString());
                System.out.println(comboBoxPanel3.getSelectedIndex());
            }
        });
        panel3.add(comboBoxPanel3);
        this.getContentPane().add(panel3, 2);

        //panel 4
        panel4 = new JPanel();
        panel4.setBackground(new Color(206, 242, 195 ));
        this.getContentPane().add(panel4, 3);

        this.setVisible(true);

    }
}
