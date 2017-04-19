/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bntrip.vista;

import bntrip.modelo.Modelo;
import bntrip.util.Alojamiento;
import java.awt.Component;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author javier
 */
public class HomeWindow extends javax.swing.JFrame {
    private ControladorHomeWindow miControlador;
    private SpinnerModel model;
    private Modelo miModelo;
    /**
     * Creates new form HomeWindow
     */
    public HomeWindow(Modelo miModelo) {
        model = new SpinnerNumberModel(1, 1, 4, 1);
        initComponents();
        miControlador = new ControladorHomeWindow(this, miModelo);
        this.setLocationRelativeTo(null);
        this.miModelo = miModelo;
        
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        noresultado = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox();
        jSlider2 = new javax.swing.JSlider();
        jSpinner1 = new javax.swing.JSpinner(model);
        jPanel4 = new javax.swing.JPanel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        mapa = new javax.swing.JPanel();
        Murcia = new javax.swing.JRadioButton();
        Barcelona = new javax.swing.JRadioButton();
        Cadiz = new javax.swing.JRadioButton();
        Cualquiera = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Madrid = new javax.swing.JRadioButton();
        foto = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        aloj1 = new javax.swing.JButton();
        aloj2 = new javax.swing.JButton();
        aloj3 = new javax.swing.JButton();
        aloj4 = new javax.swing.JButton();
        aloj5 = new javax.swing.JButton();
        aloj6 = new javax.swing.JButton();
        aloj7 = new javax.swing.JButton();
        aloj8 = new javax.swing.JButton();

        noresultado.setFont(new java.awt.Font("Ubuntu", 1, 30)); // NOI18N
        noresultado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lupa.png"))); // NOI18N
        noresultado.setText("No hay resultados");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("bntrip");
        setMinimumSize(new java.awt.Dimension(697, 626));
        setPreferredSize(new java.awt.Dimension(735, 626));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setLayout(new java.awt.GridLayout(2, 0));

        jPanel3.setLayout(new java.awt.GridLayout(5, 0));

        jPanel6.setBackground(new java.awt.Color(196, 237, 228));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logolittle.png"))); // NOI18N
        jPanel6.add(jLabel6);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/profile.png"))); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton1);

        jPanel3.add(jPanel6);

        jComboBox2.setBackground(new java.awt.Color(196, 237, 228));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cualquiera", "Casa Entera", "Habitacion Privada", "Habitacion Compartida" }));
        jComboBox2.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo de Alojamiento"));
        jComboBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox2ItemStateChanged(evt);
            }
        });
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel3.add(jComboBox2);

        jSlider2.setBackground(new java.awt.Color(196, 237, 228));
        jSlider2.setFont(new java.awt.Font("Bitstream Charter", 1, 10)); // NOI18N
        jSlider2.setMaximum(200);
        jSlider2.setMinorTickSpacing(25);
        jSlider2.setPaintLabels(true);
        jSlider2.setPaintTicks(true);
        jSlider2.setValue(200);
        jSlider2.setBorder(javax.swing.BorderFactory.createTitledBorder("Precio Maximo"));
        jSlider2.setMaximumSize(new java.awt.Dimension(32767, 40));
        jSlider2.setMinimumSize(new java.awt.Dimension(42, 40));
        jSlider2.setPreferredSize(new java.awt.Dimension(210, 40));
        jSlider2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider2StateChanged(evt);
            }
        });
        jPanel3.add(jSlider2);

        jSpinner1.setToolTipText("Numero de Huespedes");
        jSpinner1.setBorder(javax.swing.BorderFactory.createTitledBorder("Huespedes"));
        jSpinner1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner1StateChanged(evt);
            }
        });
        jPanel3.add(jSpinner1);

        jPanel4.setLayout(new java.awt.GridLayout(1, 2));

        jDateChooser2.setBackground(new java.awt.Color(196, 237, 228));
        jDateChooser2.setBorder(javax.swing.BorderFactory.createTitledBorder("Fecha Entrada"));
        jDateChooser2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jDateChooser2MouseClicked(evt);
            }
        });
        jPanel4.add(jDateChooser2);

        jDateChooser3.setBackground(new java.awt.Color(196, 237, 228));
        jDateChooser3.setBorder(javax.swing.BorderFactory.createTitledBorder("Fecha Salida"));
        jPanel4.add(jDateChooser3);

        jPanel3.add(jPanel4);

        jPanel1.add(jPanel3);

        mapa.setBackground(new java.awt.Color(196, 237, 228));
        mapa.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonGroup1.add(Murcia);
        Murcia.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        Murcia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MurciaMouseClicked(evt);
            }
        });
        mapa.add(Murcia, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, -1, -1));

        buttonGroup1.add(Barcelona);
        Barcelona.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        Barcelona.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BarcelonaMouseClicked(evt);
            }
        });
        mapa.add(Barcelona, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, -1, -1));

        buttonGroup1.add(Cadiz);
        Cadiz.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        Cadiz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CadizMouseClicked(evt);
            }
        });
        mapa.add(Cadiz, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, -1, -1));

        buttonGroup1.add(Cualquiera);
        Cualquiera.setSelected(true);
        Cualquiera.setText("Cualquier CIudad");
        Cualquiera.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CualquieraMouseClicked(evt);
            }
        });
        mapa.add(Cualquiera, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, -1, -1));

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel3.setText("Barcelona");
        mapa.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, -1, -1));

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel2.setText("Madrid");
        mapa.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, -1, -1));

        jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel4.setText("Cadiz");
        mapa.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, -1, -1));

        jLabel5.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel5.setText("Murcia");
        mapa.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, -1, -1));

        buttonGroup1.add(Madrid);
        Madrid.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        Madrid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MadridMouseClicked(evt);
            }
        });
        mapa.add(Madrid, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, -1, -1));

        foto.setBackground(new java.awt.Color(196, 237, 228));
        foto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mapa.png"))); // NOI18N
        mapa.add(foto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 270));

        jPanel1.add(mapa);

        getContentPane().add(jPanel1, java.awt.BorderLayout.LINE_START);

        jPanel2.setBackground(new java.awt.Color(244, 247, 247));

        aloj1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/aloj1.png"))); // NOI18N
        aloj1.setToolTipText("<html><img src=\""+getClass().getResource("/images/aloj1.png")+"\"></html>");
        aloj1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        aloj1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aloj1ActionPerformed(evt);
            }
        });
        jPanel2.add(aloj1);

        aloj2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/aloj2.png"))); // NOI18N
        aloj2.setToolTipText("<html><h1>Barcelona</h1>\n<h2>200 € por noche</h2>\n<br>Piso en zona muy ambientada, con gran oferta de restaurantes,<br>\n heladerías, supermercados y establecimientos comerciales en general.<br>\n Ideal para tapear y con numerosos parques alrededor.<br>\n<ul>\n  <li><b>Tipo</b> : Casa Entera </li>\n  <li><b>Huespedes</b>: 2 </li>\n  <li><b>Dormitorios</b>: 1</li>\n  <li><b>Camas</b>: 1 </li>\n  <li><b>Valoracion</b>: ★☆☆☆☆</li>\n</ul>\n</html>");
        aloj2.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        aloj2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aloj2ActionPerformed(evt);
            }
        });
        jPanel2.add(aloj2);

        aloj3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/aloj3.png"))); // NOI18N
        aloj3.setToolTipText("<html><h1>Cadiz</h1><h2>30 € por noche</h2><br>Apartamento de 3 habitaciones , con cocina dos baños y sala de estar.<br>\n Tv, Wiffi . Zona tranquila para dormir. Situado a 300 mts. de bares de tapas restaurantes, <br>\nheladerías, terrazas y supermercados. Bien conectado con el centro por bus y metro. <br>\n<ul>\n  <li><b>Tipo</b> : Casa Entera </li>\n  <li><b>Huespedes</b>: 4 </li>\n  <li><b>Dormitorios</b>: 3</li>\n  <li><b>Camas</b>: 4 </li>\n  <li><b>Valoracion</b>: ★★★☆☆</li>\n</ul>\n</html>");
        aloj3.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        aloj3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aloj3ActionPerformed(evt);
            }
        });
        jPanel2.add(aloj3);

        aloj4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/aloj4.png"))); // NOI18N
        aloj4.setToolTipText("<html><h1>Cadiz</h1><h2>65 € por noche</h2><br>Apartamento muy bien situado, orientado al sur, con vistas al Mar y Soleado.<br>\nAproximadamente a 700 m. de la playa.<br>\nParadas de autobús en la puerta. <br>\n<ul>\n  <li><b>Tipo</b> : Habitacion Privada</li>\n  <li><b>Huespedes</b>: 2 </li>\n  <li><b>Dormitorios</b>: 1</li>\n  <li><b>Camas</b>: 2 </li>\n  <li><b>Valoracion</b>: ★★★☆☆</li>\n</ul>\n</html>");
        aloj4.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        aloj4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aloj4ActionPerformed(evt);
            }
        });
        jPanel2.add(aloj4);

        aloj5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/aloj5.png"))); // NOI18N
        aloj5.setToolTipText("<html><h1>Murcia</h1><h2>150 € por noche</h2><br>Precioso chalet con 1.700 m2: gran piscina privada, <br>\nbarbacoa, íntimo jardín y chimenea. Ideal para vacaciones. <br>\n<ul>\n  <li><b>Tipo</b> : Casa Entera</li>\n  <li><b>Huespedes</b>: 3 </li>\n  <li><b>Dormitorios</b>: 3</li>\n  <li><b>Camas</b>: 3 </li>\n  <li><b>Valoracion</b>: ★★★★★</li>\n</ul>\n</html>");
        aloj5.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        aloj5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aloj5ActionPerformed(evt);
            }
        });
        jPanel2.add(aloj5);

        aloj6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/aloj6.png"))); // NOI18N
        aloj6.setToolTipText("<html><h1>Madrid</h1><h2>35 € por noche</h2><br>Se ofrece habitación doble en luminoso apartamento, Muy cómodo y confortable.<br>\n<ul>\n  <li><b>Tipo</b> : Habitacion Compartida</li>\n  <li><b>Huespedes</b>: 2</li>\n  <li><b>Dormitorios</b>: 2</li>\n  <li><b>Valoracion</b>: ★★★★☆</li>\n</ul>\n</html>");
        aloj6.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        aloj6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aloj6ActionPerformed(evt);
            }
        });
        jPanel2.add(aloj6);

        aloj7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/aloj7.png"))); // NOI18N
        aloj7.setToolTipText("<html><h1>Barcelona</h1><h2>200 € por noche</h2><br>Piso de 3 habitaciones, a 10 minutos de Eroski <br>\ny estación de autobuses.<br>\n Solo para chica no fumadora. Se solicita 1 mes de fianza. <br>\nComunidad incluida.<br>\n<ul>\n  <li><b>Tipo</b> : Habitacion Compartida </li>\n  <li><b>Huespedes</b>: 1 </li>\n  <li><b>Dormitorios</b>: 1</li>\n  <li><b>Camas</b>: 1 </li>\n  <li><b>Valoracion</b>: ★★☆☆☆</li>\n</ul>\n</html>");
        aloj7.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        aloj7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aloj7ActionPerformed(evt);
            }
        });
        jPanel2.add(aloj7);

        aloj8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/aloj8.png"))); // NOI18N
        aloj8.setToolTipText("<html><h1>Murcia</h1><h2>30 € por noche</h2><br>Todo exterior ,habitación amplia muy luminosa,<br>\nalquilo por larga temporada a estudiantes,muy cerca de la escuela <br>\nde formación profesional la Rosaleda, <br>\n<ul>\n  <li><b>Tipo</b> : Habitacion Privada</li>\n  <li><b>Huespedes</b>: 1 </li>\n  <li><b>Dormitorios</b>: 1</li>\n  <li><b>Camas</b>: 1 </li>\n  <li><b>Valoracion</b>: ★★★☆☆</li>\n</ul>\n</html>");
        aloj8.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        aloj8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aloj8ActionPerformed(evt);
            }
        });
        jPanel2.add(aloj8);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        miControlador.procesaInicioSesion();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void aloj2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aloj2ActionPerformed
        Alojamiento a2 = new Alojamiento("a2", "Barcelona", 200, "Habitacion Privada", 2);
        a2.setImagenes("/images/room/aloj20.png","/images/room/aloj21.png","/images/room/aloj22.png");
        miControlador.seleccionaAlojamiento(a2);
        miControlador.procesaAlojamientoWindow();
        if (jDateChooser2.getDate()!=null & jDateChooser3.getDate()!=null){
        miControlador.setFechas(jDateChooser2.getDate().toString(), jDateChooser3.getDate().toString());
        }
        //this.setVisible(false);
    }//GEN-LAST:event_aloj2ActionPerformed

    private void aloj1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aloj1ActionPerformed
        Alojamiento a1 = new Alojamiento("a1", "Madrid", 65, "Habitacion Privada", 2);
        a1.setImagenes("/images/room/aloj10.png","/images/room/aloj11.png","/images/room/aloj12.png");
        miControlador.seleccionaAlojamiento(a1);
        miControlador.procesaAlojamientoWindow();
        
        // DEJA PONER CALENDARIO NULO, HAY QUE HACER DESPUES QUE NO TE DEJE RESERVAR
        if (jDateChooser2.getDate()!=null & jDateChooser3.getDate()!=null){
        miControlador.setFechas(jDateChooser2.getDate().toString(), jDateChooser3.getDate().toString());
        }
    }//GEN-LAST:event_aloj1ActionPerformed

    private void aloj3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aloj3ActionPerformed
        Alojamiento a3 = new Alojamiento("a3", "Cadiz", 30, "Casa Entera", 4);
        a3.setImagenes("/images/room/aloj30.png","/images/room/aloj31.png","/images/room/aloj32.png");
        miControlador.seleccionaAlojamiento(a3);
        miControlador.procesaAlojamientoWindow();
        if (jDateChooser2.getDate()!=null & jDateChooser3.getDate()!=null){
        miControlador.setFechas(jDateChooser2.getDate().toString(), jDateChooser3.getDate().toString());
        }
    }//GEN-LAST:event_aloj3ActionPerformed

    private void aloj5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aloj5ActionPerformed
        Alojamiento a5 = new Alojamiento("a5", "Murcia", 150, "Casa Entera", 3);
        a5.setImagenes("/images/room/aloj50.png","/images/room/aloj51.png","/images/room/aloj52.png");
        miControlador.seleccionaAlojamiento(a5);
        miControlador.procesaAlojamientoWindow();
        if (jDateChooser2.getDate()!=null & jDateChooser3.getDate()!=null){
        miControlador.setFechas(jDateChooser2.getDate().toString(), jDateChooser3.getDate().toString());
        }
    }//GEN-LAST:event_aloj5ActionPerformed

    private void jSlider2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider2StateChanged
        // TODO add your handling code here:
        String name;
        miControlador.actualizarTodo(jComboBox2.getSelectedItem().toString(), jSlider2.getValue(), (int)jSpinner1.getValue(), getCiudad());
    }//GEN-LAST:event_jSlider2StateChanged

    private void jComboBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox2ItemStateChanged
        // TODO add your handling code here:
        miControlador.actualizarTodo(jComboBox2.getSelectedItem().toString(), jSlider2.getValue(), (int)jSpinner1.getValue(), getCiudad());
    }//GEN-LAST:event_jComboBox2ItemStateChanged

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jSpinner1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner1StateChanged
        // TODO add your handling code here:
        miControlador.actualizarTodo(jComboBox2.getSelectedItem().toString(), jSlider2.getValue(), (int)jSpinner1.getValue(), getCiudad());
    }//GEN-LAST:event_jSpinner1StateChanged

    private void MadridMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MadridMouseClicked
        // TODO add your handling code here:
        miControlador.actualizarTodo(jComboBox2.getSelectedItem().toString(), jSlider2.getValue(), (int)jSpinner1.getValue(), "Madrid");
    }//GEN-LAST:event_MadridMouseClicked

    private void CadizMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CadizMouseClicked
        // TODO add your handling code here:
        miControlador.actualizarTodo(jComboBox2.getSelectedItem().toString(), jSlider2.getValue(), (int)jSpinner1.getValue(), "Cadiz");
    }//GEN-LAST:event_CadizMouseClicked

    private void MurciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MurciaMouseClicked
        // TODO add your handling code here:
        miControlador.actualizarTodo(jComboBox2.getSelectedItem().toString(), jSlider2.getValue(), (int)jSpinner1.getValue(), "Murcia");
    }//GEN-LAST:event_MurciaMouseClicked

    private void BarcelonaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BarcelonaMouseClicked
        // TODO add your handling code here:
        miControlador.actualizarTodo(jComboBox2.getSelectedItem().toString(), jSlider2.getValue(), (int)jSpinner1.getValue(), "Barcelona");
    }//GEN-LAST:event_BarcelonaMouseClicked

    private void CualquieraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CualquieraMouseClicked
        // TODO add your handling code here:
        miControlador.actualizarTodo(jComboBox2.getSelectedItem().toString(), jSlider2.getValue(), (int)jSpinner1.getValue(), "Cualquiera");
    }//GEN-LAST:event_CualquieraMouseClicked

    private void jDateChooser2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDateChooser2MouseClicked
    }//GEN-LAST:event_jDateChooser2MouseClicked

    private void aloj4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aloj4ActionPerformed
        Alojamiento a4 = new Alojamiento("a4", "Cadiz", 65, "Habitacion Privada", 2);
        a4.setImagenes("/images/room/aloj40.png","/images/room/aloj41.png","/images/room/aloj42.png");
        miControlador.seleccionaAlojamiento(a4);
        miControlador.procesaAlojamientoWindow();
        if (jDateChooser2.getDate()!=null & jDateChooser3.getDate()!=null){
        miControlador.setFechas(jDateChooser2.getDate().toString(), jDateChooser3.getDate().toString());
        }
    }//GEN-LAST:event_aloj4ActionPerformed

    private void aloj6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aloj6ActionPerformed
        Alojamiento a6 = new Alojamiento("a6", "Madrid", 35, "Habitacion Compartida", 2);
        a6.setImagenes("/images/room/aloj60.png","/images/room/aloj61.png","/images/room/aloj62.png");
        miControlador.seleccionaAlojamiento(a6);
        miControlador.procesaAlojamientoWindow();
        if (jDateChooser2.getDate()!=null & jDateChooser3.getDate()!=null){
        miControlador.setFechas(jDateChooser2.getDate().toString(), jDateChooser3.getDate().toString());
        }
    }//GEN-LAST:event_aloj6ActionPerformed

    private void aloj7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aloj7ActionPerformed
        Alojamiento a7 = new Alojamiento("a7", "Barcelona", 200, "Habitacion Compartida", 1);
        a7.setImagenes("/images/room/aloj70.png","/images/room/aloj71.png","/images/room/aloj72.png");
        miControlador.seleccionaAlojamiento(a7);
        miControlador.procesaAlojamientoWindow();
        if (jDateChooser2.getDate()!=null & jDateChooser3.getDate()!=null){
        miControlador.setFechas(jDateChooser2.getDate().toString(), jDateChooser3.getDate().toString());
        }
    }//GEN-LAST:event_aloj7ActionPerformed

    private void aloj8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aloj8ActionPerformed
        Alojamiento a8 = new Alojamiento("a8", "Murcia", 30, "Habitacion Privada", 1);
        a8.setImagenes("/images/room/aloj80.png","/images/room/aloj81.png","/images/room/aloj82.png");
        miControlador.seleccionaAlojamiento(a8);
        miControlador.procesaAlojamientoWindow();
        if (jDateChooser2.getDate()!=null & jDateChooser3.getDate()!=null){
        miControlador.setFechas(jDateChooser2.getDate().toString(), jDateChooser3.getDate().toString());
        }
    }//GEN-LAST:event_aloj8ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened
    
    
    public void activaAlojamientos(int[] matriz){
        Component [] botones = jPanel2.getComponents();
        for(int i = 0; i < botones.length; i++){
            if(matriz[i]==1) botones[i].setVisible(false);
            jPanel2.add(botones[i]);
        }
    }
    
    public void activaTodo(){
        Component [] botones = jPanel2.getComponents();
        jPanel2.removeAll();
        for(int i = 0; i < botones.length; i++){
            botones[i].setVisible(true);
            jPanel2.add(botones[i]);
        }
    }
    
    public void repaint_home(){
        jPanel2.repaint();
        setSize(getSize().width+1,getSize().height+1);
        repaint();
        setSize(getSize().width-1,getSize().height-1);
        repaint();
    }
    
    public String getCiudad(){
        if(Murcia.isSelected()) return "Murcia";
        if(Cadiz.isSelected()) return "Cadiz";
        if(Barcelona.isSelected()) return "Barcelona";
        if(Madrid.isSelected()) return "Madrid";
        return "Cualquiera";
    }
    
    public void abreUsuario(){
        UserWindow ventana_usuario = new UserWindow(miModelo);
        ventana_usuario.setVisible(true);
    }
    
    public boolean getHayAlojamientos(){
        Component [] botones = jPanel2.getComponents();
        for(int i=0; i<botones.length; i++){
            if (botones[i].isVisible()) return true;
        }
        return false;
    }
    
    public void noAlojamientos(){
       jPanel2.add(noresultado);
       jPanel2.repaint();
       repaint_home();
    }
    
    public void eliminaEtiqueta(){
        jPanel2.remove(noresultado);
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Barcelona;
    private javax.swing.JRadioButton Cadiz;
    private javax.swing.JRadioButton Cualquiera;
    private javax.swing.JRadioButton Madrid;
    private javax.swing.JRadioButton Murcia;
    private javax.swing.JButton aloj1;
    private javax.swing.JButton aloj2;
    private javax.swing.JButton aloj3;
    private javax.swing.JButton aloj4;
    private javax.swing.JButton aloj5;
    private javax.swing.JButton aloj6;
    private javax.swing.JButton aloj7;
    private javax.swing.JButton aloj8;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel foto;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox2;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSlider jSlider2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JPanel mapa;
    private javax.swing.JLabel noresultado;
    // End of variables declaration//GEN-END:variables
}
