/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bntrip.vista.LoginWindow;

import bntrip.main.Main;
import bntrip.modelo.Modelo;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
/**
 * Practica 2 - Interaccion Persona Computadora
 * @date    2017 April.
 * @author  Helguera Lopez, Javier   - javhelg
 * @author  Velasco Gil, Alvaro      - alvvela
 */
public class ControladorLoginWindow {
 LoginWindow miVista;
 Modelo miModelo;
 
 private File fichero;
 private ArrayList<String> users;
 private ArrayList<String> pass;
    
    /**
     * Constructor del controlador para la clase LoginWindow
     * @param miVista
     * @param miModelo 
     */
    public ControladorLoginWindow(LoginWindow miVista, Modelo miModelo){
        this.miVista = miVista;
        this.miModelo = miModelo;
        procesaInicio();
    }

    public void procesaAyuda(){
        
    }
    
    public void procesaRecupera(){
        
    }
    
    /**
     * Procesa el registro de un usuario
     */
    public void procesaRegistro(){
        Main.getStateMachineLogin().registro();
    }
    
    /**
     * Procesa el incio de sesion de un usuario
     * @param usuario
     * @param password
     * @return 
     */
    public boolean procesaInicioSesion(String usuario, String password){
        if(users.contains(usuario)){
            if(this.pass.get(users.indexOf(usuario)).equals(password)){
                miModelo.setEmail(usuario);
                miModelo.setLoged("Correo");
                return true;
            }else return false;
        }else return false;
    }
    
    /**
     * Procesa el inicio de sesion de un usuario
     */
    private void procesaInicio(){
        fichero = new File("./.data.txt"); 
        users = new ArrayList<String>();
        pass = new ArrayList<String>();
        try{
            FileReader fr = new FileReader(fichero);
            BufferedReader br = new BufferedReader(fr);
            String linea;
            int i = 1;

		while ((linea = br.readLine()) != null) {
			if(par(i)){
                            pass.add(linea);
                        }else users.add(linea);
                        i++;
		}
        }catch(Exception e){
            try{
                FileWriter fw = new FileWriter(fichero);
            }catch(Exception f){
                
            }
            
        }
    }
    
    /**
     * Devuelve si un numero es par o no xD
     * @param numero
     * @return boolean
     */
    private boolean par(int numero){
        if (numero%2==0){
            return true;
        }
        return false;
    }
    
    /**
     * 
     * @return 
     */
    public String isLoged(){
        return miModelo.getLoged();
    }
    
    public void setLogeado(String str){
        miModelo.setLoged(str);
        Main.logeado();
    } 
    
    public void procesaLogout(){
        Main.logout();
    }
    
    
 
 
 
}
