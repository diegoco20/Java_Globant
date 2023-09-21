/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MascotaServices;

import Entidades.Mascota;
import Excepciones.NuevaExcepcion;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author diego
 */
public class mascotaService {
    private ArrayList<Mascota> mascotas;
    Scanner sc = new Scanner(System.in);
    
    public void crearMascota(String nombre, String color, int edad) throws NuevaExcepcion{
        try {
           if (nombre.isEmpty()){
               throw new NuevaExcepcion("No ha ingresado el nombre");
           }
           
           if (color.isEmpty()){
               throw new NuevaExcepcion("No ha ingresado color");
           }
           
           if (edad <= 0){
               throw new NuevaExcepcion("Edad ingresada es incorrecta");
           }
           
           //Creo un objeto mascota
           Mascota mascota = new Mascota();
           
           //Asgino los valores para incializar el objeto
           mascota.setNombre(nombre);
           mascota.setColor(color);
           mascota.setEdad(edad);
           
           //Guardo la mascota 
           guardarMascota(mascota);
        }
        
        catch (NuevaExcepcion e) {
            throw e;
        }
        catch (Exception e){
            e.printStackTrace();
            throw new NuevaExcepcion ("Error de procesamiento");
        } 
    }
    
    public void guardarMascota(Mascota mascota){
        mascotas.add(mascota);
    }
    
    public Mascota buscarMascota(String nombre) throws NuevaExcepcion{
        try {
            if (nombre.isEmpty()) {
                throw new NuevaExcepcion("Debe introducir un nombre");
            }
            
            Mascota masFound = null;
            
            for (Mascota mascota : mascotas) {
                if (mascota.getNombre().equals(nombre)) {
                    System.out.println("Mascota encontrada: ");
                    System.out.println(mascota);
                    masFound = mascota;
                    break;
                }
            }
            
            if (masFound == null){
                throw new NuevaExcepcion("No se econtró la mascota ingresada");
            }
            
            return masFound;
        } catch (NuevaExcepcion e){
            throw e;
        } catch (Exception e){
            e.printStackTrace();
            throw new NuevaExcepcion("Error de sistema");
        }
    }
    
    public void imprimirMascotas() throws NuevaExcepcion{
        
        try {
            if (mascotas.isEmpty()){
                throw new NuevaExcepcion("La lista está vacía");
            } else {
                for (Mascota mascota : mascotas){
                    System.out.println(mascota);
                }
            }
        } catch (NuevaExcepcion e){
            throw e;
        } catch (Exception e){
            e.printStackTrace();
            throw new NuevaExcepcion("Error de sistema");
        }
    }
    public void vaciarMascotas(){
        mascotas.clear();
    }

    public mascotaService() {
        mascotas = new ArrayList<Mascota>();
    }
    
    
}
