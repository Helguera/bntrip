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
public class ControladorUserWindow {
     private UserWindow miVista;
     private Modelo miModelo;
     
     public ControladorUserWindow(UserWindow miVista, Modelo miModelo){
            this.miVista = miVista;
            this.miModelo = miModelo;
     
            
     }
     
     public void procesaLogout(){
        miModelo.setLoged(false);
        Main.logout();
    }
     
     
     
}
