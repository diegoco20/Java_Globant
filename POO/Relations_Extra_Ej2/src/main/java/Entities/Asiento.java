/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author diego
 */
public class Asiento {
    private String fila;
    private int columna;
    private boolean ocupado = false;

    public String getFila() {
        return fila;
    }

    public void setFila(String fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }
    
    //Constructores

    public Asiento(String fila, int columna) {
        this.fila = fila;
        this.columna = columna;
    }
    
    
    @Override
    public String toString() {
        if (ocupado){
            return  columna + " "+ fila + " X";
        } else {
            return columna + " "+ fila + "  ";
        }
    }
    
    
    
}
