/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import Entidades.Matematica;
import Servicios.MathService;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MathService ms = new MathService();
        Matematica mat = ms.crearMat();
        ms.calcularPotencia(mat);
        ms.calcularRaiz(mat);
        ms.devolverMayor(mat);
    }
}
