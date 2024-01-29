/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.konoha.habilidad.controller;

import com.mycompany.konoha.habilidad.DAO.HabilidadDAO;
import com.mycompany.konoha.habilidad.Habilidad;
import java.util.List;

/**
 *
 * @author user
 */
public class HabilidadController {
    private final static HabilidadDAO habilidadDAO = new HabilidadDAO();
    public static List<Habilidad> traerHabilidades(){
        return habilidadDAO.getAll();
    }
    public static void guardarHabilidad(Habilidad habilidad){
        habilidadDAO.save(habilidad);
    }

}
