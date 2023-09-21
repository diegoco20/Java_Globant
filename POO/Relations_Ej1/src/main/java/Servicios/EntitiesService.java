/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Perro;
import Entidades.Persona;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 *
 * @author diego
 */
public class EntitiesService {
    private List<Perro> perros;
    private List<Persona> personas;
    private List<Perro> perrosAdoptados;
    
    //Arreglos con datos para los parámetros
    String[] razas = {"Chihuahua", "Dalmata", "Gran Danes", "Fila Brasilero", "Chaw chaw", "Pitbull", "Mastin Napolitano"};
    String[] tamanios = {"small", "medium", "big"};
    
    
    //Métodos Perro
    
    
    public Perro crearPerro(){
        Perro perro = new Perro();
        return perro;
    }
    
    public void agregarPerro(Perro perro){
        perros.add(perro);
    }
    
    public void fabricaPerros(int n){
        
        for (int i = 0; i<n; i++){
             Perro perro = crearPerro();
             String nombre = "Chiquito " + i;
             String raza = razas[(int) (Math.random()*razas.length)];
             String tamanio = tamanios[(int)(Math.random()*tamanios.length)];
             int edad = (int)(Math.random()*20);
             
             perro.setEdad(edad);
             perro.setNombre(nombre);
             perro.setRaza(raza);
             perro.setTamanio(tamanio);
             
             agregarPerro(perro);
        }
    }
    
    public void imprimirPerros(){
        
        for (Perro dog : perros){
            System.out.println(dog);
        }
    }
    
    
    
    //Métodos Persona
    public Persona crearPersona(){
        Persona persona = new Persona();
        return persona;
    }
    
    public void agregarPersona(Persona persona){
        personas.add(persona);
    }
    
    public void fabricaPersonas(int n){
        
        for (int i = 0; i<n; i++){
             Persona persona = crearPersona();
             String nombre = "Pepito ";
             String apellido = "Perez " + persona.getId();
             
             int edad = (int)(Math.random()*68 + 18);
             
             persona.setEdad(edad);
             persona.setNombre(nombre);
             persona.setApellido(apellido);
             
             agregarPersona(persona);
        }
    }
    
    public void imprimirPersonas(){
        for (Persona person : personas){
            System.out.println(person);
        }
    }
    
    public boolean buscarPersonaId(int id, List<Persona> personas){
        boolean contiene = false;
        Persona persona;
        for (int i=0; i< personas.size(); i++){
            persona = personas.get(i);
            if (persona.getId() == id){
                contiene = true;
                return contiene;
            }
        }
        return contiene;
    }
    
    
    public void asignarPerro(){ 
        List<Perro> perrosDisponibles = new ArrayList<> (perros);
        Random random = new Random();
        
        
        for (int i=0; i<personas.size(); i++){
            
            if (!perrosDisponibles.isEmpty()){
                //Creo un índice aleatorio
               
                int indicePerro = random.nextInt(perrosDisponibles.size());
                Perro perro = perrosDisponibles.get(indicePerro);
                
                personas.get(i).setPerro(perro);
                perrosDisponibles.remove(indicePerro);
                
            }
        }
        
    }
    //Getter and Setters

    public List<Perro> getPerros() {
        return perros;
    }
    
    public List<Persona> getPersonas() {
        return personas;
    }
    
    public void setPerros(List<Perro> perros) {
        this.perros = perros;
    }
    
    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }
    
    //Constructores
    
    public EntitiesService(List<Perro> perros, List<Persona> personas) {
        this.perros = perros;
        this.personas = personas;
    }

    public EntitiesService() {
    }
    
    
    
}
