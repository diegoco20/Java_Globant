/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author diego
 */
public class Armadura {
    private String colorPrimario;
    private String colorSecundario;
    private double nivelReistencia;
    private String material;
    private int salud;
    private int bateria;
    private Botas botas;
    private Guantes guantes;
    private Sintetizador sintetizador;
    private Consola consola;
    
    
    public void caminar(int tiempo){
        
    }
    public void correr(int tiempo){
        
    }
    public void propulsar(int tiempo){}
    public void volar(int tiempo){}
    public void escribir(int tiempo){}
    public void leer(int tiempo){}

    public Armadura(String colorPrimario, String colorSecundario, double nivelReistencia, String material, int salud, int bateria, Botas botas, Guantes guantes, Sintetizador sintetizador, Consola consola) {
        this.colorPrimario = colorPrimario;
        this.colorSecundario = colorSecundario;
        this.nivelReistencia = nivelReistencia;
        this.material = material;
        this.salud = salud;
        this.bateria = bateria;
        this.botas = new Botas();
        this.guantes = new Guantes();
        this.sintetizador = new Sintetizador();
        this.consola = new Consola();
    }
    
    
}
