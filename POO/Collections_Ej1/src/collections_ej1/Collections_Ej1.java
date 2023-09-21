/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package collections_ej1;

import Comparadores.Comparadores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Collections_Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        boolean salir = false;
        ArrayList<String> razas = new ArrayList<>();
        
        while (!salir) {
            System.out.println("Ingresa una raza de perro: ");
            String dato = sc.nextLine();
            razas.add(dato);
            
            System.out.println("Deseas salir? S/N");
            String seguir = sc.nextLine();
            
            if (seguir.toUpperCase().equalsIgnoreCase("S")){
                salir = true;
                break;
                
            } else if (seguir.toUpperCase().equalsIgnoreCase("N")){
               continue;
            }
              else {
                int tries =0;
                while (!seguir.toUpperCase().equalsIgnoreCase("S")){
                    tries += tries + 1;
                    System.out.println("Intentos restantes " + (3-tries));
                    System.out.println("Ingresa un valor correcto (S/N)");
                    seguir = sc.nextLine();
                    
                    
                    if (tries>3) {
                        System.out.println("Intentos superados");
                        salir = true;
                        break;
                    }
                }
            }
            
            
        }
        
        System.out.println("Datos ingresados: ");
        for (String dato : razas) {
            System.out.println(dato);
        }
        
        System.out.println("Ingresa un perro a buscar ");
        String perro = sc.nextLine();
        
        
        //Usando iterator
        Iterator iterator = razas.iterator();
        boolean existe = false;
        
        
        while (iterator.hasNext()){
            if (iterator.next().equals(perro)){
               iterator.remove();
               existe = true;
            }
        }
        if (!existe){
            System.out.println("Raza no encontrada");
        }
        
        System.out.println("Lista actualizada:");
      
        Collections.sort(razas, Comparadores.compararPorRaza);
        razas.forEach((e) -> System.out.println(e));
        
    }
    
}
