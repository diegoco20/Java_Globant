/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author diego
 */
public class CircunService {
    
    Scanner leer = new Scanner(System.in);
    //Instancio la clase Circunferencia
    
    
    //Defino los métodos
    
    /**
     * 
     * @return Circunferencia
     */
    
    
    public Circunferencia crearCir(){
        System.out.println("Ingresa el valor del radio:");
        double radio = leer.nextDouble();
        
        while (radio<0) {
            System.out.println("El radio no puede ser negativo intenta nuevamente");
            radio = leer.nextDouble();
        } 
        
        Circunferencia cir = new Circunferencia(radio);
        return cir;
    }
    
    public void calculoArea(){
        
    }
}
    

