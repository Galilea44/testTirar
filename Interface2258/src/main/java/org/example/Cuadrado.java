package org.example;

/**
 * @Author Diana
 */
public class Cuadrado implements Figura{   //al poner implements e implementar la interface figura estoy obligada a ponerle cuerpo a todos los metodos abstractos que definí
    private double lado;

    public Cuadrado() {
    }

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "Cuadrado{" +
                "lado=" + lado +
                '}';
    }

    public double calcularArea(){
        return this.lado * this.lado;                //cuerpo
    }
}
