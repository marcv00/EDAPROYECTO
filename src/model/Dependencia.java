/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author KEVIN
 */
public class Dependencia {
    
    private String nombre;
    private Dependencia sgte;

    public Dependencia(String nombre, Usuario nuevo, Dependencia sgte) {
        this.nombre = nombre;
        this.sgte = null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Dependencia getSgte() {
        return sgte;
    }

    public void setSgte(Dependencia sgte) {
        this.sgte = sgte;
    }

    
    


    
}
