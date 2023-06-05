package org.example.persistencia;

import org.example.modelo.DeportesExtremos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DeportesDAO implements InterfazDAO {

    public DeportesDAO() {
    }

    @Override
    public boolean insetar(Object obj) throws SQLException {
        String sqlInsert = "Insert INTO deportes (url, nombre, clasificacion, origen, aditamentos) VALUES (?, ?, ?, ?, ?)";
        int rowCount = 0;
        PreparedStatement pstm = ConexionSingleton.getInstance("DeportesDB.db").getConnection().prepareStatement(sqlInsert);
        pstm.setString(1, ((DeportesExtremos) obj).getUrl());
        pstm.setString(2, ((DeportesExtremos) obj).getNombre());
        pstm.setString(3, ((DeportesExtremos) obj).getClasificacion());
        pstm.setString(4, ((DeportesExtremos) obj).getOrigen());
        pstm.setString(5, ((DeportesExtremos) obj).getAditamentos());
        rowCount = pstm.executeUpdate();
        return rowCount > 0;
    }

    @Override
    public boolean update(Object obj) throws SQLException {
        String sqlUpdate = "UPDATE deportes SET url = ?, nombre = ?, clasificacion = ?, origen = ?, aditamentos = ? WHERE id = ? ; ";
        int rowCount = 0;
        PreparedStatement pstm = ConexionSingleton.getInstance("DeportesDB.db").getConnection().prepareStatement(sqlUpdate);
        pstm.setString(1, ((DeportesExtremos) obj).getUrl());
        pstm.setString(2, ((DeportesExtremos) obj).getNombre());
        pstm.setString(3, ((DeportesExtremos) obj).getClasificacion());
        pstm.setString(4, ((DeportesExtremos) obj).getOrigen());
        pstm.setString(5, ((DeportesExtremos) obj).getAditamentos());
        pstm.setInt(6, ((DeportesExtremos) obj).getId());
        rowCount = pstm.executeUpdate();
        return rowCount > 0;
    }

    @Override
    public boolean delete(String id) throws SQLException {
        String sqlDelete = "DELETE FROM deportes WHERE id = ? ;";
        int rowCount = 0;
        PreparedStatement pstm = ConexionSingleton.getInstance("DeportesDB.db").getConnection().prepareStatement(sqlDelete);
        pstm.setInt(1, Integer.parseInt(id));
        rowCount = pstm.executeUpdate();
        return rowCount > 0;
    }

    @Override
    public ArrayList obtenerTodo() throws SQLException {
        String sql = "SELECT * FROM deportes";
        ArrayList<DeportesExtremos> resultado = new ArrayList<>();

            Statement stm = ConexionSingleton.getInstance("DeportesDB.db").getConnection().createStatement();
            ResultSet rst =stm.executeQuery(sql);
            while (rst.next()){ //itero sobre todos los resultados
                resultado.add(new DeportesExtremos(rst.getInt(1), rst.getString(2),
                        rst.getString(3), rst.getString(4), rst.getString(5),
                        rst.getString(6)));
            }
        return resultado;
    }

    @Override
    public Object buscarPorId(String id) throws SQLException {
        String sql = "SELECT * FROM deportes WHERE id = ? ;";
        DeportesExtremos deportes = null;
        PreparedStatement pstm = ConexionSingleton.getInstance("DeportesDB.db").getConnection().prepareStatement(sql);
        pstm.setInt(1, Integer.parseInt(id));
        ResultSet rst = pstm.executeQuery();
        if (rst.next()) {
            deportes = new DeportesExtremos(rst.getInt(1), rst.getString(2),
                    rst.getString(3), rst.getString(4), rst.getString(5),
                    rst.getString(6));
            return deportes;
        }
        return null;
    }
}
