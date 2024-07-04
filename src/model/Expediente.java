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
    
    private String ID, asunto, docref;
    private String prioridad;
    private Interesado nuevo;

    public Expediente(String ID, String prioridad, Interesado nuevo, String asunto, String docref) {
        this.ID = ID;
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

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public Interesado getNuevo() {
        return nuevo;
    }

    public void setNuevo(Interesado nuevo) {
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
