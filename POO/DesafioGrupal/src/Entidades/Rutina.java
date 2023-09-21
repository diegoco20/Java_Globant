/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author diego
 */
public class Rutina {
    private int id;
    private String nombre;
    private int duracion;
    private double nivelDificultad;
    private String descripcion;   
    
    //Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setNivelDificultad(double nivelDificultad) {
        this.nivelDificultad = nivelDificultad;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    //Getters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public double getNivelDificultad() {
        return nivelDificultad;
    }

    public String getDescripcion() {
        return descripcion;
    }
    
    //Constructores
    
    public Rutina (){
        
    }
    
    public Rutina(int id, String nombre, int duracion, double nivelDificultad, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.duracion = duracion;
        this.nivelDificultad = nivelDificultad;
        this.descripcion = descripcion;
    }

    
}
