/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mascotaApp_servicios;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import mascotaApp.Mascota;

/**
 *
 * @author diego
 */
public class ServicioMascota {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    

    //Variables
    private ArrayList<Mascota> mascotas;

    //Constructor ----
    // --- Se inicializa una array list cada vez que se instancia
    
    public ServicioMascota() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.mascotas = new ArrayList();
    }
    
    
    public Mascota crearMascota(){
        System.out.println("");
        System.out.println("Intruciendo Mascota " + (mascotas.size()+1));
        System.out.println("");
        
        System.out.println("Introducir nombre");
        String nombre = leer.next();
        
        System.out.println("Introducir apodo");
        String apodo = leer.next();
        
        System.out.println("Introducir tipo");
        String tipo = leer.next();
        
        Mascota mascota = new Mascota(nombre, apodo, tipo);
        return mascota;
    }
    
    public void agregarMascota(Mascota mascota){
        mascotas.add(mascota);
    }
    public void fabricaChiquitos(int cantidad) {
        
        for (int i= 0; i< cantidad ; i++) {
            Mascota aux = new Mascota("Fer", "Chiquito", "Beagle");
            mascotas.add(aux);
        }
    }
    
    public void mostrarMascotas(){
        
        System.out.println("Las mascotas actuales de la lista son");
        for (Mascota mascota : mascotas){
            System.out.println(mascota);
        }
        
        System.out.println("Cantidad = " + mascotas.size());
        
    }
    
    public void fabricaMascotas(int cantidad){
        for (int i=0; i< cantidad; i++){
            Mascota mascotaCreada = crearMascota();
            agregarMascota(mascotaCreada);
            System.out.println(mascotaCreada);
        }
    }
    
    public void actualizarMascota(int index){
        
        if (index <= (mascotas.size()-1)){
            System.out.println("");
            System.out.println("----Acualizar----");
            
            Mascota m = crearMascota();
            mascotas.set(index, m);
            }
        else {
            System.out.println("El índice es erroneo");
        }
    }
    
    public void eliminarMascotas(int index){
        
        if (index <= (mascotas.size()-1)){
            System.out.println("");
            System.out.println("----Remover----");
            
            mascotas.remove(index);
            }
        else {
            System.out.println("El índice es erroneo");
        }
    }
}
