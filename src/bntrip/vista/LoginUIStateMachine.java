/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bntrip.vista;

import bntrip.modelo.Modelo;
import javax.swing.JFrame;

/**
 *
 * @author javier
 */
public class LoginUIStateMachine {
    private JFrame currentState;
    private Modelo miModelo;
    
    
    public LoginUIStateMachine(Modelo miModelo) {
        this.miModelo = miModelo; 
        start();
    }
    
    public void start() {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                currentState = new LoginWindow(miModelo);
                currentState.setVisible(true);
            }
        });}
    
    public void close() {
       currentState.setVisible(false); // si se desea ocultar
       currentState.dispose();   // si se desea destruir
    }
    
    public void registroW(){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                currentState = new RegistroWindow(miModelo);
                currentState.setVisible(true);
            }
        });
    }
    
    public void help() {
       //currentState.setVisible(false); // si se desea ocultar
       currentState.dispose();   // si se desea destruir
       
       //transición
       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                currentState = new RegistroWindow(miModelo);
                currentState.setVisible(true);
            }
        });
       
   }
}
