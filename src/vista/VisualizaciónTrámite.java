/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;
import helpers.Lector;
import model.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Kevin
 */
public class VisualizaciónTrámite extends javax.swing.JFrame {
    
    private BandejaTramite bandeja;
    private DefaultTableModel modelo;
    private static Administrador nuevo;
    
    /**
     * Creates new form VisualizaciónTrámite
     */
    
    public VisualizaciónTrámite(Administrador admin_logueado) {
        initComponents();
        bandeja = new BandejaTramite();
        nuevo = admin_logueado;
        modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Prioridad");
        modelo.addColumn("Asunto");
        modelo.addColumn("Referencia");
        modelo.addColumn("DNI");
        modelo.addColumn("Nombre");
        modelo.addColumn("Correo");
        this.jTable1.setModel(modelo);
        CargarDependencias();
        cargarTablaDesdeCSV();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        Busqueda = new javax.swing.JComboBox<>();
        Registro = new javax.swing.JButton();
        Derivar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        dependenciasComboBox = new javax.swing.JComboBox<>();
        Finalizar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "PRIORIDAD", "ASUNTO", "REFERENCIA", "DNI", "NOMBRES", "CORREO"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("Seleccionar Tipo de Busqueda");

        Busqueda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Antiguedad", "Prioridad" }));
        Busqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BusquedaActionPerformed(evt);
            }
        });

        Registro.setText("Registro Tramite");
        Registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistroActionPerformed(evt);
            }
        });

        Derivar.setText("Derivar Tramite");
        Derivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DerivarActionPerformed(evt);
            }
        });

        jLabel2.setText("Seleccionar Dependencia");

        dependenciasComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dependenciasComboBoxActionPerformed(evt);
            }
        });

        Finalizar.setText("Finalizar Tramite");
        Finalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FinalizarActionPerformed(evt);
            }
        });

        jButton4.setText("Atras");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(906, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 830, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Derivar)
                                    .addComponent(Finalizar)
                                    .addComponent(jLabel2)
                                    .addComponent(dependenciasComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(24, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Registro)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(Registro)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(dependenciasComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(Derivar)
                        .addGap(54, 54, 54)
                        .addComponent(Finalizar)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BusquedaActionPerformed
        // TODO add your handling code here:
        if(Busqueda.getSelectedItem().toString().equalsIgnoreCase("Prioridad"))
        {
            BandejaTramite ordenado = OrdenarPrioridad(bandeja);
            limpiarTabla();
            CargarTabla(ordenado);
            
            
        }
        else if (Busqueda.getSelectedItem().toString().equalsIgnoreCase("Antiguedad") )
        {
            limpiarTabla();
            
        }
    }//GEN-LAST:event_BusquedaActionPerformed

    private void RegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistroActionPerformed
        // TODO add your handling code here:
        RegTramite registrar = new RegTramite(nuevo);
        registrar.setVisible(true);
    }//GEN-LAST:event_RegistroActionPerformed

    private void dependenciasComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dependenciasComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dependenciasComboBoxActionPerformed

    private void DerivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DerivarActionPerformed
        // TODO add your handling code here:
        String dependencia = dependenciasComboBox.getSelectedItem().toString();
        jTextField1.setText(dependencia);
        Tramite aux = bandeja.desencolar();
        aux.setDependencia(dependencia);
        String[] datos = {aux.getExp().getID(), aux.getExp().getPrioridad(),aux.getExp().getNuevo().getDNI(),aux.getExp().getNuevo().getNombre(), aux.getExp().getNuevo().getCorreo(), aux.getExp().getAsunto(), aux.getExp().getDocref(), aux.getEstado(), aux.getFechain(), aux.getHorain(), aux.getFechafin(), aux.getHorafin(), aux.getDocumento()};
        // Ruta del archivo CSV
        agregar(dependencia,datos);
        CambiarSeguimiento(aux);
        jTextField2.setText(nuevo.getDependencia());
        eliminar(nuevo.getDependencia(),aux);
        
        
        
    }//GEN-LAST:event_DerivarActionPerformed

    private void FinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FinalizarActionPerformed
        // TODO add your handling code here:
        String dependencia = nuevo.getDependencia();
        
            Tramite aux = bandeja.desencolar();
            CambiarEstado(aux);
            eliminar(dependencia,aux);
        
    }//GEN-LAST:event_FinalizarActionPerformed

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
            java.util.logging.Logger.getLogger(VisualizaciónTrámite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VisualizaciónTrámite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VisualizaciónTrámite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VisualizaciónTrámite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VisualizaciónTrámite(nuevo).setVisible(true);
            }
        });
    }

    public void CargarDependencias()
    {
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
                
                String datos = line.trim();
                if (!datos.isEmpty()) { // Verificar existencia de 6 columnas en admins.csv
                    dependenciasComboBox.addItem(datos);
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
    
    public void cargarinfo(String dependencia)
    {
            String filePath = "src/datos/"+dependencia+".csv";
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

                    String[] datos = line.split(";");
                    if (datos.length == 13) { // Verificar existencia de 5 columnas en admins.csv
                        Interesado i1 = new Interesado(datos[4],datos[5],datos[6]);
                        Expediente e1 = new Expediente(datos[0],datos[1],i1,datos[2],datos[3]);
                        Tramite t1 = new Tramite(e1,datos[7],datos[8],datos[9],datos[10],datos[11],datos[12],dependencia);
                        bandeja.encolar(t1);
                        String[] row_a_insertar = {datos[0],datos[1],datos[2],datos[3],datos[4],datos[5],datos[6]};
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
    
    public void cargarTablaDesdeCSV() 
    {
        if (nuevo.getDependencia().equalsIgnoreCase("Estudios Generales"))
        {
            cargarinfo("Estudios Generales");
        }
        else if(nuevo.getDependencia().equalsIgnoreCase("DUIS"))
        {
           cargarinfo("DUIS");
        }
    }
    
    public void agregar(String dependencia, String[] datos)
    {
        String filePath = "src/datos/"+dependencia+".csv";

            try {
                // Verificar si el registro ya existe antes de agregarlo
                Lector.agregarNuevoRegistro(filePath, datos);

                // Mostrar mensaje de éxito
                JOptionPane.showMessageDialog(this, "Designacion exitosa");
            } catch (IllegalArgumentException e) {
                // Manejar la excepción si el ID ya existe en el archivo CSV
                JOptionPane.showMessageDialog(this, e.getMessage(), "Error de duplicado", JOptionPane.ERROR_MESSAGE);
            } catch (IOException e) {
                // Manejar cualquier excepción que ocurra durante la escritura del archivo
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error al derivar el tramite");
            }
    }
    public void eliminar(String dependencia,Tramite aux)
    {
        String filePath = "src/datos/"+dependencia+".csv";

            try {
                if (0 != -1) {
                    // Obtener el ID de la fila seleccionada
                    String id = (String) modelo.getValueAt(0, 0);
                // Verificar si hay una fila seleccionada en la tabla
                
                    // Obtener el ID de la fila seleccionada
                

                    // Confirmar si se desea eliminar el usuario
                        // Eliminar el registro del archivo CSV
                Lector.eliminarRegistroPorValorEnColumna(filePath,"id", id);

                        // Eliminar la fila de la tabla
                modelo.removeRow(0);
                }    
                    
                
            } catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            } catch (IOException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error al eliminar el usuario", "Error", JOptionPane.ERROR_MESSAGE);
            }
    }
    
    public static String fechaActual()
    {
        Date fecha = new Date();
        SimpleDateFormat formatofecha = new SimpleDateFormat("dd/MM/YYYY");
        return formatofecha.format(fecha);
        
    }
    
    public void CambiarSeguimiento(Tramite aux)
    {
        
        String filePath = "src/datos/tramites.csv";

            try {
                String dato = aux.getDependencia();
                // Verificar si el registro ya existe antes de agregarlo
                Lector.modificarColumnaEnLineaAñadiendo(filePath,"idexpediente",aux.getExp().getID(),"seguimiento",dato);

                
            } catch (IllegalArgumentException e) {
                // Manejar la excepción si el ID ya existe en el archivo CSV
                JOptionPane.showMessageDialog(this, e.getMessage(), "Error de duplicado", JOptionPane.ERROR_MESSAGE);
            } catch (IOException e) {
                // Manejar cualquier excepción que ocurra durante la escritura del archivo
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error al derivar el tramite");
            }
    }
    
    public void CambiarEstado(Tramite aux)
    {
        
        String filePath = "src/datos/tramites.csv";

            try {
                System.out.println(aux.getExp().getID());
                // Verificar si el registro ya existe antes de agregarlo
                Lector.modificarColumnaEnLinea(filePath,"idexpediente",aux.getExp().getID(),"estado","Finalizado");

                
            } catch (IllegalArgumentException e) {
                // Manejar la excepción si el ID ya existe en el archivo CSV
                JOptionPane.showMessageDialog(this, e.getMessage(), "Error de duplicado", JOptionPane.ERROR_MESSAGE);
            } catch (IOException e) {
                // Manejar cualquier excepción que ocurra durante la escritura del archivo
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error al derivar el tramite");
            }
    }
    
    public BandejaTramite OrdenarPrioridad(BandejaTramite bandeja)
    {
        BandejaTramite aux = new BandejaTramite();
        BandejaTramite tempBandeja = new BandejaTramite();
        // Procesar trámites con prioridad alta
        while (!bandeja.esVacia()) {
            Tramite mover = bandeja.desencolar();
            String prioridad = mover.getExp().getPrioridad();
            if (prioridad.equalsIgnoreCase("Alta")) {
                aux.encolar(mover);
            } else {
                tempBandeja.encolar(mover);
            }
        }
        // Procesar trámites con prioridad baja
        while (!tempBandeja.esVacia()) {
            Tramite mover = tempBandeja.desencolar();
            aux.encolar(mover);
        }
        aux.mostrarCola();
        return aux;
    }
    
    public void limpiarTabla()
    {
        int filas = modelo.getRowCount();
        for(int i =0;i<filas;i++)
        {
            modelo.removeRow(0); 
        }
    }
    
    public void CargarTabla(BandejaTramite ordenada)
    {
        while(!ordenada.esVacia())
        {   
            Tramite orden = ordenada.desencolar();
            String[] datos ={orden.getExp().getID(),orden.getExp().getPrioridad(),orden.getExp().getAsunto(),orden.getExp().getDocref(),orden.getExp().getNuevo().getDNI(),orden.getExp().getNuevo().getNombre(),orden.getExp().getNuevo().getCorreo()};
            modelo.addRow(datos);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Busqueda;
    private javax.swing.JButton Derivar;
    private javax.swing.JButton Finalizar;
    private javax.swing.JButton Registro;
    private javax.swing.JComboBox<String> dependenciasComboBox;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
