/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.konoha.ninjaMision.controller;

import com.mycompany.konoha.ninjaMision.DAO.NinjaMisionDAO;
import com.mycompany.konoha.ninjaMision.NinjaMision;
import java.util.List;

/**
 *
 * @author user
 */
public class NinjaMisionController {
    public final static NinjaMisionDAO ninjaMisionDAO = new NinjaMisionDAO();
    
    public static void guardarMision(NinjaMision ninjaMision){
        ninjaMisionDAO.save(ninjaMision);
    }
    public static NinjaMision buscarPorIdDeMision(long id){
        return ninjaMisionDAO.getById(id);
    }
    public static void completarMision(long id, String fechaFin){
        ninjaMisionDAO.update(id, fechaFin);
    }
    public static List<NinjaMision> mostrarMisionesCompletadas(){
        return ninjaMisionDAO.getComplete();
    }
    
}
