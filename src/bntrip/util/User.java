/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bntrip.util;

/**
 *
 * @author alvaro
 */
public class User{
    
    private String name;
    private String apellidos;
    private String nif;
    private String gender;
    private String email;
    private String password;
    
    public User(String name, String apellidos, String nif, String gender, String email, String pass){
        this.name = name;
        this.apellidos=apellidos;
        this.nif = nif;
        this.gender = gender;
        this.email = email;
        this.password = pass;
    }
    
    public String getNombre(){
        return name;
    }
    
    public boolean iniciaSesion(String user, String password){
        if (user.equals(name) && (this.password).equals(password)) return true;
        else return false;
    }
   
    
}
