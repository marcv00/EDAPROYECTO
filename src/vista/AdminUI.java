
package vista;
import helpers.DateTimeLabelUpdater;
import helpers.Lector;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import javax.swing.*;
import model.*;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

public class AdminUI extends javax.swing.JFrame {
    
// ===============================================================================================================================
// Setup USUARIOS 
    
    private DefaultTableModel modelo;
    private AdministracionUsuario Admins;

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
        
        //Setup USUARIOS
        modelo = new DefaultTableModel();
        modelo.addColumn("Nombre");
        modelo.addColumn("ID");
        modelo.addColumn("Contraseña");
        modelo.addColumn("Dependencia");
        modelo.addColumn("Correo");
        this.usuariosTable.setModel(modelo);
        Admins = new AdministracionUsuario();
        cargarTablaDesdeCSV();
        CargarDependencias();
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
        
        //Setup USUARIOS
        modelo = new DefaultTableModel();
        modelo.addColumn("Nombre");
        modelo.addColumn("ID");
        modelo.addColumn("Contraseña");
        modelo.addColumn("Dependencia");
        modelo.addColumn("Correo");
        this.usuariosTable.setModel(modelo);
        Admins = new AdministracionUsuario();
        cargarTablaDesdeCSV();
        CargarDependencias();
    }


// ===============================================================================================================================
// Para funcionamiento de UI 
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
        usuariosPanelTitleLabel = new javax.swing.JLabel();
        buscaUsuarioIdLabel = new javax.swing.JLabel();
        idBusquedaTextField = new javax.swing.JTextField();
        buscarPorIdButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        usuariosTable = new javax.swing.JTable();
        idTextField = new javax.swing.JTextField();
        contraseñaTextField = new javax.swing.JTextField();
        nombreTextField = new javax.swing.JTextField();
        correoTextField = new javax.swing.JTextField();
        actualizarButton = new javax.swing.JButton();
        agregarButton = new javax.swing.JButton();
        modificarButton = new javax.swing.JButton();
        eliminarButton = new javax.swing.JButton();
        buscaUsuarioIdLabel1 = new javax.swing.JLabel();
        dependenciasComboBox = new javax.swing.JComboBox<>();
        dependenciasLabel = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        contraseñaLabel = new javax.swing.JLabel();
        nombreLabel = new javax.swing.JLabel();
        correoLabel = new javax.swing.JLabel();
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

        homePanel.setBackground(new java.awt.Color(255, 255, 255));

        dateTimeLabel.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        dateTimeLabel.setForeground(new java.awt.Color(255, 102, 0));
        dateTimeLabel.setText("Fecha y Hora Actual");

        welcomeLabel.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        welcomeLabel.setForeground(new java.awt.Color(255, 102, 0));
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
                    .addComponent(welcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateTimeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(685, Short.MAX_VALUE))
        );
        homePanelLayout.setVerticalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(dateTimeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(welcomeLabel)
                .addContainerGap(488, Short.MAX_VALUE))
        );

        tabsPanel.addTab("Home", homePanel);

        tramitesPanel.setBackground(new java.awt.Color(255, 255, 255));

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
                .addContainerGap(648, Short.MAX_VALUE))
        );
        tramitesPanelLayout.setVerticalGroup(
            tramitesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tramitesPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(welcomeLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(498, Short.MAX_VALUE))
        );

        tabsPanel.addTab("Home", tramitesPanel);

        listaDeUsuariosPanel.setBackground(new java.awt.Color(255, 255, 255));

        usuariosPanelTitleLabel.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        usuariosPanelTitleLabel.setForeground(new java.awt.Color(255, 102, 0));
        usuariosPanelTitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        usuariosPanelTitleLabel.setText("Lista de Usuarios en el Sistema");
        usuariosPanelTitleLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        buscaUsuarioIdLabel.setBackground(new java.awt.Color(255, 255, 255));
        buscaUsuarioIdLabel.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        buscaUsuarioIdLabel.setText("Busca un usuario por ID:");

        idBusquedaTextField.setToolTipText("");
        idBusquedaTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idBusquedaTextFieldActionPerformed(evt);
            }
        });

        buscarPorIdButton.setBackground(new java.awt.Color(255, 102, 0));
        buscarPorIdButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buscarPorIdButton.setForeground(new java.awt.Color(255, 255, 255));
        buscarPorIdButton.setText("Buscar");
        buscarPorIdButton.setBorder(null);
        buscarPorIdButton.setBorderPainted(false);
        buscarPorIdButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        buscarPorIdButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarPorIdButtonActionPerformed(evt);
            }
        });

        usuariosTable.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        usuariosTable.setModel(new javax.swing.table.DefaultTableModel(
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
        usuariosTable.setGridColor(new java.awt.Color(255, 255, 255));
        usuariosTable.setRowHeight(30);
        usuariosTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usuariosTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(usuariosTable);

        idTextField.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        idTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTextFieldActionPerformed(evt);
            }
        });

        contraseñaTextField.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N

        nombreTextField.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N

        correoTextField.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N

        actualizarButton.setBackground(new java.awt.Color(102, 102, 102));
        actualizarButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        actualizarButton.setForeground(new java.awt.Color(255, 255, 255));
        actualizarButton.setText("Actualizar Usuarios");
        actualizarButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        actualizarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarButtonActionPerformed(evt);
            }
        });

        agregarButton.setBackground(new java.awt.Color(255, 102, 0));
        agregarButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        agregarButton.setForeground(new java.awt.Color(255, 255, 255));
        agregarButton.setText("Agregar");
        agregarButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        agregarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarButtonActionPerformed(evt);
            }
        });

        modificarButton.setText("Modificar");
        modificarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarButtonActionPerformed(evt);
            }
        });

        eliminarButton.setBackground(new java.awt.Color(0, 0, 0));
        eliminarButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        eliminarButton.setForeground(new java.awt.Color(255, 255, 255));
        eliminarButton.setText("Eliminar");
        eliminarButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        eliminarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarButtonActionPerformed(evt);
            }
        });

        buscaUsuarioIdLabel1.setBackground(new java.awt.Color(255, 255, 255));
        buscaUsuarioIdLabel1.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        buscaUsuarioIdLabel1.setText("Gestión de Usuarios");

        dependenciasComboBox.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        dependenciasComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dependenciasComboBoxActionPerformed(evt);
            }
        });

        dependenciasLabel.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        dependenciasLabel.setText("Asignar Dependencia:");

        idLabel.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        idLabel.setText("ID:");

        contraseñaLabel.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        contraseñaLabel.setText("Contraseña:");

        nombreLabel.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        nombreLabel.setText("Nombre:");

        correoLabel.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        correoLabel.setText("Correo:");

        javax.swing.GroupLayout listaDeUsuariosPanelLayout = new javax.swing.GroupLayout(listaDeUsuariosPanel);
        listaDeUsuariosPanel.setLayout(listaDeUsuariosPanelLayout);
        listaDeUsuariosPanelLayout.setHorizontalGroup(
            listaDeUsuariosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listaDeUsuariosPanelLayout.createSequentialGroup()
                .addGroup(listaDeUsuariosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(listaDeUsuariosPanelLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(listaDeUsuariosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(listaDeUsuariosPanelLayout.createSequentialGroup()
                                .addGroup(listaDeUsuariosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(listaDeUsuariosPanelLayout.createSequentialGroup()
                                        .addComponent(usuariosPanelTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(104, 104, 104)
                                        .addComponent(modificarButton))
                                    .addComponent(buscaUsuarioIdLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(220, 220, 220))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, listaDeUsuariosPanelLayout.createSequentialGroup()
                                .addComponent(buscaUsuarioIdLabel)
                                .addGap(18, 18, 18)
                                .addComponent(idBusquedaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(buscarPorIdButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(listaDeUsuariosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, listaDeUsuariosPanelLayout.createSequentialGroup()
                            .addGap(40, 40, 40)
                            .addGroup(listaDeUsuariosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(idLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(contraseñaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(listaDeUsuariosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(contraseñaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(45, 45, 45)
                            .addGroup(listaDeUsuariosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(listaDeUsuariosPanelLayout.createSequentialGroup()
                                    .addComponent(nombreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(nombreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(listaDeUsuariosPanelLayout.createSequentialGroup()
                                    .addComponent(correoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(correoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(59, 59, 59)
                            .addGroup(listaDeUsuariosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(agregarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(listaDeUsuariosPanelLayout.createSequentialGroup()
                                    .addComponent(dependenciasLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(26, 26, 26)
                                    .addComponent(dependenciasComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(eliminarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(listaDeUsuariosPanelLayout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(listaDeUsuariosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 980, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(actualizarButton)))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        listaDeUsuariosPanelLayout.setVerticalGroup(
            listaDeUsuariosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listaDeUsuariosPanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(listaDeUsuariosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usuariosPanelTitleLabel)
                    .addComponent(modificarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(listaDeUsuariosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(buscaUsuarioIdLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(idBusquedaTextField)
                    .addComponent(actualizarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarPorIdButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                .addGap(27, 27, 27)
                .addComponent(buscaUsuarioIdLabel1)
                .addGap(18, 18, 18)
                .addGroup(listaDeUsuariosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dependenciasComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dependenciasLabel)
                    .addComponent(idLabel)
                    .addComponent(nombreLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(listaDeUsuariosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contraseñaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(correoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(agregarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contraseñaLabel)
                    .addComponent(correoLabel))
                .addGap(18, 18, 18)
                .addComponent(eliminarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );

        tabsPanel.addTab("Home", listaDeUsuariosPanel);

        dependenciasPanel.setBackground(new java.awt.Color(255, 255, 255));

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
                .addContainerGap(651, Short.MAX_VALUE))
        );
        dependenciasPanelLayout.setVerticalGroup(
            dependenciasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dependenciasPanelLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(welcomeLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(482, Short.MAX_VALUE))
        );

        tabsPanel.addTab("Home", dependenciasPanel);

        jPanel1.add(tabsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, -40, 1090, 610));

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
        jPanel1.add(salirButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 250, 48));

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
        jPanel1.add(listaDeUsuariosButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 250, 60));

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
        jPanel1.add(listaDeDependenciasButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 250, 60));

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
        jPanel1.add(tramitesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 250, 60));

        homeButton.setBackground(new java.awt.Color(220, 223, 228));
        homeButton.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        homeButton.setText("HOME");
        homeButton.setBorder(null);
        homeButton.setBorderPainted(false);
        homeButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });
        jPanel1.add(homeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 250, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1333, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listaDeDependenciasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaDeDependenciasButtonActionPerformed
        //ListadedependenciasUI listadependencia=new ListadedependenciasUI();
        // Colocar el boton del color de su panel
        listaDeDependenciasButton.setBackground(new java.awt.Color(220,223,228,255));
        listaDeDependenciasButton.setForeground(new java.awt.Color(0,0,0,255));
        
        // Colocar los otros botones a negro
        homeButton.setBackground(new java.awt.Color(0, 0, 0));
        homeButton.setForeground(new java.awt.Color(255,255,255,255));
        tramitesButton.setBackground(new java.awt.Color(0, 0, 0));
        tramitesButton.setForeground(new java.awt.Color(255,255,255,255));
        listaDeUsuariosButton.setBackground(new java.awt.Color(0, 0, 0));
        listaDeUsuariosButton.setForeground(new java.awt.Color(255,255,255,255));
        
        tabsPanel.setSelectedIndex(3);
    }//GEN-LAST:event_listaDeDependenciasButtonActionPerformed

    private void listaDeUsuariosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaDeUsuariosButtonActionPerformed
      
        //ListaUsuarioUI listausuario=new ListaUsuarioUI();
        //listausuario.setVisible(true);
        
        // Colocar el boton del color de su panel
        listaDeUsuariosButton.setBackground(new java.awt.Color(220,223,228,255));
        listaDeUsuariosButton.setForeground(new java.awt.Color(0,0,0,255));
        
        // Colocar los otros botones a negro
        homeButton.setBackground(new java.awt.Color(0, 0, 0));
        homeButton.setForeground(new java.awt.Color(255,255,255,255));
        tramitesButton.setBackground(new java.awt.Color(0, 0, 0));
        tramitesButton.setForeground(new java.awt.Color(255,255,255,255));
        listaDeDependenciasButton.setBackground(new java.awt.Color(0, 0, 0));
        listaDeDependenciasButton.setForeground(new java.awt.Color(255,255,255,255));
        
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
        tramitesButton.setBackground(new java.awt.Color(220,223,228,255));
        tramitesButton.setForeground(new java.awt.Color(0,0,0,255));
        
        // Colocar los otros botones a negro
        homeButton.setBackground(new java.awt.Color(0, 0, 0));
        homeButton.setForeground(new java.awt.Color(255,255,255,255));
        listaDeUsuariosButton.setBackground(new java.awt.Color(0, 0, 0));
        listaDeUsuariosButton.setForeground(new java.awt.Color(255,255,255,255));
        listaDeDependenciasButton.setBackground(new java.awt.Color(0, 0, 0));
        listaDeDependenciasButton.setForeground(new java.awt.Color(255,255,255,255));
        tabsPanel.setSelectedIndex(1);
        //VisualizaciónTrámite tramite = new VisualizaciónTrámite(nuevo);
        //tramite.setVisible(true);
    }//GEN-LAST:event_tramitesButtonActionPerformed

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        // Colocar el boton del color de su panel
        homeButton.setBackground(new java.awt.Color(220,223,228,255));
        homeButton.setForeground(new java.awt.Color(0,0,0,255));
        
        // Colocar los otros botones a negro
        listaDeUsuariosButton.setBackground(new java.awt.Color(0, 0, 0));
        listaDeUsuariosButton.setForeground(new java.awt.Color(255,255,255,255));
        tramitesButton.setBackground(new java.awt.Color(0, 0, 0));
        tramitesButton.setForeground(new java.awt.Color(255,255,255,255));
        listaDeDependenciasButton.setBackground(new java.awt.Color(0, 0, 0));
        listaDeDependenciasButton.setForeground(new java.awt.Color(255,255,255,255));
        tabsPanel.setSelectedIndex(0);
        System.out.println(nuevo.getDependencia());
        VisualizaciónTrámite tramite = new VisualizaciónTrámite(nuevo);
        tramite.setVisible(true);
    }//GEN-LAST:event_homeButtonActionPerformed

// ===============================================================================================================================
// Funcionamiento USUARIOS
    
    private void idBusquedaTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idBusquedaTextFieldActionPerformed

    }//GEN-LAST:event_idBusquedaTextFieldActionPerformed

    private void buscarPorIdButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarPorIdButtonActionPerformed
        String ID = this.idBusquedaTextField.getText().trim(); // Obtener el ID y eliminar espacios en blanco al inicio y fin

        if (ID.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese un ID a buscar", "Campo vacío", JOptionPane.WARNING_MESSAGE);
            return; // Salir del método si el campo está vacío
        }

        try {
            // Ruta del archivo CSV
            String filePath = "src/datos/admins.csv";

            // Buscar la fila por el ID en el archivo CSV
            String[] datosEncontrados = Lector.retornarFilaPorValorEnColumna(filePath, "id", ID);

            if (datosEncontrados.length > 0) {
                // Limpiar la tabla antes de agregar la nueva fila
                limpiarTabla(); // Suponiendo que limpiarTabla() es un método que borra todas las filas del modelo

                // Agregar los datos encontrados a la tabla
                modelo.addRow(new Object[] { datosEncontrados[0], datosEncontrados[1], datosEncontrados[2], datosEncontrados[4] });

                // Limpiar los campos de texto de búsqueda
                limpiartexto(); // Suponiendo que limpiarCamposBusqueda() limpia los campos de texto de búsqueda

            } else {
                JOptionPane.showMessageDialog(this, "No se encontró el usuario con ID: " + ID, "Usuario no encontrado", JOptionPane.WARNING_MESSAGE);
            }

        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error al buscar usuario en el archivo CSV", "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace(); // Opcional: Imprimir el error en consola para depuración
        }
    }//GEN-LAST:event_buscarPorIdButtonActionPerformed

    private void idTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idTextFieldActionPerformed

    private void actualizarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarButtonActionPerformed
        // TODO add your handling code here:
        limpiarTabla();
        //CargarTabla();
        cargarTablaDesdeCSV();
    }//GEN-LAST:event_actualizarButtonActionPerformed

    private void agregarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarButtonActionPerformed
        // Obtener los datos de los campos de texto
        String ID = this.idTextField.getText().trim();
        String contraseña = this.contraseñaTextField.getText().trim();
        String nombre = this.nombreTextField.getText().trim();
        String correo = this.correoTextField.getText().trim();
        String dependencia = this.dependenciasComboBox.getSelectedItem().toString();

        // Verificar que todos los campos estén completos
        if (ID.isEmpty() || contraseña.isEmpty() || nombre.isEmpty() || correo.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.", "Campos incompletos", JOptionPane.WARNING_MESSAGE);
            return;
        }
        

        // Funcionalidad con CSV

        // Crear un arreglo de Strings con los datos
        String[] datos = {nombre, ID, contraseña, dependencia, correo};

        // Ruta del archivo CSV
        String filePath = "src/datos/admins.csv";

        try {
            // Verificar si el registro ya existe antes de agregarlo
            if(Admins.buscarUsuario(ID, contraseña).equalsIgnoreCase(ID)){
                JOptionPane.showMessageDialog(this, "Administrador ya registrado");
                return;
            }
            Lector.agregarNuevoRegistro(filePath, datos);

            // Agregar los datos a la tabla y a la clase interesados
            Admins.insertar(datos[1],datos[2],datos[0],datos[4], datos[3]);
            modelo.addRow(datos);

            // Limpiar los campos de texto después de agregar
            limpiartexto();

            // Mostrar mensaje de éxito
            JOptionPane.showMessageDialog(this, "Registro exitoso");
        } catch (IllegalArgumentException e) {
            // Manejar la excepción si el ID ya existe en el archivo CSV
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error de duplicado", JOptionPane.ERROR_MESSAGE);
        } catch (IOException e) {
            // Manejar cualquier excepción que ocurra durante la escritura del archivo
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al registrar el usuario");
        }
    }//GEN-LAST:event_agregarButtonActionPerformed

    private void modificarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarButtonActionPerformed

    }//GEN-LAST:event_modificarButtonActionPerformed

    private void eliminarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarButtonActionPerformed

        // Funcionalidad con CSV
        // Ruta del archivo CSV
        String filePath = "src/datos/admins.csv";

        try {
            // Verificar si hay una fila seleccionada en la tabla
            int fila = usuariosTable.getSelectedRow();
            if (fila != -1) {
                // Obtener el ID de la fila seleccionada
                String id = (String) modelo.getValueAt(fila, 1);

                // Confirmar si se desea eliminar el usuario
                int opcion = JOptionPane.showConfirmDialog(this, "¿Seguro que desea eliminar este usuario?", "Confirmar Eliminación", JOptionPane.OK_CANCEL_OPTION);
                if (opcion == JOptionPane.OK_OPTION) {
                    // Eliminar el registro del archivo CSV
                    Lector.eliminarRegistroPorValorEnColumna(filePath,"id", id);

                    // Eliminar la fila de la tabla
                    modelo.removeRow(fila);
                    limpiartexto();

                    JOptionPane.showMessageDialog(this, "Usuario eliminado correctamente");
                } else {
                    JOptionPane.showMessageDialog(this, "Eliminación cancelada");
                }
            } else {
                // Obtener el ID del campo de texto
                String id = this.idTextField.getText().trim();

                if (!id.isEmpty()) {
                    // Confirmar si se desea eliminar el usuario
                    int opcion = JOptionPane.showConfirmDialog(this, "¿Seguro que desea eliminar este usuario?", "Confirmar Eliminación", JOptionPane.OK_CANCEL_OPTION);
                    if (opcion == JOptionPane.OK_OPTION) {
                        // Eliminar el registro del archivo CSV
                        Lector.eliminarRegistroPorValorEnColumna(filePath, "id", id);

                        // Eliminar la fila correspondiente en la tabla
                        for (int i = 0; i < modelo.getRowCount(); i++) {
                            if (modelo.getValueAt(i, 1).equals(id)) {
                                modelo.removeRow(i);
                                break;
                            }
                        }

                        JOptionPane.showMessageDialog(this, "Usuario eliminado correctamente");
                        limpiartexto();
                    } else {
                        JOptionPane.showMessageDialog(this, "Eliminación cancelada");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "No se seleccionó un usuario y el campo de ID está vacío.", "Error", JOptionPane.WARNING_MESSAGE);
                }
            }
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al eliminar el usuario", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_eliminarButtonActionPerformed

    private void usuariosTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usuariosTableMouseClicked
        // TODO add your handling code here:

        Object id_usuario_encontrado_object = modelo.getValueAt(usuariosTable.getSelectedRow(), 1);
        String id_usuario_encontrado = "";
        // Check and cast the value to the appropriate type
        if (id_usuario_encontrado_object != null) {
            id_usuario_encontrado = id_usuario_encontrado_object.toString(); // Convert Object to String
        } else {
            // Handle case where value is null, if needed
            System.out.println("Value is null");
        }
        Administrador nuevo = Admins.buscarID(id_usuario_encontrado);
        idTextField.setText(nuevo.getID());
        contraseñaTextField.setText(nuevo.getContraseña());
        nombreTextField.setText(nuevo.getNombre());
        correoTextField.setText(nuevo.getCorreo());
        dependenciasComboBox.setSelectedItem(nuevo.getDependencia());
    }//GEN-LAST:event_usuariosTableMouseClicked

    private void dependenciasComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dependenciasComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dependenciasComboBoxActionPerformed

    public void cargarTablaDesdeCSV() {
        String filePath = "src/datos/admins.csv";
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
                if (datos.length == 5) { // Verificar existencia de 5 columnas en admins.csv
                    Admins.insertar(datos[1],datos[2],datos[0],datos[4], datos[3]);
                    String[] row_a_insertar = {datos[0],datos[1],datos[2], datos[3], datos[4]};
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
    
    public void limpiarTabla(){
        int filas = usuariosTable.getRowCount();
        for (int i=0;i<filas;i++)
        {
            modelo.removeRow(0);
        }
    }
    
    public void limpiartexto(){
        idBusquedaTextField.setText("");
        idTextField.setText("");
        contraseñaTextField.setText("");
        nombreTextField.setText("");
        correoTextField.setText("");
        dependenciasComboBox.setSelectedItem(null);
    }
    
    public void CargarDependencias(){
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
                new AdminUI(nuevo).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizarButton;
    private javax.swing.JButton agregarButton;
    private javax.swing.JLabel buscaUsuarioIdLabel;
    private javax.swing.JLabel buscaUsuarioIdLabel1;
    private javax.swing.JButton buscarPorIdButton;
    private javax.swing.JLabel contraseñaLabel;
    private javax.swing.JTextField contraseñaTextField;
    private javax.swing.JLabel correoLabel;
    private javax.swing.JTextField correoTextField;
    private javax.swing.JLabel dateTimeLabel;
    private javax.swing.JComboBox<String> dependenciasComboBox;
    private javax.swing.JLabel dependenciasLabel;
    private javax.swing.JPanel dependenciasPanel;
    private javax.swing.JButton eliminarButton;
    private javax.swing.JButton homeButton;
    private javax.swing.JPanel homePanel;
    private javax.swing.JTextField idBusquedaTextField;
    private javax.swing.JLabel idLabel;
    private javax.swing.JTextField idTextField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton listaDeDependenciasButton;
    private javax.swing.JButton listaDeUsuariosButton;
    private javax.swing.JPanel listaDeUsuariosPanel;
    private javax.swing.JButton modificarButton;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JTextField nombreTextField;
    private javax.swing.JButton salirButton;
    private javax.swing.JTabbedPane tabsPanel;
    private javax.swing.JButton tramitesButton;
    private javax.swing.JPanel tramitesPanel;
    private javax.swing.JLabel usuariosPanelTitleLabel;
    private javax.swing.JTable usuariosTable;
    private javax.swing.JLabel welcomeLabel;
    private javax.swing.JLabel welcomeLabel1;
    private javax.swing.JLabel welcomeLabel3;
    // End of variables declaration//GEN-END:variables
}
