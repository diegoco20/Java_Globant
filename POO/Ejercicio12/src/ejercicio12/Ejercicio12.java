/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12;

import Entidades.Persona;
import Servicios.PersonaService;
import java.util.Date;

/**
 *
 * @author diego
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PersonaService ps = new PersonaService();
        Persona prs = ps.crearPersona();
        
        System.out.println(prs);
        
        ps.calcularEdad(prs);
        ps.menorQue(prs, 28);
    }
    
    
}
