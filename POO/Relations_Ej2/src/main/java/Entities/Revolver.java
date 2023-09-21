/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

import java.util.Random;

/**
 *
 * @author diego
 */
public class Revolver {
    private int current_pos;
    private int agua_pos;
    
    //Métodos
    public void llenarRevolver(){
        Random random = new Random();
        current_pos = random.nextInt(6);
        agua_pos = random.nextInt(6);
    }
    
    public boolean mojar(){
        return current_pos == agua_pos;
    }
    
    public void siguienteChorro(){
        if ((current_pos+1)%6 == 0){
            current_pos = 6;
        } else {
            current_pos = (current_pos+1)%6;
        }
        
    }
    
    public void imprimirPos(){
        System.out.println(current_pos);
    }
    //Getters and Setters 
    
    public int getCurrent_pos() {
        return current_pos;
    }

    public void setCurrent_pos(int current_pos) {
        this.current_pos = current_pos;
    }

    public int getAgua_pos() {
        return agua_pos;
    }

    public void setAgua_pos(int agua_pos) {
        this.agua_pos = agua_pos;
    }

    //Constructores 

    public Revolver() {
    }
    
    public Revolver(int current_pos, int agua_pos) {
        this.current_pos = current_pos;
        this.agua_pos = agua_pos;
    }

    @Override
    public String toString() {
        return "Revolver{" + "Posición actual =" + current_pos + ", Posición agua =" + agua_pos + '}';
    }
    
    
    
}
