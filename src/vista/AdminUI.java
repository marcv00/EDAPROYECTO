
package vista;
import helpers.DateTimeLabelUpdater;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import javax.swing.*;
import model.*;
import javax.swing.Timer;

public class AdminUI extends javax.swing.JFrame {
    
    

   private static Administrador nuevo;
    // Para testing
    public AdminUI() {
        initComponents();
        // Initialize DateTimeLabelUpdater and Timer
        DateTimeLabelUpdater updater = new DateTimeLabelUpdater(dateTimeLabel);
        Timer timer = new Timer(500, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updater.updateLabel();
            }
        });
        timer.start();
        updater.updateLabel();
    }
    
    // Para uso
    public AdminUI(Administrador admin_logueado) {
        initComponents();
        welcomeLabel.setText("Bienvenid@ " + admin_logueado.getNombre().split(" ")[0] + "!");
        nuevo = admin_logueado;
        // Initialize DateTimeLabelUpdater and Timer
        DateTimeLabelUpdater updater = new DateTimeLabelUpdater(dateTimeLabel);
        Timer timer = new Timer(500, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updater.updateLabel();
            }
        });
        timer.start();
        updater.updateLabel();
    }

    // </editor-fold>
@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tabsPanel = new javax.swing.JTabbedPane();
        homePanel = new javax.swing.JPanel();
        dateTimeLabel = new javax.swing.JLabel();
        welcomeLabel = new javax.swing.JLabel();
        tramitesPanel = new javax.swing.JPanel();
        welcomeLabel1 = new javax.swing.JLabel();
        listaDeUsuariosPanel = new javax.swing.JPanel();
        welcomeLabel2 = new javax.swing.JLabel();
        dependenciasPanel = new javax.swing.JPanel();
        welcomeLabel3 = new javax.swing.JLabel();
        salirButton = new javax.swing.JButton();
        listaDeUsuariosButton = new javax.swing.JButton();
        listaDeDependenciasButton = new javax.swing.JButton();
        tramitesButton = new javax.swing.JButton();
        homeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabsPanel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        homePanel.setBackground(new java.awt.Color(255, 164, 68));

        dateTimeLabel.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        dateTimeLabel.setForeground(new java.awt.Color(255, 255, 255));
        dateTimeLabel.setText("Fecha y Hora Actual");

        welcomeLabel.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        welcomeLabel.setForeground(new java.awt.Color(255, 255, 255));
        welcomeLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        welcomeLabel.setText("Bienvenid@ Admin");
        welcomeLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout homePanelLayout = new javax.swing.GroupLayout(homePanel);
        homePanel.setLayout(homePanelLayout);
        homePanelLayout.setHorizontalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateTimeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(welcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(703, Short.MAX_VALUE))
        );
        homePanelLayout.setVerticalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(dateTimeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(welcomeLabel)
                .addContainerGap(388, Short.MAX_VALUE))
        );

        tabsPanel.addTab("Home", homePanel);

        tramitesPanel.setBackground(new java.awt.Color(255, 164, 68));

        welcomeLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        welcomeLabel1.setForeground(new java.awt.Color(255, 255, 255));
        welcomeLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        welcomeLabel1.setText("Trámites en Bandeja");
        welcomeLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout tramitesPanelLayout = new javax.swing.GroupLayout(tramitesPanel);
        tramitesPanel.setLayout(tramitesPanelLayout);
        tramitesPanelLayout.setHorizontalGroup(
            tramitesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tramitesPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(welcomeLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(608, Short.MAX_VALUE))
        );
        tramitesPanelLayout.setVerticalGroup(
            tramitesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tramitesPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(welcomeLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(398, Short.MAX_VALUE))
        );

        tabsPanel.addTab("Home", tramitesPanel);

        listaDeUsuariosPanel.setBackground(new java.awt.Color(255, 164, 68));

        welcomeLabel2.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        welcomeLabel2.setForeground(new java.awt.Color(255, 255, 255));
        welcomeLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        welcomeLabel2.setText("Lista de Usuarios en el Sistema");
        welcomeLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout listaDeUsuariosPanelLayout = new javax.swing.GroupLayout(listaDeUsuariosPanel);
        listaDeUsuariosPanel.setLayout(listaDeUsuariosPanelLayout);
        listaDeUsuariosPanelLayout.setHorizontalGroup(
            listaDeUsuariosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listaDeUsuariosPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(welcomeLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(626, Short.MAX_VALUE))
        );
        listaDeUsuariosPanelLayout.setVerticalGroup(
            listaDeUsuariosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listaDeUsuariosPanelLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(welcomeLabel2)
                .addContainerGap(388, Short.MAX_VALUE))
        );

        tabsPanel.addTab("Home", listaDeUsuariosPanel);

        dependenciasPanel.setBackground(new java.awt.Color(255, 164, 68));

        welcomeLabel3.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        welcomeLabel3.setForeground(new java.awt.Color(255, 255, 255));
        welcomeLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        welcomeLabel3.setText("Lista de Dependencias");
        welcomeLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout dependenciasPanelLayout = new javax.swing.GroupLayout(dependenciasPanel);
        dependenciasPanel.setLayout(dependenciasPanelLayout);
        dependenciasPanelLayout.setHorizontalGroup(
            dependenciasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dependenciasPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(welcomeLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(611, Short.MAX_VALUE))
        );
        dependenciasPanelLayout.setVerticalGroup(
            dependenciasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dependenciasPanelLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(welcomeLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(382, Short.MAX_VALUE))
        );

        tabsPanel.addTab("Home", dependenciasPanel);

        jPanel1.add(tabsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, -40, 1050, 510));

        salirButton.setBackground(new java.awt.Color(255, 0, 0));
        salirButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        salirButton.setForeground(new java.awt.Color(255, 255, 255));
        salirButton.setText("Cerrar sesión");
        salirButton.setBorder(null);
        salirButton.setBorderPainted(false);
        salirButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        salirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirButtonActionPerformed(evt);
            }
        });
        jPanel1.add(salirButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(-7, 350, 260, 48));

        listaDeUsuariosButton.setBackground(new java.awt.Color(0, 0, 0));
        listaDeUsuariosButton.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        listaDeUsuariosButton.setForeground(new java.awt.Color(255, 255, 255));
        listaDeUsuariosButton.setText("USUARIOS");
        listaDeUsuariosButton.setBorder(null);
        listaDeUsuariosButton.setBorderPainted(false);
        listaDeUsuariosButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        listaDeUsuariosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaDeUsuariosButtonActionPerformed(evt);
            }
        });
        jPanel1.add(listaDeUsuariosButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 248, 50));

        listaDeDependenciasButton.setBackground(new java.awt.Color(0, 0, 0));
        listaDeDependenciasButton.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        listaDeDependenciasButton.setForeground(new java.awt.Color(255, 255, 255));
        listaDeDependenciasButton.setText("DEPENDENCIAS");
        listaDeDependenciasButton.setBorder(null);
        listaDeDependenciasButton.setBorderPainted(false);
        listaDeDependenciasButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        listaDeDependenciasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaDeDependenciasButtonActionPerformed(evt);
            }
        });
        jPanel1.add(listaDeDependenciasButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 248, 50));

        tramitesButton.setBackground(new java.awt.Color(0, 0, 0));
        tramitesButton.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        tramitesButton.setForeground(new java.awt.Color(255, 255, 255));
        tramitesButton.setText("TRÁMITES");
        tramitesButton.setBorder(null);
        tramitesButton.setBorderPainted(false);
        tramitesButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        tramitesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tramitesButtonActionPerformed(evt);
            }
        });
        jPanel1.add(tramitesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 250, 50));

        homeButton.setBackground(new java.awt.Color(228, 139, 42));
        homeButton.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        homeButton.setForeground(new java.awt.Color(255, 255, 255));
        homeButton.setText("HOME");
        homeButton.setBorder(null);
        homeButton.setBorderPainted(false);
        homeButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });
        jPanel1.add(homeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 250, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1264, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listaDeDependenciasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaDeDependenciasButtonActionPerformed
        //ListadedependenciasUI listadependencia=new ListadedependenciasUI();
        // Colocar el boton del color de su panel
        listaDeDependenciasButton.setBackground(new java.awt.Color(228, 139, 42, 255));
        
        // Colocar los otros botones a negro
        homeButton.setBackground(new java.awt.Color(0, 0, 0));
        tramitesButton.setBackground(new java.awt.Color(0, 0, 0));
        listaDeUsuariosButton.setBackground(new java.awt.Color(0, 0, 0));
        
        tabsPanel.setSelectedIndex(3);
    }//GEN-LAST:event_listaDeDependenciasButtonActionPerformed

    private void listaDeUsuariosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaDeUsuariosButtonActionPerformed
      
        //ListaUsuarioUI listausuario=new ListaUsuarioUI();
        //listausuario.setVisible(true);
        
        // Colocar el boton del color de su panel
        listaDeUsuariosButton.setBackground(new java.awt.Color(228, 139, 42, 255));
        
        // Colocar los otros botones a negro
        homeButton.setBackground(new java.awt.Color(0, 0, 0));
        tramitesButton.setBackground(new java.awt.Color(0, 0, 0));
        listaDeDependenciasButton.setBackground(new java.awt.Color(0, 0, 0));
        
        tabsPanel.setSelectedIndex(2);
    }//GEN-LAST:event_listaDeUsuariosButtonActionPerformed

    private void salirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirButtonActionPerformed
        // TODO add your handling code here:
        MainUI new_main = new MainUI();
        this.dispose();
        new_main.setVisible(true);
    }//GEN-LAST:event_salirButtonActionPerformed

    private void tramitesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tramitesButtonActionPerformed
        // TODO add your handling code here:
        // Colocar el boton del color de su panel
        tramitesButton.setBackground(new java.awt.Color(228, 139, 42, 255));
        
        // Colocar los otros botones a negro
        homeButton.setBackground(new java.awt.Color(0, 0, 0));
        listaDeUsuariosButton.setBackground(new java.awt.Color(0, 0, 0));
        listaDeDependenciasButton.setBackground(new java.awt.Color(0, 0, 0));
        tabsPanel.setSelectedIndex(1);
        //VisualizaciónTrámite tramite = new VisualizaciónTrámite(nuevo);
        //tramite.setVisible(true);
    }//GEN-LAST:event_tramitesButtonActionPerformed

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        // Colocar el boton del color de su panel
        homeButton.setBackground(new java.awt.Color(228, 139, 42, 255));
        
        // Colocar los otros botones a negro
        listaDeUsuariosButton.setBackground(new java.awt.Color(0, 0, 0));
        tramitesButton.setBackground(new java.awt.Color(0, 0, 0));
        listaDeDependenciasButton.setBackground(new java.awt.Color(0, 0, 0));
        tabsPanel.setSelectedIndex(0);
        System.out.println(nuevo.getDependencia());
        VisualizaciónTrámite tramite = new VisualizaciónTrámite(nuevo);
        tramite.setVisible(true);
    }//GEN-LAST:event_homeButtonActionPerformed

                                       

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
    private javax.swing.JLabel dateTimeLabel;
    private javax.swing.JPanel dependenciasPanel;
    private javax.swing.JButton homeButton;
    private javax.swing.JPanel homePanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton listaDeDependenciasButton;
    private javax.swing.JButton listaDeUsuariosButton;
    private javax.swing.JPanel listaDeUsuariosPanel;
    private javax.swing.JButton salirButton;
    private javax.swing.JTabbedPane tabsPanel;
    private javax.swing.JButton tramitesButton;
    private javax.swing.JPanel tramitesPanel;
    private javax.swing.JLabel welcomeLabel;
    private javax.swing.JLabel welcomeLabel1;
    private javax.swing.JLabel welcomeLabel2;
    private javax.swing.JLabel welcomeLabel3;
    // End of variables declaration//GEN-END:variables
}
