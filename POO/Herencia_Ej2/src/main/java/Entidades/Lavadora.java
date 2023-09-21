/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author diego
 */
public class Lavadora extends Electrodomestico{
    
    private int carga;

    public Lavadora() {
    }

    public Lavadora(int carga, int precio, String color, String consumo, int peso) {
        super(precio, color, consumo, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
    
    public void crearLavadora(){

        this.crearElectrodomestico();
        this.tipo = "Lavadora";
        //Seteamos la carga
        this.setCarga((int) (Math.random() * 5 + 1) * 10 + 10);
        this.precioFinal();
    }
    
    @Override
    public void precioFinal(){
        super.precioFinal();
        
        if (this.carga > 30){
            this.precio += 500;
        }
        
        
    }

    @Override
    public String toString() {
        return "Lavadora{ precio=" + precio + ", color=" + color + ", consumo=" + consumo + ", peso=" + peso + " carga=" + carga + '}';
    }
    
    
}
