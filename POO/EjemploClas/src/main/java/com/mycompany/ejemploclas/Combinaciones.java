
package com.mycompany.ejemploclas;

import java.util.ArrayList;

/**
 *
 * @author diego
 */
public class Combinaciones {
    public ArrayList<String> generarCombinaciones(String word){
        ArrayList combinaciones = new ArrayList<>();
        int len = word.length();
        
        return combinaciones;
    }
    
    //Genera todas las permutaciones de la letra i seleccionada:
    
    public ArrayList<String> PermutacionesI (String word, int index){
        ArrayList<String> arreglo = new ArrayList<>(); 
        for (int i = index; i < word.length(); i++){
            String palabra;
            palabra = permutaLetrai(word, i);
            arreglo.add(palabra);
        }
        return arreglo;
    }
            
    public ArrayList<String> ingresarCombinaciones(ArrayList<String> permutaciones, ArrayList<String> combinaciones){
        for (int i = 0; i < permutaciones.size(); i++){
            combinaciones.add(permutaciones.get(i));
        }
        return combinaciones;
    }
    
    
    
    public String permutaLetraij(String word, int i, int j){
        char[] arrayPalabra = word.toCharArray();
        char index = arrayPalabra[i];
        arrayPalabra[i] = arrayPalabra[j];
        arrayPalabra[j] = index;
        String palabra = new String(arrayPalabra);
        return palabra;
    }
    
     public String permutaLetrai(String word, int i){
        char[] arrayPalabra = word.toCharArray();
        char index = arrayPalabra[0];
        arrayPalabra[0] = arrayPalabra[i];
        arrayPalabra[i] = index;
        String palabra = new String(arrayPalabra);
        return palabra;
    }
    
    public int numCombinaciones(String word){
        int comb = 1;
        for (int i = 1; i <= word.length(); i++){
            comb *= i;
        }
        return comb;
    }
}
