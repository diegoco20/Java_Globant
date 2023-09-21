/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.herencia_ejemplo1;

import Entidades.Animal;
import Entidades.Gato;
import Entidades.Perro;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author diego
 */
public class Herencia_Ejemplo1 {

    public static void main(String[] args) {
        List<Animal> animal_herencia = new ArrayList<Animal>(); 
        
        Animal a = new Animal();
        Animal b = new Gato();
        Animal c = new Perro();
        
        for (Animal animales : animal_herencia){
            animales.hacerRuido();
        }
        
        
    }
}
