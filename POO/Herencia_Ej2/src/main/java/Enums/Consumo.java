/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Enums;

/**
 *
 * @author diego
 */
public enum Consumo {
    A(1000), B(800), C(600), D(500), E(300), F(100);
    
    private final int precioF;
    
    Consumo(int precio){
        this.precioF = precio;
    }
    
    public int getPrecioF(){
        return precioF;
    }
}
