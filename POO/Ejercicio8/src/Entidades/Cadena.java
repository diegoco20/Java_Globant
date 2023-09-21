/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author diego
 */
public class Cadena {
    
    private String frase;
    private int longitud;
    
    //Constructores
    public Cadena(){
        
    }
    
    public Cadena(String frase) {
        this.frase = frase;
        this.longitud = this.frase.length();
    }
    
    
    //Getters
    
    public String getFrase() {
        return frase;
    }

    public int getLongitud() {
        return longitud;
    }
    
    //Setters

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public void setLongitud() {
        this.longitud = this.frase.length();
    }
    
    
    
}
