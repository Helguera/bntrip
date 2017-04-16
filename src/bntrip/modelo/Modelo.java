/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bntrip.modelo;

import java.util.ArrayList;

/**
 *
 * @author javier
 */
public class Modelo {
    private boolean isloged;
    private ArrayList almacen;
    
    public Modelo(){
        isloged = false;
        almacen = new ArrayList<Object>();
        //tipo, precio, huespedes, fecha in, fecha out, ciudad
        for (int i = 0; i < 5; i++) {
            almacen.add(null);
        }
        almacen.set(1, 100); 
    }
    
    public boolean getLoged(){
        return isloged;
    }
    
    public void setLoged(boolean b){
        isloged = b;
    }
    
    
}
