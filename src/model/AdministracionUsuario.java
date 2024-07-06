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
public class AdministracionUsuario {
    
   private Administrador U;
            
   public AdministracionUsuario()
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
       Administrador ptr = this.U;
       while (ptr !=null)
       {
           System.out.print( ptr.getID() + "\n"+
                            ptr.getContraseña() + "\n"+
                            ptr.getNombre() + "\n"+
                            ptr.getCorreo()+"\n");
           ptr = ptr.getSgte();
       }
       System.out.println("");
   }
   
   public void insertar(String ID, String contraseña, String nombre, String correo, String dependencia)
   {
       Administrador nuevo = new Administrador(ID, contraseña, nombre, correo, dependencia);
       if(estaVacia())
       {
           this.U = nuevo;
       }
       else
       {
           Administrador ptr = this.U;
           while (ptr.getSgte() != null)
           {
               ptr = ptr.getSgte();
           }
           ptr.setSgte(nuevo);
           
       }
       
   }
   
   public String buscarUsuario(String ID, String contraseña)
   {
       Administrador ptr = this.U;
       while (ptr != null && !ptr.getID().equalsIgnoreCase(ID) && !ptr.getContraseña().equalsIgnoreCase(contraseña))
       {
           ptr = ptr.getSgte();
       }
       if (ptr == null)
       {
           return "-1";
       }
       else
       {
          
           return ptr.getID();
           
       }
   }
   
   public void eliminar(String ID)
   {
       Administrador ptr = this.U;
       Administrador prev = null;
       while (ptr != null && !ptr.getID().equalsIgnoreCase(ID))
       {
           prev = ptr;
           ptr = ptr.getSgte();  
       }
       if (ptr != null && ptr.getID().equalsIgnoreCase(ID))
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
   
   public Administrador buscarID(String ID)
   {
       Administrador ptr = this.U;
       while (ptr != null && !ptr.getID().equalsIgnoreCase(ID))
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

 
   
}
