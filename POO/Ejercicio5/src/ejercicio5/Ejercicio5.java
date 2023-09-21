/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;

import Entidades.Cuenta;
import Servicios.CuentaService;

/**
 *
 * @author diego
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CuentaService accountSer = new CuentaService();
        Cuenta account1 = accountSer.crearCuenta();
        System.out.println(account1);
        
        accountSer.ingreso(account1);
        System.out.println(account1);
        
        accountSer.retirar(account1);
        System.out.println(account1);
        
        accountSer.extraccionRapida(account1);
        System.out.println(account1);
    }
    
    
}
