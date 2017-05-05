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
public class Delantero extends Jugadores {
    public int nivel_definicion;
    public double altura;
    public double velocidad;
    public double promedio;

    public Delantero() {
        super();
    }

    public Delantero(int nivel_definicion, double altura, double velocidad, double promedio, String nombre, String apellido, int edad, int estado, String pais, String pie, int numero, double precio, String equipo) {
        super(nombre, apellido, edad, estado, pais, pie, numero, precio, equipo);
        this.nivel_definicion = nivel_definicion;
        this.altura = altura;
        this.velocidad = velocidad;
        this.promedio = promedio;
    }

    public int getNivel_definicion() {
        return nivel_definicion;
    }

    public void setNivel_definicion(int nivel_definicion) {
        this.nivel_definicion = nivel_definicion;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return super.toString() + "\n-> Delantero{" + "\nNivel_Definicion=" + nivel_definicion + ", Altura=" + altura + "\nVelocidad=" + velocidad + ", Promedio=" + promedio + '}';
    }
}