/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.Date;

/**
 *
 * @author diego
 */
public class Persona {
    private String nombre;
    private Date nacimiento;
    
    
    public Persona (){
        
    }
    
    public Persona (String nombre, Date nacimiento){
        this.nombre = nombre;
        this.nacimiento = nacimiento;
    }
    
    public String getNombre(){
        return nombre;
    }

    public Date getNacimiento() {
        return nacimiento;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setNacimiento(Date born){
        this.nacimiento = born;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", nacimiento=" + nacimiento + '}';
    }
    
    
    
    
}
