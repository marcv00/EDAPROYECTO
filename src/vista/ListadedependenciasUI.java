/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.*;


/**
 *
 * @author User
 */
public class ListadedependenciasUI extends javax.swing.JFrame {
    
    private DefaultTableModel modelo;
    private AdminDependencia Dependencias;
    private String cambio;
    
    
    
    public ListadedependenciasUI() {
        initComponents();
        modelo = new DefaultTableModel();
        modelo.addColumn("Nombre");
        this.dependenciasTable.setModel(modelo);
        Dependencias = new AdminDependencia();
        cargarTablaDependenciasDesdeCSV();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        dependenciasTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        agregarDependenciaButton = new javax.swing.JButton();
        modificarDependenciaButton = new javax.swing.JButton();
        eliminarDependenciaButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        nombreDependenciaTextField = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        dependenciasTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        dependenciasTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dependenciasTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(dependenciasTable);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setText("Lista de dependencias:");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        agregarDependenciaButton.setText("Agregar");
        agregarDependenciaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarDependenciaButtonActionPerformed(evt);
            }
        });

        modificarDependenciaButton.setText("Modificar");
        modificarDependenciaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarDependenciaButtonActionPerformed(evt);
            }
        });

        eliminarDependenciaButton.setText("Eliminar");
        eliminarDependenciaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarDependenciaButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre de la dependencia:");

        jButton4.setText("Atras");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(agregarDependenciaButton)
                        .addGap(18, 18, 18)
                        .addComponent(modificarDependenciaButton)
                        .addGap(18, 18, 18)
                        .addComponent(eliminarDependenciaButton)
                        .addGap(50, 50, 50))
                    .addComponent(jButton4)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(nombreDependenciaTextField)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(nombreDependenciaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(agregarDependenciaButton)
                            .addComponent(modificarDependenciaButton)
                            .addComponent(eliminarDependenciaButton)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agregarDependenciaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarDependenciaButtonActionPerformed
        
        String nombre = nombreDependenciaTextField.getText();
        
        if(Dependencias.buscarNombre(nombre).equalsIgnoreCase(nombre))
        {    
            JOptionPane.showMessageDialog(this, "Dependencia ya registrada");
        }
        else 
        {
            Dependencias.insertar(nombre);
            JOptionPane.showMessageDialog(this, "Registro correcto");
            agregarDependencia();
            nombreDependenciaTextField.setText("");

        }
        
    }//GEN-LAST:event_agregarDependenciaButtonActionPerformed

    private void dependenciasTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dependenciasTableMouseClicked
        // TODO add your handling code here:
        int fila = dependenciasTable.getSelectedRow();
        String nuevo = Dependencias.ObtenerDepedencias(fila);
        cambio = nuevo;
        nombreDependenciaTextField.setText(nuevo);
        
    }//GEN-LAST:event_dependenciasTableMouseClicked

    private void modificarDependenciaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarDependenciaButtonActionPerformed
        // TODO add your handling code here:
        Dependencias.mostrar();System.out.println(cambio);
        Dependencia otro = Dependencias.buscarDependencia(cambio);
        String cambio1 = nombreDependenciaTextField.getText();
        String comparar = Dependencias.buscarNombre(cambio1);
        if(comparar.equalsIgnoreCase(cambio1))
        {
            JOptionPane.showMessageDialog(this, "Dedendencia ya existe");
        }
        else
        {
            otro.setNombre(cambio1);
            modificarDependencia();
            nombreDependenciaTextField.setText("");

        }
        
    }//GEN-LAST:event_modificarDependenciaButtonActionPerformed

    private void eliminarDependenciaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarDependenciaButtonActionPerformed
        // TODO add your handling code here:
        int fila = dependenciasTable.getSelectedRow();
        String nuevo = Dependencias.ObtenerDepedencias(fila);
        if(!Dependencias.buscarNombre(nuevo).equalsIgnoreCase(nuevo))
        {
            JOptionPane.showMessageDialog(this, "No se encontro la dependencia");
        }
        else
        {
            Dependencias.eliminar(nuevo);
            nombreDependenciaTextField.setText("");
            eliminarDependencia();
        }
        
    }//GEN-LAST:event_eliminarDependenciaButtonActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        AdminUI ventana = new AdminUI();
        ventana.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListadedependenciasUI().setVisible(true);
                
            }
        });
    }
    
    public void cargarTablaDependenciasDesdeCSV() {
        String filePath = "src/datos/dependencias.csv";
        BufferedReader br = null; // Se utilizara para tener en memoria la linea que se leeyo previamente en el archivo
                                    // Cada br.readLine() leera la linea siguiente a la almacenada en br
        
                                    
        try {
            br = new BufferedReader(new FileReader(filePath));
            String line;
            boolean firstLine = true; // Para saltar la primera línea (encabezados)
            
            while ((line = br.readLine()) != null) {
                if (firstLine) {
                    firstLine = false;
                    continue; // Saltar la primera línea (encabezados)
                }
                
                String dato = line.trim();
                if (!dato.isEmpty()) { // Verificar existencia de 5 columnas en admins.csv
                    Dependencias.insertar(dato);
                    String[] row_a_insertar = {dato};
                    modelo.addRow(row_a_insertar);
                }
            }
        } catch (IOException e) {
            e.printStackTrace(); // Manejo de errores en caso de problemas al leer el archivo
        } finally { // Se ejecuta independientemente de si se produjo una excepción durante la ejecución del código en el bloque try
            if (br != null) {
                try {
                    br.close(); // Cerrar el BufferedReader para liberar recursos usados en la lectura
                } catch (IOException e) {
                    e.printStackTrace(); // Manejo de errores al cerrar el archivo
                }
            }
        }
    }
    
    public void agregarDependencia()
    {
        modelo.addRow(new Object[]{nombreDependenciaTextField.getText()});
    }
    
    public void modificarDependencia()
    {
        int fila = dependenciasTable.getSelectedRow();
        modelo.setValueAt(nombreDependenciaTextField.getText(), fila, 0);
    }
    
    public void eliminarDependencia()
    {
        int fila = dependenciasTable.getSelectedRow();
        modelo.removeRow(fila);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarDependenciaButton;
    private javax.swing.JTable dependenciasTable;
    private javax.swing.JButton eliminarDependenciaButton;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton modificarDependenciaButton;
    private javax.swing.JTextField nombreDependenciaTextField;
    // End of variables declaration//GEN-END:variables
}
