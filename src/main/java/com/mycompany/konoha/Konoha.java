/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.konoha;

import com.mycompany.konoha.habilidad.Habilidad;
import com.mycompany.konoha.habilidad.controller.HabilidadController;
import com.mycompany.konoha.mision.Mision;
import com.mycompany.konoha.mision.controller.MisionController;
import com.mycompany.konoha.ninja.Ninja;
import com.mycompany.konoha.ninja.NinjaFull;
import com.mycompany.konoha.ninja.controller.NinjaController;
import com.mycompany.konoha.ninjaMision.NinjaMision;
import com.mycompany.konoha.ninjaMision.controller.NinjaMisionController;
import java.sql.Date;
import java.time.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class Konoha {

    public static void main(String[] args) {
        
        // crear un ninja
//        Ninja ninjaTest = new Ninja(0, "pedro", "s", "sanja");
//        NinjaController.guardarNinja(ninjaTest);

        // listar todos los ninjas con sus habilidades
//        List<NinjaFull> prueba = new ArrayList<>();
//        prueba = NinjaController.traerNinjas();
//        for (NinjaFull ninja : prueba) {
//            System.out.println(ninja);
//        }

        // mostrar todas las misiones
//        List<Mision> pruebaMisiones = new ArrayList<>();
//        pruebaMisiones = MisionController.traerMisiones();
//        for (Mision pruebaMisione : pruebaMisiones) {
//            System.out.println(pruebaMisione);
//        }

        // mostrar las habilidades
//        List<Habilidad> pruebaHabilidad = new ArrayList<>();
//        pruebaHabilidad = HabilidadController.traerHabilidades();
//        for (Habilidad habilidad : pruebaHabilidad) {
//            System.out.println(habilidad);
//        }

        // asignar un ninja a una mision
//        NinjaMision ninjaMisionTest = new NinjaMision(2, 4, "2024-02-30");
//        NinjaMisionController.guardarMision(ninjaMisionTest);

        // buscar misiones asignadas por el id de la mision
//        NinjaMision nmp = NinjaMisionController.buscarPorIdDeMision(2);
//        System.out.println(nmp);
        
        //completar mision con el id de la mision y la fecha final
//          NinjaMisionController.completarMision(2, "2024-04-12");

        // listar todas las misiones ya completadas
//        List<NinjaMision> pruebaMisionesCompletas = new ArrayList<>();
//        pruebaMisionesCompletas = NinjaMisionController.mostrarMisionesCompletadas();
//        for (NinjaMision pruebaMisionesCompleta : pruebaMisionesCompletas) {
//            System.out.println(pruebaMisionesCompleta);
//        }


        //intento de menu
//    private final int option=-1;
//    while (option 0){
//        System.out.println("Bienvenido al menu de Konoha! ¿qué te gustaria hacer hoy?");
//        System.out.println("1. Crear una mision");
//        System.out.println("2. Crear un nuevo ninja");
//        System.out.println("3. Asignar a un ninja una mision");
//        System.out.println("4. Marcar una mision como completada");
//        System.out.println("5.Mostrar todas las misiones completadas");  
//    }
        
        


    }

}
