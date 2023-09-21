/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author diego
 */
public class Curso {
    
    private String nombreCurso;
    private int cantidadHorasPorDia;
    private int cantidadDiasPorSemana;
    private char turno;
    private int precioPorHora;
    private String[] alumno;
    
    public Curso (){
        
    }
    
    public Curso(String nombre, int horasDia, int diasSemana, char turno, int precioHora, String [] alumnos){
        nombreCurso = nombre;
        cantidadHorasPorDia = horasDia;
        cantidadDiasPorSemana = diasSemana;
        this.turno = turno;
        precioPorHora = precioHora;
        alumno = alumnos;
    }
    
    //Getters

    public String getNombreCurso() {
        return nombreCurso;
    }

    public int getCantidadHorasPorDia() {
        return cantidadHorasPorDia;
    }

    public int getCantidadDiasPorSemana() {
        return cantidadDiasPorSemana;
    }

    public char getTurno() {
        return turno;
    }

    public int getPrecioPorHora() {
        return precioPorHora;
    }

    public String[] getAlumno() {
        return alumno;
    }
    
    //Setters

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public void setCantidadHorasPorDia(int cantidadHorasPorDia) {
        this.cantidadHorasPorDia = cantidadHorasPorDia;
    }

    public void setCantidadDiasPorSemana(int cantidadDiasPorSemana) {
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
    }

    public void setTurno(char turno) {
        this.turno = turno;
    }

    public void setPrecioPorHora(int precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    public void setAlumno(String[] alumno) {
        this.alumno = alumno;
    }
    
    
}
