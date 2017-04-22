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
import bntrip.util.User;
import java.util.ArrayList;

/**
 * Practica 2 - Interaccion Persona Computadora
 * @date    2017 April.
 * @author  Helguera Lopez, Javier   - javhelg
 * @author  Velasco Gil, Alvaro      - alvvela
 */
public class Modelo {
    
    private String email;
    private String isloged;
    private Reserva almacenReserva ;
    private Deseado almacenDeseado;
    private Fechas fechas;
    private Alojamiento alojamientoSeleccionado;
    private ArrayList almacen;
    private User usuario;
    
    /**
     * Constructor del modelo
     */
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
    
    /**
     * Establece el tipo de alojamiento
     * @param tipo 
     */
    public void setTipo(String tipo){
        almacen.set(0,tipo);
    }
    
    /**
     * Establece el precio del alojamiento
     * @param precio 
     */
    public void setPrecio(int precio){
        almacen.set(1,precio);
    }
    
    /**
     * Establece el numero de huespedes
     * @param huespedes 
     */
    public void setHuespedes(int huespedes){
        almacen.set(2, huespedes);
    }
    
    /**
     * Establece la ciudad del elojamiento
     * @param ciudad 
     */
    public void setCiudad(String ciudad){
        almacen.set(3, ciudad);
    }
    
    /**
     * Devuelve el tipo de alojamiento
     * @return String tipo
     */
    public String getTipo(){
        if(almacen.get(0) == null){
            return "Cualquiera";
        }
        return (String) almacen.get(0);
    }
    
    /**
     * devuelve el precio del alojamiento
     * @return int precio
     */
    public int getPrecio(){
        return (int) almacen.get(1);
    }
    
    /**
     * devuelve los huespedes del alojamiento
     * @return int huespedes
     */
    public int getHuespedes(){
        if((int)almacen.get(2)==0){
            return 1;
        }
        return (int) almacen.get(2);
    }
    
    /**
     * devuelve la ciudad del alojamiento
     * @return String ciudad
     */
    public String getCiudad(){
        if (almacen.get(3) == null){
            return "Cualquiera";
        }
        return (String) almacen.get(3);
    }
    
    /**
     * Devuelve un booleano en funcion de si el usuario esta logeado o no
     * @return boolean isLoged
     */
    public String getLoged(){
        return isloged;
    }
    
    /**
     * Establece si el usuario esta logeado o no
     * @param str 
     */
    public void setLoged(String str){
        isloged = str;
    }
    
    /**
     * Devuelve el alojamiento selecciona
     * @return alojamiento
     */
    public Alojamiento getAlojamientoSeleccionado(){
        return alojamientoSeleccionado;
    }

    /**
     * Permite seleccionar el alojamiento
     * @param alojamiento 
     */
    public void selectAlojamiento(Alojamiento alojamiento) {
        alojamientoSeleccionado = alojamiento;
    }
    
    /**
     * Permite seleccionar la reserva
     * @param aS 
     */
    public void setReserva(Alojamiento aS){
        almacenReserva.setReserva(aS, fechas, (int)almacen.get(2));
    }
    
    /**
     * Devuelve la reserva 
     * @return reserva
     */
    public Reserva getAlmacenReserva() {
        return almacenReserva;
    }
    
    /**
     * Establece el alojamiento deseado
     * @param aS 
     */
    public void setDeseado(Alojamiento aS){
        almacenDeseado.setDeseado(aS, fechas);
    }
    
    /**
     * Elimina un alojamiento de deseados
     * @param aS 
     */
    public void removeDeseado(Alojamiento aS){
        almacenDeseado.removeDeseado(aS);
    }
    
    /**
     * Obtiene el array de alojamientos deseados
     * @return almacenDeseado
     */
    public Deseado getAlmacenDeseado(){
        return almacenDeseado;
    }
    
    /**
     * Devuelve las fechas de entrada y salida
     * @return Fechas
     */
    public Fechas getFechas(){
        return fechas;
    }
    
    /**
     * Establece las fechas de entrada y salida para un alojamiento
     * @param f 
     */
    public void setFechas(Fechas f){
        fechas = f;
    }
    
    /**
     * Reinicia los parametros de isLoged, almacenReserva y almacenDeseado
     */
    public void reboot(){
        isloged = "";
        almacenReserva = new Reserva();
        almacenDeseado = new Deseado();
        fechas = new Fechas();    
    }
    
    public void setUsuario(User usuario){
        this.usuario=usuario;
    }
    
    public User getUsuario(){
        return usuario;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public String getEmail(){
        return email;
    }    
}
