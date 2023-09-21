/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author diego
 */
public class PersonaService {
    Scanner sc = new Scanner(System.in);
    
    public Persona crearPersona(){
        
        System.out.println("Ingresa el nombre");
        String nombre = sc.nextLine();
        
        System.out.println("Ingrese el año de nacimiento");
        int anio = sc.nextInt();
        
        System.out.println("Ingrese el mes de nacimiento");
        int mes = sc.nextInt();
        while (mes<1 || mes>12){
            System.out.println("Mes incorrecto intenta nuevamente");
            mes = sc.nextInt();
        }
        
        System.out.println("Ingrese el día de nacimiento");
        int dia = sc.nextInt();
        while (dia<1 || dia>31){
            System.out.println("Dia incorrecto intenta nuevamente");
            mes = sc.nextInt();
        }
        
        Date fecha = new Date(anio-1900, mes-1, dia);
        Persona persona = new Persona(nombre, fecha);
        
        return persona;
    }
    
    public int calcularEdad(Persona prs){
        Date fecha = new Date();
        System.out.println("La edad es: " + String.valueOf(fecha.getYear() - prs.getNacimiento().getYear()) + " años");
        int fechas = fecha.getYear() - prs.getNacimiento().getYear();
        return fechas;
               
    }
    
    public void menorQue(Persona prs1, int edad){
        if (calcularEdad(prs1) < edad){
            System.out.println(prs1.getNombre() + " es menor");
        } else {
            System.out.println(prs1.getNombre() + " es mayor");
        }
    }
    
    
}
