package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Caja<String> miCaja = new Caja<>(new String[10]);   //Pongo la clase Caja y meter cadenas de texto <> (Caja manejara strings)
        miCaja.add(0, "hola");
        miCaja.add(1, "adios");
        miCaja.add(2, "hi");
        System.out.println(miCaja);  // me imprime un arreglo de objetos de tipo string

        String temp = miCaja.get(0);//variable temporal  (obtengo el elemento en la posición 0)
        System.out.println(temp);

        System.out.println("--------");
        CajaSinGenericos cajaSin = new CajaSinGenericos(new Object[10]);
        cajaSin.add(0, "Hola");  //lo estoy mandando como string pero me lo va a recibir como objeto
        cajaSin.add(1, "adios");
        cajaSin.add(2, "Hii");
        System.out.println(cajaSin);
        //String temp2= cajaSin.get(0); // la clase sin gene. no tiene la capacidad de determinar que tipo de dato tiene almacenado
        //esto de arriba me marca error (puedo arreglarlo forzando un casting
        String temp2= (String) cajaSin.get(0);


        System.out.println("-----comida------");
        //el generico al saber el tipo de dato que va a tener (en este caso es comida) te lo regresa ya en este estilo
        Caja<Comida>cajaComida = new Caja<>(new Comida[10]);
        cajaComida.add(0, new Comida("Yogurth", true));
        System.out.println(cajaComida.get(0)); //CajaComida.get(0) se convertira en el objeto comida que esta en la posición 0
                                               //un objeto que lo mandamos a un println se ejecuta el tostring
        System.out.println("--------");
        ArrayList<Comida> comidas = new ArrayList<>();  //El framework te permite manejar cualquier tipo dearreglos de cualquier tipo de datos
        //con esto ya tengo un arreglo dinamico de comidas
        //esto es mas sencillo que la caja ya que el tamaño de arriba es fijo y esta de aquí es dinamica
        //el framework es dinamico (empieza vacio) y puedo agregar o quitar
        comidas.add(new Comida("zanahoria", false)); //puedo meter las que quiera
        comidas.add(new Comida("zanahoria", false));
        comidas.add(new Comida("zanahoria", false));
        comidas.add(new Comida("zanahoria", false));
        comidas.add(new Comida("zanahoria", false));
        comidas.add(new Comida("zanahoria", false));
        comidas.add(new Comida("zanahoria", false));
        comidas.add(new Comida("Manzana", false));
        System.out.println(comidas. size());  // al ser una clase el arrayList (que se comporta como un  arreglo) el framework provee metodos al poner el .
                                       //esto es bueno porque puedo sacarle provecho a los metodos disponibles
                                        // el size es para saber cuantas zanahorias  tengo
        System.out.println(comidas.get(7)); //puedo sacaar la zanahoria que quiera (sacaré la última)

        ArrayList<Comida>comidas2 = new ArrayList<>();
        comidas2.add(new Comida("zanahoria", false));
        comidas2.add(new Comida("yogurth", true));
        comidas2.add(new Comida("Danonino", true));
        comidas2.add(new Comida("Manzana", false));
        comidas2.add(new Comida("Bisteck", false));
        //ventajas de las estructuras de datos del freamework de colleciones
        System.out.println(comidas2.get(3));
        System.out.println(comidas2.set(3, new Comida("Fresa", false)));
        comidas2.add(3, new Comida("Naranja", false)); //agrego naranja en una posición específica
        System.out.println("----final----");
        for (Comida comida:comidas2) { //for especial en donde como es un arreglo va a iterar sobre todos los elem. del arreglo y te lo va ir sacando y poniendo en el objeto comida
            System.out.println(comida);
        }
    }
}