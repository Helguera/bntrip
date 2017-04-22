/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bntrip.util;

/**
 * Practica 2 - Interaccion Persona Computadora
 * @date    2017 April.
 * @author  Helguera Lopez, Javier   - javhelg
 * @author  Velasco Gil, Alvaro      - alvvela
 */
public class User{
    
    private String name;
    private String apellidos;
    private String nif;
    private String gender;
    private String email;
    private String password;
    
    /**
     * Constructor de la clase Usuario
     * @param name
     * @param apellidos
     * @param nif
     * @param gender
     * @param email
     * @param pass 
     */
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
    
    /**
     * Metodo para iniciar sesion a un determinado usuario
     * @param user
     * @param password
     * @return 
     */
    public boolean iniciaSesion(String user, String password){
        if (user.equals(name) && (this.password).equals(password)) return true;
        else return false;
    }
    
    public String getEmail(){
        return email;
    }
   
    
}
