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
public class Matematica {
    Scanner sc = new Scanner(System.in);
    private double num1;
    private double num2;
    
    //Constructores
    public Matematica (){
        
    }
    
    public Matematica (double num1, double num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    
    

    //Getters

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }
    
    //Setters
    
    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    @Override
    public String toString() {
        return "Matematica{" + "num1=" + num1 + ", num2=" + num2 + '}';
    }
    
    
}
