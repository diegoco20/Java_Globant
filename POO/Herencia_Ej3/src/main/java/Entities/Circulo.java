/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author diego
 */
public class Circulo implements CalculosFormas{
    private double diametro;
    
    @Override
    public void perimetro() {
        System.out.println(pi * diametro);
    }

    @Override
    public void area() {
         System.out.println(pi * (diametro/2)*(diametro/2));
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public Circulo(double diametro) {
        this.diametro = diametro;
    }

    public Circulo() {
    }
    
    
}
