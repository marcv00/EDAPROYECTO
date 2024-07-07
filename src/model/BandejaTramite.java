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
public class BandejaTramite {
    
    private Tramite frente;
    private Tramite ultimo;

    // Constructores

    public BandejaTramite() {
        frente = null;
        ultimo = null;
    }

    // Si la cola esta vacia

    public boolean esVacia() {
        if (frente == null) {
            return true;
        } else {
            return false;
        }
    }

    // encolar: agregar un nuevo elemento a al final de la cola

    public void encolar(Tramite nuevo) {
        if (esVacia() == true) {
            Tramite nuevoNodo = nuevo;
            frente = nuevoNodo;
            ultimo = nuevoNodo;
        } else { // la cola no esta vacia
            Tramite nuevoNodo = nuevo;
            ultimo.setSgte(nuevoNodo);
            ultimo = nuevoNodo;

        }
    }

    // desencolar: eliminar el elemento que esta al frente de la cola
    // nos devuelve el elemento eliminado

    public Tramite desencolar() {
        if (esVacia() == false) {
            Tramite x = frente;
            frente = x.getSgte();
            return x;
        } else {
            throw new RuntimeException("ERROR: no es posible desencolar");
        }
    }

    public Tramite frente() {
        if (!esVacia()) {
            return frente;
        } else {
            throw new RuntimeException("ERROR: no es posible devolver frente");
        }
    }

    public int longitud() {
        int i = 0;
        Tramite aux = frente;
        while (aux != null) {
            aux = aux.getSgte();
            i++;
        }
        return i;
    }
    
    public void mostrarCola() {
        Tramite aux = frente;
        while (aux != null) {
            System.out.println("Expediente: ID: "+aux.getExp().getID()+"\n"+
                                            "Prioridad: "+aux.getExp().getPrioridad()+"\n"+
                                            "Interesado: DNI: "+aux.getExp().getNuevo().getDNI()+"\n"+
                                                        "Nombre: "+aux.getExp().getNuevo().getNombre()+"\n"+
                                                        "Correo: "+aux.getExp().getNuevo().getCorreo()+"\n"+
                                 "Estado: "+aux.getEstado()+"\n"+
                                "Hora inicio: "+aux.getHorain()+"\n"+
                                "Hora fin: "+aux.getHorafin()+"\n"+
                                "Documento generado: "+aux.getDocumento()+"\n");
            aux = aux.getSgte();
            
        }
    }
    
    // Método para ordenar la cola por prioridad
    public void ordenarPorPrioridad() {
       if (esVacia() || frente.getSgte() == null) {
        return; // Si la bandeja está vacía o tiene un solo elemento, no se necesita ordenar
       }

        BandejaTramite alta = new BandejaTramite();
        BandejaTramite baja = new BandejaTramite();

        Tramite actual = frente;
        while (actual != null) {
            // Crear una nueva instancia de Tramite
            Tramite nuevoTramite = new Tramite(
                actual.getExp(),
                actual.getEstado(),
                actual.getFechain(),
                actual.getHorain(),
                actual.getFechafin(),
                actual.getHorafin(),
                actual.getDocumento(),
                actual.getSeguimiento()
            );

            if (actual.getExp().getPrioridad().equals("Alta")) {
                alta.encolar(nuevoTramite);
            } else {
                baja.encolar(nuevoTramite);
            }
            actual = actual.getSgte();
        }

        if (!alta.esVacia()) {
            frente = alta.frente();
            ultimo = alta.ultimo;
            if (!baja.esVacia()) {
                ultimo.setSgte(baja.frente());
                ultimo = baja.ultimo;
            }
        } else {
            frente = baja.frente();
            ultimo = baja.ultimo;
        }

    }
}
