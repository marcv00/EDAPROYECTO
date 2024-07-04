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
            System.out.println("Expediente: ID: "+frente.getExp().getID()+"\n"+
                                            "Prioridad: "+frente.getExp().getPrioridad()+"\n"+
                                            "Interesado: DNI: "+frente.getExp().getNuevo().getDNI()+"\n"+
                                                        "Nombre: "+frente.getExp().getNuevo().getNombre()+"\n"+
                                                        "Correo: "+frente.getExp().getNuevo().getCorreo()+"\n"+
                                 "Estado: "+frente.getEstado()+"\n"+
                                "Hora inicio: "+frente.getHorain()+"\n"+
                                "Hora fin: "+frente.getHorafin()+"\n"+
                                "Documento generado: "+frente.getDocumento()+"\n");
            aux = aux.getSgte();
            
        }
    }
}
