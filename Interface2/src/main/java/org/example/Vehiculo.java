package org.example;

public interface Vehiculo {
    public static final int VELOCIDAD_MAXIMA= 160;  //con static final estoy declarando esto como una constante y pública para despues reutilizarlas en las clases
    public static final char CLASIFICACION_EFICIENCIA = 'A';
    public boolean encender();
    public boolean apagar();
    public void avanzar();
    public void frenar();
}
