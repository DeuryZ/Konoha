/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.konoha.ninjaMision;

import com.mycompany.konoha.ninjaMision.controller.NinjaMisionController;
import java.time.LocalDate;

/**
 *
 * @author user
 */
public class Hilo implements Runnable{
    private int tiempoDeMision;
    private long ninja_id;
    private long mision_id;

    public Hilo(int tiempoDeMision, long ninja_id, long mision_id) {
        this.tiempoDeMision = tiempoDeMision;
        this.ninja_id = ninja_id;
        this.mision_id = mision_id;
    }

    public int getTiempoDeMision() {
        return tiempoDeMision;
    }

    public void setTiempoDeMision(int tiempoDeMision) {
        this.tiempoDeMision = tiempoDeMision;
    }

    public long getNinja_id() {
        return ninja_id;
    }

    public void setNinja_id(long ninja_id) {
        this.ninja_id = ninja_id;
    }

    public long getMision_id() {
        return mision_id;
    }

    public void setMision_id(long mision_id) {
        this.mision_id = mision_id;
    }
    
    

    @Override
    public void run() {
    try {    
        // Espera el tiempo de misión antes de actualizar la fecha de fin
        Thread.sleep(tiempoDeMision * 86400000); // Convierte segundos a milisegundos
        String fechaFin = LocalDate.now().toString();
        // Realiza la actualización en la base de datos
        NinjaMisionController.completarMision(mision_id, fechaFin);
    } catch (InterruptedException e) {
        e.printStackTrace();
        }
    }

    
}
