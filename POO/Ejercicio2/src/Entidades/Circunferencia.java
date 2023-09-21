/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Circunferencia {
    
    Scanner leer = new Scanner(System.in);
    private double radio;
    
    //Creo los constructores
    
    //Constructor vacío
    public Circunferencia(){
    }
    
    //Constructor con radio como argumento
    public Circunferencia(double radio){
        this.radio = radio;
    }
    
    //Métodos getters and setters
    // Get

    public double getRadio() {
        return radio;
    }
    
    //Set

    public void setRadio(double radio) {
        this.radio = radio;
    }

    //Método calcular área
    
    public void area(){
        System.out.println("Área: " + this.radio*this.radio*Math.PI + "cm2");
    } 
    
    public void perimetro(){
        System.out.println("Perímetro: " + this.radio*2*Math.PI + "cm");
    }
    @Override
    public String toString() {
        return "Circunferencia {" + "radio=" + radio + '}';
    }
    
        
}
