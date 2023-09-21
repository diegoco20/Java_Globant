/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.herencia_ej2;

import Entidades.Electrodomestico;
import Entidades.Lavadora;
import Entidades.Televisor;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author diego
 */
public class Herencia_Ej2 {

    public static void main(String[] args) {
       Herencia_Ej2 herencia = new Herencia_Ej2();
       
       ArrayList<Electrodomestico> electrodomesticos = herencia.fabricaElectro(4);
       
       herencia.imprimirElectro(electrodomesticos);
       herencia.returnPrecios(electrodomesticos);
        
        
    }
    
    public void returnPrecios(ArrayList<Electrodomestico> electrodomesticos){
        int precioLavadora = 0;
        int precioTv = 0;
        int lav = 0;
        int tv = 0;
        
        for(Electrodomestico electro : electrodomesticos){
            
            if (electro.getTipo().equals("Tv")){
                precioTv += electro.getPrecio();
                tv++;
            } else {
                precioLavadora += electro.getPrecio();
                lav++;
            }
        }
        
        System.out.println("Lavadoras: " + lav + " Precio total: " + precioLavadora);
        System.out.println("Tvs: " + tv + " Precio total: " + precioTv);
        System.out.println("Precio TOTAL: " + (precioLavadora + precioTv));
    }
    
    public void imprimirElectro(ArrayList<Electrodomestico> electro){
        for (Electrodomestico ele : electro){
            System.out.println(ele);
        }
    }
    
    public ArrayList fabricaElectro(int n){
        ArrayList<Electrodomestico> electrodomesticos = new ArrayList<>();
        
        Random random = new Random();
        
        for (int i = 0; i<n; i++){
           boolean tipo = random.nextBoolean();
           if (tipo){
               Lavadora lavadora = new Lavadora();
               lavadora.crearLavadora();
               electrodomesticos.add(lavadora);
           } else {
               Televisor tv = new Televisor();
               tv.crearTV();
               electrodomesticos.add(tv);
           }
        }
        
        return electrodomesticos;
    }
    
    
}
