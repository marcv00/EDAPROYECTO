/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author l33212
 */
public abstract class Persona {
    
    protected String nombre, correo;

    public Persona(String nombre,String correo) {
        this.nombre = nombre;
        this.correo = correo;
    }
    
}
