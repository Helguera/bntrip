/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bntrip.util;

import java.util.ArrayList;

/**
 * Practica 2 - Interaccion Persona Computadora
 * @date    2017 April.
 * @author  Helguera Lopez, Javier   - javhelg
 * @author  Velasco Gil, Alvaro      - alvvela
 */
public class Alojamiento {
    
    int maxHuespedes;
    double precio;
    String tipoHabitacion;
    String ciudad;
    String nombre;
    ArrayList<String> imagenes;
    
    /**
     * Constructor de la clase Alojamiento
     * @param nombre
     * @param ciudad
     * @param precio
     * @param tipoHabitacion
     * @param maxHuespedes 
     */
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
    
    /**
     * Metodo que establece 3 imagenes a un alojamiento.
     * @param image1 - direccion de la imagen.
     * @param image2 - direccion de la imagen.
     * @param image3 - direccion de la imagen.
     */
    public void setImagenes(String image1, String image2, String image3){
        imagenes.add(image1);
        imagenes.add(image2);
        imagenes.add(image3);
    }
    
    /**
     * Metodo que devuelve la direccion de la imagen siguiente.
     * @return image - direccion de la siguiente imagen.
     */
    public String getImagen(){
        String image = imagenes.get(0);
        imagenes.remove(0);
        imagenes.add(image);
        return image;
    }
    
    /**
     * Metodo que devuelve el nombre del alojamiento.
     * @return nombre
     */
    public String getNombre(){
        return nombre;
    }
    
}
