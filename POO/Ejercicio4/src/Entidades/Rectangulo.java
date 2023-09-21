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
public class Rectangulo {
    Scanner leer = new Scanner(System.in);
    
    private int base;
    private int altura;
    
    //Constructores 
    
    public Rectangulo(){    
    }
    
    
    public Rectangulo(int base, int altura){
        System.out.println("Ingresa la base");
        base = leer.nextInt();
        if (base>0){
            this.base = base;
        }
        
        System.out.println("Ingresa la altura");
        altura = leer.nextInt();
        if (altura>0){
            this.altura = altura;
        }
    }
    
    // Getters and Setters

    public int getAltura() {
        return altura;
    }
    
    public int getBase(){
        return base;
    }
    
    public int getPerimetro(){
        return this.perimetro();
    }
    
    public void setBase(int base){
        System.out.println("Ingresa la base");
        this.base = base;
    }
    
    public void setAltura(int altura){
        System.out.println("Ingresa la altura");
        this.altura = altura;
    }
    
    //Métodos
      public int perimetro(){
        int perimetro = (base + altura)*2;
        return perimetro;
    }
      
    public int superficie(){
        int superficie = base*altura;
        return superficie; 
    }
   
    
    public void recDibujar(){
        System.out.println("");
        for (int i = 0; i<altura; i++){
            for (int j = 0; j<base; j++){
                if (i==0 || i==altura-1 || j==0){
                    System.out.print("*");
                } else if (j==base-1){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                
            }
            System.out.println("");
        }
        System.out.println("");
    }
}
