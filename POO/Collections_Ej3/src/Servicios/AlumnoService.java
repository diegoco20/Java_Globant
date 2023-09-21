/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author diego
 */
public class AlumnoService {
    private ArrayList <Alumno> alumnos = new ArrayList();
    private Scanner sc = new Scanner(System.in);
    
    public Alumno crearAlumno(){
        Alumno m = new Alumno();
        
        System.out.println("Ingresa el nombre");
        String nombre = sc.nextLine();
        
        Integer nota;
        for (int i = 0; i<3; i++) {
            nota = 0;
            
            System.out.println("Ingresa la nota " + (i+1));
            nota = sc.nextInt();
             
            
        }
    } 
}
