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
public class Reserva{
    
    ArrayList<Alojamiento>  alojamientos;
    ArrayList<Fechas>       fechas;
    ArrayList<Integer>      huespedes;
    
    /**
     * Constructor de la clase Reserva
     */
    public Reserva(){
        alojamientos =  new ArrayList<Alojamiento>();
        fechas       =    new ArrayList<Fechas>();
        huespedes   =   new ArrayList<Integer>();
    }
    
    /**
     * Constructor de la clase Reserva
     * @param alojamiento
     * @param fechas
     * @param numHuespedes 
     */
    public Reserva(Alojamiento alojamiento, Fechas fechas, int numHuespedes){
        alojamientos    =   new ArrayList<Alojamiento>();
        this.fechas =   new ArrayList<Fechas>();
        huespedes   =   new ArrayList<Integer>();
        if (alojamiento!= null & fechas!=null && numHuespedes<=alojamiento.getMaxHuespedes()){
            alojamientos.add(alojamiento);
            this.fechas.add(fechas);
            huespedes.add(numHuespedes);
        }
    }
    
    /**
     * Método que realiza la reserva de un alojamiento para una fecha y un número de huespedes determinado.
     * @param alojamiento
     * @param fechas
     * @param numHuespedes 
     */
    public void setReserva(Alojamiento alojamiento, Fechas fechas, int numHuespedes){
        if (alojamiento!= null & fechas!=null && numHuespedes<=alojamiento.getMaxHuespedes()){
            alojamientos.add(alojamiento);
            this.fechas.add(fechas);
            huespedes.add(numHuespedes);
        }
    }
    /**
     * Ideal para usar a la vez que getFechasDeseadas, para obtener la fecha de ese alojamiento.
     * @param index
     * @return 
     */
    public Alojamiento getAlojamientoReservado(int index){
        if (index<alojamientos.size()) return alojamientos.get(index);
        else return null;
    }
    
    public Fechas getFechasReservadas(int index){
        if (index<fechas.size())return fechas.get(index);
        else return null;
    }
    
    public int getNumHuespedes(int index){
        if (index<=huespedes.size() && index>=0) return huespedes.get(index);
        else return 0;
    }
    public int getSize(){
        return huespedes.size();
    }
    
    /**
     * Elimina todos los datos sobre una reserva, dado el número de reserva.
     * @param index 
     */
    public void removeReservado(int index){
        if (index>0 && index<alojamientos.size()){
            alojamientos.remove(index);
            huespedes.remove(index);
            fechas.remove(index);
        }
    }
    
    /**
     * Dado un alojamiento, elimina la fecha, el numero de huespedes, y el alojamiento introducido.
     * @param alojamiento 
     */
    public void removeReservado(Alojamiento alojamiento){
        for (int i = 0 ; i<alojamientos.size(); i++) {
            if ((alojamientos.get(i).equals(alojamiento))){
                alojamientos.remove(i);
                fechas.remove(i);
                huespedes.remove(i);
            }
        }
    }
    
}
