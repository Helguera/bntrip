/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bntrip.vista;

import bntrip.main.Main;
import bntrip.modelo.Modelo;
import bntrip.util.Alojamiento;
import bntrip.util.Fechas;
import com.toedter.calendar.JDateChooser;

/**
 * Practica 2 - Interaccion Persona Computadora
 * @date 2017 April
 * @author  Helguera Lopez, Javier   - javhelg
 *          Velasco Gil, Alvaro      - alvvela
 */
public class ControladorHomeWindow {
    
    private HomeWindow miVista;
    private Modelo miModelo;
    
    /**
     * Implementacion del controlador del Home.
     * @param miVista [HomeWindow]  Vista que tiene que manejar.
     * @param mModelo [Modelo]      Modelo del programa.
     */
    public ControladorHomeWindow(HomeWindow miVista, Modelo miModelo){
        this.miVista = miVista;
        if (miModelo == null) System.out.println("VAYA VAYA con el constructor");
        this.miModelo = miModelo;
    }
    
    /**
     * Llama a la maquina de estado para el cambio de ventana.
     */
    public void procesaLogin(){
        // Abrir ventana de inicio de sesion
        Main.logeate();
    }
    
    /**
     * Abre una ventana o cambia de máquina de estado en funcion de si esta
     * registrado o no.
     */
    public void procesaInicioSesion(){
        if (miModelo == null) System.out.println("VAYA VAYA");
        else if(miModelo.getLoged().equals("")) this.procesaLogin();
        else{
            miVista.abreUsuario();
            miVista.setVisible(false);
        }
    }
    
    public void setFechasMinimas(JDateChooser entrada, JDateChooser salida){
        
        
        
    }
    
    /**
     * Abre una ventana con información sobre el alojamiento seleccionado.
     */
    public void procesaAlojamientoWindow(){
        Main.getStateMachineHome().alojamientoW();
    }
    
    /**
     * Devuelve un String con informacion de como ha sido el login.
     * @return "Google", "Facebook", "Correo", "".
     */
    public String isLoged(){
        return miModelo.getLoged();
    }
    
    /**
     * Pasa al modelo información sobre el alojamiento seleccionado.
     * @param alojamiento [bntrip.util.Alojamiento]
     */
    public void seleccionaAlojamiento(Alojamiento alojamiento){
        miModelo.selectAlojamiento(alojamiento);
    }
    
    /**
     * Restringe los alojamientos disponibles para una información dada.
     * @param tipo      [String]
     * @param precio    [int]
     * @param huespedes [int]
     * @param ciudad    [String]
     */
    public void actualizarTodo(String tipo, int precio, int huespedes, String ciudad){
        miVista.eliminaEtiqueta();
        miVista.activaTodo();
        actualizarTipo(tipo);
        actualizarPrecio(precio);
        actualizarHuespedes(huespedes);
        actualizarCiudad(ciudad);
        if(miVista.getHayAlojamientos()==false){
            miVista.noAlojamientos();
        }
        miVista.repaint_home();
    }
    
    /**
     * Dado un tipo de alojamiento, restringe los alojamientos visibles.
     * @param tipo [String] "Casa Entera", "Cualquiera", "Habitacion Compartida", "Habitacion Privada".
     */
    public void actualizarTipo(String tipo){
        miModelo.setTipo(tipo);
        //El 1 desactiva
        switch(tipo){
            case("Casa Entera"):
                int [] tipo_aloj0 = {1,0,0,1,0,1,1,1};
                miVista.activaAlojamientos(tipo_aloj0);
                break;
            case("Cualquiera"):
                int [] tipo_aloj1 = {0,0,0,0,0,0,0,0};
                miVista.activaAlojamientos(tipo_aloj1);
                break;
            case("Habitacion Privada"):
                int [] tipo_aloj2 = {0,1,1,0,1,1,1,0};
                miVista.activaAlojamientos(tipo_aloj2);
                break;
            case("Habitacion Compartida"):
                int [] tipo_aloj3 = {1,1,1,1,1,0,0,1};
                miVista.activaAlojamientos(tipo_aloj3);
                break;
        }
    }
    
    /**
     * Dado un precio seleccionado, restringe los alojamientos visibles.
     * @param precio [int]
     */
    public void actualizarPrecio(int precio){
        miModelo.setPrecio(precio);
        if(precio<30){
            int [] tipo_aloj0 = {1,1,1,1,1,1,1,1};
            miVista.activaAlojamientos(tipo_aloj0); 
        }else if(precio<=34){
            int [] tipo_aloj1 = {1,1,0,1,1,1,1,0};
            miVista.activaAlojamientos(tipo_aloj1);
        }else if(precio<=64){
            int [] tipo_aloj2 = {1,1,0,1,1,0,1,0};
            miVista.activaAlojamientos(tipo_aloj2);
        }else if(precio<=149){
            int [] tipo_aloj3 = {0,1,0,0,1,0,1,0};
            miVista.activaAlojamientos(tipo_aloj3);
        }else if(precio<=199){
            int [] tipo_aloj3 = {0,1,0,0,0,0,1,0};
            miVista.activaAlojamientos(tipo_aloj3);
        }else {
            int [] tipo_aloj4 = {0,0,0,0,0,0,0,0};
            miVista.activaAlojamientos(tipo_aloj4);
        }
    }
    
    /**
     * Dado un numero de huespedes que realizaran la reserva, restringe los alojamientos.
     * @param huespedes [int]   (1, 2, 3, 4)
     */
    public void actualizarHuespedes(int huespedes){
        miModelo.setHuespedes(huespedes);
        switch(huespedes){
            case(1):
                int [] tipo_aloj0 = {0,0,0,0,0,0,0,0};
                miVista.activaAlojamientos(tipo_aloj0);
                break;
            case(2):
                int [] tipo_aloj1 = {0,0,0,0,0,0,1,1};
                miVista.activaAlojamientos(tipo_aloj1);
                break;
            case(3):
                int [] tipo_aloj2 = {1,1,0,1,0,1,1,1};
                miVista.activaAlojamientos(tipo_aloj2);
                break;
            case(4):
                int [] tipo_aloj3 = {1,1,0,1,1,1,1,1};
                miVista.activaAlojamientos(tipo_aloj3);
                break;
        }
    }
    
    /**
     * Dada una ciudad, restringe los alojamientos.
     * @param ciudad [String]   "Madrid", "Barcelona", "Cadiz", "Murcia", "Cualquiera".
     */
    public void actualizarCiudad(String ciudad){
        miModelo.setCiudad(ciudad);
        switch(ciudad){
            case("Madrid"):
                int [] tipo_aloj0 = {0,1,1,1,1,0,1,1};
                miVista.activaAlojamientos(tipo_aloj0);
                break;
            case("Barcelona"):
                int [] tipo_aloj1 = {1,0,1,1,1,1,0,1};
                miVista.activaAlojamientos(tipo_aloj1);
                break;
            case("Murcia"):
                int [] tipo_aloj2 = {1,1,1,1,0,1,1,0};
                miVista.activaAlojamientos(tipo_aloj2);
                break;
            case("Cadiz"):
                int [] tipo_aloj3 = {1,1,0,0,1,1,1,1};
                miVista.activaAlojamientos(tipo_aloj3);
                break;
            case("Cualquiera"):
                int [] tipo_aloj4 = {0,0,0,0,0,0,0,0};
                miVista.activaAlojamientos(tipo_aloj4);
                break;
        }
    }
    
    /**
     * Metodo que pasa al modelo las fechas selecionadas.
     * Son de tipo java.util.Date pasadas con toString().
     * @param dateInicio    [String]
     * @param dateFin       [String]
     */
    public void setFechas(String dateInicio, String dateFin){
        Fechas f = new Fechas (dateInicio, dateFin);
        miModelo.setFechas(f);
    }
    
    
}
