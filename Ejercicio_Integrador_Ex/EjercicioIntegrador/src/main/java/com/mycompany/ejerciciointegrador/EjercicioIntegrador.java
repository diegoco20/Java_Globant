/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciointegrador;

import Servicios.Jarvis;

/**
 *
 * @author diego
 */
public class EjercicioIntegrador {

    public static void main(String[] args) {
        Jarvis jarvis = new Jarvis();
        
        for (int i = 0; i < 20; i++) {
            jarvis.getArm().correr(5);
            jarvis.MostrarEstadoBateria();
        }
    }
}
