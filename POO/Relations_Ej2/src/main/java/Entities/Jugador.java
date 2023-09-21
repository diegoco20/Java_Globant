/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author diego
 */
public class Jugador {
    private int id;
    private String nombre;
    private boolean mojado=false;
    
    //Métodos 
    
    public boolean disparo(Revolver r){
        if (r.mojar()){
            mojado = !mojado;
            return mojado;
        } 
        
        r.siguienteChorro();
        return mojado;
    }
    
    public boolean isMojado(Revolver r) {
        if (r.mojar()){
            mojado = !mojado;
            return mojado;
        } 
        
        return mojado;
    }
    
    //Getter and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }
    
    //Constructores

    public Jugador() {
    }
    
    
    
}
