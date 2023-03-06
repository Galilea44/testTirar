package ico.fes.poo2258;

import java.awt.*;

public class Perro {
    private String raza;
    private Color color;
    private String nombre;
    private float peso;
    private byte edad;

    public Perro() {
    }

    public Perro(String raza, Color color, String nombre, float peso, byte edad) {
        this.raza = raza;
        this.color = color;
        this.nombre = nombre;
        this.peso = peso;
        this.edad = edad;
    }

    public Perro(String raza, String nombre) {
        this.raza = raza;
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Perro{" +
                "raza='" + raza + '\'' +
                ", color=" + color +
                ", nombre='" + nombre + '\'' +
                ", peso=" + peso +
                ", edad=" + edad +
                '}';
    }

    public boolean ladrar(){
        System.out.println(nombre + " ¿Está ladrando?");
        boolean ladrando = Math.random() >= 0.51;
        return ladrando;
    }

    public boolean comer (){
        System.out.println(nombre + " ¿Está comiendo?");
        boolean comiendo = Math.random() > 0.51;
        return comiendo;
    }

    public boolean dormir (){
        System.out.println(nombre + " ¿Está durmiendo?");
        boolean durmiendo = Math.random() > 0.51;
        return durmiendo;
    }
}
