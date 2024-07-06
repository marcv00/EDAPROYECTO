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
    
    public static BandejaTramite OrdenarPrioridad(BandejaTramite bandeja)
    {
        /*
        int cant = 0;
        BandejaTramite aux = new BandejaTramite();
        bandeja.mostrarCola();
        for(int i = 0;i<bandeja.longitud();i++)
        {   
            Tramite mover = bandeja.desencolar();
            String prioridad = mover.getExp().getPrioridad();
            if(prioridad.equalsIgnoreCase("Alta"))
            {
                aux.encolar(mover);
            }
        }
        bandeja.mostrarCola();
        System.out.println(bandeja.longitud());
        for(int i = 0;i<bandeja.longitud();i++)
        {
            
            Tramite mover = bandeja.desencolar();
            aux.encolar(mover);
        }
        return aux;
        */
        BandejaTramite aux = new BandejaTramite();
        BandejaTramite tempBandeja = new BandejaTramite();
        // Procesar trámites con prioridad alta
        while (!bandeja.esVacia()) {
            Tramite mover = bandeja.desencolar();
            String prioridad = mover.getExp().getPrioridad();
            if (prioridad.equalsIgnoreCase("Alta")) {
                aux.encolar(mover);
            } else {
                tempBandeja.encolar(mover);
            }
        }
        // Procesar trámites con prioridad baja
        while (!tempBandeja.esVacia()) {
            Tramite mover = tempBandeja.desencolar();
            aux.encolar(mover);
        }
        aux.mostrarCola();
        return aux;
    
    }
    
    public static void main(String[] args) {
        Interesado i1 = new Interesado("DNI","NOMBRE","CORREO");
        Expediente e1 = new Expediente("1111", "Alta", i1, "asunto", "referencia");
        Tramite t1 = new Tramite(e1, "En proceso", "fechain", "horain", "fechafin", "horafin", "documento", "dependencia");
        Interesado i2 = new Interesado("DNI","NOMBRE","CORREO");
        Expediente e2 = new Expediente("2222", "Baja", i2, "asunto", "referencia");
        Tramite t2 = new Tramite(e2, "En proceso", "fechain", "horain", "fechafin", "horafin", "documento", "dependencia");
        Interesado i3 = new Interesado("DNI","NOMBRE","CORREO");
        Expediente e3 = new Expediente("3333", "Alta", i3, "asunto", "referencia");
        Tramite t3 = new Tramite(e3, "En proceso", "fechain", "horain", "fechafin", "horafin", "documento", "dependencia");
        Interesado i4 = new Interesado("DNI","NOMBRE","CORREO");
        Expediente e4 = new Expediente("44444", "Baja", i4, "asunto", "referencia");
        Tramite t4 = new Tramite(e4, "En proceso", "fechain", "horain", "fechafin", "horafin", "documento", "dependencia");
        BandejaTramite bandeja = new BandejaTramite();
        bandeja.encolar(t1);
        bandeja.encolar(t2);
        bandeja.encolar(t3);
        bandeja.encolar(t4);
        BandejaTramite ordenada = OrdenarPrioridad(bandeja);
        ordenada.mostrarCola();
        
        
        
        
    }
}
