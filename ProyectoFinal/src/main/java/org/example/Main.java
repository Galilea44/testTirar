package org.example;

import org.example.controlador.ControladorDeportesExtremos;
import org.example.modelo.DeportesExtremos;
import org.example.persistencia.DemoDeportesDB;
import org.example.persistencia.DeportesDAO;
import org.example.vista.VentanaDeportes;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        VentanaDeportes view = new VentanaDeportes("Deportes Extremos");
        ControladorDeportesExtremos controller = new ControladorDeportesExtremos(view);



    }
}