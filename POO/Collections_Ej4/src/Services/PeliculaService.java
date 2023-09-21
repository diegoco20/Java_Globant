/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Entidades.Pelicula;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author diego
 */
public class PeliculaService {
    
    Scanner sc = new Scanner(System.in);
    private ArrayList<Pelicula> peliculas;
    
    public PeliculaService() {
        peliculas = new ArrayList<>();
    }
    
    public Pelicula crearPelicula(){
        System.out.println("Ingresa el título");
        String nombre = sc.nextLine();
        
        System.out.println("Ingresa el director");
        String director = sc.nextLine();
        
        System.out.println("Ingresa la duración");
        int duracion = sc.nextInt();
        sc.nextLine();
        
        Pelicula pelicula = new Pelicula(nombre, director, duracion);
        return pelicula;
    }
    
    public void agregarPelicula(Pelicula pelicula){
        peliculas.add(pelicula);
    }
    
    public void mostrarPeliculas(){
        System.out.println("Películas actuales: " + peliculas.size());
        System.out.println("");
        System.out.println("Películas: ");
        System.out.println("");
        
        for (Pelicula peli : peliculas){
            System.out.println("");
            System.out.println(peli);
        }
    }
    
    public ArrayList retornarPeliculas(){
        return peliculas;
    } 
    
    public void peliculasMayorHora(){
        for (Pelicula peli : peliculas){
            if ((peli.getDuracionMins()/60) > 1){
                System.out.println(peli);
            }
        }
    }
    
    public static Comparator<Pelicula> ordenarTitulo = new Comparator<Pelicula> (){
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getTitulo().compareTo(t1.getTitulo());
            
        }
    };      
    
    public static Comparator<Pelicula> ordenarDuracion = new Comparator<Pelicula> (){
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getDuracionMins().compareTo(t1.getDuracionMins());
            
        }
    };
}

