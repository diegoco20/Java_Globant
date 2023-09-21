/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.Random;

/**
 *
 * @author diego
 */
public class Televisor extends Electrodomestico{
    
    private int resolucion;
    private boolean tdt;

    public Televisor() {
    }

    public Televisor(int resolucion, boolean tdt, int precio, String color, String consumo, int peso) {
        super(precio, color, consumo, peso);
        this.resolucion = resolucion;
        this.tdt = tdt;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isTdt() {
        return tdt;
    }

    public void setTdt(boolean tdt) {
        this.tdt = tdt;
    }
    
    
    public Televisor crearTV(){
        
        this.crearElectrodomestico();
        this.tipo = "Tv";
        //Llena los métodos propios de TV
        
        //Resolucion
        int res = (int) ((Math.random() * 13))*5 + 20;
        this.setResolucion(res);
        
        //tdt
        Random random = new Random();
        this.setTdt(random.nextBoolean());
        this.precioFinal();
        return this;
    }
    
    @Override
    public void precioFinal(){
        super.precioFinal();
        
        if (this.resolucion > 40){
            double incremento = this.precio * 1.3;
            this.precio = (int) incremento;
        }
        
        if (tdt){
            this.precio += 500;
        }
        
    }

    @Override
    public String toString() {
        return "Televisor{ precio=" + precio + ", color=" + color + ", consumo=" + consumo + ", peso=" + peso + " resolucion=" + resolucion + ", tdt=" + tdt + '}';
    }
    
   
    
}
