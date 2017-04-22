/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bntrip.vista.RegistroWindow;

import bntrip.main.Main;
import bntrip.modelo.Modelo;
import java.awt.Color;

/**
 * Practica 2 - Interaccion Persona Computadora
 * @date    2017 April.
 * @author  Helguera Lopez, Javier   - javhelg
 * @author  Velasco Gil, Alvaro      - alvvela
 */
public class RegistroWindow extends javax.swing.JFrame {

    private ControladorRegistroWindow miControlador;
    private Modelo miModelo;
    
    /**
     * Creates new form RegistroWindow
     */
    public RegistroWindow(Modelo miModelo) {
        this.miModelo = miModelo;
        initComponents();
        this.setLocationRelativeTo(null);
        miControlador = new ControladorRegistroWindow(this, miModelo);
        
        jLabel6.setVisible(false);
        jLabel7.setVisible(false);
        jLabel9.setVisible(false);
        jLabel10.setVisible(false);
        jLabel3.setVisible(false);
        jLabel4.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jButton2 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Accede a BnTrip");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(192, 237, 228));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 50));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flecha30x30.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Sawasdee", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(100, 104, 105));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("REGISTRATE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 74, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 50));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Sawasdee", 1, 15)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("NACIMIENTO:");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 130, 40));
        jPanel4.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 150, -1));
        jPanel4.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 150, -1));
        jPanel4.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 150, -1));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Hombre");
        jPanel4.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, -1, -1));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Mujer");
        jPanel4.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, -1, -1));

        jDateChooser1.setMaxSelectableDate(new java.util.Date(915148901000L));
        jDateChooser1.setMinSelectableDate(new java.util.Date(-2208984215000L));
        jPanel4.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 150, -1));

        jButton2.setText("Registrarse");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 284, -1));
        jPanel4.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 150, -1));
        jPanel4.add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 150, -1));

        jLabel13.setFont(new java.awt.Font("Sawasdee", 1, 15)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("APELLIDOS:");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 90, 40));

        jLabel14.setFont(new java.awt.Font("Sawasdee", 1, 15)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("NOMBRE: ");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 80, 40));

        jLabel8.setFont(new java.awt.Font("Sawasdee", 1, 15)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("NIF:");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 50, 40));

        jLabel12.setFont(new java.awt.Font("Sawasdee", 1, 15)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("E-MAIL:");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 70, 40));

        jLabel15.setFont(new java.awt.Font("Sawasdee", 1, 15)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("CONTRASEÑA:");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 120, 40));

        jLabel3.setForeground(new java.awt.Color(189, 0, 0));
        jLabel3.setText("* Minimo 5 carácteres");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, 20));

        jLabel4.setForeground(new java.awt.Color(172, 15, 1));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("*");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 40, 40));

        jLabel6.setForeground(new java.awt.Color(172, 15, 1));
        jLabel6.setText("*");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, -1, -1));

        jLabel7.setForeground(new java.awt.Color(172, 15, 1));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("*");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 110, 30, -1));

        jLabel9.setForeground(new java.awt.Color(172, 15, 1));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("*");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 40, 50));

        jLabel10.setForeground(new java.awt.Color(172, 15, 1));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("*");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 40, 40));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 10, 390, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        miControlador.procesaCancelar();
    }//GEN-LAST:event_formWindowClosing

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int check = 0;
        
        if (jTextField1.getText().equals("")) jLabel6.setVisible(true);
        else { check++;  jLabel6.setVisible(false);}
        
        if (jTextField2.getText().equals("")) jLabel7.setVisible(true);
        else { check++;  jLabel7.setVisible(false);}
        
        if (jTextField3.getText().equals("")) jLabel9.setVisible(true);
        else { check++; jLabel9.setVisible(false);}
        
        if (jTextField4.getText().equals("")) jLabel10.setVisible(true);
        else { check++; jLabel10.setVisible(false);}
        
        if ((new String (passwordField.getPassword())).length()<5){
            passwordField.setText("");
            jLabel3.setVisible(true);
        } else { check++; jLabel3.setVisible(false);}
        
        if (jDateChooser1.getDate() == null) jLabel4.setVisible(true);
        else { check++; jLabel4.setVisible(false);}
        
        if (check==6) miControlador.procesaRegistro(jTextField1.getText(), jTextField2.getText(), jTextField3.getText(), jTextField4.getText(), new String(passwordField.getPassword()), null);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        Main.logout();
    }//GEN-LAST:event_jLabel1MouseClicked
    
    public void setRecoveryLabelText(String text){
        //jLabel8.setText(text);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JPasswordField passwordField;
    // End of variables declaration//GEN-END:variables
}
