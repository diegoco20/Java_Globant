/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author diego
 */
public class Cuenta {
    
    //Atributos
    private int numeroCuenta;
    private long dni;
    private int saldo;
    
    //Constructores
    public Cuenta(){
    }
    
    public Cuenta(int numero, long dni, int saldo){
        numeroCuenta = numero;
        this.dni = dni;
        this.saldo = saldo;
    }
    
    //Setters
    public void setNumeroCuenta(int numero){
        this.numeroCuenta = numero;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }
    
    public void setSaldo(int saldo){
        this.saldo = saldo;
    }
    
    //Getters
    public int getNumeroCuenta(){
        return numeroCuenta;
    }
    
    public long getDni(){
        return dni;
    }
    
    public int getSaldo(){
        return saldo;
    }
    
    //Método to String 

    @Override
    public String toString() {
        return "Cuenta{" + "numeroCuenta=" + numeroCuenta + ", dni=" + dni + ", saldo=" + saldo + '}';
    }
    
}
