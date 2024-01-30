/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.konoha.ninjaMision;

import java.sql.Date;
/**
 *
 * @author user
 */
public class NinjaMision {
    private long ninja_id;
    private long mision_id;
    String fechaInicio;
    String fechaFinal;
    int tiempoDeMision;

    public NinjaMision(long ninja_id, long mision_id, String fechaInicio, int tiempoDeMision) {
        this.ninja_id = ninja_id;
        this.mision_id = mision_id;
        this.fechaInicio = fechaInicio;
        this.tiempoDeMision = tiempoDeMision; 
    }

    public NinjaMision() {
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

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = (fechaInicio);
    }

    public String getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(String fechaFinal) {
        this.fechaFinal = (fechaFinal);
    }

    public int getTiempoDeMision() {
        return tiempoDeMision;
    }

    public void setTiempoDeMision(int tiempoDeMision) {
        this.tiempoDeMision = tiempoDeMision;
    }

    @Override
    public String toString() {
        return "NinjaMision{" + "ninja_id=" + ninja_id + ", mision_id=" + mision_id + ", fechaInicio=" + fechaInicio + ", fechaFinal=" + fechaFinal + ", tiempoDeMision=" + tiempoDeMision + '}';
    }

}
