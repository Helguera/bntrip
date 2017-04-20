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
 * Practica 2 - Interaccion Persona Computadora
 * @date 2017 April
 * @author  Helguera Lopez, Javier   - javhelg
 *          Velasco Gil, Alvaro      - alvvela
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
        labelNoResultado = new javax.swing.JLabel();
        PanelMenu = new javax.swing.JPanel();
        panelMenuSuperior = new javax.swing.JPanel();
        panelLogoPerfil = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        comboTipoAlojamiento = new javax.swing.JComboBox();
        sliderPrecio = new javax.swing.JSlider();
        spinerHuespedes = new javax.swing.JSpinner(model);
        panelFechas = new javax.swing.JPanel();
        dateChooserEntrada = new com.toedter.calendar.JDateChooser();
        dateChooserSalida = new com.toedter.calendar.JDateChooser();
        panelMenuMapa = new javax.swing.JPanel();
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
        PanelAlojamientos = new javax.swing.JPanel();
        botonAlojamiento1 = new javax.swing.JButton();
        botonAlojamiento2 = new javax.swing.JButton();
        botonAlojamiento3 = new javax.swing.JButton();
        botonAlojamiento4 = new javax.swing.JButton();
        botonAlojamiento5 = new javax.swing.JButton();
        botonAlojamiento6 = new javax.swing.JButton();
        botonAlojamiento7 = new javax.swing.JButton();
        botonAlojamiento8 = new javax.swing.JButton();

        labelNoResultado.setFont(new java.awt.Font("Ubuntu", 1, 30)); // NOI18N
        labelNoResultado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lupa.png"))); // NOI18N
        labelNoResultado.setText("No hay resultados");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("bntrip");
        setMinimumSize(new java.awt.Dimension(697, 626));
        setPreferredSize(new java.awt.Dimension(735, 626));

        PanelMenu.setLayout(new java.awt.GridLayout(2, 0));

        panelMenuSuperior.setLayout(new java.awt.GridLayout(5, 0));

        panelLogoPerfil.setBackground(new java.awt.Color(196, 237, 228));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logolittle.png"))); // NOI18N
        panelLogoPerfil.add(jLabel6);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/profile.png"))); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panelLogoPerfil.add(jButton1);

        panelMenuSuperior.add(panelLogoPerfil);

        comboTipoAlojamiento.setBackground(new java.awt.Color(196, 237, 228));
        comboTipoAlojamiento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cualquiera", "Casa Entera", "Habitacion Privada", "Habitacion Compartida" }));
        comboTipoAlojamiento.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo de Alojamiento"));
        comboTipoAlojamiento.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboTipoAlojamientoItemStateChanged(evt);
            }
        });
        comboTipoAlojamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTipoAlojamientoActionPerformed(evt);
            }
        });
        panelMenuSuperior.add(comboTipoAlojamiento);

        sliderPrecio.setBackground(new java.awt.Color(196, 237, 228));
        sliderPrecio.setFont(new java.awt.Font("Bitstream Charter", 1, 10)); // NOI18N
        sliderPrecio.setMaximum(200);
        sliderPrecio.setMinorTickSpacing(25);
        sliderPrecio.setPaintLabels(true);
        sliderPrecio.setPaintTicks(true);
        sliderPrecio.setValue(200);
        sliderPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Precio Maximo"));
        sliderPrecio.setMaximumSize(new java.awt.Dimension(32767, 40));
        sliderPrecio.setMinimumSize(new java.awt.Dimension(42, 40));
        sliderPrecio.setPreferredSize(new java.awt.Dimension(210, 40));
        sliderPrecio.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderPrecioStateChanged(evt);
            }
        });
        panelMenuSuperior.add(sliderPrecio);

        spinerHuespedes.setToolTipText("Numero de Huespedes");
        spinerHuespedes.setBorder(javax.swing.BorderFactory.createTitledBorder("Huespedes"));
        spinerHuespedes.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinerHuespedesStateChanged(evt);
            }
        });
        panelMenuSuperior.add(spinerHuespedes);

        panelFechas.setLayout(new java.awt.GridLayout(1, 2));

        dateChooserEntrada.setBackground(new java.awt.Color(196, 237, 228));
        dateChooserEntrada.setBorder(javax.swing.BorderFactory.createTitledBorder("Fecha Entrada"));
        dateChooserEntrada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dateChooserEntradaMouseClicked(evt);
            }
        });
        panelFechas.add(dateChooserEntrada);

        dateChooserSalida.setBackground(new java.awt.Color(196, 237, 228));
        dateChooserSalida.setBorder(javax.swing.BorderFactory.createTitledBorder("Fecha Salida"));
        panelFechas.add(dateChooserSalida);

        panelMenuSuperior.add(panelFechas);

        PanelMenu.add(panelMenuSuperior);

        panelMenuMapa.setBackground(new java.awt.Color(196, 237, 228));
        panelMenuMapa.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonGroup1.add(Murcia);
        Murcia.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        Murcia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MurciaMouseClicked(evt);
            }
        });
        panelMenuMapa.add(Murcia, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, -1, -1));

        buttonGroup1.add(Barcelona);
        Barcelona.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        Barcelona.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BarcelonaMouseClicked(evt);
            }
        });
        panelMenuMapa.add(Barcelona, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, -1, -1));

        buttonGroup1.add(Cadiz);
        Cadiz.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        Cadiz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CadizMouseClicked(evt);
            }
        });
        panelMenuMapa.add(Cadiz, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, -1, -1));

        buttonGroup1.add(Cualquiera);
        Cualquiera.setSelected(true);
        Cualquiera.setText("Cualquier CIudad");
        Cualquiera.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CualquieraMouseClicked(evt);
            }
        });
        panelMenuMapa.add(Cualquiera, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, -1, -1));

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel3.setText("Barcelona");
        panelMenuMapa.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, -1, -1));

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel2.setText("Madrid");
        panelMenuMapa.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, -1, -1));

        jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel4.setText("Cadiz");
        panelMenuMapa.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, -1, -1));

        jLabel5.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel5.setText("Murcia");
        panelMenuMapa.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, -1, -1));

        buttonGroup1.add(Madrid);
        Madrid.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        Madrid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MadridMouseClicked(evt);
            }
        });
        panelMenuMapa.add(Madrid, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, -1, -1));

        foto.setBackground(new java.awt.Color(196, 237, 228));
        foto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mapa.png"))); // NOI18N
        panelMenuMapa.add(foto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 270));

        PanelMenu.add(panelMenuMapa);

        getContentPane().add(PanelMenu, java.awt.BorderLayout.LINE_START);

        PanelAlojamientos.setBackground(new java.awt.Color(244, 247, 247));

        botonAlojamiento1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/aloj1.png"))); // NOI18N
        botonAlojamiento1.setToolTipText("<html><img src=\""+getClass().getResource("/images/Tips/tip1.png")+"\"></html>");
        botonAlojamiento1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        botonAlojamiento1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAlojamiento1ActionPerformed(evt);
            }
        });
        PanelAlojamientos.add(botonAlojamiento1);

        botonAlojamiento2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/aloj2.png"))); // NOI18N
        botonAlojamiento2.setToolTipText("<html><img src=\""+getClass().getResource("/images/Tips/tip2.png")+"\"></html>");
        botonAlojamiento2.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        botonAlojamiento2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAlojamiento2ActionPerformed(evt);
            }
        });
        PanelAlojamientos.add(botonAlojamiento2);

        botonAlojamiento3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/aloj3.png"))); // NOI18N
        botonAlojamiento3.setToolTipText("<html><img src=\""+getClass().getResource("/images/Tips/tip3.png")+"\"></html>");
        botonAlojamiento3.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        botonAlojamiento3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAlojamiento3ActionPerformed(evt);
            }
        });
        PanelAlojamientos.add(botonAlojamiento3);

        botonAlojamiento4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/aloj4.png"))); // NOI18N
        botonAlojamiento4.setToolTipText("<html><img src=\""+getClass().getResource("/images/Tips/tip4.png")+"\"></html>");
        botonAlojamiento4.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        botonAlojamiento4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAlojamiento4ActionPerformed(evt);
            }
        });
        PanelAlojamientos.add(botonAlojamiento4);

        botonAlojamiento5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/aloj5.png"))); // NOI18N
        botonAlojamiento5.setToolTipText("<html><img src=\""+getClass().getResource("/images/Tips/tip5.png")+"\"></html>");
        botonAlojamiento5.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        botonAlojamiento5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAlojamiento5ActionPerformed(evt);
            }
        });
        PanelAlojamientos.add(botonAlojamiento5);

        botonAlojamiento6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/aloj6.png"))); // NOI18N
        botonAlojamiento6.setToolTipText("<html><img src=\""+getClass().getResource("/images/Tips/tip6.png")+"\"></html>");
        botonAlojamiento6.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        botonAlojamiento6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAlojamiento6ActionPerformed(evt);
            }
        });
        PanelAlojamientos.add(botonAlojamiento6);

        botonAlojamiento7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/aloj7.png"))); // NOI18N
        botonAlojamiento7.setToolTipText("<html><img src=\""+getClass().getResource("/images/Tips/tip7.png")+"\"></html>");
        botonAlojamiento7.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        botonAlojamiento7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAlojamiento7ActionPerformed(evt);
            }
        });
        PanelAlojamientos.add(botonAlojamiento7);

        botonAlojamiento8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/aloj8.png"))); // NOI18N
        botonAlojamiento8.setToolTipText("<html><img src=\""+getClass().getResource("/images/Tips/tip8.png")+"\"></html>");
        botonAlojamiento8.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        botonAlojamiento8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAlojamiento8ActionPerformed(evt);
            }
        });
        PanelAlojamientos.add(botonAlojamiento8);

        getContentPane().add(PanelAlojamientos, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened		
         // TODO add your handling code here:		
     }//GEN-LAST:event_formWindowOpened
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        miControlador.procesaInicioSesion();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void botonAlojamiento1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAlojamiento1ActionPerformed
        Alojamiento a1 = new Alojamiento("a1", "Madrid", 65, "Habitacion Privada", 2);
        a1.setImagenes("/images/room/aloj10.png","/images/room/aloj11.png","/images/room/aloj12.png");
        miControlador.seleccionaAlojamiento(a1);
        miControlador.procesaAlojamientoWindow();
        
        // DEJA PONER CALENDARIO NULO, HAY QUE HACER DESPUES QUE NO TE DEJE RESERVAR
        if (dateChooserEntrada.getDate()!=null & dateChooserSalida.getDate()!=null){
        miControlador.setFechas(dateChooserEntrada.getDate().toString(), dateChooserSalida.getDate().toString());
        }
    }//GEN-LAST:event_botonAlojamiento1ActionPerformed

    private void botonAlojamiento2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAlojamiento2ActionPerformed
        Alojamiento a2 = new Alojamiento("a2", "Barcelona", 200, "Habitacion Privada", 2);
        a2.setImagenes("/images/room/aloj20.png","/images/room/aloj21.png","/images/room/aloj22.png");
        miControlador.seleccionaAlojamiento(a2);
        miControlador.procesaAlojamientoWindow();
        
        
        if (dateChooserEntrada.getDate()!=null && dateChooserSalida.getDate()!=null){
        miControlador.setFechas(dateChooserEntrada.getDate().toString(), dateChooserSalida.getDate().toString());
        }
        //this.setVisible(false);
    }//GEN-LAST:event_botonAlojamiento2ActionPerformed

    private void botonAlojamiento3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAlojamiento3ActionPerformed
        Alojamiento a3 = new Alojamiento("a3", "Cadiz", 30, "Casa Entera", 4);
        a3.setImagenes("/images/room/aloj30.png","/images/room/aloj31.png","/images/room/aloj32.png");
        miControlador.seleccionaAlojamiento(a3);
        miControlador.procesaAlojamientoWindow();
        if (dateChooserEntrada.getDate()!=null & dateChooserSalida.getDate()!=null){
        miControlador.setFechas(dateChooserEntrada.getDate().toString(), dateChooserSalida.getDate().toString());
        }
    }//GEN-LAST:event_botonAlojamiento3ActionPerformed

    private void botonAlojamiento4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAlojamiento4ActionPerformed
        Alojamiento a4 = new Alojamiento("a4", "Cadiz", 65, "Habitacion Privada", 2);
        a4.setImagenes("/images/room/aloj40.png","/images/room/aloj41.png","/images/room/aloj42.png");
        miControlador.seleccionaAlojamiento(a4);
        miControlador.procesaAlojamientoWindow();
        if (dateChooserEntrada.getDate()!=null & dateChooserSalida.getDate()!=null){
        miControlador.setFechas(dateChooserEntrada.getDate().toString(), dateChooserSalida.getDate().toString());
        }
    }//GEN-LAST:event_botonAlojamiento4ActionPerformed

    private void botonAlojamiento5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAlojamiento5ActionPerformed
        Alojamiento a5 = new Alojamiento("a5", "Murcia", 150, "Casa Entera", 3);
        a5.setImagenes("/images/room/aloj50.png","/images/room/aloj51.png","/images/room/aloj52.png");
        miControlador.seleccionaAlojamiento(a5);
        miControlador.procesaAlojamientoWindow();
        if (dateChooserEntrada.getDate()!=null & dateChooserSalida.getDate()!=null){
        miControlador.setFechas(dateChooserEntrada.getDate().toString(), dateChooserSalida.getDate().toString());
        }
    }//GEN-LAST:event_botonAlojamiento5ActionPerformed

    private void botonAlojamiento6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAlojamiento6ActionPerformed
        Alojamiento a6 = new Alojamiento("a6", "Madrid", 35, "Habitacion Compartida", 2);
        a6.setImagenes("/images/room/aloj60.png","/images/room/aloj61.png","/images/room/aloj62.png");
        miControlador.seleccionaAlojamiento(a6);
        miControlador.procesaAlojamientoWindow();
        if (dateChooserEntrada.getDate()!=null & dateChooserSalida.getDate()!=null){
        miControlador.setFechas(dateChooserEntrada.getDate().toString(), dateChooserSalida.getDate().toString());
        }
    }//GEN-LAST:event_botonAlojamiento6ActionPerformed

    private void botonAlojamiento7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAlojamiento7ActionPerformed
        Alojamiento a7 = new Alojamiento("a7", "Barcelona", 200, "Habitacion Compartida", 1);
        a7.setImagenes("/images/room/aloj70.png","/images/room/aloj71.png","/images/room/aloj72.png");
        miControlador.seleccionaAlojamiento(a7);
        miControlador.procesaAlojamientoWindow();
        if (dateChooserEntrada.getDate()!=null & dateChooserSalida.getDate()!=null){
        miControlador.setFechas(dateChooserEntrada.getDate().toString(), dateChooserSalida.getDate().toString());
        }
    }//GEN-LAST:event_botonAlojamiento7ActionPerformed

    private void botonAlojamiento8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAlojamiento8ActionPerformed
        Alojamiento a8 = new Alojamiento("a8", "Murcia", 30, "Habitacion Privada", 1);
        a8.setImagenes("/images/room/aloj80.png","/images/room/aloj81.png","/images/room/aloj82.png");
        miControlador.seleccionaAlojamiento(a8);
        miControlador.procesaAlojamientoWindow();
        if (dateChooserEntrada.getDate()!=null & dateChooserSalida.getDate()!=null){
        miControlador.setFechas(dateChooserEntrada.getDate().toString(), dateChooserSalida.getDate().toString());
        }
    }//GEN-LAST:event_botonAlojamiento8ActionPerformed


    /************************************
     *                                  *
     *         OPCIONES DEL MENU        *
     *                                  *
     * **********************************/


    
    // Funcionalidad a los botones del menú de actualizar los alojamientos disponibles en funcion de lo seleccionado.
     
    private void sliderPrecioStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderPrecioStateChanged
        miControlador.actualizarTodo(comboTipoAlojamiento.getSelectedItem().toString(), sliderPrecio.getValue(), (int)spinerHuespedes.getValue(), getCiudad());
    }//GEN-LAST:event_sliderPrecioStateChanged

    private void comboTipoAlojamientoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboTipoAlojamientoItemStateChanged
        miControlador.actualizarTodo(comboTipoAlojamiento.getSelectedItem().toString(), sliderPrecio.getValue(), (int)spinerHuespedes.getValue(), getCiudad());
    }//GEN-LAST:event_comboTipoAlojamientoItemStateChanged

    private void comboTipoAlojamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTipoAlojamientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboTipoAlojamientoActionPerformed

    private void spinerHuespedesStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinerHuespedesStateChanged
        // TODO add your handling code here:
        miControlador.actualizarTodo(comboTipoAlojamiento.getSelectedItem().toString(), sliderPrecio.getValue(), (int)spinerHuespedes.getValue(), getCiudad());
    }//GEN-LAST:event_spinerHuespedesStateChanged

    
    // Funcionalidad de actualizar los alojamientos en funcion del boton clickado del mapa.
     
    private void MadridMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MadridMouseClicked
        // TODO add your handling code here:
        miControlador.actualizarTodo(comboTipoAlojamiento.getSelectedItem().toString(), sliderPrecio.getValue(), (int)spinerHuespedes.getValue(), "Madrid");
    }//GEN-LAST:event_MadridMouseClicked

    private void CadizMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CadizMouseClicked
        // TODO add your handling code here:
        miControlador.actualizarTodo(comboTipoAlojamiento.getSelectedItem().toString(), sliderPrecio.getValue(), (int)spinerHuespedes.getValue(), "Cadiz");
    }//GEN-LAST:event_CadizMouseClicked

    private void MurciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MurciaMouseClicked
        // TODO add your handling code here:
        miControlador.actualizarTodo(comboTipoAlojamiento.getSelectedItem().toString(), sliderPrecio.getValue(), (int)spinerHuespedes.getValue(), "Murcia");
    }//GEN-LAST:event_MurciaMouseClicked

    private void BarcelonaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BarcelonaMouseClicked
        // TODO add your handling code here:
        miControlador.actualizarTodo(comboTipoAlojamiento.getSelectedItem().toString(), sliderPrecio.getValue(), (int)spinerHuespedes.getValue(), "Barcelona");
    }//GEN-LAST:event_BarcelonaMouseClicked

    private void CualquieraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CualquieraMouseClicked
        // TODO add your handling code here:
        miControlador.actualizarTodo(comboTipoAlojamiento.getSelectedItem().toString(), sliderPrecio.getValue(), (int)spinerHuespedes.getValue(), "Cualquiera");
    }//GEN-LAST:event_CualquieraMouseClicked

    private void dateChooserEntradaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dateChooserEntradaMouseClicked
    }//GEN-LAST:event_dateChooserEntradaMouseClicked

    /********************************
     *                              *
     *    --- FUNCIONES CREADAS --- *
     *                              *
     * ******************************/

     /**
      * Metodo que desactiva los alojamientos.
      * @param matriz: MAtriz del mismo tamano que alojamientos totales donde el 1 desactiva.
      */
    public void activaAlojamientos(int[] matriz){
        Component [] botones = PanelAlojamientos.getComponents();
        for(int i = 0; i < botones.length; i++){
            if(matriz[i]==1) botones[i].setVisible(false);
            PanelAlojamientos.add(botones[i]);
        }
    }
    
    /**
     * Metodo que pone visibles todos los alojamientos.
     */
    public void activaTodo(){
        Component [] botones = PanelAlojamientos.getComponents();
        PanelAlojamientos.removeAll();
        for(int i = 0; i < botones.length; i++){
            botones[i].setVisible(true);
            PanelAlojamientos.add(botones[i]);
        }
    }
    
    /**
     * Metodo utilizado para que se actualice la ventana con los
     * cambios realizados.
     * Se utiliza tras haber realizado algun cambio en la 
     * visibilidad de los alojamientos.
     */
    public void repaint_home(){
        PanelAlojamientos.repaint();
        setSize(getSize().width+1,getSize().height+1);
        repaint();
        setSize(getSize().width-1,getSize().height-1);
        repaint();
    }
    
    /**
     * Metodo que devuelve la ciudad seleccionada.
     * @return ciudad [String] 
     */
    public String getCiudad(){
        if(Murcia.isSelected()){ return "Murcia";}
        if(Cadiz.isSelected()) return "Cadiz";
        if(Barcelona.isSelected()) return "Barcelona";
        if(Madrid.isSelected()) return "Madrid";
        return "Cualquiera";
    }
    
    /**
     * Metodo que abre el panel del usuario.
     */
    public void abreUsuario(){
        UserWindow ventana_usuario = new UserWindow(miModelo);
        ventana_usuario.setVisible(true);
    }
    
    /**
     * Metodo que devuelve true o false en funcion de si queda algun
     * alojamiento visible,
     * @return 
     */
    public boolean getHayAlojamientos(){
        Component [] botones = PanelAlojamientos.getComponents();
        for(int i=0; i<botones.length; i++){
            if (botones[i].isVisible()) return true;
        }
        return false;
    }
    
    /**
     * Metodo que informa con un label de que no hay ningun alojamiento
     * con esas caracteristicas.
     */
    public void noAlojamientos(){
       PanelAlojamientos.add(labelNoResultado);
       PanelAlojamientos.repaint();
       repaint_home();
    }
   
    /**
     * Metodo que elimina el label de que no hay alojamientos con esas caracteristicas.
     */
    public void eliminaEtiqueta(){
        PanelAlojamientos.remove(labelNoResultado);
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Barcelona;
    private javax.swing.JRadioButton Cadiz;
    private javax.swing.JRadioButton Cualquiera;
    private javax.swing.JRadioButton Madrid;
    private javax.swing.JRadioButton Murcia;
    private javax.swing.JPanel PanelAlojamientos;
    private javax.swing.JPanel PanelMenu;
    private javax.swing.JButton botonAlojamiento1;
    private javax.swing.JButton botonAlojamiento2;
    private javax.swing.JButton botonAlojamiento3;
    private javax.swing.JButton botonAlojamiento4;
    private javax.swing.JButton botonAlojamiento5;
    private javax.swing.JButton botonAlojamiento6;
    private javax.swing.JButton botonAlojamiento7;
    private javax.swing.JButton botonAlojamiento8;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox comboTipoAlojamiento;
    private com.toedter.calendar.JDateChooser dateChooserEntrada;
    private com.toedter.calendar.JDateChooser dateChooserSalida;
    private javax.swing.JLabel foto;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel labelNoResultado;
    private javax.swing.JPanel panelFechas;
    private javax.swing.JPanel panelLogoPerfil;
    private javax.swing.JPanel panelMenuMapa;
    private javax.swing.JPanel panelMenuSuperior;
    private javax.swing.JSlider sliderPrecio;
    private javax.swing.JSpinner spinerHuespedes;
    // End of variables declaration//GEN-END:variables
}
