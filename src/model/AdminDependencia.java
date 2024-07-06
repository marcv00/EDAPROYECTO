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
public class AdminDependencia {
    
    private Dependencia U;
            
   public AdminDependencia()
   {
       this.U = null;
   }
   
   public boolean estaVacia()
   {
       if (this.U == null)
            return true;
       return false;
   }
   
   public void mostrar()
   {
       Dependencia ptr = this.U;
       while (ptr !=null)
       {
           System.out.print( ptr.getNombre() + "\n");
           ptr = ptr.getSgte();
       }
       System.out.println("");
   }
   
   public void insertar(String nombre)
   {
       Dependencia nuevo = new Dependencia(nombre);
       if(estaVacia())
       {
           this.U = nuevo;
       }
       else
       {
           Dependencia ptr = this.U;
           while (ptr.getSgte() != null)
           {
               ptr = ptr.getSgte();
           }
           ptr.setSgte(nuevo);
           
       }
       
   }
   
   public Dependencia buscarDependencia(String nombre)
   {
       Dependencia ptr = this.U;
       while (ptr != null && !ptr.getNombre().equalsIgnoreCase(nombre))
       {
           ptr = ptr.getSgte();
       }
       if (ptr == null)
       {
           return null;
       }
       else
       {
          
           return ptr;
           
       }
   }
   
   public void eliminar(String nombre)
   {
       Dependencia ptr = this.U;
       Dependencia prev = null;
       while (ptr != null && !ptr.getNombre().equalsIgnoreCase(nombre))
       {
           prev = ptr;
           ptr = ptr.getSgte();  
       }
       System.out.println(ptr.getNombre());
       if (ptr != null && ptr.getNombre().equalsIgnoreCase(nombre))
       {
           if (prev == null) //eliminando al primero de la lista
           {
               this.U = ptr.getSgte();
           }
           else
           {   
                prev.setSgte(ptr.getSgte());
           }
       }
   }
   
   
   
   public String ObtenerDepedencias(int ubicacion)
   {
       int i = 0;
       Dependencia ptr = this.U;
       if(!estaVacia())
       {
        while (i!=ubicacion)
        {
           ptr = ptr.getSgte();
           i++;
        }
           return ptr.getNombre();
       }
       else
       {
           return "-1";
       }
   }
   
   public String buscarNombre(String nombre)
   {
       Dependencia ptr = this.U;
       while (ptr != null && !ptr.getNombre().equalsIgnoreCase(nombre))
       {
           ptr = ptr.getSgte();
       }
       if (ptr == null)
       {
           return "-1";
       }
       else
       {
          
           return ptr.getNombre();
           
       }
   }
   
}
