/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Matematica;

/**
 *
 * @author diego
 */
public class MathService {
    
    //Métodos 
    public Matematica crearMat(){
        Matematica mat = new Matematica(Math.random()*10, Math.random()*10);
        return mat;
    }
    
    public void devolverMayor(Matematica mat){
        if (mat.getNum1() > mat.getNum2()){
            System.out.println("El número 1 es mayor");
        } else {
            System.out.println("El número 2 es mayor");
        }
    }
    
    public void calcularPotencia(Matematica mat){
        if (mat.getNum1() > mat.getNum2()){
            System.out.println(Math.pow(Math.round(mat.getNum1()), Math.round(mat.getNum2())));
        } else {
            System.out.println(Math.pow(Math.round(mat.getNum2()), Math.round(mat.getNum1())));
        }
    }
    
    public void calcularRaiz(Matematica mat){
        if (mat.getNum1() > mat.getNum2()){
            Math.sqrt(Math.abs(mat.getNum2()));
        } else {
            Math.sqrt(Math.abs(mat.getNum1()));
        }
    }
    
}
