/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.konoha.ninja;

/**
 *
 * @author user
 */
public class Ninja {
    private long ninja_id;
    private String nombre;
    private String rango;
    private String aldea;

    public Ninja(long ninja_id, String nombre, String rango, String aldea) {
        this.ninja_id = ninja_id;
        this.nombre = nombre;
        this.rango = rango;
        this.aldea = aldea;
    }

    public Ninja() {
    }

    public long getNinja_id() {
        return ninja_id;
    }

    public void setNinja_id(long ninja_id) {
        this.ninja_id = ninja_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    public String getAldea() {
        return aldea;
    }

    public void setAldea(String aldea) {
        this.aldea = aldea;
    }

    @Override
    public String toString() {
        return "ninja{" + "ninja_id=" + ninja_id + ", nombre=" + nombre + ", rango=" + rango + ", aldea=" + aldea + '}';
    }
    
    
}
