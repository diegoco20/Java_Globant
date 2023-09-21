/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author diego
 */
public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private int id;
    private Perro perro;
    private static int contador;
    
   
    //Métodos 
    public void mostrarPerro(){
        System.out.print(nombre);
        System.out.print(" adoptó a ");
        System.out.print(perro.getNombre());
        System.out.println("");
    }
    
    //Constructores
    public Persona() {
        contador++;
        id = contador;
    }

    public Persona(String nombre, String apellido, int edad, Perro perro) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.perro = perro;
    }
    
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Perro getPerro() {
        return perro;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", id=" + id + ", perro=" + perro + '}';
    }
    
    
}
