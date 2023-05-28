package org.example;

import org.example.modelo.Libro;
import org.example.persistencia.DemoLibroDB;
import org.example.persistencia.LibroDAO;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //DemoLibroDB demo = new DemoLibroDB();
        //demo.insertarStatement();
        //System.out.println("Con prepared");
        //demo.insertarPreparedStatement();
        //Libro libro = new Libro(0, "El juego", "Desconocido");
//        if(demo.insertarLibro(libro)){
//            System.out.println("Se insertó correctamente");
//        }else{
//            System.out.println("Nose insertó");
//        }

        //System.out.println(demo.buscarLibroPorId(100));

        //System.out.println("--------------------------");
        //for (Libro tmp: demo.obtenerTodos()) {
            //System.out.println("Libro: "+tmp);
            //System.out.println("Titulo: "+ tmp.getTitulo());
    //}
        LibroDAO ldao= new LibroDAO();
        try {
           Libro res= (Libro) ldao.buscarPorId("1");
            System.out.println(res);
            System.out.println("--------------");
            for (Object lib:ldao.obtenerTodo()) {
                System.out.println((Libro)lib);

            }

        }catch (SQLException sqle){
            System.out.println("Error al eliminar");
            System.out.println(sqle.getMessage());
        }

//        Libro libro = new Libro(1, "El perfume", "Patrick Suskind");
//        try {
//            if(ldao.update(libro)){
//                System.out.println("Se modificó correctamente");
//            }else {
//                System.out.println("No se pudo modificar");
//            }
//        }catch (SQLException sqle){
//            System.out.println("Error al insertar");
//
//        }

    }
}