/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

import Entidades.Rectangulo;

/**
 *
 * @author diego
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Rectangulo rec1 = new Rectangulo();
        Rectangulo rec2 = new Rectangulo(1, 2);
        
        System.out.println(rec2.getAltura());
        rec2.recDibujar();
        System.out.println("Perímetro: " + rec2.perimetro());
        System.out.println("Superficie: " + rec2.superficie());
    }
    
    
}
