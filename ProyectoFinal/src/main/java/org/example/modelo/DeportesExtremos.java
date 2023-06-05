package org.example.modelo;

import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;

public class DeportesExtremos {
    //aquí se almacena la información que viene de la base de datos
    private int id;
    private String url;
    private String nombre;
    private String clasificacion;
    private String origen;
    private String aditamentos;

    public DeportesExtremos() {
    }

    public DeportesExtremos(int id, String url, String nombre, String clasificacion, String origen, String aditamentos) {
        this.id = id;
        this.url = url;
        this.nombre = nombre;
        this.clasificacion = clasificacion;
        this.origen = origen;
        this.aditamentos = aditamentos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getAditamentos() {
        return aditamentos;
    }

    public void setAditamentos(String aditamentos) {
        this.aditamentos = aditamentos;
    }

    @Override
    public String toString() {
        return "DeportesExtremos{" +
                "id=" + id +
                ", url='" + url + '\'' +
                ", nombre='" + nombre + '\'' +
                ", clasificacion='" + clasificacion + '\'' +
                ", origen='" + origen + '\'' +
                ", aditamentos='" + aditamentos + '\'' +
                '}';
    }
//para que el url de la tabla se refleje como imagen en el panel 3
    public ImageIcon getImagen() throws MalformedURLException {
        URL urlImagen = new URL(this.url);
        return new ImageIcon(urlImagen);
    }
}
