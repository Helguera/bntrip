/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bntrip.vista.LoginWindow;

import bntrip.main.Main;
import bntrip.modelo.Modelo;
/**
 * Practica 2 - Interaccion Persona Computadora
 * @date    2017 April.
 * @author  Helguera Lopez, Javier   - javhelg
 * @author  Velasco Gil, Alvaro      - alvvela
 */
public class ControladorLoginWindow {
 LoginWindow miVista;
 Modelo miModelo;
 
    public ControladorLoginWindow(LoginWindow miVista, Modelo miModelo){
        this.miVista = miVista;
        this.miModelo = miModelo;
    }

    public void procesaAyuda(){
        
    }
    
    public void procesaRecupera(){
        
    }
    
    public void procesaLogin(){
        Main.logeate();
    }
    
    public void procesaRegistro(){
        //Main.getStateMachineLogin().registroW();
        Main.getStateMachineLogin().help();
    }
    /**
    public void procesaInicio(){
        if(miModelo.getLoged().equals("")){
            this.procesaLogin();
        }else{
            //abrir vantana de usuario
        }
    }**/
    
    public String isLoged(){
        return miModelo.getLoged();
    }
    
    public void setLogeado(String str){
        miModelo.setLoged(str);
        Main.logeado();
    } 
    
    public void procesaLogout(){
        Main.logout();
    }
    
    
 
 
 
}
