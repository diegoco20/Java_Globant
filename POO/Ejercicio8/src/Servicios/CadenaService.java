/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Cadena;
import java.util.Scanner;

/**
 *
 * @author diego
 */
public class CadenaService {
    Scanner leer = new Scanner(System.in);
    
    public Cadena crearCadena(){
        Cadena cadena = new Cadena();
        System.out.println("Ingresa una frase");
        String frase = leer.nextLine(); 
        cadena.setFrase(frase);
        
        cadena.setLongitud();
        return cadena;
    }
    
    //Métodos
    public void mostraVocales(Cadena cadena){
        int contador = 0;
        for (int i=0; i<cadena.getLongitud(); i++){
            if (cadena.getFrase().toUpperCase().charAt(i) == 'A'
                || cadena.getFrase().toUpperCase().charAt(i) == 'E'
                || cadena.getFrase().toUpperCase().charAt(i) == 'I' 
                || cadena.getFrase().toUpperCase().charAt(i) == 'O' 
                || cadena.getFrase().toUpperCase().charAt(i) == 'U'){
                
                contador++;
            }
        }
        
        System.out.println("La frase tiene: " + contador + " vocales");
    }
    
    public void invertirFrase(Cadena cadena){
        for (int i = cadena.getLongitud()-1; i>=0; i--){
            System.out.print(cadena.getFrase().charAt(i));
        }
        System.out.println("");
    }  
    
    public void vecesRepetido(Cadena cadena){
        System.out.println("Ingresa el carácter a buscar");
        String letra = leer.nextLine();
        while(letra.length()!= 1){
            System.out.println("Cantidad de caracteres no permitido, intenta de nuevo");
            letra = leer.nextLine();
        }
        
        int contador = 0;
        String posiciones = "";
        for (int i =0; i<cadena.getLongitud(); i++){
            if (cadena.getFrase().charAt(i) == letra.charAt(0)){
                contador++;
                posiciones = posiciones + String.valueOf(i) + ", ";
            }
        }
        
        System.out.println("El carácter '" + letra + "' se repite " + contador + " veces" + "en las posiciones " + posiciones);
    }
    
    public void compararLongitud(Cadena cadena){
        System.out.println("Ingresa una frase a comparar");
        String fraseC = leer.nextLine();
        
        if (cadena.getLongitud() > fraseC.length()){
            System.out.println("La longitud de la frase ingresada es MENOR");
        } else {
            System.out.println("La longitud de la frase ingresada es MAYOR");
        }
    }
    
    public void unirFrases(Cadena cadena){
        System.out.println("Ingresa la frase a unir");
        String frase = leer.nextLine();
        String fraseU = cadena.getFrase() + frase;
        System.out.println(fraseU);
        
    }
    
    public void reemplazar(Cadena cadena) {
        System.out.println("Ingresa la letra a buscar");
        char letra = leer.nextLine().charAt(0);
        
        System.out.println("Ingresa la letra a reemplazar");
        char letraR = leer.nextLine().charAt(0);
        
        for (int i=0; i<cadena.getLongitud(); i++){
            if (letra==cadena.getFrase().charAt(i)){
                
            }
        }
    }
}
