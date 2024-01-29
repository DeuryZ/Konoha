/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.konoha.mision.DAO;

import com.mycompany.konoha.DAO.IGetAllDAO;
import com.mycompany.konoha.mision.Mision;
import com.mycompany.konoha.persistence.BDConnection;
import com.mycompany.konoha.persistence.Operations;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class MisionDAO implements IGetAllDAO{
    
    @Override
    public List getAll() {
        Operations.setConnection(BDConnection.MySQLConnection());
        // Create a query and send corresponding information in each field by replacing the character "?" with the information
        String stmInsert = "SELECT * FROM mision;";
        try (PreparedStatement ps = Operations.getConnection().prepareStatement(stmInsert)) {
            ResultSet rs = Operations.query_db(ps);
            List<Mision> listMision = new ArrayList<>();
            while (rs.next()) {
                Mision mision = new Mision();
                mision.setMision_id(rs.getLong("mision_id"));
                mision.setDescripcion(rs.getString("descripcion"));
                mision.setRango(rs.getString("rango"));
                mision.setRecompensa(rs.getDouble("recompensa"));
                listMision.add(mision);
            }
            return listMision;
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("An error has occurred: " + e.getMessage());
        }
        return null;
    }
}
