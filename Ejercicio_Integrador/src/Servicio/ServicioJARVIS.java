/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Armadura;
import java.util.Random;

/**
 *
 * @author jupac
 */
public class ServicioJARVIS {
    
    
   
   
   public Armadura arm=new Armadura();
   
   /**
    * Estado de la Batería
Hacer un método para que JARVIS informe el estado de la batería en porcentaje a través de la
consola. Poner como carga máxima del reactor el mayor float posible. Ejecutar varias acciones y
mostrar el estado de la misma.
    */
   public void MostrarEstadoBateria(){
       System.out.println("Estado de la bateria: ");
       System.out.print("--> ");
       System.out.println(arm.getBateria());
   }
   
   public boolean probabilidadDanio(){
       Random random = new Random();
       arm.getBotas().setEsta_danado(random.nextDouble() < 0.3);
        return arm.getBotas().isEsta_danado();
   }
   
    public boolean probabilidadReparacion(){
       Random random = new Random();
        return random.nextDouble() <0.4;
   }
           
}
