/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bntrip.vista;

import bntrip.main.Main;
import bntrip.modelo.Modelo;
import bntrip.util.Alojamiento;

/**
 *
 * @author javier
 */
public class ControladorHomeWindow {
    
    private HomeWindow miVista;
    private Modelo miModelo;
    
    public ControladorHomeWindow(HomeWindow miVista, Modelo mMo){
        this.miVista = miVista;
        if (mMo == null) System.out.println("VAYA VAYA con el constructor");
        this.miModelo = mMo;
    }

    public void procesaAyuda(){
        
    }
    
    public void procesaRecupera(){
        
    }
    
    public void procesaLogin(){
        // Abrir ventana de inicio de sesion
        Main.logeate();
    }
    
    public void procesaInicio(){
        if (miModelo == null) System.out.println("VAYA VAYA");
        else if(miModelo.getLoged()==false){
            this.procesaLogin();
        }else{
            //abrir vantana de usuario (reservas y lista de deseados)
        }
    }
    
    public boolean isLoged(){
        return miModelo.getLoged();
    }
    
    public void actualizaTipo(String tipo){
       
    }
    
    public void seleccionaAlojamiento(Alojamiento alojamiento){
        miModelo.selectAlojamiento(alojamiento);
    }
    
    
    
    
    
}
