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
    protected String elemento;
    protected double consumo;
    protected boolean esta_danado;
    protected boolean destruido;
    
    protected static double consumoCaminar = 0;
    protected static double consumoCorrer = 0;
    protected static double consumoVolar= 0;
    protected static double consumoPropulsarse = 0;
    
    public boolean estaDanado(){
        return this.esta_danado;
    }
    
    public String getDispositivo(){
        return elemento;
    }

    public void setEstaDanado(boolean dano){
        this.esta_danado = dano;
    }
    
    public void setDestruido(boolean destruido){
        this.destruido = destruido;
    }
    
    public boolean getDestruido(){
        return destruido;
    }
}
