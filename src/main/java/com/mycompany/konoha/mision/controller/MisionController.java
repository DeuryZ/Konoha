/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.konoha.mision.controller;

import com.mycompany.konoha.mision.DAO.MisionDAO;
import com.mycompany.konoha.mision.Mision;
import java.util.List;

/**
 *
 * @author user
 */
public class MisionController {
    private final static MisionDAO misionDAO = new MisionDAO();
    public static List<Mision> traerMisiones(){
        return misionDAO.getAll();
    }
    
}
