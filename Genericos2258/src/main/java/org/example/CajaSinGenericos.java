package org.example;

import java.util.Arrays;

public class CajaSinGenericos {  //como no tiene genericos los maneja como objetos
    Object[] content;     //es una clase que maneja un arreglo de tipo object

    public CajaSinGenericos() {
    }

    public CajaSinGenericos(Object[] content) {
        this.content = content;
    }
    public void add(int pos, Object objeto){
        content [pos]= objeto;
    }
    public Object get (int pos){
        return content[pos];
    }

    @Override
    public String toString() {
        return "CajaSinGenericos{" +
                "content=" + Arrays.toString(content) +
                '}';
    }
}

