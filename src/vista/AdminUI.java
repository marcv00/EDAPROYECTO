
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

        tabsPanel = new javax.swing.JTabbedPane();
        homePanel = new javax.swing.JPanel();
        welcomeLabel = new javax.swing.JLabel();
        listaDeUsuariosButton = new javax.swing.JButton();
        listaDeDependenciasButton = new javax.swing.JButton();
        bandejaPanel = new javax.swing.JPanel();
        salirButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabsPanel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        homePanel.setBackground(new java.awt.Color(228, 139, 42));

        welcomeLabel.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        welcomeLabel.setForeground(new java.awt.Color(255, 255, 255));
        welcomeLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        welcomeLabel.setText("Bienvenido: Admin");
        welcomeLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

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

        javax.swing.GroupLayout homePanelLayout = new javax.swing.GroupLayout(homePanel);
        homePanel.setLayout(homePanelLayout);
        homePanelLayout.setHorizontalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(listaDeDependenciasButton, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                    .addComponent(welcomeLabel)
                    .addComponent(listaDeUsuariosButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(600, Short.MAX_VALUE))
        );
        homePanelLayout.setVerticalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanelLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(welcomeLabel)
                .addGap(15, 15, 15)
                .addComponent(listaDeUsuariosButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(listaDeDependenciasButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 147, Short.MAX_VALUE))
        );

        tabsPanel.addTab("Home", homePanel);

        bandejaPanel.setBackground(new java.awt.Color(228, 139, 42));

        javax.swing.GroupLayout bandejaPanelLayout = new javax.swing.GroupLayout(bandejaPanel);
        bandejaPanel.setLayout(bandejaPanelLayout);
        bandejaPanelLayout.setHorizontalGroup(
            bandejaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 866, Short.MAX_VALUE)
        );
        bandejaPanelLayout.setVerticalGroup(
            bandejaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 381, Short.MAX_VALUE)
        );

        tabsPanel.addTab("Bandeja", bandejaPanel);

        salirButton.setBackground(new java.awt.Color(255, 0, 0));
        salirButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        salirButton.setForeground(new java.awt.Color(255, 255, 255));
        salirButton.setText("Salir");
        salirButton.setBorder(null);
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
            .addComponent(tabsPanel)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(salirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(salirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabsPanel))
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
    private javax.swing.JPanel bandejaPanel;
    private javax.swing.JPanel homePanel;
    private javax.swing.JButton listaDeDependenciasButton;
    private javax.swing.JButton listaDeUsuariosButton;
    private javax.swing.JButton salirButton;
    private javax.swing.JTabbedPane tabsPanel;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables
}
