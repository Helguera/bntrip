/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bntrip.util;

/**
 *
 * @author alvaro velasco & javier helguera
 */
public class Alojamiento {
    
    int maxHuespedes;
    double precio;
    String tipoHabitacion;
    
    public Alojamiento(double precio, String tipoHabitacion, int maxHuespedes){
        this.precio = precio;
        this.tipoHabitacion = tipoHabitacion;
        this.maxHuespedes = maxHuespedes;
    }
    
    public double getPrecio(){
        return precio;
    }
    
    public String getTipoHabitacion(){
        return tipoHabitacion;
    }
    public int getMaxHuespedes(){
        return maxHuespedes;
    }
    
    
    
}
