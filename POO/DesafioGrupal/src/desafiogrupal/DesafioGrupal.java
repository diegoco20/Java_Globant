/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package desafiogrupal;

import Entidades.Cliente;
import Servicios.ClienteService;

/**
 *
 * @author diego
 */
public class DesafioGrupal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ClienteService cs = new ClienteService();
        Cliente cliente = new Cliente ();
        
        cs.registrarCliente();
        cs.registrarCliente();
        cs.mostrarCliente(1);
        cs.mostrarCliente(2);
    }
    
}
