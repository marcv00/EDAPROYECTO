/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import vista.CrearusuarioUI;

/**
 *
 * @author KEVIN
 */
public class Demo {
    
    public static void main(String[] args) {
        Administracion ad = new Administracion();
        Usuario nuevo = new Usuario("ID", "Contra","Nom","Cor");
        
        ad.insertar("ID", "Contra","Nom","Cor");
        ad.mostrar();
        
        Usuario otro = CrearusuarioUI.Interesado.buscarID("I202232");
        System.out.println(otro.getID());
    }
}
