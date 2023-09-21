/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

import Entidad.Libro;
import Servicios.LibroService;
import java.util.Date;

/**
 *
 * @author diego
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Instancio los libros
        LibroService libservice = new LibroService();
        Libro lib1 = libservice.crearLibro();
        
        lib1.mostrarInfo();
            
        
    }
    
}
