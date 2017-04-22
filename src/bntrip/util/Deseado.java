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
public class Deseado {
    ArrayList<Alojamiento>  deseados;
    ArrayList<Fechas>       fechas;
    
    /**
     * Constructor de la clase Deseado (tiene sobrecarga de constructores)
     */
    public Deseado(){
        deseados =  new ArrayList<Alojamiento>();
        fechas =    new ArrayList<Fechas>();
    }
    
    /**
     * Constructor de la clase Deseado
     * @param alojamiento
     * @param fechas 
     */
    public Deseado(Alojamiento alojamiento, Fechas fechas){
        deseados    =   new ArrayList<Alojamiento>();
        this.fechas =   new ArrayList<Fechas>();
        if (alojamiento!= null & fechas!=null){
            deseados.add(alojamiento);
            this.fechas.add(fechas);
        }
    }
    
    public void setDeseado(Alojamiento alojamiento, Fechas fechas){
        if (alojamiento!= null & fechas!=null){
            deseados.add(alojamiento);
            this.fechas.add(fechas);
        }
    }
    /**
     * Ideal para usar a la vez que getFechasDeseadas, para obtener la fecha de ese alojamiento.
     * @param numero
     * @return 
     */
    public Alojamiento getAlojamientoDeseado(int numero){
        if (numero<deseados.size()) return deseados.get(numero);
        else return null;
    }
    
    public Fechas getFechasDeseada(int numero){
        if (numero<fechas.size())return fechas.get(numero);
        else return null;
    }
    
    public void removeDeseado(Alojamiento alojamiento){
        for (int i = 0 ; i<deseados.size(); i++) {
            if ((deseados.get(i).equals(alojamiento))){
                deseados.remove(i);
                fechas.remove(i);
            }
        }
    }
    
    public void removeDeseado(int index){
        deseados.remove(index);
        fechas.remove(index);
    }
    
    public int getSize(){
        return deseados.size();
    }
    
    
}
