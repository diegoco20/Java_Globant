/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.herencia_ej3;

import Entities.Circulo;
import Entities.Rectangulo;

/**
 *
 * @author diego
 */
public class Herencia_Ej3 {

    public static void main(String[] args) {
        Circulo circulo = new Circulo(2.5);
        Rectangulo rectangulo = new Rectangulo(4, 3);
        
        circulo.perimetro();
        rectangulo.perimetro();
        
    }
    
}
