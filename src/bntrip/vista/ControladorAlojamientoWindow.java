/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bntrip.vista;

import bntrip.modelo.Modelo;
import bntrip.util.Alojamiento;
import bntrip.util.Deseado;
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
            setImagenBoton("/images/reserva_iniciarsesion.png/");
            return false;
        }
        
        if(f.getFechaInicio()==0 || f.getFechaFin()==0){
            setImagenBoton("/images/reserva_rellenacampos.png/");
            return false;
        }
        
        if (f!=null && miModelo.getHuespedes()!=0){
            System.out.println("INICIO: " + f.getFechaInicio() + "\t FIN: "+ f.getFechaFin());
            
            if ((miModelo.getFechas().getFechaInicio())>(miModelo.getFechas().getFechaFin())) {
                setImagenBoton("/images/reserva_fechanovalida.png/");
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
                    setImagenBoton("/images/reserva_fechaocupada.png/");
                    return false;
                }
            }
            
            miModelo.setReserva(aS);
            miVista.setImagenReserva("/images/reserva_ok.png");
            
            return true;
        }
        setImagenBoton("/images/reserva_rellenacampos.png/");
        return false;
    }
    
    
    public boolean setDeseado(Alojamiento aS){
        Fechas f = miModelo.getFechas();
        
        if (miModelo.getLoged().equals("")){
            setImagenBoton("/images/reserva_iniciarsesion.png/");
            return false;
        }else if(f.getFechaInicio()==0 || f.getFechaFin()==0){
                setImagenBoton("/images/reserva_fechanovalida.png/");
                return false;
        } else if ((miModelo.getFechas().getFechaInicio())>(miModelo.getFechas().getFechaFin())) {
                setImagenBoton("/images/reserva_fechanovalida.png/");
                return false;
        }
        
        Deseado almacenDeseado = miModelo.getAlmacenDeseado();
        for (int i = 0; i<almacenDeseado.getSize(); i++){
            Alojamiento aR = almacenDeseado.getAlojamientoDeseado(i);
            Fechas fR = almacenDeseado.getFechasDeseada(i);
            Fechas fS = miModelo.getFechas();
            String n1 = aR.getNombre();
            String n2 = aS.getNombre();       
            if(n1.equals(n2) && fR.getFechaInicio()==fS.getFechaInicio() && fR.getFechaFin() == fS.getFechaFin()){
                return false;
            }
        }
            
        miModelo.setDeseado(aS);
        miVista.setImagenDeseado("/images/deseado_ok.png");
            
        return true;    
    }
    
    
    private void setImagenBoton(String url){
        miVista.setImagenAlojamiento(url);
    }
    
    
    public Alojamiento getAlojamiento(){
        return miModelo.getAlojamientoSeleccionado();
    }
    
    
    public Fechas getFechas(){
        Fechas f = miModelo.getFechas();
        return f;
    }

}
