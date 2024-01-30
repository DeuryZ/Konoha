/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.konoha.habilidad.DAO;

import com.mycompany.konoha.DAO.*;
import com.mycompany.konoha.habilidad.Habilidad;
import com.mycompany.konoha.mision.Mision;
import com.mycompany.konoha.persistence.BDConnection;
import com.mycompany.konoha.persistence.Operations;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 *
 * @author user
 */
public class HabilidadDAO implements IGetAllDAO<Habilidad>, ISaveDAO<Habilidad>{

    @Override
    public List<Habilidad> getAll() {
        Operations.setConnection(BDConnection.MySQLConnection());
        String stmInsert = "SELECT * FROM habilidad;";

        try (PreparedStatement ps = Operations.getConnection().prepareStatement(stmInsert)) {
            ResultSet rs = Operations.query_db(ps);
            return mapResultSetToList(rs, rsIteracion -> {
                try {
                    Habilidad habilidad = new Habilidad();
                    habilidad.setNinja_id(rs.getLong("ninja_id"));
                    habilidad.setNombre(rs.getString("nombre"));
                    habilidad.setDescripcion(rs.getString("descripcion"));
                    return habilidad;
                } catch (SQLException e) {
                    throw new RuntimeException("Error mapping ResultSet to Habilidad", e);
                }
            });
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("An error has occurred: " + e.getMessage());
        }

        return null;
    }
    
    private <T> List<T> mapResultSetToList(ResultSet rs, Function<ResultSet, T> mapper) throws SQLException {
        List<T> list = new ArrayList<>();
        while (rs.next()) {
            list.add(mapper.apply(rs));
        }
        return list;
    }
    
    @Override
    public void save(Habilidad t) {
        Operations.setConnection(BDConnection.MySQLConnection());
        // Create a query and send corresponding information in each field by replacing the character "?" with the information
        String stmInsert = "INSERT INTO habilidad (ninja_id, nombre, descripcion) VALUES(?, ?, ?);";
        try (PreparedStatement ps = Operations.getConnection().prepareStatement(stmInsert)) {
            ps.setLong(1, t.getNinja_id());
            ps.setString(2, t.getNombre());
            ps.setString(3, t.getDescripcion());
            // use Operation class with insert_update_delete and verify if the rows in database are affected
            int rows = Operations.insert_update_delete_db(ps);

            if (rows <= 0) {
                System.out.println("Error insert establishment to database");
            } else {
                System.out.println("Successful  insert establishment");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("An error has occurred: " + e.getMessage());
        }
    }

    
    
    
}
