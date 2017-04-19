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
    private String isloged;
    private Reserva almacenReserva ;
    private Deseado almacenDeseado;
    private Fechas fechas;
    private Alojamiento alojamientoSeleccionado;
    private ArrayList almacen;
    
    public Modelo(){
        almacen = new ArrayList<Object>();
        //tipo, precio, huespedes, ciudad
        for (int i = 0; i < 4; i++) {
            almacen.add(null);
        }
        almacen.set(1, 200);
        almacen.set(2,1);
        
        isloged = "";
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
        System.out.println((int)almacen.get(2));
        System.out.print("EASIFONIDFONS");
        if((int)almacen.get(2)==0){
            return 1;
        }
        return (int) almacen.get(2);
    }
    
    public String getCiudad(){
        if (almacen.get(3) == null){
            return "Cualquiera";
        }
        return (String) almacen.get(3);
    }
    
    
    
    public String getLoged(){
        return isloged;
    }
    
    public void setLoged(String str){
        isloged = str;
    }
    
    public Alojamiento getAlojamientoSeleccionado(){
        return alojamientoSeleccionado;
    }

    public void selectAlojamiento(Alojamiento alojamiento) {
        alojamientoSeleccionado = alojamiento;
    }
    
    public void setReserva(Alojamiento aS){
        almacenReserva.setReserva(aS, fechas, (int)almacen.get(2));
    }
    
    public Reserva getAlmacenReserva() {
        return almacenReserva;
    }
    
    public Fechas getFechas(){
        return fechas;
    }
    
    public void setFechas(Fechas f){
        fechas = f;
    }
    
    public void reboot(){
        isloged = "";
        almacenReserva = new Reserva();
        almacenDeseado = new Deseado();
        fechas = new Fechas();    
    }
}
