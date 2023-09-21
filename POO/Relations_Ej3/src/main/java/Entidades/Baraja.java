/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author diego
 */
public class Baraja {
    private List<Carta> cartas = new ArrayList<>();

    public Baraja() {
        //cartas = new ArrayList<Carta>();
    }
    
    public Baraja(List<Carta> cartas){
        this.cartas = cartas;
    }
    
    public void agregarCarta(Carta carta){
        cartas.add(carta);
    }

    public List<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(List<Carta> cartas) {
        this.cartas = cartas;
    }
    
    
}
