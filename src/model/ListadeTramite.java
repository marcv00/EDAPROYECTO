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
public class ListadeTramite {
    
    private Evento_Tramite L;
   
   public ListadeTramite()
   {
       this.L = null;
   }
   
   public boolean estaVacia()
   {
       if (this.L == null)
            return true;
       return false;
   }
   
   public void mostrar()
   {
       Evento_Tramite ptr = this.L;
       while (ptr !=null)
       {
           System.out.print( ptr.getEmpleado() + "/n"
                            );
           
                            
           ptr = ptr.getSgte();
       }
       System.out.println("");
   }
   
   public void insertar(Expediente exp, Dependencia punto, String horain, String horafin, Usuario empleado)
   {
       Evento_Tramite nuevo = new Evento_Tramite(exp, punto, horain, horafin, empleado);
       if(estaVacia())
       {
           this.L = nuevo;
       }
       else
       {
           Evento_Tramite ptr = this.L;
           while (ptr.getSgte() != null)
           {
               ptr = ptr.getSgte();
           }
           ptr.setSgte(nuevo);
           
       }
       
   }
   
   public String buscar(String item)
   {
       Evento_Tramite ptr = this.L;
       while (ptr != null && ptr.getExp().getID() != item)
       {
           ptr = ptr.getSgte();
       }
       if (ptr == null)
       {
           return "-1";
       }
       else
       {
           return ptr.getExp().getID();
       }
   }
   /*
   public void eliminar(int item)
   {
       Nodo ptr = this.L;
       Nodo prev = null;
       while (ptr != null && ptr.getValue() != item)
       {
           prev = ptr;
           ptr = ptr.getNext();  
       }
       if (ptr != null && ptr.getValue() != item)
       {
           if (prev == null) //eliminando al primero de la lista
           {
               this.L = ptr.getNext();
           }
           else
           {   
            prev.setNext(ptr.getNext());
           }
       }
   }
   */
   
    
}
