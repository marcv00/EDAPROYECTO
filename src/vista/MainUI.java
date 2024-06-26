/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;
import javax.swing.JOptionPane;
import model.*;

/**
 *
 * @author villa
 */
public class MainUI extends javax.swing.JFrame{
        private Administrador boss;
    
        public MainUI() {
                initComponents();
                boss = new Administrador("A202234","bosses","" ,"");
        }
        
        /**
         * This method is called from within the constructor to initialize the
         * form. WARNING: Do NOT modify this code. The content of this method is
         * always regenerated by the Form Editor.
         */
        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        mainTitleLabel = new javax.swing.JLabel();
        nombreUsuarioTextField = new javax.swing.JTextField();
        usuarioLabel = new javax.swing.JLabel();
        ingresarButton = new javax.swing.JButton();
        contrasenaLabel = new javax.swing.JLabel();
        contrasenaUsuarioPasswordField = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        segTramiteButton = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        infoLabel = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        mainTitleLabel.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        mainTitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        mainTitleLabel.setText("SISTEMA DE GESTIÓN DE TRÁMITES DOCUMENTARIOS");
        mainTitleLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        nombreUsuarioTextField.setToolTipText("");
        nombreUsuarioTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreUsuarioTextFieldActionPerformed(evt);
            }
        });

        usuarioLabel.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        usuarioLabel.setText("Usuario:");

        ingresarButton.setBackground(new java.awt.Color(255, 51, 0));
        ingresarButton.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        ingresarButton.setForeground(new java.awt.Color(255, 255, 255));
        ingresarButton.setText("INGRESAR");
        ingresarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ingresarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarButtonActionPerformed(evt);
            }
        });

        contrasenaLabel.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        contrasenaLabel.setText("Contraseña:");

        contrasenaUsuarioPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contrasenaUsuarioPasswordFieldActionPerformed(evt);
            }
        });

        segTramiteButton.setBackground(new java.awt.Color(0, 0, 0));
        segTramiteButton.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        segTramiteButton.setForeground(new java.awt.Color(255, 255, 255));
        segTramiteButton.setText("SEGUIMIENTO DE TRÁMITES");
        segTramiteButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        segTramiteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                segTramiteButtonActionPerformed(evt);
            }
        });

        infoLabel.setForeground(new java.awt.Color(0, 102, 255));
        infoLabel.setText("Contacto y/o Soporte: ulsystemsupport@ulima.edu.pe");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1)
                            .addComponent(segTramiteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mainTitleLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(97, 97, 97)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(usuarioLabel)
                                        .addComponent(contrasenaLabel))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(nombreUsuarioTextField)
                                        .addComponent(contrasenaUsuarioPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(ingresarButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 51, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(infoLabel)
                        .addGap(114, 114, 114)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(mainTitleLabel)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreUsuarioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usuarioLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(contrasenaLabel)
                    .addComponent(contrasenaUsuarioPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(ingresarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(segTramiteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(infoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

        private void nombreUsuarioTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreUsuarioTextFieldActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_nombreUsuarioTextFieldActionPerformed

        private void ingresarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarButtonActionPerformed
                // TODO add your handling code here:
                String nuevo;
                String ID = nombreUsuarioTextField.getText();
                String contraseña = contrasenaUsuarioPasswordField.getText();
                if(ID.substring(0,1).equalsIgnoreCase("A"))
                {
                    if(boss.getID().equalsIgnoreCase(ID) && boss.getContraseña().equalsIgnoreCase(contraseña))
                    {
                    AdminUI VistaAdmin = new AdminUI();
                    VistaAdmin.setVisible(true); // hide
                    }
                    else if (!boss.getID().equalsIgnoreCase(ID) || !boss.getContraseña().equalsIgnoreCase(contraseña))
                    {
                        JOptionPane.showMessageDialog(this, "ID o contraseña del usuario incorrecta");
                    }
                    else if (!boss.getID().equalsIgnoreCase(ID) || !boss.getContraseña().equalsIgnoreCase(contraseña))
                    {
                        JOptionPane.showMessageDialog(this, "Usuario no registrado");
                    }
                }
                else if (ID.substring(0,1).equalsIgnoreCase("I"))
                {
                    nuevo = ListaUsuarioUI.Interesados.buscarUsuario(ID, contraseña);
                    System.out.println(nuevo);
                    if(nuevo.equalsIgnoreCase(ID))
                    {
                        SegTramiteUI VistaInteresado = new SegTramiteUI();
                        VistaInteresado.setVisible(true); // hide
                    }
                    else if (!nuevo.equalsIgnoreCase(ID) && !nuevo.equalsIgnoreCase("-1"))
                    {
                        JOptionPane.showMessageDialog(this, "ID o contraseña del usuario incorrecta");
                    }
                    else if (nuevo == "-1")
                    {
                        JOptionPane.showMessageDialog(this, "Usuario no registrado");
                    }
                }
                
                
                
        }//GEN-LAST:event_ingresarButtonActionPerformed

        private void segTramiteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_segTramiteButtonActionPerformed
                SegTramiteUI frmSegTramite = new SegTramiteUI();
                frmSegTramite.setVisible(true); // hide
        }//GEN-LAST:event_segTramiteButtonActionPerformed

    private void contrasenaUsuarioPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contrasenaUsuarioPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contrasenaUsuarioPasswordFieldActionPerformed

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
                        java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
                //</editor-fold>

                /* Create and display the form */
                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                new MainUI().setVisible(true);
                        }
                });
        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel contrasenaLabel;
    private javax.swing.JPasswordField contrasenaUsuarioPasswordField;
    private javax.swing.JLabel infoLabel;
    private javax.swing.JButton ingresarButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel mainTitleLabel;
    private javax.swing.JTextField nombreUsuarioTextField;
    private javax.swing.JButton segTramiteButton;
    private javax.swing.JLabel usuarioLabel;
    // End of variables declaration//GEN-END:variables
}
