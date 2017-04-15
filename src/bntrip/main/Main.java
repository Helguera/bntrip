/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bntrip.main;
import bntrip.vista.HomeUIStateMachine;
import bntrip.vista.LoginUIStateMachine;


/**
 *
 * @author javier y alvaro
 */
public class Main {
    private static HomeUIStateMachine  homeStateMachine;
    private static LoginUIStateMachine loginStateMachine;
    
    public static void main(String args[]) {
        
        loginStateMachine = new LoginUIStateMachine();
        //homeStateMachine = new HomeUIStateMachine();
        
    }
    
    public static LoginUIStateMachine getStateMachineLogin() {
        return loginStateMachine;
    }
    
     public static void loginSucceed() {
        loginStateMachine.close();
        homeStateMachine = new HomeUIStateMachine();
    }
    
    public static HomeUIStateMachine getStateMachineHome() {
        return homeStateMachine;
    }
    
    public static void logout() {
        homeStateMachine.close();
        loginStateMachine.start();
    }
    
    
}
