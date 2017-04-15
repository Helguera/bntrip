/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bntrip.modelo;


/**
 *
 * @author javier
 */
public class Modelo {
    private boolean isloged;
    
    public Modelo(){
        isloged = false;
    }
    
    public boolean getLoged(){
        return isloged;
    }
    
    public void setLoged(boolean b){
        isloged = b;
    }
    
}
