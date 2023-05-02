package org.example;

import java.util.Arrays;

public class Caja <T>{  // estoy diciendo que usará un tipo de dato genérico
   public static final int CAPACIDAD = 10;
    private T[] content;

    public Caja() {
    }
    public Caja(T[] content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Caja{" +
                "content=" + Arrays.toString(content) +
                '}';
    }
    //El método add permite añadir un elemento al final del ArrayList si no le indicamos una posición
    // o  permite añadir un elemento en una posición determinada si le pasamos como parámetro la posición además del elemento.
    public void add(int pos, T objeto){    //el generico T tendra un metodo add con una posición que metera un objeto de ese tipo generico (t)
    content [pos]= objeto;                // en esa posición
    }
    public T get (int pos){     // a este metodo get yo le doy la posición y te va a regresar un objeto
        return content[pos];
    }
}
