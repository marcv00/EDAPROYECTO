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
public class Tramite {
    
    private Expediente exp;
    private String fechain, horain, fechafin,horafin,estado,dependencia,documento;
    private Tramite sgte;

    public Tramite(Expediente exp, String estado, String fechain,String horain, String fechafin, String horafin,String documento, String dependencia) {
        this.exp = exp;
        this.fechain = fechain;
        this.fechafin = fechafin;
        this.horain = horain;
        this.horafin = horafin;
        this.estado = estado;
        this.documento = documento;
        this.dependencia = dependencia;
        this.sgte = null;
    } 
    
    public Expediente getExp() {
        return exp;
    }

    public void setExp(Expediente exp) {
        this.exp = exp;
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDependencia() {
        return dependencia;
    }

    public void setDependencia(String dependencia) {
        this.dependencia = dependencia;
    }

    public Tramite getSgte() {
        return sgte;
    }

    public void setSgte(Tramite sgte) {
        this.sgte = sgte;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getFechain() {
        return fechain;
    }

    public void setFechain(String fechain) {
        this.fechain = fechain;
    }

    public String getFechafin() {
        return fechafin;
    }

    public void setFechafin(String fechafin) {
        this.fechafin = fechafin;
    }
    
    
}
