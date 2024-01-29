 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.konoha.habilidad;

/**
 *
 * @author user
 */
public class Habilidad {
    private long ninja_id;
    private String nombre;
    private String descripcion;

    public Habilidad() {
    }

    public Habilidad(long ninja_id, String nombre, String descripcion) {
        this.ninja_id = ninja_id;
        this.nombre = nombre;
        this.descripcion = descripcion;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Habilidad{" + "ninja_id=" + ninja_id + ", nombre=" + nombre + ", descripcion=" + descripcion + '}';
    }
    
    
}
