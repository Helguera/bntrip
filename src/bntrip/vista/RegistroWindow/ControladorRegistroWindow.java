/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bntrip.vista.RegistroWindow;

import bntrip.main.Main;
import bntrip.modelo.Modelo;
import bntrip.util.User;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 * Practica 2 - Interaccion Persona Computadora
 * @date    2017 April.
 * @author  Helguera Lopez, Javier   - javhelg
 * @author  Velasco Gil, Alvaro      - alvvela
 */
public class ControladorRegistroWindow {
    
    private RegistroWindow miVista;
    private Modelo miModelo;
    
    private File fichero;
    private ArrayList<String> users;
    private ArrayList<String> pass;
    
    /**
     * Constructor del Controlador para la clase RegistroWindow
     * @param miVista
     * @param miModelo 
     */
    public ControladorRegistroWindow(RegistroWindow miVista, Modelo miModelo){
        this.miVista = miVista;
        this.miModelo = miModelo;
        procesaInicio();
    }
    
    public void procesaCancelar(){
        Main.logout();
    }
    
    /**
     * Procesa el inicio, extrae los datos del fichero data.txt o lo genera si no existe
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
    
    private boolean par(int numero){
        if (numero%2==0){
            return true;
        }
        return false;
    }
    
    /**
     * Procesa el login de un usuario, comprueba los datos introducidos con los que hay en el fichero .data.txt
     * @param usuario
     * @param pass 
     */
    public void procesaLogin(String usuario, String pass){
        int posicion;
        if(users.contains(usuario)){
            if(this.pass.get(users.indexOf(usuario)).equals(pass)){
                miModelo.setEmail(usuario);
                miModelo.setLoged("Correo");
                Main.logeado();
            }else miVista.setRecoveryLabelText("Error, ha introducido algun dato incorrecto :(");
        }else miVista.setRecoveryLabelText("Error, ha introducido algun dato incorrecto :(");
    }
    
    /**
     * Añade los datos de un usuario al fichero .data.txt para que pueda logearse siempre que quiera
     * @param nombre
     * @param apellidos
     * @param nif
     * @param email
     * @param pass
     * @param sexo 
     */
    public void procesaRegistro (String nombre, String apellidos, String nif, String email, String pass, String sexo){
        User usuario = new User(nombre, apellidos, nif, sexo, email, pass);
        miModelo.setUsuario(usuario);
        users.add(email);
        this.pass.add(pass);
        guarda_datos();
        miModelo.setLoged("Correo");
        Main.logeado();
    }
    
    public void guarda_datos(){
        try{
            FileWriter fw = new FileWriter(fichero);
            for(int i = 0; i<users.size(); i++){
                fw.write(users.get(i)+"\n");
                fw.write(pass.get(i)+"\n");
            }
            fw.close();
        }catch(Exception w){  
        }
    }
    
    
    
}
