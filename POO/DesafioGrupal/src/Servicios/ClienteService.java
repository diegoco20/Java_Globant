/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Cliente;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author diego
 */
public class ClienteService {
    private static final List<Cliente> clientes = new ArrayList<Cliente> ();
    
    Scanner sc = new Scanner(System.in);
    
    // Getters

    public static List<Cliente> getClientes() {
        return clientes;
    }


    
    
    
    //Metodos 
    
    public void registrarCliente(){
        System.out.println("Ingrese el nombre");
        String nombre = sc.nextLine();
        System.out.println("Ingresa la edad");
        int edad = sc.nextInt();
        System.out.println("Ingresa la altura");
        double altura = sc.nextDouble();
        System.out.println("Ingresa el peso");
        double peso = sc.nextDouble();
        sc.nextLine();
        System.out.println("Ingresa el objetivo");
        String objetivo = sc.nextLine();
        
        Cliente cliente = new Cliente(nombre, edad, altura, peso, objetivo);
        clientes.add(cliente);
    }
    
    public static Cliente buscarCliente(int id){
        List <Cliente> clientes = new ArrayList <Cliente> ();
        clientes = getClientes();
        for (Cliente cliente : clientes){
            if (cliente.getId() == id){
                return cliente;
            }
        } 
        return null;
    }
    
    public static Cliente mostrarCliente(int id){
        if (buscarCliente(id) == null){
            System.out.println("Cliente no encontrado");
            return null;
        }
        
        System.out.println(buscarCliente(id).getNombre());
        return buscarCliente(id);
    }
    
    
}

