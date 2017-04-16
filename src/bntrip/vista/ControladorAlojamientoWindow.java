/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bntrip.vista;

import bntrip.modelo.Modelo;
import bntrip.util.Alojamiento;
import bntrip.util.Fechas;
import bntrip.util.Reserva;
import java.util.ArrayList;

/**
 *
 * @author alvaro
 */
public class ControladorAlojamientoWindow {
    private AlojamientoWindow miVista;
    private Modelo miModelo;
    


    public ControladorAlojamientoWindow(AlojamientoWindow miVista, Modelo miModelo) {
        this.miVista = miVista;
        this.miModelo = miModelo;
    }
    
    public boolean isLoged(){
        return miModelo.getLoged();
    }
    
    /**
     * HAY QUE HACER EN MODELO LA POSIBILIDAD DE RESERVAR,
     * CON EL ALOJAMIENTO SELECCIONADO QUE YA TIENE
     */
    public boolean setReservado(Alojamiento aS){
        
        if (miModelo.getFechas()!=null && miModelo.getNumHuespedes()!=0){
            Reserva almacenReserva = miModelo.getAlmacenReserva();
            for (int i = 0; i<almacenReserva.getSize(); i++){
                Alojamiento aR = almacenReserva.getAlojamientoReservado(i);
                Fechas fR = almacenReserva.getFechasReservadas(i);
                Fechas fS = miModelo.getFechas();
                String n1 = aR.getNombre();
                String n2 = aS.getNombre();
                System.out.println(n1 + " " +n2);
                if(n1.equals(n2) && ((fR.getFechaInicio()<=fS.getFechaInicio() && fR.getFechaFin()>=fS.getFechaInicio())||(fR.getFechaInicio()<=fS.getFechaFin() && fR.getFechaFin()>=fS.getFechaFin()))){
                    return false;
                }
            }
            miModelo.setReserva(aS);
            return true;
        }
        return false;
    }
    
    public Alojamiento getAlojamiento(){
        return miModelo.getAlojamientoSeleccionado();
    }
    
}
