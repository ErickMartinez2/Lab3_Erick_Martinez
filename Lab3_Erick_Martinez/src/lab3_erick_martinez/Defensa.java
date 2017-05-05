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
public class Defensa extends Jugadores {
    public int nivel_agresividad;
    public double altura;
    public double peso;
    public double velocidad;

    public Defensa() {
        super();
    }

    public int getNivel_agresividad() {
        return nivel_agresividad;
    }

    public void setNivel_agresividad(int nivel_agresividad) {
        this.nivel_agresividad = nivel_agresividad;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return super.toString() + "Defensa{" + "nivel_agresividad=" + nivel_agresividad + ", altura=" + altura + ", peso=" + peso + ", velocidad=" + velocidad + '}';
    }
    
    
}
