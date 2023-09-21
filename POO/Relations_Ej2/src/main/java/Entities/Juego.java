/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Juego {
    private List<Jugador> jugadores;
    private Revolver revolver;
    
    Scanner sc = new Scanner(System.in);
    
    //Métodos
    
    public void llenarJugadores(int n, Revolver r){
        int n_jugadores;
        if (n>6 || n<0){
            n_jugadores = 6;
        } else {
            n_jugadores = n;
        }
        
        for (int i =1; i<=n_jugadores; i++){
          Jugador jugador = new Jugador();
          jugador.setNombre("Jugador " + i);
          jugadores.add(jugador);
        }
    }
    
    public void ronda(Jugador jugador){
       jugador.disparo(revolver);
    }
    
    public void jugar(){
        System.out.println("Ingresa el número de jugadores");
        int n = sc.nextInt();
        
        System.out.println("Iniciando el juego....");
        System.out.println("");
        
        revolver.llenarRevolver();
        llenarJugadores(n, revolver);
        
        System.out.println("Llenando el revolver....");
        System.out.println("");
       
        for (int i = 1; i<7; i++) {
            
            Jugador player = jugadores.get((i%n));
            
            
            System.out.println("Turno de " + player.getNombre());
            System.out.println("");
            System.out.println("Disparando...");
            System.out.println("Posición actual: " + revolver.getCurrent_pos() + "   Posición agua: " + revolver.getAgua_pos());
            
            if (player.isMojado(revolver)){
                System.out.println("Pummmm......");
                System.out.println(player.getNombre() + " ha muerto");
                System.out.println("");
                System.out.println("Juego acabado....");
                break;
                
            } else {
                System.out.println("Click....");
                System.out.println("");
                System.out.println("Siguiente turno...");
                System.out.println("");
                player.disparo(revolver);
            }
            
        }
        
    }
    
    //Getters and Setters 

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Revolver getRevolver() {
        return revolver;
    }

    public void setRevolver(Revolver revolver) {
        this.revolver = revolver;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public Juego(List<Jugador> jugadores, Revolver revolver) {
        this.jugadores = jugadores;
        this.revolver = revolver;
    }
    
    
    
    
    
}
