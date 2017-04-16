/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bntrip.modelo;

import bntrip.util.Alojamiento;
import bntrip.util.Deseado;
import bntrip.util.Fechas;
import bntrip.util.Reserva;
import java.util.ArrayList;

/**
 *
 * @author javier
 */
public class Modelo {
    private boolean isloged;
    private Reserva almacenReserva ;
    private Deseado almacenDeseado;
    private Fechas fechas;
    private Alojamiento alojamientoSeleccionado;
    private int numHuespedes;
    
    public Modelo(){
        isloged = false;
        fechas = new Fechas();
        almacenReserva = new Reserva();
        almacenDeseado = new Deseado();
    }
    
    public boolean getLoged(){
        return isloged;
    }
    
    public void setLoged(boolean b){
        isloged = b;
    }
    
    public Alojamiento getAlojamientoSeleccionado(){
        return alojamientoSeleccionado;
    }

    public void selectAlojamiento(Alojamiento alojamiento) {
        alojamientoSeleccionado = alojamiento;
    }
    
    public void setReserva(Alojamiento aS){
        almacenReserva.setReserva(aS, fechas, numHuespedes);
    }

    public Reserva getAlmacenReserva() {
        return almacenReserva;
    }
    
    public Fechas getFechas(){
        if (fechas.getFechaInicio()!=0 && fechas.getFechaFin()!=0)return fechas;
        else return null;
    }
    
    public int getNumHuespedes(){
        return numHuespedes;
    }
}
