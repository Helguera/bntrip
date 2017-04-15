/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bntrip.vista;

import javax.swing.JFrame;

/**
 *
 * @author javier
 */
public class LoginUIStateMachine {
    private JFrame currentState;
    
    public LoginUIStateMachine() {
         start();
    }
    
    public void start() {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                currentState = new LoginWindow();
                currentState.setVisible(true);
            }
        });}
    
    public void close() {
       currentState.setVisible(false); // si se desea ocultar
       currentState.dispose();   // si se desea destruir
    }
    
    
}
