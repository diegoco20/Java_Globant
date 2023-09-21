/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.relations_extra_ej2;

import Entities.Sala;
import Services.CineService;

/**
 *
 * @author diego
 */
public class Relations_Extra_Ej2 {

    public static void main(String[] args) {
        CineService cs = new CineService();
        Sala sala = cs.crearSala();
        
        cs.ImprimirSala(sala);
        
        
    }
    
    
}
