/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bntrip.vista.UserWindow;

import bntrip.main.Main;
import bntrip.modelo.Modelo;
import bntrip.util.Alojamiento;
import bntrip.util.Deseado;
import bntrip.util.Reserva;
import java.awt.List;

/**
 * Practica 2 - Interaccion Persona Computadora
 * @date    2017 April.
 * @author  Helguera Lopez, Javier   - javhelg
 * @author  Velasco Gil, Alvaro      - alvvela
 */
public class ControladorUserWindow {
     private UserWindow miVista;
     private Modelo miModelo;
     
     /**
      * Constructor del controlador de la clase UserWindow
      * @param miVista
      * @param miModelo 
      */
     public ControladorUserWindow(UserWindow miVista, Modelo miModelo){
            this.miVista = miVista;
            this.miModelo = miModelo;
     
            
     }
     
     public void procesaLogout(){
        miModelo.reboot();
        miVista.dispose();
        Main.getStateMachineHome().close();
        Main.getStateMachineHome().start();
    }
     
     /**
      * Devuelve una objeto Reserva, donde están guardados las reservas realizadas por ese usuario.
      * @return 
      */
    public Reserva getReserva(){
        if (!(miModelo.getLoged()).equals("")) return miModelo.getAlmacenReserva();
        else return new Reserva();
    }
    
    public Deseado getDeseado(){
        if (!(miModelo.getLoged()).equals("")) return miModelo.getAlmacenDeseado();
        else return new Deseado();
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
    
    /**
     * Carga la lista de reservas deseados para que sea visible por el usuario
     * @param listaDeseado 
     */
    public void cargarListaDeseados(List listaDeseado){    
        Deseado d = getDeseado();
        for (int i=0; i<d.getSize(); i++){
            Alojamiento a = d.getAlojamientoDeseado(i); 
            int dias = d.getFechasDeseada(i).getDiasReservados();
            int precio = dias*((int)a.getPrecio());

            if (dias==1) listaDeseado.add(d.getAlojamientoDeseado(i).getCiudad() + ", " + precio + "€, " + d.getFechasDeseada(i).getDiasReservados() + " dia.");
            else listaDeseado.add(d.getAlojamientoDeseado(i).getCiudad() + ", " + precio + "€, " + d.getFechasDeseada(i).getDiasReservados() + " dias.");
        } 
    }
    
    /**
     * Metodo que borra de la lista de Deseados el elemento seleccionado de la lista.
     * @param listaDeseado
     * @return 
     */
    public boolean removeDeseado(List listaDeseado){
        try{
            Deseado deseados = miModelo.getAlmacenDeseado();
            deseados.removeDeseado(listaDeseado.getSelectedIndex());    
            return true;
        }catch(Exception e){
            return false; 
        }
    }
    
    /**
     * Carga la lista de deseados para que sea visible por el usuario
     * @param listaReserva 
     */
    public void cargarListaReservados(List listaReserva){
        Reserva r = getReserva();
        for (int i=0; i<r.getSize(); i++){
            Alojamiento a = r.getAlojamientoReservado(i);
            int precio = r.getFechasReservadas(i).getDiasReservados()*((int)a.getPrecio());
            if (r.getNumHuespedes(i)==1) listaReserva.add(r.getAlojamientoReservado(i).getCiudad() + ", " + precio + "€, " + r.getNumHuespedes(i) + " BnTripero");
            else listaReserva.add(r.getAlojamientoReservado(i).getCiudad() + ", " + precio + "€, " + r.getNumHuespedes(i) + " BnTriperos");
        } 
    }
    
    public void procesaCierre(){
        Main.getStateMachineHome().close();
        Main.getStateMachineHome().start();
    }
}
