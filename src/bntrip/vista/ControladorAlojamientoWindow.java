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
    
    public String isLoged(){
        return miModelo.getLoged();
    }
    
    /**
     * HAY QUE HACER EN MODELO LA POSIBILIDAD DE RESERVAR,
     * CON EL ALOJAMIENTO SELECCIONADO QUE YA TIENE
     */
    public boolean setReservado(Alojamiento aS){
        
        Fechas f = miModelo.getFechas();
        
        if (miModelo.getLoged().equals("")) {
            System.out.println("\n\t--- DEBE INICIAR SESION! ---");
            return false;
        }
        
        if(f.getFechaInicio()==0 || f.getFechaFin()==0){
            System.out.println("\n\t--- LAS FECHAS NO PUEDEN ESTAR VACÍAS ---");
            return false;
        }
        
        if (f!=null && miModelo.getHuespedes()!=0){
            System.out.println("INICIO: " + f.getFechaInicio() + "\t FIN: "+ f.getFechaFin());
            
            if ((miModelo.getFechas().getFechaInicio())>(miModelo.getFechas().getFechaFin())) {
                System.out.println("\n\t--- LAS FECHAS ESTÁN AL REVÉS! ---");
                return false;
            }
            
            Reserva almacenReserva = miModelo.getAlmacenReserva();
            for (int i = 0; i<almacenReserva.getSize(); i++){
                Alojamiento aR = almacenReserva.getAlojamientoReservado(i);
                Fechas fR = almacenReserva.getFechasReservadas(i);
                Fechas fS = miModelo.getFechas();
                String n1 = aR.getNombre();
                String n2 = aS.getNombre();
                
                if(n1.equals(n2) && ((fR.getFechaInicio()<=fS.getFechaInicio() && fR.getFechaFin()>=fS.getFechaInicio())||(fR.getFechaInicio()<=fS.getFechaFin() && fR.getFechaFin()>=fS.getFechaFin()))){
                    System.out.println("\n\t--- LAS FECHAS ESTAN OCUPADAS");
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
    
    public Fechas getFechas(){
        Fechas f = miModelo.getFechas();
        return f;
    }

}
