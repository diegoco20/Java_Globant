/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Arreglo;
import java.util.Scanner;

/**
 *
 * @author diego
 */
public class ArregloService {
    Scanner sc = new Scanner(System.in);
    
    public Arreglo crearArreglo(){
        
        double [] arregloA = new double[50];
        double [] arregloB = new double[20];
        
        for (int i=0; i<50; i++){
            arregloA[i] = Math.round(Math.random()*100+1);
        }
        
        imprimirArreglo(arregloA);
        
        
        double [] arregloOrdenado = ordenarArreglo(arregloA);
        imprimirArreglo(arregloOrdenado);
        
        System.arraycopy(arregloOrdenado, 0, arregloB, 0, 10);
        for (int i = 10; i<20; i++){
            arregloB[i] = 0.5;
        }
        imprimirArreglo(arregloB);
        
        
        Arreglo ar = new Arreglo(arregloA, arregloB);
        return ar;
        
    }
    
    
    public double [] ordenarArreglo(double[] arreglo){
        double menor;
        int indiceMenor = 0;
        for (int i = 0; i<50; i++){
            menor=arreglo[i];
            for (int j = i; j<50; j++){
                
                if (menor>arreglo[j]){
                    menor = arreglo[j];
                    indiceMenor = j;
                }
            }
            arreglo[indiceMenor] = arreglo[i];
            arreglo[i] = menor;
        }
        return arreglo;
    }
    
    public void imprimirArreglo(double [] arreglo){
        System.out.println("Arreglo: ");
        for (int i = 0; i<arreglo.length; i++){
            System.out.print(" [" + arreglo[i] + "] ");
        }
        
        System.out.println("");
    }
}
