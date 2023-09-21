/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.excepciones_ej2;

import Excepciones.NuevaExcepcion;
import MascotaServices.mascotaService;
import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Excepciones_Ej2 {

    public static void main(String[] args) throws NuevaExcepcion {
        Scanner sc = new Scanner(System.in);
        
        mascotaService masService = new mascotaService();
        
        try {
            //Creo una mascota con todos los parámetros 
            masService.crearMascota("Cain", "naranja", 2);
            
            //Creo una mascota sin un parámetro
            masService.crearMascota("Pelos", "", 0);
            
            //Elimino la lista de mascotas
            masService.vaciarMascotas();
            
            //Imprimo la lista de mascotas por pantalla
            masService.imprimirMascotas();
            
        }
        catch (NuevaExcepcion e){
            System.out.println(e.getMessage());
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        
        
    }
    
    
}
