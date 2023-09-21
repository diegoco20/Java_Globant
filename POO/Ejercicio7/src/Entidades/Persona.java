/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Persona {
    
    Scanner leer = new Scanner(System.in);
    
    //Atributos
    private String nombre;
    private int edad;
    private char sexo;
    private int peso;
    private int altura;
    
    //Constructores
    public Persona(){     
    }

    public Persona(String nombre, int edad, char sexo, int peso, int altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }
    
    //Getters

    public int getAltura() {
        return altura;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public int getPeso() {
        return peso;
    }

    public char getSexo() {
        return sexo;
    }

    
    @Override
    public String toString() {
        return "Persona{"+ "nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura + '}';
    }
    
    
    //Setters
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    public void setPeso(int peso){
        this.peso = peso;
    }
    
    public void setSexo(char sexo){
        if (sexo == 'M' || sexo == 'H' || sexo=='O'){
           this.sexo=sexo; 
        } else {
            this.sexo = 'N';
        }
    }
    
    //Métodos
    public Persona crearPersona(){
        
        System.out.println("Ingresa el nombre: ");
        String nombre = leer.nextLine();
        
        System.out.println("Ingresa la edad: ");
        int edad = leer.nextInt();
         while (edad<0){
             System.out.println("La edad no puede ser negativa, intenta de nuevo");
             edad = leer.nextInt();
         }
         
        System.out.println("Ingresa tu sexo: (M, H, O)");
        char sexo = leer.next().charAt(0);
        while (sexo != 'M' && sexo != 'H' && sexo != 'O'){
            System.out.println("Sexo no permitido, intenta de nuevo: ");
            sexo = leer.next().charAt(0);
        }
                        
        System.out.println("Ingresa tu peso: ");
        int peso = leer.nextInt();
        while (peso<0){
            System.out.println("El peso no puede ser negativo, intenta de nuevo");
            peso = leer.nextInt();
         }
        
        System.out.println("Ingresa la altura: ");
        int altura = leer.nextInt();
        while (altura<0){
             System.out.println("La altura no puede ser negativa, intenta de nuevo");
             altura = leer.nextInt();
         }
         
        
        Persona persona = new Persona(nombre, edad, sexo, peso, altura);
        return persona;
    }
    
    public double calcularIMC(Persona persona){
        double imc = persona.peso/persona.altura*persona.altura;
        return imc;
    }
    
    public boolean mayorEdad(Persona persona){
        boolean mayor = false;
        if (persona.getEdad()>18){
            mayor=true;
            return mayor;
        }
        return mayor;
    }
}
