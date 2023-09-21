/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Entities.Espectador;
import Entities.Sala;
import java.util.ArrayList;

/**
 *
 * @author diego
 */
public class CineService {
    
    public CineService(){
        
    }
    
    public Sala crearSala(){
        Sala sala = new Sala();
        return sala;
    }
    
    public void ImprimirSala(Sala sala){
        for (int i =0; i < 8; i++){
            
            System.out.print("|");
            for (int j = 0; j<6; j++){
                System.out.print(sala.getSala().get(i).get(j) + "|");
            }
            System.out.println("");
        }
    }
    
    public ArrayList<Espectador> fabricaEspectadores(int n){
        ArrayList espectadores = new ArrayList<>();
        for (int i = 0; i<n; i++){
            String nombre = "Espectador " + i;
            int edad = (int) (Math.random() * (80 - 8 + 1)) + 8;
            int dinero = (int) (Math.random() * (200 - 50 + 1)) + 50;
            
            Espectador espectador = new Espectador(nombre, edad, dinero);
            espectadores.add(espectador);
        }
        return espectadores;
    } 
    
    
}
