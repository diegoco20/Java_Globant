/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8;

import Entidades.Cadena;
import Servicios.CadenaService;

/**
 *
 * @author diego
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CadenaService cadenaS = new CadenaService();
        Cadena cadena = cadenaS.crearCadena();
        cadenaS.mostraVocales(cadena);
        cadenaS.invertirFrase(cadena);
        cadenaS.vecesRepetido(cadena);
        cadenaS.unirFrases(cadena);
    }
    
}
