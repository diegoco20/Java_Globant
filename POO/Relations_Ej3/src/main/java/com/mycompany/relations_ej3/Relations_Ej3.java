/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.relations_ej3;

import Entidades.Baraja;
import Entidades.Carta;
import Enums.Numeros;
import Servicios.BarajaService;
import static java.lang.Math.random;
import java.util.Random;

/**
 *
 * @author diego
 */
public class Relations_Ej3 {

    public static void main(String[] args) {
        BarajaService bs = new BarajaService();
        Baraja cartas = new Baraja();
        
        bs.setBaraja(cartas);
        bs.rellenarBaraja();
        bs.barajar();
        bs.cartasDisponibles();
        bs.imprimirBaraja();
        bs.siguienteCarta();
        bs.siguienteCarta();
        bs.cartasDisponibles();
        bs.darCartas(5);
        bs.cartasDisponibles();
        bs.cartasMonton();
        bs.imprimirBaraja();
    }
}
