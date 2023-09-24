/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author diego
 */
public class Botas extends ElementosArmadura {
    private static double consumo_acumulado;
    
    public Botas() {
        consumo=100000;
        esta_danado=false;
        consumo_acumulado = 0;
    }
    
    public boolean getEsta_danado() {
        return esta_danado;
    }

    public void setEsta_danado(boolean esta_danado) {
        this.esta_danado = esta_danado;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public static double getConsumo_acumulado() {
        return consumo_acumulado;
    }

    public static void setConsumo_acumulado(double consumo_acumulado) {
        Botas.consumo_acumulado = consumo_acumulado;
    }
}
