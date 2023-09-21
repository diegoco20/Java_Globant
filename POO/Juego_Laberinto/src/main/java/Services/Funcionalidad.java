/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Entities.Laberinto;
import java.util.ArrayList;

/**
 *
 * @author diego
 */
public class Funcionalidad {
    private Laberinto laberinto;
    
    public Laberinto getLaberinto() {
        return laberinto;
    }
    
    public void setLaberinto(Laberinto laberinto) {
        this.laberinto = laberinto;
    }
    
    public Funcionalidad(){
        
    }
    
    public Funcionalidad(Laberinto lab){
        this.laberinto = lab;
    }
    
    
}
