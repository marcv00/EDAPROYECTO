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
        Interesado i1 = new Interesado("1111","Jose","ppppp");
        Expediente e1 = new Expediente("1234","0",i1,"Que rico","Soy chipi");
        Interesado i2 = new Interesado("0000","Miguel","aaaaaa");
        Expediente e2 = new Expediente("4321","1",i2,"Que feo","Soy venoso");
        Tramite t1 = new Tramite(e1,"proceso","ini","fin","geerado","Breña");
        Tramite t2 = new Tramite(e2,"proceso","ini","fin","generado","Comas");
        BandejaTramite b1 = new BandejaTramite();
        b1.encolar(t1);
        b1.encolar(t2);
        b1.mostrarCola();
        System.out.println(b1.desencolar().getExp().getID());
    }
}
