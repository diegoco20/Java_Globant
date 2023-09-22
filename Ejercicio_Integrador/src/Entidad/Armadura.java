/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.Random;

/**
 *
 * @En este trabajo se deberá crear en el proyecto una clase llamada Armadura
 * que modele toda la información y las acciones que pueden efectuarse con la
 * Armadura de Iron Man. Las armaduras de Stark se encuentran definidas por un
 * color primario y un color secundario. Se encuentran compuestas de dos
 * propulsored, uno en cada bota; y dos repulsores, uno en cada guante (los
 * repulsores se utilizan también como armas). Tony los utiliza en su conjunto
 * para volar. La armadura tiene un nivel de resistencia, que depende del
 * material con el que está fabricada, y se mide con un número entero cuya
 * unidad de medida de dureza es Rockwell
 * (https://es.wikipedia.org/wiki/Dureza_Rockwell). Todas las armaduras poseen
 * un nivel de salud el cual se mide de 0 a 100. Además, Tony tiene un
 * generador, el cual le sirve para salvarle la vida en cada instante de tiempo
 * alejando las metrallas de metal de su corazón y también para alimentar de
 * energía a la armadura. La batería a pesar de estar en el pecho de Tony, es
 * considerada como parte de la armadura. La armadura también posee una consola
 * en el casco, a través de la cual JARVIS le escribe información a Iron Man. En
 * el casco también se encuentra un sintetizador por donde JARVIS susurra cosas
 * al oído de Tony. Cada dispositivo de la armadura de Iron Man (botas, guantes,
 * consola y sintetizador) tienen un consumo de energía asociado.
 */
public class Armadura {

    private String color_primario;
    private String color_secundario;

    private Integer nivel_resistencia;
    private Integer salud;
    private String material;
    private double generador;
    private double bateria;
    private Botas botas;
    private Guantes guantes;
    private Consola consola;
    private Sintetizador sintetizador;

    /////Atributos armadura, partes///////
    public Armadura() {
        this.color_primario = "Rojo";
        this.color_secundario = "Amarillo";
        this.nivel_resistencia = 80; ///Rockwell
        this.salud = 100;
        this.material = "Titanio";
        this.generador = 900_000_000;
        this.bateria = (generador / 900_000_000) * 100;
        this.botas = new Botas();
        this.guantes = new Guantes();
        this.consola = new Consola();
        this.sintetizador = new Sintetizador();
    }

    public Armadura(String color_primario, String color_secundario, Integer nivel_resistencia, Integer salud, String material, double generador, double bateria, Botas botas, Guantes guantes, Consola consola, Sintetizador sintetizador) {
        this.color_primario = color_primario;
        this.color_secundario = color_secundario;
        this.nivel_resistencia = nivel_resistencia;
        this.salud = salud;
        this.material = material;
        this.generador = 900000000;
        this.bateria = (generador / 900000000) * 100;
        this.botas = new Botas();
        this.guantes = new Guantes();
        this.consola = new Consola();
        this.sintetizador = new Sintetizador();
    }

    public Integer getNivel_resistencia() {
        return nivel_resistencia;
    }

    public void setNivel_resistencia(Integer nivel_resistencia) {
        this.nivel_resistencia = nivel_resistencia;
    }

    public Integer getSalud() {
        return salud;
    }

    public void setSalud(Integer salud) {
        this.salud = salud;
    }

    public double getGenerador() {
        return generador;
    }

    public void setGenerador(double generador) {
        this.generador = generador;
    }

    public double getBateria() {
        return bateria;
    }

    public void setBateria(double bateria) {
        this.bateria = bateria;
    }

    public Botas getBotas() {
        return botas;
    }

    public void setBotas(Botas botas) {
        this.botas = botas;
    }

    public Guantes getGuantes() {
        return guantes;
    }

    public void setGuantes(Guantes guantes) {
        this.guantes = guantes;
    }

    public Consola getConsola() {
        return consola;
    }

    public void setConsola(Consola consola) {
        this.consola = consola;
    }

    public Sintetizador getSintetizador() {
        return sintetizador;
    }

    public void setSintetizador(Sintetizador sintetizador) {
        this.sintetizador = sintetizador;
    }

    /**
     *
     * • Al caminar la armadura hará un uso básico de las botas y se consumirá
     * la energía establecida como consumo en la bota por el tiempo en el que se
     * camine. • Al correr la armadura hará un uso normal de las botas y se
     * consumirá el doble de la energía establecida como consumo en la bota por
     * el tiempo en el que se corra. 15 • Al propulsarse la armadura hará un uso
     * intensivo de las botas utilizando el triple de la energía por el tiempo
     * que dure la propulsión. • Al volar la armadura hará un uso intensivo de
     * las botas y de los guantes un uso normal consumiendo el triple de la
     * energía establecida para las botas y el doble para los guantes. • Al
     * utilizar los guantes como armas el consumo se triplica durante el tiempo
     * del disparo. • Al utilizar las botas para caminar o correr el consumo es
     * normal durante el tiempo que se camina o se corra. • Cada vez que se
     * escribe en la consola o se habla a través del sintetizador se consume lo
     * establecido en estos dispositivos. Solo se usa en nivel básico. • Cada
     * vez que se efectúa una acción se llama a los métodos usar del dispositivo
     * se le pasa el nivel de intensidad y el tiempo. El dispositivo debe
     * retornar la energía consumida y la armadura deberá informar al generador
     * se ha consumido esa cantidad de energía. Modele las clases, los atributos
     * y los métodos necesarios para poder obtener un modelo real de la armadura
     * y del estado de la misma.
     */
    ///Metodos///////////////
    /**
     *
     */
    public double caminar(int tiempo_segundos) {
        double consumo = 0;

        System.out.println("Caminando por: " + tiempo_segundos + " segundos...");
        try {

            if (!botas.esta_danado) {
                for (int i = 0; i < tiempo_segundos; i++) {

                    generador -= botas.consumo;
                    consumo += botas.consumo;
                    if (botas.consumo > generador) {
                        throw new Exception("No hay energia para seguir caminando.");
                    }
                }

                bateria = (generador / 900000000) * 100;
                botas.esta_danado = probabilidadDanio();
                if (botas.esta_danado) {
                    while (!probabilidadReparacion()) {
                        if (probabilidadDanio()) {
                            break;
                        }

                    }
                    botas.esta_danado = false;
                }
            } else {
                System.out.println("Las botas estan danadas.");
            }

        } catch (Exception e) {
            e.getMessage();
        }

        return consumo;
    }

    ///////////////////////////////
    public double correr(int tiempo_segundos) {
        double consumo = 0;
        System.out.println("Corriendo por: " + tiempo_segundos + " segundos...");
        try {
            for (int i = 0; i < tiempo_segundos; i++) {
                generador -= botas.consumo * 2;
                consumo += botas.consumo * 2;
                if (botas.consumo > generador) {
                    throw new Exception("No hay energia para seguir corriendo.");
                }
            }
            bateria = (generador / 900000000) * 100;
        } catch (Exception e) {
            e.getMessage();
        }

        return consumo;
    }

    public void propulsar(int tiempo_segundos) {
    }

    public void volar(int tiempo_segundos) {
    }

    public void escribir() {
    }

    public void leer() {
    }

    public boolean probabilidadDanio() {
        Random random = new Random();
        return random.nextDouble() < 0.3;
    }

    public boolean probabilidadReparacion() {
        Random random = new Random();
        return random.nextDouble() < 0.4;
    }

}
