/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author diego
 */
public abstract class ElementosArmadura {
    protected boolean esta_danado;
    protected double consumo;
    
    protected static double consumoCaminar = 0;
    protected static double consumoCorrer = 0;
    
    
    public boolean estaDanado(){
        return this.esta_danado;
    }
    
}
