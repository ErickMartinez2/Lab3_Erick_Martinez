/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_erick_martinez;

/**
 *
 * @author usuario
 */
public class Medio extends Jugadores {
    public int nivel_creatividad;
    public int nivel_dominio;
    public double promedio;

    public Medio() {
        super();
    }

    public Medio(int nivel_creatividad, int nivel_dominio, double promedio, String nombre, String apellido, int edad, int estado, String pais, String pie, int numero, double precio, String equipo) {
        super(nombre, apellido, edad, estado, pais, pie, numero, precio, equipo);
        this.nivel_creatividad = nivel_creatividad;
        this.nivel_dominio = nivel_dominio;
        this.promedio = promedio;
    }

    public int getNivel_creatividad() {
        return nivel_creatividad;
    }

    public void setNivel_creatividad(int nivel_creatividad) {
        this.nivel_creatividad = nivel_creatividad;
    }

    public int getNivel_dominio() {
        return nivel_dominio;
    }

    public void setNivel_dominio(int nivel_dominio) {
        this.nivel_dominio = nivel_dominio;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return super.toString() + "Medio{" + "nivel_creatividad=" + nivel_creatividad + ", nivel_dominio=" + nivel_dominio + ", promedio=" + promedio + '}';
    }
   
    
}
