/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Armadura;
import Entidades.ElementosArmadura;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author diego
 */
public class Jarvis {
   public Armadura arm=new Armadura();
   
    public void caminar(int tiempo_segundos) {
        
    }

    public void correr(int tiempo_segundos) {

        try {
            //Evalua si el elemento se puede utilizar 
            if (arm.getBotas().getEsta_danado()) {
                throw new Exception("Las botas están dañadas...");
            }
            
            //Evalua que el tiempo ingresado no sea negativo 
            if (tiempo_segundos < 0) {
                throw new Exception("Tiempo ingresado incorrecto, verificar parámetro...");
            }
            
            //Itera por cada segundo checando que la energía consumida por segundo esté disponible
            for (int i = 0; i < tiempo_segundos; i++) {
                if (arm.getBotas().getConsumo() > arm.getGenerador()) {
                    throw new Exception("No hay energia para seguir corriendo.");
                }

                System.out.println("Corriendo por: " + i + " segundos...");
                
                double consumo = arm.getGenerador();
                arm.setGenerador(consumo - arm.getBotas().getConsumo()*2); //Actualiza la energía del generador por segundo
                arm.setBateria(arm.getGenerador()/900_000_000*100); // Actualiza el estado de la bateria
                
                //Guarda el consumo acumulado del método correr
                double consumoAcumulado = arm.getBotas().getConsumo_acumulado();
                arm.getBotas().setConsumo_acumulado(consumoAcumulado + arm.getBotas().getConsumo() * 2);
                
            }

        } catch (Exception e) {
            e.getMessage();
            System.out.println("Error interno del sistema...");
        }
    }

    /**
     * Estado de la Batería Hacer un método para que JARVIS informe el estado de
     * la batería en porcentaje a través de la consola. Poner como carga máxima
     * del reactor el mayor float posible. Ejecutar varias acciones y mostrar el
     * estado de la misma.
     */
    
    //Métodos de Estado
    public void MostrarEstadoBateria() {
        System.out.print("Estado de la bateria: ");
        System.out.println("< " + arm.getBateria() + "% >");
    }
    
    public void MostrarEstadoGeneral(){
        System.out.println("");
        System.out.println("Mostrando el estado general... ");
        System.out.println("");
        System.out.println("  Salud : " + arm.getSalud());
        System.out.println("  Generador: " + arm.getGenerador());
        System.out.println("  Bateria: " + arm.getBateria() + "%");
        System.out.println("");
        
        ArrayList<ElementosArmadura> dispositivos = new ArrayList<>();
        dispositivos.add(arm.getBotas());
        dispositivos.add(arm.getGuantes());
        dispositivos.add(arm.getConsola());
        dispositivos.add(arm.getSintetizador());
        
        
        for (ElementosArmadura dispositivo : dispositivos){
            if (dispositivo.getDestruido()){
                System.out.println(dispositivo.getDispositivo() + " : <Destruido>");
            } else {
                if (dispositivo.estaDanado()){
                    System.out.println(dispositivo.getDispositivo() + " : <Dañado>");
                } else {
                    System.out.println(dispositivo.getDispositivo() + " : <Funcionando>");
                }
            }       
        }
        
    }
    
    public void repararDispositivo(ElementosArmadura dispositivo){
        try {
            System.out.println("Intentando reparar dispositivo...");
            if(!dispositivo.estaDanado()){
                throw new Exception ("El dispositivo no está dañado...");
            } else {
                if (probabilidadReparacion()){
                   dispositivo.setEstaDanado(false);
                   System.out.println("Dispositivo reparado exitosamente");
                   System.out.println(dispositivo.getDispositivo() + ": <Funcionando>" );
                } else {
                   System.out.println("Error al reparar el dispositivo");
                }
            }
            
        } catch (Exception e) {
            e.getMessage();
        }
    }
    
    
    public void revisarDispositivos(){
        ArrayList<ElementosArmadura> dispositivos = new ArrayList<>();
        dispositivos.add(arm.getBotas());
        dispositivos.add(arm.getGuantes());
        dispositivos.add(arm.getConsola());
        dispositivos.add(arm.getSintetizador());
        
        
        for (ElementosArmadura dispositivo : dispositivos){
            try {
                if (dispositivo.getDestruido()){
                    System.out.println(dispositivo.getDispositivo() + ": <Destruido> ");
                    throw new Exception();
                }
                if (dispositivo.estaDanado()) {
                    System.out.println(dispositivo.getDispositivo() + ": <Dañado> ");
                    //Se intenta reparar el dispositivo iterativamente con una probabilidad del 30% de daño total.                
                    while (dispositivo.estaDanado()) {
                        System.out.println("Intentando reparar el dispositivo...");

                        //Se estima la probabilidad del evento destruir dispositivo 
                        if (probabilidadDanio()) {
                            dispositivo.setDestruido(true); //El evento ocurre se destruye dispositivo
                            System.out.println("Error en el sistema...");
                            throw new Exception("El dispositivo se ha destruido");
                        } else {
                            repararDispositivo(dispositivo);
                        }
                    }
                } else {
                    System.out.println(dispositivo.getDispositivo() + ": <Funcionando> ");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    //Métodos para aleatorizar el posible arreglo o daño de los elementos durante su uso
    public boolean probabilidadDanio() {
        Random random = new Random();
        return random.nextDouble() < 0.3;
    }

    public boolean probabilidadReparacion() {
        Random random = new Random();
        return random.nextDouble() < 0.4;
    }
    
    
    //Constructor
    public Jarvis () {
    }
    
    //Getters and Setters

    public Armadura getArm() {
        return arm;
    }

    public void setArm(Armadura arm) {
        this.arm = arm;
    }
}
