/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.konoha.ninja.DAO;

import com.mycompany.konoha.DAO.*;
import com.mycompany.konoha.ninja.Ninja;
import com.mycompany.konoha.persistence.BDConnection;
import com.mycompany.konoha.persistence.Operations;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class NinjaDAO implements IGetAllDAO, ISaveDAO<Ninja>{

    @Override
    public List getAll() {
        Operations.setConnection(BDConnection.MySQLConnection());
        // Create a query and send corresponding information in each field by replacing the character "?" with the information
        String stmInsert = "SELECT * FROM ninja;";
        try (PreparedStatement ps = Operations.getConnection().prepareStatement(stmInsert)) {
            ResultSet rs = Operations.query_db(ps);
            List<Ninja> listNinja = new ArrayList<>();
            while (rs.next()) {
                Ninja ninja = new Ninja();
                ninja.setNinja_id(rs.getLong("ninja_id"));
                ninja.setNombre(rs.getString("nombre"));
                ninja.setRango(rs.getString("rango"));
                ninja.setAldea(rs.getString("aldea"));
                listNinja.add(ninja);
            }
            return listNinja;
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("An error has occurred: " + e.getMessage());
        }
        return null;
    }

    @Override
    public void save(Ninja t) {
        
    }
    
}
