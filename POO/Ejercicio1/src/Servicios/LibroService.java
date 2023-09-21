/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidad.Libro;
import java.util.Scanner;

/**
 *
 * @author diego
 */
public class LibroService {
    
    private Scanner leer = new Scanner(System.in);
    
    public Libro crearLibro(){
      
       Libro libro = new Libro(); 
       
       System.out.println("Introduce el nombre del libro");
       libro.setNombre(leer.nextLine());
       
       System.out.println("Introduce el ISBN");
       libro.setISBN(leer.nextLine());
       
       System.out.println("Introduce la editorial");
       libro.setAutor(leer.nextLine());
       
       System.out.println("Introduce el año");
       libro.setYear(leer.nextInt());
               
       return libro;
    }
}

