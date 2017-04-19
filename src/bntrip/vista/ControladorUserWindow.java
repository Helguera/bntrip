/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bntrip.vista;

import bntrip.main.Main;
import bntrip.modelo.Modelo;
import bntrip.util.Reserva;

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
        miModelo.reboot();
        Main.logout();
    }
     
     /**
      * Devuelve una objeto Reserva, donde están guardados las reservas realizadas por ese usuario.
      * @return 
      */
    public Reserva getReserva(){
        if (!(miModelo.getLoged()).equals("")) return miModelo.getAlmacenReserva();
        else return new Reserva();
    }
    
    public String getIconoPerfil(){
        switch(miModelo.getLoged()){
            case "Google":  return ("/images/icono_google.png/");
            case "Facebook":return ("/images/icono_fb.png/");
            case "Correo":  return ("/images/icono_correo.png");
        }
        return "/images/profile.png";
    }
    
    public String getLoged(){
        return miModelo.getLoged();
    }
     
     
}
