/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.juego_laberinto;

import Entities.Laberinto;
import Services.LabService;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author diego
 */
public class Juego_Laberinto {

    public static void main(String[] args) {
        LabService ls = new LabService();
        
        ls.crearLaberinto();
        ls.imprimirLaberinto();
    }
}
