package org.example;

public class Main {
    public static void main(String[] args) {

        //LISTA SIMPLE -----------> SE MUESTRA EN CONSOLA
    LinkedList lista = new LinkedList();
    System.out.println("-----LISTA SIMPLE-----");
    lista.AgregarInicio(10);     //AGREGO
    lista.AgregarFinal(8);
    lista.AgregarFinal(4);
    lista.AgregarFinal(17);
    lista.mostrar();
    lista.eliminarValor(10);       //ELIMINO
    lista.AgregarInicio(12);
    lista.AgregarFinal(56);
    System.out.println("Lista eliminando un valor y agregando al inicio y al final otros valores ");
    lista.mostrar();
    lista.revertir();              //REVIERTO
    System.out.println("Lista revertida");
    lista.mostrar();


        //LISTA DOBLE  -------> LA LISTA DOBLE SE MUESTRA CON UN MENSAJE DE DIALOGO A EXCEPCION DE LA LISTA REVERTIDA, ESTA ULTIMA SE MUESTRA EN LA CONSOLA
   LinkedDList listaD= new LinkedDList();
   listaD.AgregarAlInicio(10);  //AGREGO
   listaD.AgregarAlInicio(20);
   listaD.AgregarAlInicio(30);
   listaD.AgregarAlInicio(25);
   listaD.MostrarListaDeInicioAFin();
   listaD.MostrarListaDelFinAlInicio();
   listaD.AgregarAlFinal(55);
   listaD.AgregarAlFinal(66);
   listaD.MostrarListaDeInicioAFin();
   listaD.MostrarListaDelFinAlInicio();
   listaD.eliminarElementoDelInicio();   //ELIMINO
   listaD.MostrarListaDeInicioAFin();
   listaD.eliminarElementoDelFinal();
   listaD.MostrarListaDeInicioAFin();
   System.out.println("-------LISTA DOBLE--------");
   System.out.println("Lista revertida");
   listaD.revertir();                //REVIERTO
   listaD.mostrar();

        //LISTA CIRCULAR --------->SE MUESTRA EN CONSOLA
    LinkedCList listaC =new LinkedCList();
    System.out.println("-----LISTA CIRCULAR-----");
    listaC.Agregar(100);
    listaC.Agregar(10);  //AGREGO
    listaC.Agregar(20);
    listaC.Agregar(30);
    listaC.Agregar(40);
    listaC.Agregar(50);
    listaC.Agregar(81);
    listaC.Mostrar();
    listaC.eliminar(40);    //ELIMINO
    System.out.println("Lista despues de eliminar un valor");
    listaC.Mostrar();

    }
}