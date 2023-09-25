/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.Random;

/**
 *
 * @author diego
 */
public class Armadura {
    //Atributos de configuracion
    private String color_primario; 
    private String color_secundario;
    private String material;
    private int nivel_resistencia; //Depende del material
    
    
    //Atributos de estado
    private int salud; // 0- 100
    private double generador; // 0 - 900 000 000
    private double bateria; // % generador
    
    //Elementos de la armadura
    private Botas botas;
    private Guantes guantes;
    private Consola consola;
    private Sintetizador sintetizador;
    
    //Constructor 
    public Armadura() {
        this.color_primario = "Rojo";
        this.color_secundario = "Amarillo";
        this.nivel_resistencia = 80; ///Rockwell
        this.salud = 100;
        this.material = "Titanio";
        this.generador = 900_000_000;
        this.bateria = (generador / 900_000_000) * 100;
        this.botas = new Botas();
        this.guantes = new Guantes();
        this.consola = new Consola();
        this.sintetizador = new Sintetizador();
    } 
    
    //Métodos de Acciones 
    
    public void caminar(int tiempo_segundos){
        try {
            //Evalua si el elemento se puede utilizar 
            //Si está destruido no se puede usar más
            if (botas.destruido){
                throw new Exception("Las botas están destruidas...");
            }
            
            if (botas.esta_danado){
                throw new Exception("Las botas están dañadas...");
            }
            
            //Evalua que el tiempo ingresado no sea negativo 
            if (tiempo_segundos < 0){
                throw new Exception("Tiempo ingresado incorrecto, verificar parámetro...");
            }
            
            System.out.println("");
            System.out.println("Método caminar: <Activado>");
            System.out.println("");
            
            //Itera por cada segundo checando que la energía consumida por segundo esté disponible
            for (int i = 0; i < tiempo_segundos; i++) {
                if (botas.consumo > generador) {
                    throw new Exception("No hay energia para seguir corriendo.");
                }
                
                System.out.println("Caminando por: " + i + " segundos...");
                generador -= botas.consumo * 2;
                double consumo = botas.getConsumo_acumulado();
                botas.setConsumo_acumulado(consumo + botas.consumo); //Actualiza la energía del generador por segundo
                bateria = (generador / 900000000) * 100; // Actualiza el estado de la bateria
                
                //Guarda el consumo acumulado del método caminar
                double consumoAcumulado = botas.consumoCaminar; // Capturo el valor actual de caminar 
                botas.consumoCaminar = (consumoAcumulado + botas.getConsumo()); // Lo actualizo
            }
            
            // Se estima el evento daño del despositivo con una propabilidad de 30%
            if (probabilidadDanio()){
                //Ocurre daño del dispositivo
                System.out.println("Actualización, ocurrió un daño en el dispositivo");
                System.out.println("Intentando reparar el dispositivo");
                System.out.println("...");
                

                //Se estima el evento reparar dispositivo con una probabilidad de 40%                
                if (probabilidadReparar()){
                    //El evento ocurre por lo tanto se repara el dispositivo 
                    System.out.println("Reparación exitosa");
                    System.out.println("Estado de las botas: <Funcionando>");
                } else{
                    //El dispositivo queda dañado
                    System.out.println("No fue posible reparar el dispositivo");
                    System.out.println("Estado de las botas: <Dañado>");
                    botas.setEsta_danado(true);
                }
            }
            System.out.println("");
            System.out.println("Método caminar: <Desactivado>");
            System.out.println("");
            
        } catch (Exception e) {
            e.getMessage();
            System.out.println("Error interno del sistema...");
        }
    }
    
    public void correr(int tiempo_segundos) {
       
        try {
            //Evalua si el elemento se puede utilizar 
            //Si está destruido no se puede usar más
            if (botas.destruido){
                throw new Exception("Las botas están destruidas...");
            }
            if (botas.esta_danado){
                throw new Exception("Las botas están dañadas...");
            }
            
            //Evalua que el tiempo ingresado no sea negativo 
            if (tiempo_segundos < 0){
                throw new Exception("Tiempo ingresado incorrecto, verificar parámetro...");
            }
            
            System.out.println("");
            System.out.println("Método correr: <Activado>");
            System.out.println("");
            
            //Itera por cada segundo checando que la energía consumida por segundo esté disponible
            for (int i = 0; i < tiempo_segundos; i++) {
                if (botas.consumo > generador) {
                    throw new Exception("No hay energia para seguir corriendo.");
                }
                
                System.out.println("Corriendo por: " + i + " segundos...");
                generador -= botas.consumo * 2;
                double consumo = botas.getConsumo_acumulado();
                botas.setConsumo_acumulado(consumo + botas.consumo * 2); //Actualiza la energía del generador por segundo
                bateria = (generador / 900000000) * 100; // Actualiza el estado de la bateria
                
                //Guarda el consumo acumulado del método correr
                double consumoAcumulado = botas.consumoCorrer;
                botas.consumoCorrer = consumoAcumulado + botas.getConsumo() * 2;
            }
            
            if (probabilidadDanio()){
                //Ocurre daño del dispositivo
                System.out.println("Actualización, ocurrió un daño en el dispositivo");
                System.out.println("Intentando reparar el dispositivo");
                System.out.println("...");
                

                //Se estima el evento reparar dispositivo con una probabilidad de 40%                
                if (probabilidadReparar()){
                    //El evento ocurre por lo tanto se repara el dispositivo 
                    System.out.println("Reparación exitosa");
                    System.out.println("Estado de las botas: <Funcionando>"); 
                } else{
                    //El dispositivo queda dañado
                    System.out.println("No fue posible reparar el dispositivo");
                    System.out.println("Estado de las botas: <Dañado>");
                    botas.setEsta_danado(true);
                }
            }
            
            System.out.println("");
            System.out.println("Método correr: <Desactivado>");
            System.out.println("");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    //Métodos para aleatorizar evento de daño o reparación de los dispositivos 
    
    public boolean probabilidadDanio() {
        Random random = new Random();
        return random.nextDouble() < 0.3;
    }
    
    public boolean probabilidadReparar() {
        Random random = new Random();
        return random.nextDouble() < 0.4;
    }
    
    //Getters and Setters
    
    public int getNivel_resistencia() {
        return nivel_resistencia;
    }
    
    
    public void setNivel_resistencia(int nivel_resistencia) {
        this.nivel_resistencia = nivel_resistencia;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public double getGenerador() {
        return generador;
    }

    public void setGenerador(double generador) {
        this.generador = generador;
    }

    public double getBateria() {
        return bateria;
    }

    public void setBateria(double bateria) {
        this.bateria = bateria;
    }

    public Botas getBotas() {
        return botas;
    }

    public void setBotas(Botas botas) {
        this.botas = botas;
    }

    public Guantes getGuantes() {
        return guantes;
    }

    public void setGuantes(Guantes guantes) {
        this.guantes = guantes;
    }

    public Consola getConsola() {
        return consola;
    }

    public void setConsola(Consola consola) {
        this.consola = consola;
    }

    public Sintetizador getSintetizador() {
        return sintetizador;
    }

    public void setSintetizador(Sintetizador sintetizador) {
        this.sintetizador = sintetizador;
    }
}
