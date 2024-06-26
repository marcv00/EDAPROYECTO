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
public class Personal extends Usuario {

    protected String bandeja;
    public Personal(String ID, String contraseña, char tipo, String nombre, String dependencia, String correo, String bandeja) {
        super(ID, contraseña, tipo, nombre, dependencia, correo);
        this.bandeja = bandeja;
    }
    
    

    @Override
    public void setTipo(char tipo) {
        super.setTipo(tipo); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public char getTipo() {
        return super.getTipo(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setCorreo(String correo) {
        super.setCorreo(correo); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getCorreo() {
        return super.getCorreo(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setDependencia(String dependencia) {
        super.setDependencia(dependencia); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getDependencia() {
        return super.getDependencia(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNombre() {
        return super.getNombre(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setContraseña(String contraseña) {
        super.setContraseña(contraseña); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getContraseña() {
        return super.getContraseña(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setID(String ID) {
        super.setID(ID); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getID() {
        return super.getID(); //To change body of generated methods, choose Tools | Templates.
    }

    public String getBandeja() {
        return bandeja;
    }

    public void setBandeja(String bandeja) {
        this.bandeja = bandeja;
    }

   
    
    
}
