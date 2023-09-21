/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author diego
 */
public class Pelicula {
    private String titulo;
    private String director;
    private int duracionMins;
    
    public Pelicula(String titulo, String director, int duracionMins){
        this.titulo = titulo;
        this.director = director;
        this.duracionMins = duracionMins;
        
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDirector() {
        return director;
    }

    public Integer getDuracionMins() {
        return duracionMins;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setDuracionMins(Integer duracionMins) {
        this.duracionMins = duracionMins;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", director=" + director + ", duracionMins=" + duracionMins + '}';
    }
    
    
}
