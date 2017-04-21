/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bntrip.main;
import bntrip.modelo.Modelo;
import bntrip.vista.StateMachine.HomeUIStateMachine;
import bntrip.vista.StateMachine.LoginUIStateMachine;
import bntrip.vista.LoginWindow.LoginWindow;


/**
 * Practica 2 - Interaccion Persona Computadora
 * @date    2017 April.
 * @author  Helguera Lopez, Javier   - javhelg
 * @author  Velasco Gil, Alvaro      - alvvela
 */
public class Main {
    private static HomeUIStateMachine  homeStateMachine;
    private static LoginUIStateMachine loginStateMachine;
    private static Modelo modelo;
    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("GTK+".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        modelo = new Modelo();
        homeStateMachine = new HomeUIStateMachine(modelo);
        
    }
    
    public static LoginUIStateMachine getStateMachineLogin() {
        return loginStateMachine;
    }
    
    
    public static HomeUIStateMachine getStateMachineHome() {
        return homeStateMachine;
    }
    
    public static void logout() {
        loginStateMachine.close();
        homeStateMachine.close();
        homeStateMachine.start();
    }

    public static void logeate() {
        homeStateMachine.close();
        loginStateMachine = new LoginUIStateMachine(modelo);
    }
    
    public static void logeado(){
        loginStateMachine.close();
        homeStateMachine.close();
        homeStateMachine.start();
    }
    
    
}
