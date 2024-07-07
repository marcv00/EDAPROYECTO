
package vista;
import helpers.Tiempo;
import helpers.Lector;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import javax.swing.*;
import model.*;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;


public class AdminUI extends javax.swing.JFrame {
    
    private static Administrador adminLogueado;
    
    // ===============================================================================================================================
    // Setup USUARIOS 
    private DefaultTableModel modeloUsuarios;
    private AdministracionUsuario Admins;

    // Setup TRAMITES 
    private BandejaTramite bandeja;
    private DefaultTableModel modeloTramites;
    
    // Setup DEPENDENCIAS
    private DefaultTableModel modeloDependencias;
    private AdminDependencia Dependencias;
    private String cambio;
    
    // Setup NOTIFICACIONES
    private Timer notificationTimer;
    private boolean atenderPressed = false;
    
    // Para testing
    public AdminUI() {
        initComponents();
        // Initialize Tiempo and Timer
        Tiempo updater = new Tiempo(dateTimeLabel);
        Timer timer = new Timer(500, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updater.updateLabel();
            }
        });
        timer.start();
        updater.updateLabel();
        
        //Setup USUARIOS
        modeloUsuarios = new DefaultTableModel();
        modeloUsuarios.addColumn("Nombre");
        modeloUsuarios.addColumn("ID");
        modeloUsuarios.addColumn("Contraseña");
        modeloUsuarios.addColumn("Dependencia");
        modeloUsuarios.addColumn("Correo");
        this.usuariosTable.setModel(modeloUsuarios);
        Admins = new AdministracionUsuario();
        cargarTablaDesdeCSV();
        CargarDependenciasParaUsuariosPanel();
        
        // Setup DEPENDENCIAS
        modeloDependencias = new DefaultTableModel();
        modeloDependencias.addColumn("Nombre");
        this.dependenciasTable.setModel(modeloDependencias);
        Dependencias = new AdminDependencia();
        cargarTablaDependenciasDesdeCSV();
    }
    
    // Para uso
    public AdminUI(Administrador admin_logueado) {
        
        initComponents();
        
        adminLogueado = admin_logueado;
        // INICIALIZAR PANELES COMPRENDIDOS EN LA UI (FUNCIONALIDADES)
        setupHOMEPANEL();
        setupUSUARIOSPANEL();
        setupDEPENDENCIASPANEL();
        setupTRAMITESPANEL();
     
        // Programar la primera Notificacion
        scheduleFirstNotification();

    }


// ===============================================================================================================================
// Funcionamiento de UI 
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
        jScrollPane2 = new javax.swing.JScrollPane();
        tramitesTable = new javax.swing.JTable();
        tipoDeOrdenamientoLabel = new javax.swing.JLabel();
        tipoOrdenamientoComboBox = new javax.swing.JComboBox<>();
        crearTramiteButton = new javax.swing.JButton();
        derivarLabel = new javax.swing.JLabel();
        dependenciasEnvioTramiteComboBox = new javax.swing.JComboBox<>();
        DerivarTramiteButton = new javax.swing.JButton();
        finalizarTramiteButton = new javax.swing.JButton();
        DocumentoGeneradoTextField = new javax.swing.JTextField();
        documentoGeneradoLabel = new javax.swing.JLabel();
        derivacionDeTramitesLabel = new javax.swing.JLabel();
        finalizacionDeTramiteLabel = new javax.swing.JLabel();
        buscaUsuarioIdLabel4 = new javax.swing.JLabel();
        ordenarTramitesButton = new javax.swing.JButton();
        nombreInteresadoLabel = new javax.swing.JLabel();
        dniInteresadoTextField = new javax.swing.JTextField();
        dniInteresadoLabel = new javax.swing.JLabel();
        nombreInteresadoTextField = new javax.swing.JTextField();
        correoInteresadoLabel = new javax.swing.JLabel();
        correoInteresadoTextField = new javax.swing.JTextField();
        asuntoTramiteLabel = new javax.swing.JLabel();
        docRefTramiteTextField = new javax.swing.JTextField();
        docRefTramiteLabel = new javax.swing.JLabel();
        asuntoTramiteTextField = new javax.swing.JTextField();
        prioridadTramiteComboBox = new javax.swing.JComboBox<>();
        correoInteresadoLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
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
        eliminarButton = new javax.swing.JButton();
        buscaUsuarioIdLabel1 = new javax.swing.JLabel();
        dependenciasComboBox = new javax.swing.JComboBox<>();
        dependenciasLabel = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        contraseñaLabel = new javax.swing.JLabel();
        nombreLabel = new javax.swing.JLabel();
        correoLabel = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        dependenciasPanel = new javax.swing.JPanel();
        welcomeLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        dependenciasTable = new javax.swing.JTable();
        agregarDependenciaButton = new javax.swing.JButton();
        modificarDependenciaButton = new javax.swing.JButton();
        eliminarDependenciaButton = new javax.swing.JButton();
        dependenciaSeleccionadaLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        nuevoNombreDependenciaLabel = new javax.swing.JLabel();
        modificacionDependenciaLabel = new javax.swing.JLabel();
        nuevoNombreNuevaDependenciaTextField = new javax.swing.JTextField();
        crearDependenciaLabel = new javax.swing.JLabel();
        nuevaDependenciaNombreLabel = new javax.swing.JLabel();
        nombreNuevaDependenciaTextField = new javax.swing.JTextField();
        eliminarDependenciaLabel = new javax.swing.JLabel();
        eliminacionDependienciaLabel = new javax.swing.JLabel();
        salirButton = new javax.swing.JButton();
        listaDeUsuariosButton = new javax.swing.JButton();
        listaDeDependenciasButton = new javax.swing.JButton();
        tramitesButton = new javax.swing.JButton();
        homeButton = new javax.swing.JButton();
        logo_admin_transparente = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 102, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabsPanel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        homePanel.setBackground(new java.awt.Color(255, 255, 255));

        dateTimeLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        dateTimeLabel.setForeground(new java.awt.Color(255, 102, 0));
        dateTimeLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        dateTimeLabel.setText("Fecha y Hora Actual");

        welcomeLabel.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
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
                .addComponent(welcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(536, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(dateTimeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        homePanelLayout.setVerticalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanelLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(dateTimeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(welcomeLabel)
                .addContainerGap(525, Short.MAX_VALUE))
        );

        tabsPanel.addTab("Home", homePanel);

        tramitesPanel.setBackground(new java.awt.Color(255, 255, 255));

        welcomeLabel1.setFont(new java.awt.Font("Century Gothic", 1, 30)); // NOI18N
        welcomeLabel1.setForeground(new java.awt.Color(255, 102, 0));
        welcomeLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        welcomeLabel1.setText("Trámites en Bandeja");
        welcomeLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        tramitesTable.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        tramitesTable.setModel(new javax.swing.table.DefaultTableModel(
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
        tramitesTable.setGridColor(new java.awt.Color(255, 255, 255));
        tramitesTable.setRowHeight(30);
        tramitesTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tramitesTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tramitesTable);

        tipoDeOrdenamientoLabel.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        tipoDeOrdenamientoLabel.setText("Tipo de Ordenamiento");

        tipoOrdenamientoComboBox.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tipoOrdenamientoComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Antiguedad", "Prioridad" }));
        tipoOrdenamientoComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoOrdenamientoComboBoxActionPerformed(evt);
            }
        });

        crearTramiteButton.setBackground(new java.awt.Color(255, 102, 0));
        crearTramiteButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        crearTramiteButton.setForeground(new java.awt.Color(255, 255, 255));
        crearTramiteButton.setText("Crear Trámite");
        crearTramiteButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        crearTramiteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearTramiteButtonActionPerformed(evt);
            }
        });

        derivarLabel.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        derivarLabel.setText("Derivar a:");

        dependenciasEnvioTramiteComboBox.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        dependenciasEnvioTramiteComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dependenciasEnvioTramiteComboBoxActionPerformed(evt);
            }
        });

        DerivarTramiteButton.setBackground(new java.awt.Color(0, 0, 0));
        DerivarTramiteButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        DerivarTramiteButton.setForeground(new java.awt.Color(255, 255, 255));
        DerivarTramiteButton.setText("Derivar Tramite");
        DerivarTramiteButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        DerivarTramiteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DerivarTramiteButtonActionPerformed(evt);
            }
        });

        finalizarTramiteButton.setBackground(new java.awt.Color(0, 0, 0));
        finalizarTramiteButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        finalizarTramiteButton.setForeground(new java.awt.Color(255, 255, 255));
        finalizarTramiteButton.setText("Finalizar Tramite");
        finalizarTramiteButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        finalizarTramiteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalizarTramiteButtonActionPerformed(evt);
            }
        });

        documentoGeneradoLabel.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        documentoGeneradoLabel.setText("Documento generado:");

        derivacionDeTramitesLabel.setBackground(new java.awt.Color(255, 255, 255));
        derivacionDeTramitesLabel.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        derivacionDeTramitesLabel.setForeground(new java.awt.Color(255, 102, 0));
        derivacionDeTramitesLabel.setText("Derivación de Trámites");

        finalizacionDeTramiteLabel.setBackground(new java.awt.Color(255, 255, 255));
        finalizacionDeTramiteLabel.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        finalizacionDeTramiteLabel.setForeground(new java.awt.Color(255, 102, 0));
        finalizacionDeTramiteLabel.setText("Finalización de Trámites");

        buscaUsuarioIdLabel4.setBackground(new java.awt.Color(255, 255, 255));
        buscaUsuarioIdLabel4.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        buscaUsuarioIdLabel4.setForeground(new java.awt.Color(255, 102, 0));
        buscaUsuarioIdLabel4.setText("Crear un nuevo trámite");

        ordenarTramitesButton.setBackground(new java.awt.Color(102, 102, 102));
        ordenarTramitesButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ordenarTramitesButton.setForeground(new java.awt.Color(255, 255, 255));
        ordenarTramitesButton.setText("Ordenar");
        ordenarTramitesButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        ordenarTramitesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordenarTramitesButtonActionPerformed(evt);
            }
        });

        nombreInteresadoLabel.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        nombreInteresadoLabel.setText("Nombre del Interesado:");

        dniInteresadoLabel.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        dniInteresadoLabel.setText("DNI del Interesado:");

        correoInteresadoLabel.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        correoInteresadoLabel.setText("Correo Electrónico:");

        asuntoTramiteLabel.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        asuntoTramiteLabel.setText("Asunto del Trámite:");

        docRefTramiteLabel.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        docRefTramiteLabel.setText("Documento Referencia: ");

        prioridadTramiteComboBox.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        prioridadTramiteComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Baja", "Alta" }));
        prioridadTramiteComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prioridadTramiteComboBoxActionPerformed(evt);
            }
        });

        correoInteresadoLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        correoInteresadoLabel1.setText("Prioridad del Trámite:");

        javax.swing.GroupLayout tramitesPanelLayout = new javax.swing.GroupLayout(tramitesPanel);
        tramitesPanel.setLayout(tramitesPanelLayout);
        tramitesPanelLayout.setHorizontalGroup(
            tramitesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tramitesPanelLayout.createSequentialGroup()
                .addGap(0, 29, Short.MAX_VALUE)
                .addGroup(tramitesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, tramitesPanelLayout.createSequentialGroup()
                        .addComponent(welcomeLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tipoDeOrdenamientoLabel)
                        .addGap(18, 18, 18)
                        .addComponent(tipoOrdenamientoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(ordenarTramitesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1031, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(tramitesPanelLayout.createSequentialGroup()
                        .addGroup(tramitesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(derivacionDeTramitesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(tramitesPanelLayout.createSequentialGroup()
                                .addComponent(derivarLabel)
                                .addGap(44, 44, 44)
                                .addComponent(dependenciasEnvioTramiteComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(DerivarTramiteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(tramitesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(finalizacionDeTramiteLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(tramitesPanelLayout.createSequentialGroup()
                                .addComponent(documentoGeneradoLabel)
                                .addGap(40, 40, 40)
                                .addComponent(DocumentoGeneradoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(finalizarTramiteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(tramitesPanelLayout.createSequentialGroup()
                        .addGroup(tramitesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(tramitesPanelLayout.createSequentialGroup()
                                .addComponent(nombreInteresadoLabel)
                                .addGap(18, 18, 18)
                                .addComponent(nombreInteresadoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(tramitesPanelLayout.createSequentialGroup()
                                .addComponent(correoInteresadoLabel)
                                .addGap(18, 18, 18)
                                .addComponent(correoInteresadoTextField)))
                        .addGap(45, 45, 45)
                        .addGroup(tramitesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(tramitesPanelLayout.createSequentialGroup()
                                .addComponent(dniInteresadoLabel)
                                .addGap(18, 18, 18)
                                .addComponent(dniInteresadoTextField))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, tramitesPanelLayout.createSequentialGroup()
                                .addComponent(asuntoTramiteLabel)
                                .addGap(18, 18, 18)
                                .addComponent(asuntoTramiteTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(48, 48, 48)
                        .addGroup(tramitesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(crearTramiteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(tramitesPanelLayout.createSequentialGroup()
                                .addGroup(tramitesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(docRefTramiteLabel)
                                    .addComponent(correoInteresadoLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(tramitesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(prioridadTramiteComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(docRefTramiteTextField)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, tramitesPanelLayout.createSequentialGroup()
                        .addComponent(buscaUsuarioIdLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator2)))
                .addGap(0, 30, Short.MAX_VALUE))
        );
        tramitesPanelLayout.setVerticalGroup(
            tramitesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tramitesPanelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(tramitesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(tramitesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tipoDeOrdenamientoLabel)
                        .addComponent(tipoOrdenamientoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ordenarTramitesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(welcomeLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(tramitesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(derivacionDeTramitesLabel)
                    .addComponent(finalizacionDeTramiteLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tramitesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(tramitesPanelLayout.createSequentialGroup()
                        .addGroup(tramitesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(derivarLabel)
                            .addComponent(dependenciasEnvioTramiteComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DerivarTramiteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(finalizarTramiteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DocumentoGeneradoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(documentoGeneradoLabel))
                        .addGap(28, 28, 28)
                        .addComponent(buscaUsuarioIdLabel4))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(tramitesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreInteresadoLabel)
                    .addComponent(dniInteresadoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dniInteresadoLabel)
                    .addComponent(nombreInteresadoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(docRefTramiteTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(docRefTramiteLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(tramitesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(asuntoTramiteLabel)
                    .addComponent(asuntoTramiteTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prioridadTramiteComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(correoInteresadoLabel1)
                    .addComponent(correoInteresadoLabel)
                    .addComponent(correoInteresadoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(crearTramiteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );

        tabsPanel.addTab("Home", tramitesPanel);

        listaDeUsuariosPanel.setBackground(new java.awt.Color(255, 255, 255));

        usuariosPanelTitleLabel.setFont(new java.awt.Font("Century Gothic", 1, 30)); // NOI18N
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
        agregarButton.setText("Crear Usuario");
        agregarButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        agregarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarButtonActionPerformed(evt);
            }
        });

        eliminarButton.setBackground(new java.awt.Color(0, 0, 0));
        eliminarButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        eliminarButton.setForeground(new java.awt.Color(255, 255, 255));
        eliminarButton.setText("Eliminar Usuario");
        eliminarButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        eliminarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarButtonActionPerformed(evt);
            }
        });

        buscaUsuarioIdLabel1.setBackground(new java.awt.Color(255, 255, 255));
        buscaUsuarioIdLabel1.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        buscaUsuarioIdLabel1.setForeground(new java.awt.Color(255, 102, 0));
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
                .addGroup(listaDeUsuariosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(listaDeUsuariosPanelLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(buscaUsuarioIdLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 781, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(listaDeUsuariosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(listaDeUsuariosPanelLayout.createSequentialGroup()
                            .addGap(30, 30, 30)
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
                            .addGroup(listaDeUsuariosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(listaDeUsuariosPanelLayout.createSequentialGroup()
                                    .addComponent(dependenciasLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(dependenciasComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(listaDeUsuariosPanelLayout.createSequentialGroup()
                                    .addComponent(eliminarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(agregarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(listaDeUsuariosPanelLayout.createSequentialGroup()
                            .addGap(25, 25, 25)
                            .addGroup(listaDeUsuariosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(listaDeUsuariosPanelLayout.createSequentialGroup()
                                    .addComponent(buscaUsuarioIdLabel)
                                    .addGap(28, 28, 28)
                                    .addComponent(idBusquedaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(buscarPorIdButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(actualizarButton))
                                .addComponent(usuariosPanelTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 980, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        listaDeUsuariosPanelLayout.setVerticalGroup(
            listaDeUsuariosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listaDeUsuariosPanelLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(usuariosPanelTitleLabel)
                .addGap(18, 18, 18)
                .addGroup(listaDeUsuariosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(listaDeUsuariosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(buscarPorIdButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(actualizarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buscaUsuarioIdLabel))
                    .addComponent(idBusquedaTextField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(listaDeUsuariosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(buscaUsuarioIdLabel1)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(listaDeUsuariosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(listaDeUsuariosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(dependenciasComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dependenciasLabel)
                        .addComponent(idLabel)
                        .addComponent(nombreLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(listaDeUsuariosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(listaDeUsuariosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(correoTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(listaDeUsuariosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(contraseñaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contraseñaLabel)
                            .addComponent(correoLabel)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, listaDeUsuariosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(eliminarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(agregarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(94, 94, 94))
        );

        tabsPanel.addTab("Home", listaDeUsuariosPanel);

        dependenciasPanel.setBackground(new java.awt.Color(255, 255, 255));

        welcomeLabel3.setFont(new java.awt.Font("Century Gothic", 1, 30)); // NOI18N
        welcomeLabel3.setForeground(new java.awt.Color(255, 102, 0));
        welcomeLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        welcomeLabel3.setText("Administración de Dependencias");
        welcomeLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        dependenciasTable.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
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
        dependenciasTable.setGridColor(new java.awt.Color(255, 255, 255));
        dependenciasTable.setRowHeight(30);
        dependenciasTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dependenciasTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(dependenciasTable);

        agregarDependenciaButton.setBackground(new java.awt.Color(255, 102, 0));
        agregarDependenciaButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        agregarDependenciaButton.setForeground(new java.awt.Color(255, 255, 255));
        agregarDependenciaButton.setText("Agregar");
        agregarDependenciaButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        agregarDependenciaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarDependenciaButtonActionPerformed(evt);
            }
        });

        modificarDependenciaButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        modificarDependenciaButton.setText("Modificar");
        modificarDependenciaButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        modificarDependenciaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarDependenciaButtonActionPerformed(evt);
            }
        });

        eliminarDependenciaButton.setBackground(new java.awt.Color(0, 0, 0));
        eliminarDependenciaButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        eliminarDependenciaButton.setForeground(new java.awt.Color(255, 255, 255));
        eliminarDependenciaButton.setText("Eliminar");
        eliminarDependenciaButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        eliminarDependenciaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarDependenciaButtonActionPerformed(evt);
            }
        });

        dependenciaSeleccionadaLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        dependenciaSeleccionadaLabel.setText("DEPENDENCIA SELECCIONADA:");

        nuevoNombreDependenciaLabel.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        nuevoNombreDependenciaLabel.setText("Nuevo nombre:");

        modificacionDependenciaLabel.setBackground(new java.awt.Color(255, 255, 255));
        modificacionDependenciaLabel.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        modificacionDependenciaLabel.setForeground(new java.awt.Color(255, 102, 0));
        modificacionDependenciaLabel.setText("Modificar Dependencia");

        nuevoNombreNuevaDependenciaTextField.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        nuevoNombreNuevaDependenciaTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoNombreNuevaDependenciaTextFieldActionPerformed(evt);
            }
        });

        crearDependenciaLabel.setBackground(new java.awt.Color(255, 255, 255));
        crearDependenciaLabel.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        crearDependenciaLabel.setForeground(new java.awt.Color(255, 102, 0));
        crearDependenciaLabel.setText("Crear Nueva Dependencia");

        nuevaDependenciaNombreLabel.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        nuevaDependenciaNombreLabel.setText("Nueva Dependencia: ");

        nombreNuevaDependenciaTextField.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        nombreNuevaDependenciaTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreNuevaDependenciaTextFieldActionPerformed(evt);
            }
        });

        eliminarDependenciaLabel.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        eliminarDependenciaLabel.setText("Nota:  La dependencia no debe tener trámites");

        eliminacionDependienciaLabel.setBackground(new java.awt.Color(255, 255, 255));
        eliminacionDependienciaLabel.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        eliminacionDependienciaLabel.setForeground(new java.awt.Color(255, 102, 0));
        eliminacionDependienciaLabel.setText("Eliminar Dependencia");

        javax.swing.GroupLayout dependenciasPanelLayout = new javax.swing.GroupLayout(dependenciasPanel);
        dependenciasPanel.setLayout(dependenciasPanelLayout);
        dependenciasPanelLayout.setHorizontalGroup(
            dependenciasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dependenciasPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(dependenciasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(welcomeLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addGroup(dependenciasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dependenciasPanelLayout.createSequentialGroup()
                        .addGroup(dependenciasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dependenciaSeleccionadaLabel)
                            .addGroup(dependenciasPanelLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(nuevoNombreDependenciaLabel)
                                .addGap(18, 18, 18)
                                .addComponent(nuevoNombreNuevaDependenciaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(modificarDependenciaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(dependenciasPanelLayout.createSequentialGroup()
                                .addGroup(dependenciasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(dependenciasPanelLayout.createSequentialGroup()
                                        .addGap(7, 7, 7)
                                        .addComponent(nuevaDependenciaNombreLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(nombreNuevaDependenciaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(dependenciasPanelLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(eliminarDependenciaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(dependenciasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(agregarDependenciaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(eliminarDependenciaButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(35, Short.MAX_VALUE))
                    .addGroup(dependenciasPanelLayout.createSequentialGroup()
                        .addGroup(dependenciasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(modificacionDependenciaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(crearDependenciaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eliminacionDependienciaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        dependenciasPanelLayout.setVerticalGroup(
            dependenciasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dependenciasPanelLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(welcomeLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(dependenciasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dependenciasPanelLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(dependenciaSeleccionadaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(modificacionDependenciaLabel)
                        .addGap(15, 15, 15)
                        .addGroup(dependenciasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(modificarDependenciaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nuevoNombreNuevaDependenciaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nuevoNombreDependenciaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(eliminacionDependienciaLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(dependenciasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(eliminarDependenciaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eliminarDependenciaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(crearDependenciaLabel)
                        .addGap(18, 18, 18)
                        .addGroup(dependenciasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nuevaDependenciaNombreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(agregarDependenciaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombreNuevaDependenciaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(117, Short.MAX_VALUE))
        );

        tabsPanel.addTab("Home", dependenciasPanel);

        jPanel1.add(tabsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, -40, 1090, 690));

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
        jPanel1.add(salirButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 250, 48));

        listaDeUsuariosButton.setBackground(new java.awt.Color(0, 0, 0));
        listaDeUsuariosButton.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        listaDeUsuariosButton.setForeground(new java.awt.Color(255, 255, 255));
        listaDeUsuariosButton.setText("USUARIOS");
        listaDeUsuariosButton.setBorder(null);
        listaDeUsuariosButton.setBorderPainted(false);
        listaDeUsuariosButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        listaDeUsuariosButton.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        listaDeUsuariosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaDeUsuariosButtonActionPerformed(evt);
            }
        });
        jPanel1.add(listaDeUsuariosButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 290, 260, 80));

        listaDeDependenciasButton.setBackground(new java.awt.Color(0, 0, 0));
        listaDeDependenciasButton.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        listaDeDependenciasButton.setForeground(new java.awt.Color(255, 255, 255));
        listaDeDependenciasButton.setText("DEPENDENCIAS");
        listaDeDependenciasButton.setBorder(null);
        listaDeDependenciasButton.setBorderPainted(false);
        listaDeDependenciasButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        listaDeDependenciasButton.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        listaDeDependenciasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaDeDependenciasButtonActionPerformed(evt);
            }
        });
        jPanel1.add(listaDeDependenciasButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 360, 260, 80));

        tramitesButton.setBackground(new java.awt.Color(0, 0, 0));
        tramitesButton.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        tramitesButton.setForeground(new java.awt.Color(255, 255, 255));
        tramitesButton.setText("TRÁMITES");
        tramitesButton.setBorder(null);
        tramitesButton.setBorderPainted(false);
        tramitesButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        tramitesButton.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        tramitesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tramitesButtonActionPerformed(evt);
            }
        });
        jPanel1.add(tramitesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 220, 260, 80));

        homeButton.setBackground(new java.awt.Color(220, 223, 228));
        homeButton.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        homeButton.setText("HOME");
        homeButton.setBorder(null);
        homeButton.setBorderPainted(false);
        homeButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        homeButton.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });
        jPanel1.add(homeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 150, 260, 80));

        logo_admin_transparente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/logo_transparente.png"))); // NOI18N
        logo_admin_transparente.setText("jLabel1");
        jPanel1.add(logo_admin_transparente, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 110, 110));

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
        //VisualizaciónTrámite tramite = new VisualizaciónTrámite(adminLogueado);
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
                limpiarTabla(); // Suponiendo que limpiarTabla() es un método que borra todas las filas del modeloUsuarios

                // Agregar los datos encontrados a la tabla
                modeloUsuarios.addRow(new Object[] { datosEncontrados[0], datosEncontrados[1], datosEncontrados[2], datosEncontrados[4] });

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
            modeloUsuarios.addRow(datos);

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

    private void eliminarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarButtonActionPerformed

        // Funcionalidad con CSV
        // Ruta del archivo CSV
        String filePath = "src/datos/admins.csv";

        try {
            // Verificar si hay una fila seleccionada en la tabla
            int fila = usuariosTable.getSelectedRow();
            if (fila != -1) {
                // Obtener el ID de la fila seleccionada
                String id = (String) modeloUsuarios.getValueAt(fila, 1);

                // Confirmar si se desea eliminar el usuario
                int opcion = JOptionPane.showConfirmDialog(this, "¿Seguro que desea eliminar este usuario?", "Confirmar Eliminación", JOptionPane.OK_CANCEL_OPTION);
                if (opcion == JOptionPane.OK_OPTION) {
                    // Eliminar el registro del archivo CSV
                    Lector.eliminarRegistroPorValorEnColumna(filePath,"id", id);

                    // Eliminar la fila de la tabla
                    modeloUsuarios.removeRow(fila);
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
                        for (int i = 0; i < modeloUsuarios.getRowCount(); i++) {
                            if (modeloUsuarios.getValueAt(i, 1).equals(id)) {
                                modeloUsuarios.removeRow(i);
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

        Object id_usuario_encontrado_object = modeloUsuarios.getValueAt(usuariosTable.getSelectedRow(), 1);
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

    private void tramitesTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tramitesTableMouseClicked
        // TODO add your handling code here:
       
    }//GEN-LAST:event_tramitesTableMouseClicked
    
// Funcionamiento DEPENDENCIAS  =============================================================================================    
    private void dependenciasTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dependenciasTableMouseClicked
        // TODO add your handling code here:
        int fila = dependenciasTable.getSelectedRow();
        String nuevo = Dependencias.ObtenerDepedencias(fila);
        cambio = nuevo;
        dependenciaSeleccionadaLabel.setText("DEPENDENCIA SELECCIONADA: " + nuevo);
        nuevoNombreNuevaDependenciaTextField.setText(nuevo);
    }//GEN-LAST:event_dependenciasTableMouseClicked

    private void agregarDependenciaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarDependenciaButtonActionPerformed

        String nombre = nombreNuevaDependenciaTextField.getText();

        if (Dependencias.buscarNombre(nombre).equalsIgnoreCase(nombre)) {
            JOptionPane.showMessageDialog(this, "Dependencia ya registrada");
            nombreNuevaDependenciaTextField.setText("");
        } else {
            String filePath = "src/datos/dependencias.csv";
            String[] new_dep = {nombre};
            try {
                Lector.agregarNuevoRegistro(filePath, new_dep);
                modeloDependencias.setRowCount(0); // Remove all existing rows
                Dependencias = new AdminDependencia(); // Reset the current Dependencias in linked list
                cargarTablaDependenciasDesdeCSV();
                JOptionPane.showMessageDialog(this, "Registro correcto");
                
                CargarDependenciasParaUsuariosPanel(); // Actualizar las Dependencias en el panel de usuarios
                CargarDependeciasTramites(); // Actualizar las Dependencias en el panel de Tramites

            } catch (IOException e) {
                e.printStackTrace(); // Manejo de errores en caso de problemas al leer el archivo
            } finally {
                nombreNuevaDependenciaTextField.setText("");
            }
        }

    }//GEN-LAST:event_agregarDependenciaButtonActionPerformed

    private void modificarDependenciaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarDependenciaButtonActionPerformed
        // Verificar que se ha seleccionado una fila
        int fila = dependenciasTable.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione una dependencia de la tabla.");
            return;
        }

        try {
            // Obtener el nombre de la dependencia desde la tabla
            int columnIndexNombre = dependenciasTable.getColumnModel().getColumnIndex("Nombre");
            String nombre_dependencia = (String) dependenciasTable.getValueAt(fila, columnIndexNombre);

            // Obtener el nuevo nombre de la dependencia desde el campo de texto
            String cambio1 = nuevoNombreNuevaDependenciaTextField.getText().trim();

            // Verificar que el nuevo nombre no esté vacío
            if (cambio1.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor, ingrese un nuevo nombre para la dependencia.");
                return;
            }

            // Verificar si el nuevo nombre ya existe
            String comparar = Dependencias.buscarNombre(cambio1);
            if (comparar.equalsIgnoreCase(cambio1)) {
                JOptionPane.showMessageDialog(this, "La dependencia ya tiene este nombre");
                return;
            }

            // Actualizar el nombre de la dependencia en la lista de dependencias
            Dependencia otro = Dependencias.buscarDependencia(nombre_dependencia);
            if (otro == null) {
                JOptionPane.showMessageDialog(this, "No se encontró la dependencia seleccionada.");
                return;
            }
            otro.setNombre(cambio1);
            

            // Actualizar los archivos CSV
            String dependenciasFilePath = "src/datos/dependencias.csv";
            String tramitesFilePath = "src/datos/tramites.csv";
            try {
                Lector.reemplazarValorDeColumnaEnTodasLasFilas(dependenciasFilePath, "nombre", nombre_dependencia, cambio1);
                Lector.reemplazarValorDeColumnaEnTodasLasFilas(tramitesFilePath, "seguimiento", nombre_dependencia, cambio1);
            } catch (IOException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error al modificar los archivos: " + e.getMessage());
                return;
            }

            // Limpiar el campo de texto y actualizar la tabla
            nuevoNombreNuevaDependenciaTextField.setText("");
            dependenciaSeleccionadaLabel.setText("DEPENDENCIA SELECCIONADA: ");
            modeloDependencias.setRowCount(0);
            Dependencias = new AdminDependencia(); // Reiniciar la lista de dependencias
            cargarTablaDependenciasDesdeCSV();
            CargarDependenciasParaUsuariosPanel(); // Actualizar las Dependencias en el panel de usuarios
            CargarDependeciasTramites(); // Actualizar las Dependencias en el panel de Tramites
            // Mostrar mensaje de confirmación
            JOptionPane.showMessageDialog(this, "La dependencia ha sido modificada con éxito.");

        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }//GEN-LAST:event_modificarDependenciaButtonActionPerformed

    private void eliminarDependenciaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarDependenciaButtonActionPerformed
        int fila = dependenciasTable.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione una dependencia");
            return;
        }

        String nombre = Dependencias.ObtenerDepedencias(fila);
        if (nombre == null || nombre.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No se encontró la dependencia seleccionada");
            return;
        }

        String filePath = "src/datos/dependencias.csv";
        String tramitesFilePath = "src/datos/tramites.csv";

        if (Dependencias.buscarNombre(nombre) == null || !Dependencias.buscarNombre(nombre).equalsIgnoreCase(nombre)) {
            JOptionPane.showMessageDialog(this, "No se encontró la dependencia");
            dependenciaSeleccionadaLabel.setText("DEPENDENCIA SELECCIONADA: ");
            nuevoNombreNuevaDependenciaTextField.setText("");
            return;
        }

        // Verificar que la dependencia no tenga tramites en seguimiento
        try {
            if (Lector.retornarFilaPorValorEnColumna(tramitesFilePath, "seguimiento", nombre) != null) {
                JOptionPane.showMessageDialog(this, "La dependencia tiene trámites en proceso y/o finalizados");
                dependenciaSeleccionadaLabel.setText("Dependencia Seleccionada: ");
                nuevoNombreNuevaDependenciaTextField.setText("");
                return;
            }
        } catch (IOException e) {
            e.printStackTrace(); // Manejo de errores en caso de problemas al leer el archivo
        }

        // Eliminar dependencia
        try {
            Lector.eliminarRegistroPorValorEnColumna(filePath, "nombre", nombre);
            modeloDependencias.setRowCount(0); // Remove all existing rows
            Dependencias = new AdminDependencia(); // Reset the current Dependencias in linked list
            cargarTablaDependenciasDesdeCSV();
            JOptionPane.showMessageDialog(this, "Eliminación Correcta");
            
            CargarDependenciasParaUsuariosPanel(); // Actualizar las Dependencias en el panel de usuarios
            CargarDependeciasTramites(); // Actualizar las Dependencias en el panel de Tramites
        } catch (IOException e) {
            e.printStackTrace(); // Manejo de errores en caso de problemas al leer el archivo
        } finally {
            dependenciaSeleccionadaLabel.setText("Dependencia Seleccionada: ");
            nuevoNombreNuevaDependenciaTextField.setText("");
        }
        

    }//GEN-LAST:event_eliminarDependenciaButtonActionPerformed

    private void nuevoNombreNuevaDependenciaTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoNombreNuevaDependenciaTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nuevoNombreNuevaDependenciaTextFieldActionPerformed

    private void nombreNuevaDependenciaTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreNuevaDependenciaTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreNuevaDependenciaTextFieldActionPerformed

    private void tipoOrdenamientoComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoOrdenamientoComboBoxActionPerformed

    }//GEN-LAST:event_tipoOrdenamientoComboBoxActionPerformed

    private void crearTramiteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearTramiteButtonActionPerformed
        
        String filePath = "src/datos/tramites.csv";
    
        // Extraer datos
        String nombre = nombreInteresadoTextField.getText();
        String correo = correoInteresadoTextField.getText();
        String dni = dniInteresadoTextField.getText();
        String asunto = asuntoTramiteTextField.getText();
        String doc_ref = docRefTramiteTextField.getText();
        String prioridad = prioridadTramiteComboBox.getSelectedItem().toString();

        // Verificar que ninguno de los campos esté vacío
        if (nombre.isEmpty() || correo.isEmpty() || dni.isEmpty() || asunto.isEmpty() || doc_ref.isEmpty() || prioridad.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor ingrese todos los datos necesarios");
            return;
        }

        String id_exp = generarID();
        String[] ids_registrados = null;

        try {
            ids_registrados = Lector.obtenerValoresDeColumna(filePath, "idexpediente");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error al leer los IDs registrados: " + e.getMessage());
            return;
        }

        // Verificar si el ID generado ya existe
        while (Arrays.asList(ids_registrados).contains(id_exp)) {
            id_exp = generarID(); // Generar un nuevo ID si el anterior ya existe
        }

        // Construir la fila de tramite
        String[] fila_tramite = {
            dni, nombre, correo, id_exp, prioridad, asunto, doc_ref, "proceso",
            Tiempo.getCurrentDateSimple(), Tiempo.getCurrentTime(), "", "", "",
            adminLogueado.getDependencia() + ">"
        };

        try {
            Lector.agregarNuevoRegistro(filePath, fila_tramite);
            JOptionPane.showMessageDialog(this, "Trámite creado exitosamente.");
            
            bandeja = new BandejaTramite(); // Vaciar la bandeja de Tramites
            cargarTramitesDesdeCSV(); // Cargar los nuevos tramites para la bandeja y tabla
            
            // Limpiar los campos de texto
            nombreInteresadoTextField.setText("");
            correoInteresadoTextField.setText("");
            dniInteresadoTextField.setText("");
            asuntoTramiteTextField.setText("");
            docRefTramiteTextField.setText("");
            prioridadTramiteComboBox.setSelectedIndex(0); // Resetear al primer elemento
            
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error al crear el trámite: " + e.getMessage());
        }
        
        
    }//GEN-LAST:event_crearTramiteButtonActionPerformed

    private void dependenciasEnvioTramiteComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dependenciasEnvioTramiteComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dependenciasEnvioTramiteComboBoxActionPerformed

    private void DerivarTramiteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DerivarTramiteButtonActionPerformed
        // TODO add your handling code here:
        String filePath = "src/datos/tramites.csv";

        // Obtener el id del expediente en la tabla y buscar el Tramite
        int fila = tramitesTable.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione un Tramite de la Tabla");
            return;
        }
        
        String id_de_tramite_a_derivar = tramitesTable.getValueAt(fila, 0).toString();
        String dependencia_Destino = dependenciasEnvioTramiteComboBox.getSelectedItem().toString();
        
        // Verificar que el campo de texto no esté vacío
        if (dependencia_Destino.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Necesita escoger una dependencia");
            return;
        }
        
        // Verificar que la dependencia destino no sea la misma del admin
        if (dependencia_Destino.equals(adminLogueado.getDependencia())) {
            JOptionPane.showMessageDialog(this, "No se puede derivar un tramite a esta misma dependencia");
            return;
        }
        
        // Buscar en bandeja
        Tramite aux = bandeja.frente();
        while (aux != null) {
            if (id_de_tramite_a_derivar.equals(aux.getExp().getID())) {
                derivarTramite(aux, dependencia_Destino); // Modificar el tramite en csv
                bandeja = new BandejaTramite(); // Vaciar la bandeja de Tramites
                cargarTramitesDesdeCSV(); // Cargar los nuevos tramites para la bandeja y tabla
                break; // Parar el loop ya que se encontró el tramite
            }
            aux = aux.getSgte();    
        }

        if (aux == null) {
            JOptionPane.showMessageDialog(this, "Tramite no encontrado en la bandeja.");
        }
    }//GEN-LAST:event_DerivarTramiteButtonActionPerformed

    private void finalizarTramiteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalizarTramiteButtonActionPerformed
        // TODO add your handling code here:
        String filePath = "src/datos/tramites.csv";

        // Obtener el id del expediente en la tabla y buscar el Tramite
        int fila = tramitesTable.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione un Tramite de la Tabla");
            return;
        }

        String id_de_tramite_a_finalizar = tramitesTable.getValueAt(fila, 0).toString();
        String doc_generado = DocumentoGeneradoTextField.getText();

        // Verificar que el campo de texto no esté vacío
        if (doc_generado.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese el documento que se generó en la finalización del Tramite");
            return;
        }

        // Buscar en bandeja
        Tramite aux = bandeja.frente();
        while (aux != null) {
            if (id_de_tramite_a_finalizar.equals(aux.getExp().getID())) {
                finalizarTramite(aux, doc_generado); // Modificar el tramite en csv
                bandeja = new BandejaTramite(); // Vaciar la bandeja de Tramites
                cargarTramitesDesdeCSV(); // Cargar los nuevos tramites para la bandeja y tabla
                break; // Parar el loop ya que se encontró el tramite
            }
            aux = aux.getSgte();    
        }

        if (aux == null) {
            JOptionPane.showMessageDialog(this, "Tramite no encontrado en la bandeja.");
        }
    }//GEN-LAST:event_finalizarTramiteButtonActionPerformed

    private void prioridadTramiteComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prioridadTramiteComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prioridadTramiteComboBoxActionPerformed

    private void ordenarTramitesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordenarTramitesButtonActionPerformed
                
        String metodo = tipoOrdenamientoComboBox.getSelectedItem().toString();
        if (metodo.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Metodo de ordenamiento no escogido");
            return;
        }

        if (metodo.equals("Prioridad")) {
            bandeja.ordenarPorPrioridad();
            limpiarTablaTramites();
            llenarTablaTramitesDesdeBandeja();
        } else {
            bandeja = new BandejaTramite();
            cargarTramitesDesdeCSV();
        }
    }//GEN-LAST:event_ordenarTramitesButtonActionPerformed
    
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
                    modeloDependencias.addRow(row_a_insertar);
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
      
    public void eliminarDependencia()
    {
        int fila = dependenciasTable.getSelectedRow();
        modeloDependencias.removeRow(fila);
    }
// Funcionamiento USUARIOS =====================================================================================
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
                    modeloUsuarios.addRow(row_a_insertar);
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
            modeloUsuarios.removeRow(0);
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
    
    public void CargarDependenciasParaUsuariosPanel(){
        String filePath = "src/datos/dependencias.csv";
        BufferedReader br = null; // Se utilizara para tener en memoria la linea que se leeyo previamente en el archivo
                                    // Cada br.readLine() leera la linea siguiente a la almacenada en br
        
                                    
        try {
            br = new BufferedReader(new FileReader(filePath));
            String line;
            boolean firstLine = true; // Para saltar la primera línea (encabezados)
            dependenciasComboBox.removeAllItems(); // Vaciar el combo box antes de actualizar
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
// Funcionamiento NOTIFICACION =====================================================================================
    
    // Cuerpo de la Notificacion
    public void notificarTramitesEnBandeja() {
        // Count tramites en bandeja
        int tramitesEnBandeja = bandeja.longitud();

        // Check if there are tramites to notify about
        if (tramitesEnBandeja > 0) {
            // Show dialog with "Atender" and "Cerrar" options
            int option = JOptionPane.showOptionDialog(this,
                    "Hay " + tramitesEnBandeja + " trámites en bandeja.",
                    "Notificación de Trámites en Bandeja",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    new String[]{"Atender", "Cerrar"},
                    "Cerrar");

            // Check user selection
            if (option == JOptionPane.YES_OPTION) {
                // User pressed "Atender", perform actions
                tramitesButton.setBackground(new java.awt.Color(220, 223, 228, 255));
                tramitesButton.setForeground(new java.awt.Color(0, 0, 0, 255));
                homeButton.setBackground(new java.awt.Color(0, 0, 0));
                homeButton.setForeground(new java.awt.Color(255, 255, 255, 255));
                listaDeUsuariosButton.setBackground(new java.awt.Color(0, 0, 0));
                listaDeUsuariosButton.setForeground(new java.awt.Color(255, 255, 255, 255));
                listaDeDependenciasButton.setBackground(new java.awt.Color(0, 0, 0));
                listaDeDependenciasButton.setForeground(new java.awt.Color(255, 255, 255, 255));
                tabsPanel.setSelectedIndex(1);

                // Cancel the notification timer
                cancelNotificationTimer();
            } else {
                // Si usuario presiona Cerrar
                // llamar al programador de SIGUIENTE Notificacion
                scheduleNextNotification();
            }
        } else {
            // Ningun tramite en bandeja, no hay necesidad de modificar.
            cancelNotificationTimer();
        }
    }

    // Programador de PRIMERA Notificacion (solo sera usado al loguearse).
    private void scheduleFirstNotification() {
        if (notificationTimer != null) {
            notificationTimer.stop();
        }
        notificationTimer = new Timer(20 * 1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                notificarTramitesEnBandeja();
            }
        });
        notificationTimer.setRepeats(false); // Ensure it runs only once unless rescheduled
        notificationTimer.start();
    }

    // Function to schedule the next notification after 1 minute (60 seconds)
    private void scheduleNextNotification() {
        if (notificationTimer != null) {
            notificationTimer.stop();
        }
        notificationTimer = new Timer(60 * 1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                notificarTramitesEnBandeja();
            }
        });
        notificationTimer.setRepeats(false); // Ensure it runs only once unless rescheduled
        notificationTimer.start();
    }

    // Function to cancel the notification timer
    private void cancelNotificationTimer() {
        if (notificationTimer != null) {
            notificationTimer.stop();
            notificationTimer = null; // Set to null to prevent further notifications
        }
    }

// Funcionamiento TRAMITES
    
    public void CargarDependeciasTramites()
    {
        String filePath = "src/datos/dependencias.csv";
        BufferedReader br = null; // Se utilizara para tener en memoria la linea que se leeyo previamente en el archivo
                                    // Cada br.readLine() leera la linea siguiente a la almacenada en br
        
                                    
        try {
            br = new BufferedReader(new FileReader(filePath));
            String line;
            boolean firstLine = true; // Para saltar la primera línea (encabezados)
            
            dependenciasEnvioTramiteComboBox.removeAllItems(); // Vaciar el combobox antes de actualizar 
            while ((line = br.readLine()) != null) {
                if (firstLine) {
                    firstLine = false;
                    continue; // Saltar la primera línea (encabezados)
                }
                
                String datos = line.trim();
                if (!datos.isEmpty()) { // Verificar existencia de 6 columnas en admins.csv
                    dependenciasEnvioTramiteComboBox.addItem(datos);
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
    
    public void cargarTramitesDesdeCSV()
    {
        String filePath = "src/datos/tramites.csv";
        BufferedReader br = null; // Se utilizara para tener en memoria la linea que se leeyo previamente en el archivo
                                    // Cada br.readLine() leera la linea siguiente a la almacenada en br
        try {
            br = new BufferedReader(new FileReader(filePath));
            String line;
            boolean firstLine = true; // Para saltar la primera línea (encabezados)
            limpiarTablaTramites(); // Limpiar Tabla
            while ((line = br.readLine()) != null) {
                if (firstLine) {
                    firstLine = false;
                    continue; // Saltar la primera línea (encabezados)
                }

                String[] datos = line.split(";");
                if (datos.length == 14  && datos[7].equals("proceso") && datos[13].endsWith(adminLogueado.getDependencia() + ">")) { // Verificar existencia de las 14 columnas en la fila leida en tramites.csv y que el tramite este en proceso
                    Interesado int_de_tra = new Interesado(datos[0],datos[1],datos[2]); //DNI, NOMBRE, CORREO
                    Expediente exp_de_tra = new Expediente(datos[3],datos[4],int_de_tra,datos[5],datos[6]);
                    Tramite tramite = new Tramite(exp_de_tra,datos[7],datos[8],datos[9],datos[10],datos[11],datos[12],datos[13]);
                    bandeja.encolar(tramite);
                    String[] row_a_insertar = {exp_de_tra.getID(),exp_de_tra.getPrioridad(),exp_de_tra.getAsunto(),tramite.getFechain(),int_de_tra.getDNI(),int_de_tra.getNombre(),int_de_tra.getCorreo()}; //ID, Prioridad, Asunto, Referencia, DNI, Nombre, Correo
                    modeloTramites.addRow(row_a_insertar);
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
    
    public void derivarTramite(Tramite tramite, String dep_Destino)
    {
        
        String filePath = "src/datos/tramites.csv";

            try {
                String salto = dep_Destino + ">";
                
                Lector.modificarColumnaEnLineaAñadiendo(filePath,"idexpediente",tramite.getExp().getID(),"seguimiento",salto);

                
            } catch (IllegalArgumentException e) {
                // Manejar la excepción si el ID ya existe en el archivo CSV
                JOptionPane.showMessageDialog(this, e.getMessage(), "Error de duplicado", JOptionPane.ERROR_MESSAGE);
            } catch (IOException e) {
                // Manejar cualquier excepción que ocurra durante la escritura del archivo
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error al derivar el tramite");
            }
    }
    
    public void finalizarTramite(Tramite tramite, String doc_generado)
    {
        
        String filePath = "src/datos/tramites.csv";

            try {
                // Al finalizar un tramite se le asigna la fecha de finalizacion, hora de finalizacion y un documento producto
                // Asimismo se cambia su estado a finalizado
                
                String[] columnas_a_cambiar_del_csv = {"estado", "fecha_fin", "hora_fin", "documento_producto"};
                String[] valores_a_colocar_en_columnas = {"finalizado", Tiempo.getCurrentDateSimple(), Tiempo.getCurrentTime(), doc_generado};
                Lector.modificarColumnasEnLinea(filePath, "idexpediente", tramite.getExp().getID(), columnas_a_cambiar_del_csv, valores_a_colocar_en_columnas);
                
            } catch (IllegalArgumentException e) {
                // Manejar la excepción si el ID ya existe en el archivo CSV
                JOptionPane.showMessageDialog(this, e.getMessage(), "Error de duplicado", JOptionPane.ERROR_MESSAGE);
            } catch (IOException e) {
                // Manejar cualquier excepción que ocurra durante la escritura del archivo
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error al derivar el tramite");
            }
    }
    
    public void limpiarTablaTramites()
    {
        int filas = modeloTramites.getRowCount();
        for(int i =0;i<filas;i++)
        {
            modeloTramites.removeRow(0); 
        }
    }
    
    public String generarID() {
        int numeroAleatorio = (int)(Math.random() * 90000) + 10000; // Genera un número aleatorio entre 10000 y 99999
        return String.valueOf(numeroAleatorio);
    }
    
    private void llenarTablaTramitesDesdeBandeja() {
    
        Tramite tramite = bandeja.frente();

        while (tramite != null) {
            Expediente exp_de_tra = tramite.getExp();
            Interesado int_de_tra = exp_de_tra.getNuevo();

            String[] row_a_insertar = {
                exp_de_tra.getID(),
                exp_de_tra.getPrioridad(),
                exp_de_tra.getAsunto(),
                tramite.getFechain(),
                int_de_tra.getDNI(),
                int_de_tra.getNombre(),
                int_de_tra.getCorreo()
            };

            modeloTramites.addRow(row_a_insertar);
            tramite = tramite.getSgte();
        }
    }

    // FUNCIONES SETUP PARA EL CONSTRUCTOR DE AdminUI
    
    public void setupHOMEPANEL(){
        welcomeLabel.setText("¡Bienvenid@ " + adminLogueado.getNombre().split(" ")[0] + "!");
        // Initialize Tiempo and Timer
        Tiempo updater = new Tiempo(dateTimeLabel);
        Timer timer = new Timer(500, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updater.updateLabel();
            }
        });
        timer.start();
        updater.updateLabel();
    }
    
    public void setupUSUARIOSPANEL(){
        //Setup USUARIOS
        modeloUsuarios = new DefaultTableModel();
        modeloUsuarios.addColumn("Nombre");
        modeloUsuarios.addColumn("ID");
        modeloUsuarios.addColumn("Contraseña");
        modeloUsuarios.addColumn("Dependencia");
        modeloUsuarios.addColumn("Correo");
        this.usuariosTable.setModel(modeloUsuarios);
        Admins = new AdministracionUsuario();
        cargarTablaDesdeCSV();
        CargarDependenciasParaUsuariosPanel();
        
        // Setup DEPENDENCIAS
        modeloDependencias = new DefaultTableModel();
        modeloDependencias.addColumn("Nombre");
        this.dependenciasTable.setModel(modeloDependencias);
        Dependencias = new AdminDependencia();
        cargarTablaDependenciasDesdeCSV();
    }
    
    public void setupDEPENDENCIASPANEL(){
        // Setup DEPENDENCIAS
        modeloDependencias = new DefaultTableModel();
        modeloDependencias.addColumn("Nombre");
        this.dependenciasTable.setModel(modeloDependencias);
        Dependencias = new AdminDependencia();
        cargarTablaDependenciasDesdeCSV();
    }
    
    public void setupTRAMITESPANEL(){
        // Setup TRAMITES
        modeloTramites = new DefaultTableModel();
        modeloTramites.addColumn("ID");
        modeloTramites.addColumn("Prioridad");
        modeloTramites.addColumn("Asunto");
        modeloTramites.addColumn("Fecha de Inicio");
        modeloTramites.addColumn("DNI");
        modeloTramites.addColumn("Nombre");
        modeloTramites.addColumn("Correo");
        this.tramitesTable.setModel(modeloTramites);
        this.bandeja = new BandejaTramite();
        CargarDependeciasTramites();
        cargarTramitesDesdeCSV();
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
                new AdminUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DerivarTramiteButton;
    private javax.swing.JTextField DocumentoGeneradoTextField;
    private javax.swing.JButton actualizarButton;
    private javax.swing.JButton agregarButton;
    private javax.swing.JButton agregarDependenciaButton;
    private javax.swing.JLabel asuntoTramiteLabel;
    private javax.swing.JTextField asuntoTramiteTextField;
    private javax.swing.JLabel buscaUsuarioIdLabel;
    private javax.swing.JLabel buscaUsuarioIdLabel1;
    private javax.swing.JLabel buscaUsuarioIdLabel4;
    private javax.swing.JButton buscarPorIdButton;
    private javax.swing.JLabel contraseñaLabel;
    private javax.swing.JTextField contraseñaTextField;
    private javax.swing.JLabel correoInteresadoLabel;
    private javax.swing.JLabel correoInteresadoLabel1;
    private javax.swing.JTextField correoInteresadoTextField;
    private javax.swing.JLabel correoLabel;
    private javax.swing.JTextField correoTextField;
    private javax.swing.JLabel crearDependenciaLabel;
    private javax.swing.JButton crearTramiteButton;
    private javax.swing.JLabel dateTimeLabel;
    private javax.swing.JLabel dependenciaSeleccionadaLabel;
    private javax.swing.JComboBox<String> dependenciasComboBox;
    private javax.swing.JComboBox<String> dependenciasEnvioTramiteComboBox;
    private javax.swing.JLabel dependenciasLabel;
    private javax.swing.JPanel dependenciasPanel;
    private javax.swing.JTable dependenciasTable;
    private javax.swing.JLabel derivacionDeTramitesLabel;
    private javax.swing.JLabel derivarLabel;
    private javax.swing.JLabel dniInteresadoLabel;
    private javax.swing.JTextField dniInteresadoTextField;
    private javax.swing.JLabel docRefTramiteLabel;
    private javax.swing.JTextField docRefTramiteTextField;
    private javax.swing.JLabel documentoGeneradoLabel;
    private javax.swing.JLabel eliminacionDependienciaLabel;
    private javax.swing.JButton eliminarButton;
    private javax.swing.JButton eliminarDependenciaButton;
    private javax.swing.JLabel eliminarDependenciaLabel;
    private javax.swing.JLabel finalizacionDeTramiteLabel;
    private javax.swing.JButton finalizarTramiteButton;
    private javax.swing.JButton homeButton;
    private javax.swing.JPanel homePanel;
    private javax.swing.JTextField idBusquedaTextField;
    private javax.swing.JLabel idLabel;
    private javax.swing.JTextField idTextField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JButton listaDeDependenciasButton;
    private javax.swing.JButton listaDeUsuariosButton;
    private javax.swing.JPanel listaDeUsuariosPanel;
    private javax.swing.JLabel logo_admin_transparente;
    private javax.swing.JLabel modificacionDependenciaLabel;
    private javax.swing.JButton modificarDependenciaButton;
    private javax.swing.JLabel nombreInteresadoLabel;
    private javax.swing.JTextField nombreInteresadoTextField;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JTextField nombreNuevaDependenciaTextField;
    private javax.swing.JTextField nombreTextField;
    private javax.swing.JLabel nuevaDependenciaNombreLabel;
    private javax.swing.JLabel nuevoNombreDependenciaLabel;
    private javax.swing.JTextField nuevoNombreNuevaDependenciaTextField;
    private javax.swing.JButton ordenarTramitesButton;
    private javax.swing.JComboBox<String> prioridadTramiteComboBox;
    private javax.swing.JButton salirButton;
    private javax.swing.JTabbedPane tabsPanel;
    private javax.swing.JLabel tipoDeOrdenamientoLabel;
    private javax.swing.JComboBox<String> tipoOrdenamientoComboBox;
    private javax.swing.JButton tramitesButton;
    private javax.swing.JPanel tramitesPanel;
    private javax.swing.JTable tramitesTable;
    private javax.swing.JLabel usuariosPanelTitleLabel;
    private javax.swing.JTable usuariosTable;
    private javax.swing.JLabel welcomeLabel;
    private javax.swing.JLabel welcomeLabel1;
    private javax.swing.JLabel welcomeLabel3;
    // End of variables declaration//GEN-END:variables
}
