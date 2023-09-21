/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author diego
 */
public class Libro {
    
    private String nombre;
    private String ISBN;
    private int year;
    private String autor;
    
    //Defino los constructores
    
    public Libro(){
    }
    
    public Libro(String nombre){
        this.nombre = nombre;
    }

    public Libro(String nombre, String ISBN, String autor, int year) {
        this.nombre = nombre;
        this.ISBN = ISBN;
        this.autor = autor;
        this.year = year;   
    }

    //Defino los getters

    public String getNombre() {
        return nombre;
    }
    
    public String getISBN(){
        return ISBN;
    }
    
       public String getAutor() {
        return autor;
    }
       
    //Defino los setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setISBN(String ISBN){
        if (ISBN.length() > 0){
            this.ISBN = ISBN;
        }
    }
    
    public void setAutor(String autor){
        if (autor.length() > 0){
            this.autor = autor;
        }
    }

    public void setYear(int year){
        if (year > 0){
            this.year = year;
        }
    }
 
    
    
    //Métodos
    
    /**
     * 
     */
    public void mostrarNombre(){
        System.out.println("Nombre: " + nombre);
    }
    
    public void mostrarInfo(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Autor: " + autor);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Año: "+ year);
    }
    @Override
    public String toString() {
        return "Libro{" + "Nombre= " + nombre + ", ISBN= " + ISBN + ", Autor=" + autor +  ", Año= " + year + '}';
    }
    
    
    
    
    
    
}
