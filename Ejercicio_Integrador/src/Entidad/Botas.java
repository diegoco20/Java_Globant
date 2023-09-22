/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author jupac
 */
public class Botas extends PartesArmadura{

    
     public Botas() {
        this.consumo=200000;
        this.esta_danado=false;
        
    }
    
    
    public boolean isEsta_danado() {
        return esta_danado;
    }

    public void setEsta_danado(boolean esta_danado) {
        this.esta_danado = esta_danado;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    
    
   
    
    
    
}
