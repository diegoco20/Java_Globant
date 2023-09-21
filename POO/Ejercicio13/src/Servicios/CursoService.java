/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Curso;
import java.util.Scanner;

/**
 *
 * @author diego
 */
public class CursoService {
    Scanner sc = new Scanner(System.in);
    
    public String[] cargarAlumnos(){
        String alumnos[] = new String [5];
        for (int i=0; i<5; i++){
            System.out.println("Ingresa el alumno " + (i+1));
            alumnos[i] = sc.nextLine();

        }
        
        return alumnos;
    }
    
    public void mostrarAlumnos(Curso curso){
        String [] alumnos = curso.getAlumno();
        for (int i=0; i<5; i++){
            System.out.println("Alumno " + (i+1) + " " + alumnos[i]);
        }
        
    }
    
    public Curso crearCurso(){
        System.out.println("Ingresa el nombre del curso: ");
        String nombre = sc.nextLine();
        
        System.out.println("Cantidad de horas por día: ");
        int horasDia = sc.nextInt();
        while (horasDia > 24 || horasDia < 0){
            System.out.println("Número de horas incorrecto, ingresa un númeor entre 1 y 24");
            horasDia = sc.nextInt();
        }
        
        System.out.println("Ingresa el número de días por semana");
        int diasSemana = sc.nextInt();
        while(diasSemana > 8 || diasSemana < 0){
            System.out.println("Ingresa una cantidad entre 1 y 7");
            diasSemana = sc.nextInt();
            sc.nextLine();
        }
        
        String turno = sc.nextLine();
        char firstChar;
        if (!turno.isEmpty()) {
            firstChar = turno.charAt(0);  // Acceder al primer carácter
            
        } else {
            System.out.println("Turno: Mañana (M) o Tarde(T)");
            turno = sc.nextLine();
            firstChar = turno.charAt(0);
            while (firstChar != 'M' && firstChar != 'T'){
                System.out.println("Caracter incorrecto intenta de nuevo: ");
                turno = sc.nextLine();
                firstChar = turno.charAt(0);
            }
        }
       
        
        System.out.println("Ingresa el precio por hora: ");
        int precioHora = sc.nextInt();
      
        String [] alumnos = cargarAlumnos(); 
        
        Curso curso = new Curso(nombre, horasDia, diasSemana, firstChar, precioHora, alumnos);
        
        return curso;
    }
    
    public void calcularGananciaSemanal(Curso curso){
        int ganancia = curso.getCantidadDiasPorSemana()*curso.getCantidadHorasPorDia()*curso.getPrecioPorHora();
        System.out.println("La ganancia semanal es: " + ganancia );
        
    }
}


