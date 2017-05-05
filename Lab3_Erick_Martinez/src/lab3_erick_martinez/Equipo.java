/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_erick_martinez;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Equipo {
    public String nombre;
    public int palmares;
    public String ciudad;
    public double presupuesto;
    public ArrayList<Jugadores> lista = new ArrayList();

    public Equipo() {
    }

    public Equipo(String nombre, int palmares, String ciudad, double presupuesto) {
        this.nombre = nombre;
        this.palmares = palmares;
        this.ciudad = ciudad;
        this.presupuesto = presupuesto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPalmares() {
        return palmares;
    }

    public void setPalmares(int palmares) {
        this.palmares = palmares;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public ArrayList<Jugadores> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Jugadores> lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return "Equipo{" + "\nNombre=" + nombre + ", Palmares=" + palmares + "\nCiudad=" + ciudad + ", Presupuesto=" + presupuesto + "\nLista=" + lista + '}';
    }
    
}
