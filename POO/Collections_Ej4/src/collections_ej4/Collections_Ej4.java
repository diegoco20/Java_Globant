/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package collections_ej4;

import Services.PeliculaService;
import java.util.Collections;

/**
 *
 * @author diego
 */
public class Collections_Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PeliculaService ps = new PeliculaService();
        
        ps.agregarPelicula(ps.crearPelicula());
        ps.agregarPelicula(ps.crearPelicula());
        ps.mostrarPeliculas();
        
        Collections.sort(ps.retornarPeliculas(), PeliculaService.ordenarDuracion);
        ps.mostrarPeliculas();
        
    }
    
}
