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
public class Administrador {
    
    private String ID, contraseña, nombre, correo;
    private Administrador sgte;
    
    

    public Administrador() {
        this.ID="";
        this.contraseña="";
        this.correo="";
        this.nombre="";
        this.sgte = null;
    }

    
    
    public Administrador(String ID, String contraseña, String nombre, String correo) {
        this.ID = ID;
        this.contraseña = contraseña;
        this.nombre = nombre;
        this.correo = correo;
        this.sgte = null;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Administrador getSgte() {
        return sgte;
    }

    public void setSgte(Administrador sgte) {
        this.sgte = sgte;
    }

     


    
    
}
