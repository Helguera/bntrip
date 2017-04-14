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
public class HomeUIStateMachine {
    
    private JFrame currentState;
    
    public HomeUIStateMachine(){
        start();
    }
    
    public void start(){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                currentState = new HomeWindow();
                currentState.setVisible(true);
            }
        });
    }
    
    public void close(){
        currentState.setVisible(false);
        currentState.dispose();
    }
    
    
}
