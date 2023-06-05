package org.example.persistencia;

import org.example.modelo.DeportesExtremos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DemoDeportesDB {
    public DemoDeportesDB() {
    }
    public void insertarStatement(){
        String elurl ="https://is4-ssl.mzstatic.com/image/thumb/Purple117/v4/3f/6c/a0/3f6ca082-c3d3-aa73-5541-8e26cd0386b4/source/256x256bb.jpg";
        String elnombre ="Wingsuiting Flying";
        String laclasificacion ="Aire";
        String elorigen ="Francia";
        String losaditamentos ="Traje";

        try {
            Statement stm = ConexionSingleton.getInstance("DeportesDB.db").getConnection().createStatement();

            String sqlInsert = "Insert INTO deportes (url, nombre, clasificacion, origen, aditamentos) VALUES ('"+elurl+"','"+elnombre+"', '"+laclasificacion+"', " +
                    "'"+elorigen+"', '"+losaditamentos+"')";
            int rowCount = stm.executeUpdate(sqlInsert);
            System.out.println("Se insertaron "+ rowCount+" registros");
        }catch (SQLException sqle){
            System.out.println("Error al conectar" + sqle.getMessage());
        }

    }

//Este es mejor (PreparedStatement) ya que simplifica la creacion de consultas porque ya no se hacen concatenaciones
    public void insertarPreparedStatement(){
        String elurl ="https://m.media-amazon.com/images/I/61-0qDVFtZL._CR0,80,480,480_UX256.jpg";
        String elnombre ="Surf";
        String laclasificacion ="Agua";
        String elorigen ="Hawai";
        String losaditamentos ="Tabla y traje";
        String sqlInsert = "Insert INTO deportes (url, nombre, clasificacion, origen, aditamentos) VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement pstm = ConexionSingleton.getInstance("DeportesDB.db").getConnection().prepareStatement(sqlInsert);
            pstm.setString(1, elurl);
            pstm.setString(2, elnombre);
            pstm.setString(3, laclasificacion);
            pstm.setString(4, elorigen);
            pstm.setString(5, losaditamentos);
            int rowCount = pstm. executeUpdate();
            System.out.println("Se insertaron " + rowCount + "archivos");

        }catch (SQLException sqle) {
            System.out.println("Error Prepared statement" + sqle.getMessage());
        }

    }
    public boolean insertarDeporteExtremo (DeportesExtremos deporte){
        String sqlInsert = "Insert INTO deportes (url, nombre, clasificacion, origen, aditamentos) VALUES (?, ?, ?, ?, ?)";
        int rowCount = 0;
        try {
            PreparedStatement pstm = ConexionSingleton.getInstance("DeportesDB.db").getConnection().prepareStatement(sqlInsert);
            pstm.setString(1, deporte.getUrl());
            pstm.setString(2, deporte.getNombre());
            pstm.setString(3, deporte.getClasificacion());
            pstm.setString(4, deporte.getOrigen());
            pstm.setString(5, deporte.getAditamentos());
            rowCount = pstm. executeUpdate();

        }catch (SQLException sqle) {
            System.out.println("Error Prepared statement" + sqle.getMessage());
        }
        return rowCount > 0;
    }
    public DeportesExtremos buscarDeporteExtremo(int id){
        String sql = "SELECT * FROM deportes WHERE id = ? ;";
        DeportesExtremos deportes = null;
        try {
            PreparedStatement pstm= ConexionSingleton.getInstance("DeportesDB.db").getConnection().prepareStatement(sql);
            pstm.setInt(1, id);
            ResultSet rst = pstm.executeQuery();
            if (rst.next()){
                deportes= new DeportesExtremos(rst.getInt(1), rst.getString(2),
                        rst.getString(3), rst.getString(4), rst.getString(5),
                        rst.getString(6));
            }
        }catch (SQLException sqle){
            System.out.println("Error al buscar");
        }
        return deportes;
    }
    public ArrayList<DeportesExtremos> ObtenerTodos(){
        String sql = "SELECT * FROM deportes";
        ArrayList<DeportesExtremos> resultado = new ArrayList<>();
        try {
            Statement stm = ConexionSingleton.getInstance("DeportesDB.db").getConnection().createStatement();
            ResultSet rst =stm.executeQuery(sql);
            while (rst.next()){ //itero sobre todos los resultados
                resultado.add(new DeportesExtremos(rst.getInt(1), rst.getString(2),
                        rst.getString(3), rst.getString(4), rst.getString(5),
                        rst.getString(6)));
            }
        }catch (SQLException sqle){
            System.out.println(sqle.getMessage());
        }
        return resultado;
    }
}
