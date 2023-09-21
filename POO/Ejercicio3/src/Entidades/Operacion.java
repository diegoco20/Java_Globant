/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Operacion {
    //Instancio Scanner
    Scanner leer = new Scanner(System.in);
    
    //Atributos 
    private int numero1;
    private int numero2;
    
    //Constructores
    public Operacion(){
    }
    public Operacion(int num1, int num2){
        numero1 = num1;
        numero2 = num2;
    }
    
    //Métodos get y set

    public int getNumero1() {
        return numero1;
    }
    
    public int getNumero2() {
        return numero2;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    
    //Métodos
    public void crearOperacion(){
        System.out.println("Ingresa el número 1");
        int num1 = leer.nextInt();
        if (num1>0){
            numero1 = num1;
        }
        
        System.out.println("Ingresa el número 2");
        int num2 = leer.nextInt();
        if (num2>0){
            numero2=num2;
        }
    }
    
    public int sumar(){
        return numero1+numero2;
    }
    
    public int restar(){
        return numero1-numero2;
    }
    
    public int multiplicar(){
        if (numero1 != 0 && numero2!= 0){
           return numero1*numero2;
        } else {
            System.out.println("Se está multiplicando por 0");
            return 0;
        }
    }
    
    public int dividir(){
        if (numero2==0){
            System.out.println("No se puede dividir por 0");
            return 0;
        } else {
            return numero1/numero2;
        }
    }
}

