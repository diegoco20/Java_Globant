/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author diego
 */
public class Laberinto {
    private ArrayList<ArrayList<String>> laberinto;
    int[] salida;
    int[] llegada;
    int[] currentPos;

    public ArrayList<ArrayList<String>> getLaberinto() {
        return laberinto;
    }

    public void setLaberinto(ArrayList laberinto) {
        this.laberinto = laberinto;
    }

    public int[] getSalida() {
        return salida;
    }

    public void setSalida(int[] salida) {
        this.salida = salida;
    }

    public int[] getLlegada() {
        return llegada;
    }

    public void setLlegada(int[] llegada) {
        this.llegada = llegada;
    }

    public int[] getCurrentPos() {
        return currentPos;
    }

    public void setCurrentPos(int[] currentPos) {
        this.currentPos = currentPos;
    }
    
    
    public Laberinto() {
    }
    
    
}
