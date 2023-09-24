/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciointegrador;

import java.util.Random;

/**
 *
 * @author diego
 */
public class EjercicioIntegrador {

    public static void main(String[] args) {
        System.out.println(generarAleatorios(10000));
    }
    
    
    public static boolean generarBooleano(double prob) {
        Random rand = new Random();
        double probabilidad = rand.nextDouble();  // Genera un número aleatorio entre 0 y 1
        
        return probabilidad <= prob;
    }
    
    public static double generarAleatorios(double n){
        int prob = 0;
        for (int i = 0; i < n; i++){
            if (generarBooleano(0.01)){
                prob++;
            }
        }
        return (prob/n);
    }
    
    
}
