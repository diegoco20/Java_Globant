/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Cuenta;
import java.util.Scanner;

/**
 *
 * @author diego
 */
public class CuentaService {
    Scanner leer = new Scanner(System.in);
    
    //Métodos
    //Crea una nueva cuenta:
    public Cuenta crearCuenta(){
        System.out.println("Ingresa el número de cuenta");
        int cuenta = leer.nextInt();
        while (cuenta<0){
            System.out.println("Número incorrecto, intenta de nuevo");
            cuenta=leer.nextInt();
        }
        
        System.out.println("Ingresa tu DNI");
        long dni = leer.nextLong(); 
        while (String.valueOf(dni).length()!= 8 || dni < 0){ 
            System.out.println("DNI incorreto, ingresa un DNI de 8 dígitos");
            dni = leer.nextLong();
        }
        
        System.out.println("Ingresa el saldo :v");
        int saldo = leer.nextInt();
        while(saldo<0){
            System.out.println("Saldo no puede negativo, intenta de nuevo");
            saldo = leer.nextInt();
        }
        
        
        Cuenta account = new Cuenta(cuenta, dni, saldo);
        return account;
    }
    
    public void ingreso(Cuenta account){
        
        System.out.println("Ingresa una cantidad a depositar");
        int cant = leer.nextInt();
        while (cant<0){
            System.out.println("Cantidad negativa, intenta de nuevo");
            cant = leer.nextInt();
        }
        account.setSaldo( account.getSaldo() + cant);
    }
    
    public void retirar(Cuenta account){
        System.out.println("Saldo disponible: " + account.getSaldo());
        System.out.println("Ingresa la cantidad a retirar");
        int retiro = leer.nextInt();
        while(retiro<0){
            System.out.println("Retiro no puede ser negativo, intenta de nuevo");
            retiro = leer.nextInt();
        }
        boolean neg = true;
        boolean bal = true;
        
        while (neg && bal){
            System.out.println("Cantidad superior al saldo, ingresa cantidad menor");
            retiro = leer.nextInt();
            
        }
        while(retiro > account.getSaldo()){
            System.out.println("Cantidad superior al saldo, ingresa cantidad menor");
            retiro = leer.nextInt();
        }
        
        account.setSaldo( account.getSaldo() - retiro);
        System.out.println("Retiro exitoso");
        System.out.println("Nuevo saldo: " + account.getSaldo());
    }
    
    
    
    public void extraccionRapida(Cuenta account){
        if (account.getSaldo() > 0){
            System.out.println("Dinero retirado: " + account.getSaldo()*0.2);
            account.setSaldo((int) (account.getSaldo()*0.8));
            
            System.out.println("Nuevo saldo: " + account.getSaldo());
        }
    }
    
    public void consultarSaldo(Cuenta account){
        System.out.println("Saldo disponible: " + account.getSaldo());
    }
    
    public void consultarDatos(Cuenta account){
        System.out.println("Número de cuenta: " + account.getNumeroCuenta());
        System.out.println("DNI: " + account.getDni() );
        System.out.println("Saldo: " + account.getSaldo());
        
    }
    
    
    
}
