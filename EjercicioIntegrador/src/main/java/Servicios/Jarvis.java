/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Armadura;
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
        if (arm.getBotas().getEsta_danado()){
            System.out.println("  Botas: <Dañadas>");
        } else {
            System.out.println("  Botas: <Funcionando>");
        }
        if (arm.getGuantes().estaDanado()){
            System.out.println("  Guantes: <Dañados>");
        } else {
            System.out.println("  Guantes: <Funcionando>");
        }
        if (arm.getConsola().estaDanado()){
            System.out.println("  Consola: <Dañada>");
        } else {
            System.out.println("  Consola: <Funcionando>");
        }
        if (arm.getSintetizador().estaDanado()){
            System.out.println("  Sintetizador: <Dañado>");
        } else {
            System.out.println("  Sintetizador: <Funcionando>");
        }
        
    }
    //Métodos para aleatorizar el posible arreglo o daño de los elementos durante su uso
    public boolean probabilidadDanio() {
        Random random = new Random();
        return arm.getBotas().getEsta_danado();
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
