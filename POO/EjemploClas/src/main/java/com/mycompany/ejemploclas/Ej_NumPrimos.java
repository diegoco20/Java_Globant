/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemploclas;

/**
 *
 * @author diego
 */
public class Ej_NumPrimos {
    int mayor;
    int menor;
    
    public boolean esPrimo(int n){
        
        for (int i = 2; i<n-1; i++){
            if (n%i == 0){
                System.out.println("No es primo");
                return false;
            }
        }
        System.out.println("Es primo");
        return true;
    }
    public int factorial(int n){
        if (n==0){
            return 1;
        } else {
            return n*factorial(n-1);
        }
            
    }
    
    public int factorialYo(int n) {
        for (int i = n-1; i > 1; i--) {
            n *= i;
        }
        return n;
    }
    
    public void sumaPimpar(int a, int b){
        int par = 0, impar = 0;
        
        if (a < 0 || b  < 0){
            System.out.print("Números incorrectos");
            return;
        }
        
        if (b < a){
            int c = a;
            a = b;
            b = c;
        }
        
        for (int i = a; i <= b; i++){
            if (i % 2 == 0){
                par += i;
            } else {
                impar += i;
            }
        }
        
        System.out.println("Suma par = " + par);
        System.out.println("Suma impar = " + impar);
    }
    
    
    public Ej_NumPrimos() {
    }
    
    
}

