/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bntrip.vista;

import bntrip.main.Main;
import bntrip.modelo.Modelo;
/**
 *
 * @author javier
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
    
    public void procesaInicio(){
        if(!miModelo.getLoged()){
            this.procesaLogin();
        }else{
            //abrir vantana de usuario
        }
    }
    
    public boolean isLoged(){
        return miModelo.getLoged();
    }
    
    public void setLogeado(boolean b){
        miModelo.setLoged(b);
        Main.logeado();
    } 
    
    public void procesaLogout(){
        Main.logout();
    }
 
 
 
}