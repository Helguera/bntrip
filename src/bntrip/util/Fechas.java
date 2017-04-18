/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bntrip.util;

import static java.lang.Integer.parseInt;
import java.util.Date;

/**
 *
 * @author alvaro velasco & javier helguera
 */
public class Fechas {
    
    private int inicio;
    private String inicioStrDate;
    private String inicioStr;
    private int fin;
    private String finStr;
    private String finStrDate;
    
    public Fechas(){
        inicio = 0;
        fin = 0;
    }
    
    public Fechas(String inicio, String fin){
        if (inicio!=null && fin!=null){
            inicioStrDate=inicio;
            finStrDate = fin;
            setInicio(inicio);
            setFinal(fin);
        } else throw new IllegalArgumentException("Fechas no validas.");
    }    
    
    public void setInicio(String date){
        if (date!=null) inicio = generaFecha(date);
        else System.out.println("OJO CUIDADO QUE EL INICIO ES NULO!");
    }
    
    private int generaFecha(String d){
        String year = d.substring(25, 29);
        String mes = d.substring(3, 7);
        String day = d.substring(8, 10);
        String inicio = year;
            switch(mes){
                case " Jan": inicio = year+"01"+day; break;
                case " Feb": inicio = year+"02"+day; break;
                case " Mar": inicio = year+"03"+day; break;
                case " Apr": inicio = year+"04"+day; break;
                case " May": inicio = year+"05"+day; break;
                case " Jun": inicio = year+"06"+day; break;
                case " Jul": inicio = year+"07"+day; break;
                case " Aug": inicio = year+"08"+day; break;
                case " Sep": inicio = year+"09"+day; break;
                case " Oct": inicio = year+"10"+day; break;
                case " Nov": inicio = year+"11"+day; break;
                case " Dec": inicio = year+"12"+day; break;
            }
        return parseInt(inicio);
    }
    public void setFinal(String date){
        if (date!=null && inicio!=0 && (generaFecha(date)>=inicio)){
            fin = generaFecha(date);
        } else System.out.println("OJO CUIDADO QUE LAS FECHAS NO SON CORRECTAS!");
    }
    
    public int getDiasReservados(){
        if (inicio!=0 && fin!=0) return (fin-inicio);
        else return 0;
    }
    
    /**
     * Devuelve la fecha de inicio estilo dd/mm/aa.
     * @return String
     */
    public String getFechaInicioStr(){
        return date2String(this.inicioStrDate);
    }
    
    /**
     * Devuelve la fecha de fin estilo dd/mm/aa.
     * @return String
     */
    public String getFechaFinStr(){
        return date2String(this.finStrDate);
    }
    
    public int getFechaInicio(){
        return inicio;
    }

    public int getFechaFin(){
        return fin;
    }
    private String date2String(String a){
        return ("" + a.substring(8, 10) + "/" + a.substring(3, 7) + a.substring(25,29));
    }
}
