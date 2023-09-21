/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

import java.util.ArrayList;
import java.util.List;
import Enums.Filas;
import Enums.Columnas;


/**
 *
 * @author diego
 */
public class Sala {
    
    private ArrayList<ArrayList<Asiento>> sala = new ArrayList<>();
    
        ArrayList salas = new ArrayList<>();
    
    // Creo un método para rellenar el ArrayList sala con objetos asiento    
    
    
    public Sala(){
        for (int i = 8; i>= 1; i--){
            for (Columnas col : Columnas.values()){
                
                Asiento asiento = new Asiento(col.toString(), i);
                salas.add(asiento);
            }
            sala.add(salas);
            salas = new ArrayList<>();
        }
    }
    

    public List<ArrayList<Asiento>> getSala() {
        return sala;
    }

    
    
}
