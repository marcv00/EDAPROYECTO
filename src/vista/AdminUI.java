
package vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import javax.swing.*;
import model.*;

public class AdminUI extends javax.swing.JFrame {

   
    // Para testing
    public AdminUI() {
        initComponents();     
    }
    
    // Para uso
    public AdminUI(Administrador admin_logueado) {
        initComponents();
        welcomeLabel.setText("Bienvenido/a " + admin_logueado.getNombre().split(" ")[0]);
    }
   
    // </editor-fold>
@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        welcomeLabel = new javax.swing.JLabel();
        listaDeDependenciasButton = new javax.swing.JButton();
        listaDeUsuariosButton = new javax.swing.JButton();
        salirButton = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        welcomeLabel.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        welcomeLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        welcomeLabel.setText("Bienvenido: Admin");
        welcomeLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        listaDeDependenciasButton.setBackground(new java.awt.Color(0, 0, 0));
        listaDeDependenciasButton.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        listaDeDependenciasButton.setForeground(new java.awt.Color(255, 255, 255));
        listaDeDependenciasButton.setText("LISTA DE DEPENDENCIAS");
        listaDeDependenciasButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        listaDeDependenciasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaDeDependenciasButtonActionPerformed(evt);
            }
        });

        listaDeUsuariosButton.setBackground(new java.awt.Color(0, 0, 0));
        listaDeUsuariosButton.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        listaDeUsuariosButton.setForeground(new java.awt.Color(255, 255, 255));
        listaDeUsuariosButton.setText("LISTA DE USUARIOS");
        listaDeUsuariosButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        listaDeUsuariosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaDeUsuariosButtonActionPerformed(evt);
            }
        });

        salirButton.setBackground(new java.awt.Color(255, 51, 51));
        salirButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        salirButton.setForeground(new java.awt.Color(255, 255, 255));
        salirButton.setText("Salir");
        salirButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(welcomeLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(listaDeUsuariosButton, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(listaDeDependenciasButton, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(277, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(salirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(salirButton)
                .addGap(74, 74, 74)
                .addComponent(welcomeLabel)
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listaDeUsuariosButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listaDeDependenciasButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(142, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listaDeDependenciasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaDeDependenciasButtonActionPerformed
        ListadedependenciasUI listadependencia=new ListadedependenciasUI();
        listadependencia.setVisible(true);
    }//GEN-LAST:event_listaDeDependenciasButtonActionPerformed

    private void listaDeUsuariosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaDeUsuariosButtonActionPerformed
      
        ListaUsuarioUI listausuario=new ListaUsuarioUI();
        listausuario.setVisible(true);
    
    }//GEN-LAST:event_listaDeUsuariosButtonActionPerformed

    private void salirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirButtonActionPerformed
        // TODO add your handling code here:
        MainUI new_main = new MainUI();
        this.dispose();
        new_main.setVisible(true);
    }//GEN-LAST:event_salirButtonActionPerformed

    /*/
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
            public void run(){
                new AdminUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton listaDeDependenciasButton;
    private javax.swing.JButton listaDeUsuariosButton;
    private javax.swing.JButton salirButton;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables
}
