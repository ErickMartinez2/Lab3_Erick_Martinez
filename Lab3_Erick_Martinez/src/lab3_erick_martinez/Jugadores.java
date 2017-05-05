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
public class Jugadores {
    public String nombre;
    public String apellido;
    public int edad;
    public int estado;
    public String pais;
    public String pie;
    public int numero;
    public double precio;
    public String equipo;

    public Jugadores() {
    }

    public Jugadores(String nombre, String apellido, int edad, int estado, String pais, String pie, int numero, double precio, String equipo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.estado = estado;
        this.pais = pais;
        this.pie = pie;
        this.numero = numero;
        this.precio = precio;
        this.equipo = equipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getPie() {
        return pie;
    }

    public void setPie(String pie) {
        this.pie = pie;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    @Override
    public String toString() {
        return "Jugadores{" + ", Nombre=" + nombre + "\nApellido=" + apellido + ", Edad=" + edad + "\nEstado=" + estado + ", Pais=" + pais + "\nPie=" + pie + ", Numero=" + numero + "\nprecio=" + precio + ", equipo=" + equipo + '}';
    }
    
}