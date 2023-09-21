/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author diego
 */
public class EdificioDeOficinas extends Edificio{
    private int numOficinas;
    private int perOficina;
    private int numPisos;
    

    @Override
    public void calcularSuperficie() {
        System.out.println("Superficie: " + (largo*ancho));
    }

    @Override
    public void calcularVolumen() {
        System.out.println("Volumen: " + (largo*ancho*alto));
    }
    
}
