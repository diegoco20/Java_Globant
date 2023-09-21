/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13;

import Entidades.Curso;
import Servicios.CursoService;

/**
 *
 * @author diego
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        CursoService cs = new CursoService();
        Curso curso = new Curso();
        
        String prueba = new String();
        prueba = "Hello World";
        char pruebas = prueba.charAt(0);
        System.out.println(pruebas);
        
        curso = cs.crearCurso();
        cs.calcularGananciaSemanal(curso);
    }
    
}
