/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.konoha.ninjaMision.DAO;

import com.mycompany.konoha.DAO.*;
import com.mycompany.konoha.mision.Mision;
import com.mycompany.konoha.ninjaMision.NinjaMision;
import com.mycompany.konoha.persistence.BDConnection;
import com.mycompany.konoha.persistence.Operations;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class NinjaMisionDAO implements ISaveDAO<NinjaMision>, IGetByIdDAO<NinjaMision>{

    @Override
    public void save(NinjaMision t) {
        Operations.setConnection(BDConnection.MySQLConnection());
        // Create a query and send corresponding information in each field by replacing the character "?" with the information
        String stmInsert = "INSERT INTO mision_ninja (ninja_id, mision_id, fecha_inicio) VALUES(?, ?, ?);";
        try (PreparedStatement ps = Operations.getConnection().prepareStatement(stmInsert)) {
            ps.setLong(1, t.getNinja_id());
            ps.setLong(2, t.getMision_id());
            ps.setDate(3, Date.valueOf(t.getFechaInicio()));
            // use Operation class with insert_update_delete and verify if the rows in database are affected
            int rows = Operations.insert_update_delete_db(ps);

            if (rows <= 0) {
                System.out.println("Error insert mision to database");
            } else {
                System.out.println("Successful  insert mision");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("An error has occurred: " + e.getMessage());
        }
    }

    public void update(long id, String fechaFin) {
            NinjaMision ninjaMision = getById(id);

        if (ninjaMision != null) {
            if (ninjaMision.getFechaFinal()==null){
                            ninjaMision.setFechaFinal(fechaFin);
            // Create a query and send corresponding information in each field by replacing the character "?" with the information
            String stmInsert = """
                           UPDATE mision_ninja 
                           SET fecha_fin = ?
                           WHERE mision_id = ?
                           """;
            try (PreparedStatement ps = Operations.getConnection().prepareStatement(stmInsert)) {
                ps.setString(1, ninjaMision.getFechaFinal());
                ps.setLong(2,ninjaMision.getMision_id()) ;

                // use Operation class with insert_update_delete and verify if the rows in database are affected
                int rows = Operations.insert_update_delete_db(ps);

                if (rows <= 0) {
                    System.out.println("Error to complete mision");
                } else {
                    System.out.println("Mision complete");
                }
            } catch (SQLException e) {
                e.printStackTrace();
                System.out.println("An error has occurred: " + e.getMessage());
            }
            } else{
                System.out.println("Mision complete yet, try with another mision");
            }

        } else {
            System.out.println("mision to complete not found");
        }
    }

    @Override
    public NinjaMision getById(long id) {
        Operations.setConnection(BDConnection.MySQLConnection());
        // Create a query and send corresponding information in each field by replacing the character "?" with the information
        String stmInsert = "SELECT * FROM mision_ninja WHERE mision_id=?;";
        try (PreparedStatement ps = Operations.getConnection().prepareStatement(stmInsert)) {
            ps.setLong(1, id);
            ResultSet rs = Operations.query_db(ps);
            if (rs.next()) {
                NinjaMision nm = new NinjaMision();
                nm.setNinja_id(rs.getLong("ninja_id"));
                nm.setMision_id(rs.getLong("mision_id"));
                nm.setFechaInicio(rs.getString("fecha_inicio"));
                nm.setFechaFinal(rs.getString("fecha_fin"));
                return nm;
            } else {
                System.out.println("Not found mision");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("An error has occurred: " + e.getMessage());
        }
        return null;
    }
    
    public List<NinjaMision> getComplete(){
        Operations.setConnection(BDConnection.MySQLConnection());
        // Create a query and send corresponding information in each field by replacing the character "?" with the information
        String stmInsert = "SELECT * FROM mision_ninja WHERE fecha_fin IS NOT NULL;";
        try (PreparedStatement ps = Operations.getConnection().prepareStatement(stmInsert)) {
            ResultSet rs = Operations.query_db(ps);
            List<NinjaMision> ninjaMisionList = new ArrayList<>();
            while (rs.next()) {
                NinjaMision ninjaMision = new NinjaMision();
                ninjaMision.setNinja_id(rs.getLong("ninja_id"));
                ninjaMision.setFechaInicio(rs.getString("mision_id"));
                ninjaMision.setFechaInicio(rs.getString("fecha_inicio"));
                ninjaMision.setFechaFinal(rs.getString("fecha_fin"));
                ninjaMisionList.add(ninjaMision);
            }
            return ninjaMisionList;
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("An error has occurred: " + e.getMessage());
        }
        return null;
    }
}
