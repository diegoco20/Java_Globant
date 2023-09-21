/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import Enums.Color;
import Enums.Consumo;

/**
 *
 * @author diego
 */
public class Electrodomestico {
    protected int precio;
    protected String color;
    protected String consumo;
    protected int peso;
    protected String tipo;
    
    public Electrodomestico(){
        
    }

    public Electrodomestico(int precio, String color, String consumo, int peso) {
        this.precio = precio;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
        comprobarConsumoEnergetico(consumo.charAt(0));
        comprobarColor(color);
    }

    /*
    Métodos
    */
    
    private void comprobarConsumoEnergetico(char letra){
        String consumoLetra = "" + letra;
        boolean consumoR = false;
        for (Consumo con : Consumo.values()){
            if (con.toString().equals(consumoLetra)){
                consumoR = true;
                break;
            }
        }
        if (!consumoR) {
            this.consumo = "F";
        }
    } 
    
    private void comprobarColor(String color){
        boolean colorR = false;
        for (Color col : Color.values()){
            if (color.equals(col.toString())){
                colorR = true;
                break;
            }
        }
        
        if (!colorR){
            this.color = "Blanco";
        }
    }
    
    protected void crearElectrodomestico() throws ElectrodomesticoException{
        try {
            this.setPrecio(1000);

            //Genera un color aleatoriamente
            Color[] colorEnum = Color.values();
            int indiceColor = (int) (Math.random() * (colorEnum.length - 1));
            this.setColor(colorEnum[indiceColor].toString());

            //Genera un consumo aleatorio
            Consumo[] consumoEnum = Consumo.values();
            int indiceConsumo = (int) (Math.random() * (consumoEnum.length - 1));
            this.setConsumo(consumoEnum[indiceConsumo].toString());

            //Genera un peso aleatorio
            int pesoRandom = (int) (Math.random() * (100));
            this.setPeso(pesoRandom);
            
            
            //Manejamoas las excepeciones: 
         
            if (this.color.isEmpty()){
                throw new ElectrodomesticoException("Debe ingresar un color");
            }
            if (this.consumo.isEmpty()){
                throw new ElectrodomesticoException("Debe ingresar un color");
            }
            if (this.precio < 0){
                throw new ElectrodomesticoException("Debe ingresar un color");
            }
        }
        catch (ElectrodomesticoException e){
            throw e;
        }
        
        
        
    }
    
    public void precioFinal(){
        
        int precioFinal = this.getPrecio(); //Inicializa variable con el peso base
        
        //Determina precio de acuerdo al consumo
        String consumo = this.getConsumo();
        Consumo con = Consumo.valueOf(consumo);
        precioFinal += con.getPrecioF();
        
        //Determina precio de acuerdo al peso
        if (this.getPeso() < 20) {
            precioFinal += 100;
        } else if (this.getPeso() < 50) {
            precioFinal += 500;
        } else if (this.getPeso() < 80) {
            precioFinal += 800;
        } else {
            precioFinal += 1000;
        }
        // Seteo el precio final 
        this.setPrecio(precioFinal);
    }
    
    
    
    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getConsumo() {
        return consumo;
    }

    public void setConsumo(String consumo) {
        this.consumo = consumo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consumo=" + consumo + ", peso=" + peso + '}';
    }
    
    
}
