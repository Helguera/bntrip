/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bntrip.vista.StateMachine;

import bntrip.vista.HomeWindow.HomeWindow;
import bntrip.vista.AlojamientoWindow.AlojamientoWindow;
import bntrip.modelo.Modelo;
import javax.swing.JFrame;

/**
 * Practica 2 - Interaccion Persona Computadora
 * @date    2017 April.
 * @author  Helguera Lopez, Javier   - javhelg
 * @author  Velasco Gil, Alvaro      - alvvela
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
        currentState.dispose();
    }
    
    public void alojamientoW(){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                currentState = new AlojamientoWindow(miModelo);
                currentState.setVisible(true);
            }
        });
    }
    
    
    
    
}
