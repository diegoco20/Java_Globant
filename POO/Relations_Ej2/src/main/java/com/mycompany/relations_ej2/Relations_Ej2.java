/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.relations_ej2;

import Entities.Juego;
import Entities.Jugador;
import Entities.Revolver;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author diego
 */
public class Relations_Ej2 {

    public static void main(String[] args) {
        Revolver revolver = new Revolver();
        List<Jugador> jugadores = new ArrayList<Jugador>();
        
        Juego game = new Juego(jugadores, revolver);
        game.jugar();
         
    }
}
