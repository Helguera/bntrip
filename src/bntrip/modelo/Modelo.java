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
    private ArrayList almacen;
    
    public Modelo(){
        almacen = new ArrayList<Object>();
        //tipo, precio, huespedes, ciudad
        for (int i = 0; i < 3; i++) {
            almacen.add(null);
        }
        almacen.set(1, 200);
        almacen.set(2,1);
        
        isloged = false;
        fechas = new Fechas();
        almacenReserva = new Reserva();
        almacenDeseado = new Deseado();
    }
    
    public void setTipo(String tipo){
        almacen.set(0,tipo);
    }
    
    public void setPrecio(int precio){
        almacen.set(1,precio);
    }
    
    public void setHuespedes(int huespedes){
        almacen.set(2, huespedes);
    }
    
    public void setCiudad(String ciudad){
        almacen.set(3, ciudad);
    }
    
    public String getTipo(){
        if(almacen.get(0) == null){
            return "Cualquiera";
        }
        return (String) almacen.get(0);
    }
    
    public int getPrecio(){
        return (int) almacen.get(1);
    }
    
    public int getHuespedes(){
        return (int) almacen.get(2);
    }
    
    public String getCiudad(){
        if (almacen.get(3) == null){
            return "Cualquiera";
        }
        return (String) almacen.get(3);
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
