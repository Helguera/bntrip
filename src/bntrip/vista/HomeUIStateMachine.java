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
public class HomeUIStateMachine {
    
    private JFrame currentState;
    private Modelo miModelo;
    
    public HomeUIStateMachine(Modelo miModelo){
        this.miModelo = miModelo;
        start();
    }
    
    public void start(){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                currentState = new HomeWindow(miModelo);
                currentState.setVisible(true);
            }
        });
    }
    
    public void close(){
        currentState.setVisible(false);
        currentState.dispose();
    }
    
    
}
