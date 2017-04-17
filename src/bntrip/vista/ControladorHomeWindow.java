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
    
    public void procesaInicioSesion(){
        if (miModelo == null) System.out.println("VAYA VAYA");
        else if(miModelo.getLoged()==false){
            this.procesaLogin();
        }else{
            //abrir vantana de usuario (reservas y lista de deseados)
        }
    }
    
    public void procesaAlojamientoWindow(){
        Main.getStateMachineHome().alojamientoW();
    }
    
    public boolean isLoged(){
        return miModelo.getLoged();
    }
    
    public void seleccionaAlojamiento(Alojamiento alojamiento){
        miModelo.selectAlojamiento(alojamiento);
    }
    
    public void actualizarTipo(String tipo){
        miModelo.setTipo(tipo);
        switch(tipo){
            case("Casa Entera"):
                int [] tipo_aloj0 = {0,1,1,0,1,0,0,0};
                miVista.activaAlojamientos(tipo_aloj0);
                break;
            case("Cualquiera"):
                int [] tipo_aloj1 = {1,1,1,1,1,1,1,1};
                miVista.activaAlojamientos(tipo_aloj1);
                break;
            case("Habitacion Privada"):
                int [] tipo_aloj2 = {1,0,0,1,0,0,0,1};
                miVista.activaAlojamientos(tipo_aloj2);
                break;
            case("Habitacion Compartida"):
                int [] tipo_aloj3 = {0,0,0,0,0,1,1,0};
                miVista.activaAlojamientos(tipo_aloj3);
                break;
        }
    }
    
    public void actualizarPrecio(int precio){
        miModelo.setPrecio(precio);
    }
    
    public void actualizarHuespedes(int huespedes){
        miModelo.setHuespedes(huespedes);
    }
    
    public void actualizarCiudad(String ciudad){
        miModelo.setCiudad(ciudad);
    }
    
    
    
    
    
    
    
    
    
    
    
}
