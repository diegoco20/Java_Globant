/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejemploclas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author diego
 */
public class EjemploClas {

    public static void main(String[] args) {
        Ej_NumPrimos primo = new Ej_NumPrimos();
        Combinaciones combi = new Combinaciones();
        //primo.esPrimo(97);
        
        
        String[] words = {"duel", "speed", "dule", "cars"};
        String[] queries = {"spede", "deul"};
        
        
        // solucion = procesar(words, queries);
        // imprimirSolucion(solucion);
        
        ArrayList permutaciones = new ArrayList<String>();
        permutaciones = combi.PermutacionesI("abcd", 0);
        for (int i = 0; i < permutaciones.size(); i++){
            System.out.println(permutaciones.get(i));
        }
    }
    
    public static void imprimirSolucion(ArrayList<ArrayList<String>> sol) {
        System.out.print("[");
        for (int i = 0; i < sol.size(); i++) {
            System.out.print("[");
            for (int j = 0; j < sol.get(i).size(); j++) {
                if (j < sol.get(i).size() - 1) {
                    System.out.print("'" + sol.get(i).get(j) + "',");
                } else {
                    System.out.print("'" + sol.get(i).get(j) + "'");
                }

            }
            System.out.print("]");
        }
        System.out.print("]");
    }
    
    public static ArrayList procesar(String[] words, String[] queries){
        ArrayList solucion = new ArrayList<ArrayList<String>>();
        for (String querie : queries) {
            ArrayList solQuerie= new ArrayList<String>();
            for (String word : words) {
                if (mismaLongitud(querie, word)) {
                    if (mismasLetras(querie, word)) {
                        solQuerie.add(word);
                    }
                }
            }
            Collections.sort(solQuerie);
            solucion.add(solQuerie);
        }
        return solucion;
    }
    
    public static boolean mismaLongitud(String w1, String w2){
        return w1.length()==w2.length();
    }
    
    public static boolean mismasLetras(String w1, String w2){
        char[] querieChar = w1.toCharArray();
        char[] wordChar = w2.toCharArray();
        
        Arrays.sort(querieChar);
        Arrays.sort(wordChar);
        
        String querie = new String(querieChar);
        String word = new String(wordChar);
        
        return querie.equals(word);
    }
    
    
    
    
    
    public static String combinatoriaDoble(String word){
        String wordB = word;
        String wordA = word.substring(word.length()-2);
        String wordC = word.substring(0, word.length()-2) + wordA.substring(wordA.length()-1) + wordA.substring(0, 1);
        System.out.println(wordC);
        return wordC;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static List<String> generarCombinaciones(String palabra) {
        List<String> resultado = new ArrayList<>();
        generarCombinacionesRecursivas("", palabra, resultado);
        return resultado;
    }

    private static void generarCombinacionesRecursivas(String prefijo, String sufijo, List<String> resultado) {
        int n = sufijo.length();
        if (n == 0) {
            resultado.add(prefijo);
        } else {
            for (int i = 0; i < n; i++) {
                generarCombinacionesRecursivas(prefijo + sufijo.charAt(i), sufijo.substring(0, i) + sufijo.substring(i + 1, n), resultado);
            }
        }
    }
}

