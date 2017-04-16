/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bntrip.util;

import java.util.ArrayList;

/**
 *
 * @author alvaro velasco & javier helguera
 */
public class Alojamiento {
    
    int maxHuespedes;
    double precio;
    String tipoHabitacion;
    String ciudad;
    String nombre;
    ArrayList<String> imagenes;
    
    public Alojamiento(String nombre, String ciudad, double precio, String tipoHabitacion, int maxHuespedes){
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.precio = precio;
        this.imagenes = new ArrayList<String>();
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
        imagenes.add(image1);
        imagenes.add(image2);
        imagenes.add(image3);
    }
    
    public String getImagen(){
        String image = imagenes.get(0);
        imagenes.remove(0);
        imagenes.add(image);
        return image;
    }
    
    public String getNombre(){
        return nombre;
    }
    
}
