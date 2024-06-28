
package vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import javax.swing.*;
import model.*;

public class AdminUI extends javax.swing.JFrame {

   
    
    public AdminUI() {
        initComponents();
        
        
    }
   
    // </editor-fold>
@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        usuarioLabel = new javax.swing.JLabel();
        mainTitleLabel = new javax.swing.JLabel();
        listadedependienteButton1 = new javax.swing.JButton();
        crearusuarioButton2 = new javax.swing.JButton();
        listadeusuariosButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        usuarioLabel.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N

        mainTitleLabel.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        mainTitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        mainTitleLabel.setText("SISTEMA DE ADMINISTRACIÓN DE USUARIOS");
        mainTitleLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        listadedependienteButton1.setBackground(new java.awt.Color(0, 0, 0));
        listadedependienteButton1.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        listadedependienteButton1.setForeground(new java.awt.Color(255, 255, 255));
        listadedependienteButton1.setText("LISTA DE DEPENDENCIAS");
        listadedependienteButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        listadedependienteButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listadedependienteButton1ActionPerformed(evt);
            }
        });

        crearusuarioButton2.setBackground(new java.awt.Color(0, 0, 0));
        crearusuarioButton2.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        crearusuarioButton2.setForeground(new java.awt.Color(255, 255, 255));
        crearusuarioButton2.setText("CREAR USUARIO");
        crearusuarioButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        crearusuarioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearusuarioButton2ActionPerformed(evt);
            }
        });

        listadeusuariosButton3.setBackground(new java.awt.Color(0, 0, 0));
        listadeusuariosButton3.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        listadeusuariosButton3.setForeground(new java.awt.Color(255, 255, 255));
        listadeusuariosButton3.setText("LISTA DE USUARIOS");
        listadeusuariosButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        listadeusuariosButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listadeusuariosButton3ActionPerformed(evt);
            }
        });

        jButton1.setText("Atras");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(mainTitleLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(crearusuarioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(123, 123, 123)
                        .addComponent(usuarioLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(listadeusuariosButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(listadedependienteButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(jButton1)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(mainTitleLabel)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(usuarioLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(crearusuarioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(listadeusuariosButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(listadedependienteButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listadedependienteButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listadedependienteButton1ActionPerformed
        ListadedependenciasUI listadependencia=new ListadedependenciasUI();
        listadependencia.setVisible(true);
    }//GEN-LAST:event_listadedependienteButton1ActionPerformed

    private void crearusuarioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearusuarioButton2ActionPerformed
       CrearusuarioUI  crear=new CrearusuarioUI();
       crear.setVisible(true);
       
    }//GEN-LAST:event_crearusuarioButton2ActionPerformed

    private void listadeusuariosButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listadeusuariosButton3ActionPerformed
      
        ListaUsuarioUI listausuario=new ListaUsuarioUI();
        listausuario.setVisible(true);
         


            
    }//GEN-LAST:event_listadeusuariosButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        MainUI volver = new MainUI();
        volver.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
// Método para mostrar el menú de usuarios
    /*private void mostrarMenuUsuarios() {
        String[] opciones = {"Filtrar por Empleados", "Filtrar por Externos", "Filtrar por Admins", "Eliminar Usuario", "Modificar Usuario"};
        String opcionSeleccionada = (String) JOptionPane.showInputDialog(this, "Seleccione una opción", "Gestión de Usuarios", JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);

        if (opcionSeleccionada != null) {
            switch (opcionSeleccionada) {
                case "Filtrar por Empleados":
                    mostrarUsuariosFiltrados("Empleado");
                    break;
                case "Filtrar por Externos":
                    mostrarUsuariosFiltrados("Externo");
                    break;
                case "Filtrar por Admins":
                    mostrarUsuariosFiltrados("Admin");
                    break;
                case "Eliminar Usuario":
                    String nombreEliminar = JOptionPane.showInputDialog(this, "Ingrese el nombre del usuario a eliminar:");
                    if (nombreEliminar != null && !nombreEliminar.isEmpty()) {
                        eliminarUsuario(nombreEliminar);
                    } else {
                        JOptionPane.showMessageDialog(this, "Nombre de usuario no válido.");
                    }
                    break;
                case "Modificar Usuario":
                    String nombreModificar = JOptionPane.showInputDialog(this, "Ingrese el nombre del usuario a modificar:");
                    if (nombreModificar != null && !nombreModificar.isEmpty()) {
                        String nuevoNombre = JOptionPane.showInputDialog(this, "Ingrese el nuevo nombre:");
                        String nuevoTipo = JOptionPane.showInputDialog(this, "Ingrese el nuevo tipo (Empleado, Externo o Admin):");
                        if (nuevoNombre != null && nuevoTipo != null && !nuevoNombre.isEmpty() && !nuevoTipo.isEmpty()) {
                            modificarUsuario(nombreModificar, nuevoNombre, nuevoTipo);
                        } else {
                            JOptionPane.showMessageDialog(this, "Datos no válidos.");
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "Nombre de usuario no válido.");
                    }
                    break;
                default:
                    break;
            }
        }
    }
    // Clase interna para representar usuarios
    /*
    private class Usuario {
        private String nombre;
        private String tipo;

        public Usuario(String nombre, String tipo) {
            this.nombre = nombre;
            this.tipo = tipo;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getTipo() {
            return tipo;
        }

        public void setTipo(String tipo) {
            this.tipo = tipo;
        }
    }
    */
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
      try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton crearusuarioButton2;
    private javax.swing.JButton jButton1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton listadedependienteButton1;
    private javax.swing.JButton listadeusuariosButton3;
    private javax.swing.JLabel mainTitleLabel;
    private javax.swing.JLabel usuarioLabel;
    // End of variables declaration//GEN-END:variables
}
