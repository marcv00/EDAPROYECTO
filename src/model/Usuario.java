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
public abstract class Usuario {
    
    protected String ID, contraseña, nombre, dependencia, correo;
    protected char tipo;
    

    public Usuario(String ID, String contraseña, char tipo, String nombre, String dependencia, String correo) {
        this.ID = ID;
        this.contraseña = contraseña;
        this.nombre = nombre;
        this.dependencia = dependencia;
        this.correo = correo;
        this.tipo = tipo;
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

    public String getDependencia() {
        return dependencia;
    }

    public void setDependencia(String dependencia) {
        this.dependencia = dependencia;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    //prioridad 1-3 id interesado estado dependencia empleado hora
    
    
}
