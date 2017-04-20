/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bntrip.vista;

import bntrip.main.Main;
import bntrip.modelo.Modelo;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 *
 * @author javier
 */
public class ControladorRegistroWindow {
    
    private RegistroWindow miVista;
    private Modelo miModelo;
    
    private File fichero;
    private ArrayList<String> users;
    private ArrayList<String> pass;
    
    public ControladorRegistroWindow(RegistroWindow miVista, Modelo miModelo){
        this.miVista = miVista;
        this.miModelo = miModelo;
    }
    
    public void procesaCancelar(){
        Main.logout();
    }
    
    public void procesaInicio(){
        fichero = new File("./.data.txt");
        
        
        users = new ArrayList<String>();
        pass = new ArrayList<String>();
        try{
            FileReader fr = new FileReader(fichero);
            BufferedReader br = new BufferedReader(fr);
            String linea;
            int i = 1;

		while ((linea = br.readLine()) != null) {
                        System.out.println(linea);
			if(par(i)){
                            users.add(linea);
                        }else pass.add(linea);
                        i++;
		}
        }catch(Exception e){
            
        }
    }
    
    public boolean par(int numero){
        if (numero%2==0){
            return true;
        }
        return false;
    }
    
    public void procesaLogin(String usuario, String pass){
        int posicion;
        if(users.contains(usuario)){
            if(this.pass.get(users.indexOf(usuario)).equals(pass)){
                miModelo.setLoged("Correo");
            }
        }else miVista.setRecoveryLabelText("Error, ¿no recuerda su contraseña?");
    }
    
    
    
}
