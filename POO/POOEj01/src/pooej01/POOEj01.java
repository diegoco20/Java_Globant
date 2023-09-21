/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pooej01;

import Entidad.Mascota;
import java.util.Scanner;


/**
 *
 * @author diego
 */
public class POOEj01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        
        Mascota pelos = new Mascota();
        
        pelos.apodo = "Micho";
        pelos.color = "Naranja";
        pelos.edad = 2;
        pelos.tipo = "Gato";
        pelos.raza = "Michifu";
        
        System.out.println(pelos.apodo + " " + pelos.edad);
    }
    
}
