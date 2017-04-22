/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bntrip.vista.LoginWindow;

import bntrip.main.Main;
import bntrip.modelo.Modelo;
import java.awt.Color;

/**
 * Practica 2 - Interaccion Persona Computadora
 * @date    2017 April.
 * @author  Helguera Lopez, Javier   - javhelg
 * @author  Velasco Gil, Alvaro      - alvvela
 */
public class LoginWindow extends javax.swing.JFrame {
    private ControladorLoginWindow miControlador;
    private Modelo miModelo;
    
    /**
     * Creates new form LoginWindow
     */
    public LoginWindow(Modelo miModelo) {
        initComponents();
        miControlador = new ControladorLoginWindow(this, miModelo);
        this.miModelo=miModelo;
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        botonGoogle = new javax.swing.JButton();
        botonFb = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        textFieldEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        botonEntrar = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(244, 247, 247));
        setPreferredSize(new java.awt.Dimension(250, 355));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonGoogle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/inicia_google.png"))); // NOI18N
        botonGoogle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGoogleActionPerformed(evt);
            }
        });
        getContentPane().add(botonGoogle, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 286, 200, 30));

        botonFb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/inicia_fb.png"))); // NOI18N
        botonFb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonFbActionPerformed(evt);
            }
        });
        getContentPane().add(botonFb, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 246, 200, 30));

        jLabel1.setFont(new java.awt.Font("Sawasdee", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(1, 1, 1));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("- O REGÍSTRATE AQUÍ -");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 200, -1));

        jPanel1.setBackground(new java.awt.Color(192, 237, 228));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flecha30x30.png"))); // NOI18N
        jLabel3.setToolTipText("Atrás");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel4.setFont(new java.awt.Font("Sawasdee", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(100, 104, 105));
        jLabel4.setText("INICIA SESIÓN");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 50));

        textFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldEmailActionPerformed(evt);
            }
        });
        getContentPane().add(textFieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 200, 30));

        jLabel5.setFont(new java.awt.Font("Sawasdee", 1, 15)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("CONTRASEÑA");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 120, 30));

        jLabel6.setFont(new java.awt.Font("Sawasdee", 1, 15)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("E-MAIL:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 67, 70, 40));

        passwordField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                passwordFieldMouseEntered(evt);
            }
        });
        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });
        passwordField.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                passwordFieldPropertyChange(evt);
            }
        });
        getContentPane().add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 200, 30));

        botonEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/inicia_correo.png"))); // NOI18N
        botonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(botonEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 200, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonGoogleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGoogleActionPerformed
        miControlador.setLogeado("Google");
        
    }//GEN-LAST:event_botonGoogleActionPerformed

    private void botonFbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonFbActionPerformed
        miControlador.setLogeado("Facebook");
    }//GEN-LAST:event_botonFbActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        miControlador.procesaLogout();
    }//GEN-LAST:event_formWindowClosing

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        jLabel1.setForeground(Color.GREEN);
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        jLabel1.setForeground(Color.BLACK);
    }//GEN-LAST:event_jLabel1MouseExited

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        miControlador.procesaRegistro();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void botonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEntrarActionPerformed
        if(miControlador.procesaInicioSesion(textFieldEmail.getText(), new String (passwordField.getPassword()))){
            Main.logeado();
        }else{
            passwordField.setText("");
            botonEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/inicia_correo_fail.png")));
        }
    }//GEN-LAST:event_botonEntrarActionPerformed

    private void textFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldEmailActionPerformed
        //miControlador.procesaLogin(textFieldEmail.getText(), new String(passwordField.getPassword()));
    }//GEN-LAST:event_textFieldEmailActionPerformed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed

    private void passwordFieldPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_passwordFieldPropertyChange
        botonEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/inicia_correo.png")));

    }//GEN-LAST:event_passwordFieldPropertyChange

    private void passwordFieldMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordFieldMouseEntered
        botonEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/inicia_correo.png")));

    }//GEN-LAST:event_passwordFieldMouseEntered

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        Main.logout();
    }//GEN-LAST:event_jLabel3MouseClicked

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonEntrar;
    private javax.swing.JButton botonFb;
    private javax.swing.JButton botonGoogle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField textFieldEmail;
    // End of variables declaration//GEN-END:variables

}
