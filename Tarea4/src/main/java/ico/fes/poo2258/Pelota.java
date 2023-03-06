package ico.fes.poo2258;

import java.awt.*;

public class Pelota {
    private String tipo;
    private boolean inflada;
    private float peso;
    private Color color;
    private String textura;

    public Pelota() {
    }

    public Pelota(String tipo, boolean inflada, float peso, Color color, String textura) {
        this.tipo = tipo;
        this.inflada = inflada;
        this.peso = peso;
        this.color = color;
        this.textura = textura;
    }

    public Pelota(String tipo, String textura) {
        this.tipo = tipo;
        this.textura = textura;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isInflada() {
        return inflada;
    }

    public void setInflada(boolean inflada) {
        this.inflada = inflada;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getTextura() {
        return textura;
    }

    public void setTextura(String textura) {
        this.textura = textura;
    }

    @Override
    public String toString() {
        return "Pelota{" +
                "tipo='" + tipo + '\'' +
                ", inflada=" + inflada +
                ", peso=" + peso +
                ", color=" + color +
                ", textura='" + textura + '\'' +
                '}';
    }

    public boolean rebotar (){
        System.out.println(tipo + " ¿Está rebotando?");
        boolean rebotando = Math.random() >= 0.51;
        return rebotando;
    }

    public boolean rodar (){
        System.out.println(tipo + " ¿Está rodando?");
        boolean rodando = Math.random() >= 0.51;
        return rodando;
}

    public boolean girar (){
        System.out.println(tipo + " ¿Está girando?");
        boolean girando = Math.random() >= 0.51;
        return girando;
}
}
