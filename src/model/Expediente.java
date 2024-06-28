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
public class Expediente {
    
    private String ID, estado, asunto, docref;
    private int prioridad;
    private Usuario nuevo;

    public Expediente(String ID, String estado, int prioridad, Usuario nuevo, String asunto, String docref) {
        this.ID = ID;
        this.estado = estado;
        this.prioridad = prioridad;
        this.nuevo = nuevo;
        this.asunto = asunto;
        this.docref = docref;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public Usuario getNuevo() {
        return nuevo;
    }

    public void setNuevo(Usuario nuevo) {
        this.nuevo = nuevo;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getDocref() {
        return docref;
    }

    public void setDocref(String docref) {
        this.docref = docref;
    }
    
    
}
