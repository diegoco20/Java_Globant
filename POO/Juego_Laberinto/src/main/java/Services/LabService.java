/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Entities.Laberinto;
import Enums.Movimientos;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author diego
 */
public class LabService {
    private Laberinto laberinto;
    
    public Laberinto crearLaberinto(){
        ArrayList laberintoFinal = new ArrayList<>();
        
        List laberinto1 = Arrays.asList("S", "O", "O", "O", "O", "0");
        List laberinto2 = Arrays.asList("1", "1", "1", "1", "1", "0");
        List laberinto3 = Arrays.asList("0", "O", "O", "O", "O", "0");
        List laberinto4 = Arrays.asList("0", "1", "1", "1", "1", "1");
        List laberinto5 = Arrays.asList("0", "O", "O", "O", "O", "0");
        List laberinto6 = Arrays.asList("1", "1", "1", "1", "1", "E");
        
        laberintoFinal.add(laberinto1);
        laberintoFinal.add(laberinto2);
        laberintoFinal.add(laberinto3);
        laberintoFinal.add(laberinto4);
        laberintoFinal.add(laberinto5);
        laberintoFinal.add(laberinto6);
        
        Laberinto lab = new Laberinto();
        lab.setLaberinto(laberintoFinal);
        int[] salida = {0, 0};
        int[] meta = {5, 5};
        
        lab.setLlegada(meta);
        lab.setSalida(salida);
        lab.setCurrentPos(salida);
        
        this.laberinto = lab;
        return lab;
    }
    
    public void mover(String movimiento){
        System.out.println("Ingrese moviento: (A, W, D, S): ");
        Scanner sc = new Scanner(System.in);
        String mov = sc.nextLine();
        for (Movimientos movEnum : Movimientos.values()){
            if ( movEnum.toString().equals(mov)){
               int fila = laberinto.getCurrentPos()[0];
               int col = laberinto.getCurrentPos()[1];
               int[] setPos = {fila + movEnum.getValor()[0], col + movEnum.getValor()[1]}; 
               laberinto.setCurrentPos(setPos);
            } else {
               System.out.println("Valor no válido");
            }
        }
    }
    
    public String mostrarCelda(int fila, int col){
        List filaI;
        filaI = laberinto.getLaberinto().get(fila);
        String celda;
        celda = (String) filaI.get(col);
        return celda;
    }
    
    public void imprimirLaberinto(){
        ArrayList<ArrayList<String>> lab = laberinto.getLaberinto();
        
        for (int i = 0; i < lab.size(); i++) {
            System.out.print("|");
            List<String> fila = new ArrayList<>();
            fila = lab.get(i);
            
            for (String celda : fila){
                System.out.print(" " + celda + " ");
            }
            System.out.println("|");
        }
    }
    
    /* Verificaciones 
    
    public boolean verificarMovimiento(String mov){
        
        int[] newPos = laberinto.getCurrentPos();
        
    }
    */
    
    // Verifico valor ingresado 
    public boolean verificarLetra(String letter){
        for (Movimientos mov : )
    }
    public Laberinto getLaberinto() {
        return laberinto;
    }
    
    
    public void setLaberinto(Laberinto laberinto) {
        this.laberinto = laberinto;
    }

    public LabService() {
    }
    
    
}
