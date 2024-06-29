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
public class Evento_Tramite {
    
    protected Expediente exp;
    protected Evento_Tramite sgte;
    protected Dependencia punto;
    protected String horain, horafin;
    protected Usuario empleado;

    public Evento_Tramite(Expediente exp, Dependencia punto, String horain, String horafin) {
        this.exp = exp;
        this.sgte = null;
        this.punto = punto;
        this.horain = horain;
        this.empleado = empleado;
        this.horafin = horafin;
    }

    public Expediente getExp() {
        return exp;
    }

    public void setExp(Expediente exp) {
        this.exp = exp;
    }

    public Evento_Tramite getSgte() {
        return sgte;
    }

    public void setSgte(Evento_Tramite sgte) {
        this.sgte = sgte;
    }

    public Dependencia getPunto() {
        return punto;
    }

    public void setPunto(Dependencia punto) {
        this.punto = punto;
    }

    public Usuario getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Usuario empleado) {
        this.empleado = empleado;
    }

    public String getHorain() {
        return horain;
    }

    public void setHorain(String horain) {
        this.horain = horain;
    }

    public String getHorafin() {
        return horafin;
    }

    public void setHorafin(String horafin) {
        this.horafin = horafin;
    }
    
    
}
