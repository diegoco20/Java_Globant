/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comparadores;

import java.util.Comparator;

/**
 *
 * @author diego
 */
public class Comparadores {
    public static Comparator<String> compararPorRaza = new Comparator<String>(){
        @Override
        public int compare(String t, String t1) {
            return t.compareTo(t1);
        }
        
    };
}
