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

/**
 *
 * @author javier
 */
public class ControladorHomeWindow {
    
    private HomeWindow miVista;
    private Modelo miModelo;
    
    public ControladorHomeWindow(HomeWindow miVista, Modelo mMo){
        this.miVista = miVista;
        if (mMo == null) System.out.println("VAYA VAYA con el constructor");
        this.miModelo = mMo;
    }
    
    
    
    public void procesaLogin(){
        // Abrir ventana de inicio de sesion
        Main.logeate();
    }
    
    public void procesaInicioSesion(){
        if (miModelo == null) System.out.println("VAYA VAYA");
        else if(miModelo.getLoged().equals("")) this.procesaLogin();
        else miVista.abreUsuario();
    }
    
    public void procesaAlojamientoWindow(){
        Main.getStateMachineHome().alojamientoW();
    }
    
    public String isLoged(){
        return miModelo.getLoged();
    }
    
    public void seleccionaAlojamiento(Alojamiento alojamiento){
        miModelo.selectAlojamiento(alojamiento);
    }
    
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
    
    public void setFechas(String dateInicio, String dateFin){
        Fechas f = new Fechas (dateInicio, dateFin);
        miModelo.setFechas(f);
    }
    
    
}
