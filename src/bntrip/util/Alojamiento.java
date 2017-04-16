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
    String ciudad;
    String image1;
    String image2;
    String image3;
    
    public Alojamiento(String ciudad, double precio, String tipoHabitacion, int maxHuespedes){
        this.ciudad = ciudad;
        this.precio = precio;
        this.tipoHabitacion = tipoHabitacion;
        this.maxHuespedes = maxHuespedes;
    }
    public String getCiudad(){
        return ciudad;
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
    public void setImagenes(String image1, String image2, String image3){
        this.image1=image1;
        this.image2=image2;
        this.image3=image3;
    }
    
    
}
