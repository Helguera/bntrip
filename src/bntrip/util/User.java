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
    private String nif;
    private String gender;
    private String birthday;
    private String password;
    
    public User(String name, String nif, String gender, Fechas birthday){
        this.name = name;
        this.nif = nif;
        this.gender = gender;
        this.birthday = birthday.getBirthdayStr();
    }
    
    public String getNombre(){
        return name;
    }
    
    public boolean iniciaSesion(String user, String password){
        if (user.equals(name) && (this.password).equals(password)) return true;
        else return false;
    }
    
}
