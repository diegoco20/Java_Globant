/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.relations_ej1;

import Entidades.Perro;
import Entidades.Persona;
import Enumeraciones.Raza;
import Servicios.EntitiesService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author diego
 */
public class Relations_Ej1 {

    public static void main(String[] args) {
        List<Perro> perros = new ArrayList<Perro>();
        List<Persona> personas = new ArrayList<Persona>();
        EntitiesService ps = new EntitiesService(perros, personas);
        
        
        ps.fabricaPerros(10);
        ps.fabricaPersonas(10);
        
        ps.asignarPerro();
        ps.imprimirPersonas();
        
        
    }

}