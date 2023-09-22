/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciointegradocomplementario;

import Servicio.ServicioJARVIS;

/**
 *
 * @author jupac
 */
public class EjercicioIntegradoComplementario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ServicioJARVIS jarvis=new ServicioJARVIS();
        jarvis.MostrarEstadoBateria();
        jarvis.arm.caminar(2);
        jarvis.MostrarEstadoBateria();
//        for (int i = 0; i < 100; i++) {
//            jarvis.arm.caminar(5);
//            jarvis.MostrarEstadoBateria();
//        }
        
        for (int i = 0; i < 100; i++) {
            System.out.println(jarvis.probabilidadDanio());
            System.out.println(jarvis.arm.getBotas().isEsta_danado());
        }
    }
    
}
