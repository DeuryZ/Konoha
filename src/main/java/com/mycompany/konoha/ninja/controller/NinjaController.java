/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.konoha.ninja.controller;

import com.mycompany.konoha.ninja.DAO.NinjaDAO;
import com.mycompany.konoha.ninja.Ninja;
import java.util.List;

/**
 *
 * @author user
 */
public class NinjaController {
    private final static NinjaDAO ninjaDAO = new NinjaDAO();

    public static List<Ninja> traerNinjas() {
        return ninjaDAO.getAll();
    }
}
