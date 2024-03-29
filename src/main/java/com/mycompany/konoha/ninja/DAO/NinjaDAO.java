/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.konoha.ninja.DAO;

import com.mycompany.konoha.DAO.*;
import com.mycompany.konoha.habilidad.Habilidad;
import com.mycompany.konoha.ninja.Ninja;
import com.mycompany.konoha.ninja.NinjaFull;
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
            List<NinjaFull> listNinja = new ArrayList<>();
            while (rs.next()) {
                NinjaFull ninja = new NinjaFull();
                ninja.setNinja_id(rs.getLong("ninja_id"));
                ninja.setNombre(rs.getString("nombre"));
                ninja.setRango(rs.getString("rango"));
                ninja.setAldea(rs.getString("aldea"));
                listNinja.add(ninja);
            }
            for (NinjaFull ninjaFull : listNinja) {
            String stmInsertHabilidades = "SELECT * FROM habilidad WHERE ninja_id = ?;";
            PreparedStatement ps2 = Operations.getConnection().prepareStatement(stmInsertHabilidades);
            ps2.setLong(1,ninjaFull.getNinja_id());
            ResultSet rs2 = Operations.query_db(ps2);
            List<Habilidad> habilidades = new ArrayList<>();
            while(rs2.next()){
                Habilidad habilidad = new Habilidad();
                habilidad.setNinja_id(rs2.getLong("ninja_id"));
                habilidad.setNombre(rs2.getString("nombre"));
                habilidad.setDescripcion(rs2.getString("descripcion"));
                habilidades.add(habilidad);
            }
            ninjaFull.setHabilidades(habilidades);
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
        Operations.setConnection(BDConnection.MySQLConnection());
        // Create a query and send corresponding information in each field by replacing the character "?" with the information
        String stmInsert = "INSERT INTO ninja (nombre, rango, aldea) VALUES(?, ?, ?);";
        try (PreparedStatement ps = Operations.getConnection().prepareStatement(stmInsert)) {
            ps.setString(1, t.getNombre());
            ps.setString(2, t.getRango());
            ps.setString(3, t.getAldea());
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
