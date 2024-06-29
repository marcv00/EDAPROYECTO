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
public class Demo {
    
    public static void main(String[] args) {
        AdminDependencia nuevo = new AdminDependencia();
        
        nuevo.insertar("pepe");
        nuevo.insertar("jose");
        
        System.out.println(nuevo.NDep());
        String[] datos = new String[nuevo.NDep()];
        for(int i = 0; i<nuevo.NDep();i++)
        {
            System.out.println(nuevo.ObtenerDepedencias(i));
        }
        
    }
}
