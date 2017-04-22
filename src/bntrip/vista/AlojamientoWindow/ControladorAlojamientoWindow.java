/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bntrip.vista.AlojamientoWindow;

import bntrip.modelo.Modelo;
import bntrip.util.Alojamiento;
import bntrip.util.Deseado;
import bntrip.util.Fechas;
import bntrip.util.Reserva;
import java.util.ArrayList;

/**
 * Practica 2 - Interaccion Persona Computadora
 * @date    2017 April.
 * @author  Helguera Lopez, Javier   - javhelg
 * @author  Velasco Gil, Alvaro      - alvvela
 */
public class ControladorAlojamientoWindow {
    
    private AlojamientoWindow miVista;
    private Modelo miModelo;

    /**
     * Controlador de la clase Alojamiento
     * @param miVista
     * @param miModelo 
     */
    public ControladorAlojamientoWindow(AlojamientoWindow miVista, Modelo miModelo) {
        this.miVista = miVista;
        this.miModelo = miModelo;
    }
    
    /**
     * Devuelve el nombre del medio con el que está registrado.
     * @return String
     */
    public String isLoged(){
        return miModelo.getLoged();
    }
    
    /**
     * Metodo que cambia el boton de deseado dependiendo de si ya está deseado o no.
     * @return boolean
     */
    public boolean setEstadoDeseado(){
        Deseado almacenDeseado = miModelo.getAlmacenDeseado();
        Alojamiento aS = miModelo.getAlojamientoSeleccionado();
        Fechas fS = miModelo.getFechas();
        
        for (int i = 0; i<almacenDeseado.getSize(); i++){
            Alojamiento aD = almacenDeseado.getAlojamientoDeseado(i);
            Fechas fD = almacenDeseado.getFechasDeseada(i);
            String n1 = aD.getNombre();
            String n2 = aS.getNombre();       
            if(n1.equals(n2) && fD.getFechaInicio()==fS.getFechaInicio() && fD.getFechaFin() == fS.getFechaFin()){
                miVista.setImagenDeseado("/images/deseado_ok.png");
                return true;
            }
        }
        miVista.setImagenDeseado("/images/deseado_no.png");
        return false;
    }
    
    /**
     * Metodo que intenta realizar una reserva, indicando si puede realizarse con exito o no.
     * @param alojamientoSeleccionado [Alojamiento]
     * @return boolean
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
    
    
    /**
     * MEtodo que dado un alojamiento, y teniendo unas fechas, lo guarda como deseado.
     * @param alojamientoSeleccionado [Alojamiento]
     * @return boolean
     */
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
            Alojamiento aD = almacenDeseado.getAlojamientoDeseado(i);
            Fechas fD = almacenDeseado.getFechasDeseada(i);
            Fechas fS = miModelo.getFechas();
            String n1 = aD.getNombre();
            String n2 = aS.getNombre();       
            if(n1.equals(n2) && fD.getFechaInicio()==fS.getFechaInicio() && fD.getFechaFin() == fS.getFechaFin()){
                miModelo.removeDeseado(aD);
                miVista.setImagenDeseado("/images/deseado_no.png");
                return false;
            }
        }
       
        miModelo.setDeseado(aS);
        miVista.setImagenDeseado("/images/deseado_ok.png");
            
        return true;    
    }
    
    
    /**
     * Pasandole una URL de una imagen, la coloc como icono.
     * @param url 
     */
    private void setImagenBoton(String url){
        miVista.setImagenAlojamiento(url);
    }
    
    
    /**
     * Metodo que devuelve el alojamiento guardado en el modelo.
     * @return Alojamiento
     */
    public Alojamiento getAlojamiento(){
        return miModelo.getAlojamientoSeleccionado();
    }
    
    /**
     * MEtodo que obtiene las fechas seleccionadas guardadas en el modelo.
     * @return Fechas.
     */
    public Fechas getFechas(){
        Fechas f = miModelo.getFechas();
        return f;
    }

}
