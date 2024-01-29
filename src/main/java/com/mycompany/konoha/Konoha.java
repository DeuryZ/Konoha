/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.konoha;

import com.mycompany.konoha.ninja.Ninja;
import com.mycompany.konoha.ninja.controller.NinjaController;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class Konoha {

    public static void main(String[] args) {
        List<Ninja> prueba = new ArrayList<>();
        prueba = NinjaController.traerNinjas();
        for (Ninja ninja : prueba) {
            System.out.println(ninja);
        }
    }
}
