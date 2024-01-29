/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.konoha.ninja;

import com.mycompany.konoha.habilidad.Habilidad;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class NinjaFull extends Ninja{
    List<Habilidad> habilidades = new ArrayList<>();

    public NinjaFull() {
    }
    
    public NinjaFull(long ninja_id, String nombre, String rango, String aldea, List<Habilidad> habilidades) {
        super(ninja_id, nombre, rango, aldea);
        this.habilidades = habilidades;
    }

    public List<Habilidad> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(List<Habilidad> habilidades) {
        this.habilidades = habilidades;
    }

    @Override
    public String toString() {
        return super.toString()+ " NinjaFull{" + "habilidades=" + habilidades + '}';
    }
    
    

    
    
}
