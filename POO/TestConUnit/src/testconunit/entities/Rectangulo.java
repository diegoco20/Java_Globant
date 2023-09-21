/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testconunit.entities;

/**
 *
 * @author diego
 */
public class Rectangulo {
    //Atributos
    
    private double ancho;
    private double largo;
    private String color;
    private boolean active;
    
    
    // Constructores

    public Rectangulo(double ancho, double largo) {
        this.ancho = ancho;
        this.largo = largo;
        //this.color = "Rojo";
        this.active = true;
    }
    
    //Getters y Setters

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
    
    
}
