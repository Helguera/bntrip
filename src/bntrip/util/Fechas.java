/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bntrip.util;

import static java.lang.Integer.parseInt;
import java.util.Date;

/**
 * Practica 2 - Interaccion Persona Computadora
 * @date    2017 April.
 * @author  Helguera Lopez, Javier   - javhelg
 * @author  Velasco Gil, Alvaro      - alvvela
 */
public class Fechas {
    
    private int inicio;
    private Date dateInicio;
    private String inicioStr_Date;
    private String inicioStr;
    
    private int fin;
    private Date dateFin;
    private String finStr;
    private String finStr_Date;
    private String birthday;
    
    /**
     * Constructor de la clase Fechas
     */
    public Fechas(){
        inicio = 0;
        fin = 0;
    }
    
    /**
     * @param date (JCalendar.getDate().toString())
     */
    public void setBirthday(String date){
        birthday = date2String(date);
    }
    
    /**
     * Devuelve dd/mm/aa
     * @return 
     */
    public String getBirthdayStr(){
        return birthday;
    }
    
    public Fechas(String dateInicio, String dateFin){
        if (dateInicio!=null && dateFin!=null){
            inicioStr_Date=dateInicio;
            finStr_Date = dateFin;
            this.inicio = generaFecha(dateInicio);
            this.fin = generaFecha(dateFin);
            inicioStr = date2String(dateInicio);
            finStr = date2String(dateFin);
            
        } else throw new IllegalArgumentException("Fechas no validas.");
    }    
    
    public void setInicio(String date){
        if (date!=null){
            dateInicio = new Date();
            this.inicio = generaFecha(date);
            this.inicioStr_Date = date;
            this.inicioStr = date2String(date);
        }
        else System.out.println("OJO CUIDADO QUE EL INICIO ES NULO!");
    }
    
    private int generaFecha(String d){
        String year = d.substring(25, 29);
        String mes = d.substring(3, 7);
        String day = d.substring(8, 10);
        String date = year;
            switch(mes){
                case " Jan": date = year+"01"+day; break;
                case " Feb": date = year+"02"+day; break;
                case " Mar": date = year+"03"+day; break;
                case " Apr": date = year+"04"+day; break;
                case " May": date = year+"05"+day; break;
                case " Jun": date = year+"06"+day; break;
                case " Jul": date = year+"07"+day; break;
                case " Aug": date = year+"08"+day; break;
                case " Sep": date = year+"09"+day; break;
                case " Oct": date = year+"10"+day; break;
                case " Nov": date = year+"11"+day; break;
                case " Dec": date = year+"12"+day; break;
            }
        return parseInt(date);
    }
    public void setFinal(String date){
        if (date!=null && this.inicio!=0 && (generaFecha(date)>=inicio)){
            fin = generaFecha(date);
            finStr = date2String(date);
            finStr_Date = date;
        } else System.out.println("OJO CUIDADO QUE LAS FECHAS NO SON CORRECTAS!");
    }
    
    public int getDiasReservados(){
        if (inicio!=0 && fin!=0) return (fin-inicio);
        else return 0;
    }
    
    /**
     * Devuelve la fecha de inicio estilo dd/mm.
     * @return String
     */
    public String getFechaInicioStr(){
        return inicioStr;
    }
    
    /**
     * Devuelve la fecha de fin estilo dd/mm.
     * @return String
     */
    public String getFechaFinStr(){
        return finStr;
    }
    
    public int getFechaInicio(){
        return inicio;
    }

    public int getFechaFin(){
        return fin;
    }
    
    public Date getDateInicio(){
        return dateInicio;
    }
    
    public Date getDateFin(){
        return dateFin;
    }
    
    /**
     * Convierte la fecha al estilo dd/mm.
     * @param Fecha estilo Date (String largo).
     * @return "dd/mm/aa".
     */
    private String date2String(String date){
        System.out.println(date);
        String fecha = ("" + date.substring(8, 10) + "/" + date.substring(4, 7));
        System.out.println(fecha);
        return fecha;
    }
}
