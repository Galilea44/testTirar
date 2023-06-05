package org.example.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//La conexionSingletos nos permite que haya una sola instancia de la clase Singleton
//(es decir evita que se creen varias conexiones)
public class ConexionSingleton {
    private String baseDatos;
    public static ConexionSingleton _instance;
    private Connection connection;


    //Este metodo es privado es para evitar que alguien exterior cree objetos
    private ConexionSingleton(String database) {
        this.baseDatos = database;
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:"+this.baseDatos);
        } catch (SQLException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static ConexionSingleton getInstance(String baseDatos) {
        if(_instance == null){
            _instance = new ConexionSingleton(baseDatos);
        }else{
            System.out.println("Ya fué creada.");
        }
        return _instance;
    }


    public Connection getConnection() {
        return connection;
    }

}
