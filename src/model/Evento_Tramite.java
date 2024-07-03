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
    
    private Expediente exp;
    private Dependencia punto;
    private String horain, horafin;

    public Evento_Tramite(Expediente exp, String horain, String horafin) {
        this.exp = exp;
        this.horain = horain;
        this.horafin = horafin;
    }

    public Expediente getExp() {
        return exp;
    }

    public void setExp(Expediente exp) {
        this.exp = exp;
    }

    public Dependencia getPunto() {
        return punto;
    }

    public void setPunto(Dependencia punto) {
        this.punto = punto;
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
