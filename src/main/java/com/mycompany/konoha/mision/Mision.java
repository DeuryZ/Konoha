/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.konoha.mision;



/**
 *
 * @author user
 */
public class Mision{
    private long mision_id;
    private String descripcion;
    private String rango;
    private double recompensa;
    
    public Mision() {
    }

    public Mision(long mision_id, String descripcion, String rango, double recompensa) {
        this.mision_id = mision_id;
        this.descripcion = descripcion;
        this.rango = rango;
        this.recompensa = recompensa;
    }

    public long getMision_id() {
        return mision_id;
    }

    public void setMision_id(long mision_id) {
        this.mision_id = mision_id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    public double getRecompensa() {
        return recompensa;
    }

    public void setRecompensa(double recompensa) {
        this.recompensa = recompensa;
    }

    @Override
    public String toString() {
        return "Mision{" + "mision_id=" + mision_id + ", descripcion=" + descripcion + ", rango=" + rango + ", recompensa=" + recompensa + '}';
    }

    
    
    
}
