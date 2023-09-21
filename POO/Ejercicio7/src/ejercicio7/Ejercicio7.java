/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7;

import Entidades.Persona;

/**
 *
 * @author diego
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Persona persona1 = new Persona();
        
        Persona persona2 = new Persona().crearPersona();
        
        System.out.println(persona1);
        System.out.println(persona2);
        System.out.println(persona2.calcularIMC(persona2));
        System.out.println(persona2.mayorEdad(persona2));
    }
    
}
