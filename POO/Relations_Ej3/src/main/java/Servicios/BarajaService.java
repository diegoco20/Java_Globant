/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Baraja;
import Entidades.Carta;
import Enums.Numeros;
import Enums.Palos;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 *
 * @author diego
 */
public class BarajaService {
    private Baraja baraja;
    private Baraja seleccionadas;
    private Baraja disponibles;
    
    
    //Métodos
    public void barajar(){
        Random random = new Random();
        Carta carta;
        Carta carta_index;
        int indice;
        for (int i=baraja.getCartas().size()-1; i>0; i--){
            
            indice = random.nextInt(i+1);
            carta = baraja.getCartas().get(i);
            carta_index = baraja.getCartas().get(indice);
            
            baraja.getCartas().set(i, carta_index);
            baraja.getCartas().set(indice, carta);
        }
            
        //Collections.shuffle(baraja.getCartas());
    }
    
    public void imprimirBaraja(){
        String espacios = " ";
        for (int i=0; i<baraja.getCartas().size(); i++){
            System.out.print(espacios);
            System.out.println(baraja.getCartas().get(i));
            espacios += " ";
        }
    }
    
    public void rellenarBaraja(){
        
        for (Palos palo : Palos.values()){
            for (Numeros numero : Numeros.values()){
                Carta carta = new Carta(numero.getValor() ,palo.toString());
                baraja.getCartas().add(carta);
            }
        }
    }
    
    
    public void siguienteCarta(){
        if(!baraja.getCartas().isEmpty()){
            int indice = baraja.getCartas().size()-1;
            Carta siguiente = baraja.getCartas().get(indice);
            seleccionadas.getCartas().add(siguiente);
            baraja.getCartas().remove(indice);
            System.out.println(siguiente);
        } else {
            System.out.println("La baraja está vacía");
        }
    }
    
    
    public int cartasDisponibles(){
        System.out.println("Cartas disponibles: " + baraja.getCartas().size());
        return baraja.getCartas().size();
    }
       
    public void darCartas(int n){
        if (!(cartasDisponibles()<n)){
            System.out.println("Cartas entregadas: ");
            for (int i=0; i<n ; i++){
                siguienteCarta();
            }
        } else {
            System.out.println("Cartas disponibles no son suficientes");
        }
    }
    
    public void cartasMonton(){
        if (!seleccionadas.getCartas().isEmpty()){
            System.out.println("Cartas del monton: ");
            for (int i =0; i< seleccionadas.getCartas().size(); i++){
                System.out.println(seleccionadas.getCartas().get(i));
            }
        }
    }
    
    //Constructores 
    public BarajaService() {
        baraja = new Baraja();
        seleccionadas = new Baraja();
        disponibles = new Baraja();
        
    }

    public BarajaService(Baraja baraja) {
        this.baraja = baraja;
    }

    public Baraja getBaraja() {
        return baraja;
    }

    public void setBaraja(Baraja baraja) {
        this.baraja = baraja;
    }
    
    
    
    
}
