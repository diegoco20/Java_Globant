/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Enums;

/**
 *
 * @author diego
 */
public enum Fila {
     UNO(1), DOS(2), TRES(3), CUATRO(4), CINCO(5), SEIS(6), SIETE(7), OCHO(8);
    
    private final int valor;
    
    Fila (int valor){
        this.valor = valor;
    }
    
    public int getValor(){
        return valor;
    }
    
    
}
