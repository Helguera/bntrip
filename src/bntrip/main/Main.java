/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bntrip.main;
import bntrip.modelo.Modelo;
import bntrip.util.Alojamiento;
import bntrip.util.Fechas;
import bntrip.util.Reserva;
import bntrip.vista.StateMachine.HomeUIStateMachine;
import bntrip.vista.StateMachine.LoginUIStateMachine;
import bntrip.vista.LoginWindow.LoginWindow;
import javax.swing.JOptionPane;


/**
 * Practica 2 - Interaccion Persona Computadora
 * @date    2017 April.
 * @author  Helguera Lopez, Javier   - javhelg
 * @author  Velasco Gil, Alvaro      - alvvela
 */
public class Main {
    private static HomeUIStateMachine  homeStateMachine;
    private static LoginUIStateMachine loginStateMachine;
    private static Modelo modelo;
    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("GTK+".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        /**
         * CASOS DISPONIBLES DE EJECUCION (n=argumento):
         *      *** Se recomienda ejecutar con argumento=0, para ver la aplicacion al completo***
         *      *** Para poder iniciar sesion con correo primero tienes que haberte creado una cuenta (los datos se guardan en un .txt)***
         *      
         *      n=0 -> Ejecucion "por defecto", todas las funcionalidades disponibles
         *      n=1 -> Ejecucion "Google", usuario registrado con Google
         *      n=2 -> Ejecucion "Facebook", usuario registrado con Facebook
         *      n=3 -> Logeado con Google, destinos sólo en Madrid, de 1 huésped y Habitacion Privada
         *      n=4 -> Logeado con Facebook, destinos solo en Murcia, de menos de 200€ y Casa Entera
         *      n=5 -> Sin estar logeado, 3 Huespedes en Cadiz, para cualquier alojamiento.
         *      n=6 -> Estando logeado con Google, reserva hecha en Barcelona
         *      n=7 -> Estando logeado con Facebook, alojamiento deseado en Barcelona
         */
        
        
        modelo = new Modelo();
        try{
            switch(args[0]){
            case "0":   
                break;
            case "1":   
                modelo.setLoged("Google");
                break;
            case "2":
                modelo.setLoged("Facebook");
                break;
            case "3":   
                modelo.setLoged("Google");
                modelo.setCiudad("Madrid");
                modelo.setHuespedes(1);
                modelo.setTipo("Habitacion Privada");
                break;
            case "4":   
                modelo.setLoged("Facebook");
                modelo.setCiudad("Murcia");
                modelo.setPrecio(200);
                modelo.setTipo("Casa Entera");
                break;
            case "5":
                modelo.setCiudad("Cadiz");
                modelo.setHuespedes(3);
                break;
            case "6":
                //Aqui va el ejemplo de una reserva
                
                modelo.setLoged("Google");
                
                Alojamiento prueba = new Alojamiento("Prueba", "Barcelona", 200, "Casa Entera", 2);
                modelo.selectAlojamiento(prueba);
                //Fechas fechas = new Fechas("Sat Apr 22 16:57:55 CEST 2017", "Sat Apr 28 16:57:55 CEST 2017");
                //Reserva reserva = new Reserva(prueba, fechas ,2);
                modelo.setReserva(prueba);
                modelo.setLoged("Google");
                modelo.setCiudad("Barcelona");
                break;
            case "7":
                //Aqui va el ejemplo de un deseado
                modelo.setLoged("Facebook");
                
                
                break;
            default:
                JOptionPane.showMessageDialog(null, "Ejecuta el programa con un argumento entre 0 y 6 (Ambos inclusive)", "Error", 0);
                System.exit(0);
                
        }
        }catch(Exception f){
            JOptionPane.showMessageDialog(null, "Ejecuta el programa con un argumento entre 0 y 6 (Ambos inclusive)", "Error", 0);
            System.exit(0);
        }
        
        homeStateMachine = new HomeUIStateMachine(modelo);
        
    }
    
    /**
     * 
     * @return LoginUIStateMachine 
     */
    public static LoginUIStateMachine getStateMachineLogin() {
        return loginStateMachine;
    }
    
    /**
     * 
     * @return HomeUIStateMachine 
     */
    public static HomeUIStateMachine getStateMachineHome() {
        return homeStateMachine;
    }
    
    /**
     * Permite hacer logout, cierra la maquina de estados del login y abre la del home
     */
    public static void logout() {
        loginStateMachine.close();
        homeStateMachine.close();
        homeStateMachine.start();
    }

    /**
     * Abre la maquina de estado de login para poder hacer login
     */
    public static void logeate() {
        homeStateMachine.close();
        loginStateMachine = new LoginUIStateMachine(modelo);
    }
    
    /**
     * Una vez el usuario se ha logeado, reabre la maquina de estado Home
     */
    public static void logeado(){
        loginStateMachine.close();
        homeStateMachine.close();
        homeStateMachine.start();
    }
    
    
}
