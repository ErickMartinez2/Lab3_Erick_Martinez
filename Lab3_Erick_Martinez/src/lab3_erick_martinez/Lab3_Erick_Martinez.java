/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_erick_martinez;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Lab3_Erick_Martinez {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Jugadores> jugador = new ArrayList();
    static ArrayList<Equipo> equipos = new ArrayList();
    static Jugadores j = new Jugadores();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("*** Control de Equipos ***");
            System.out.println("1. Crear Jugador");
            System.out.println("2. Modificar Jugador");
            System.out.println("3. Eliminar Jugador");
            System.out.println("4. Crear Equipo");
            System.out.println("5. Eliminar Equipo");
            System.out.println("6. Hacer Compras");
            System.out.println("7. Organizar Equipo");
            System.out.println("8. Listar Equipo");
            System.out.println("9. Listar Jugadores");
            System.out.println("10. Salir");
            System.out.print("Ingrese su opcion: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    Crear();
                    break;
                case 2:
                    break;
            }
        } while (opcion != 10);
    }

    public static void Crear() {
        System.out.println("-> Crear Jugador");
        System.out.print("Ingrese el nombre: ");
        String nombre = sc.next();
        System.out.print("Ingrese el apellido: ");
        String apellido = sc.next();
        System.out.print("Ingrese la edad: ");
        int edad = sc.nextInt();
        System.out.println(" Estado:");
        System.out.println("1. Libre");
        System.out.println("2. Comprado");
        System.out.print("Ingrese el numero del estado: ");
        int estado = sc.nextInt();
        sc.nextLine();
        System.out.print("Ingrese el pais de nacimiento: ");
        String pais = sc.nextLine();
        System.out.print("Ingrese el pie preferido: ");
        String pie = sc.next();
        System.out.print("Ingrese el numero de camiseta: ");
        int camiseta = sc.nextInt();
        System.out.print("Ingrese el precio: ");
        double precio = sc.nextDouble();
        System.out.println(" Posicion");
        System.out.println("1. Delantero");
        System.out.println("2. Medio");
        System.out.println("3. Defensa");
        System.out.println("4. Portero");
        int posicion = sc.nextInt();
        switch (posicion) {
            case 1:
                System.out.println("-> Delantero");
                System.out.print("Ingrese su nivel de definicion (1-10): ");
                int definicion = sc.nextInt();
                System.out.print("Ingrese su altura: ");
                double altura = sc.nextDouble();
                System.out.print("Ingrese su velocidad: ");
                double velocidad = sc.nextDouble();
                System.out.print("Ingrese su promedio de goles por partido: ");
                double promedio = sc.nextDouble();
                Jugadores J_D = new Delantero(definicion, altura, velocidad, promedio, nombre, apellido, edad, estado, pais, pie, camiseta, precio, "");
                jugador.add(J_D);
                break;
            case 2:
                System.out.println("-> Medio");
                System.out.print("Ingrese su nivel de creatividad (1-10): ");
                int creatividad = sc.nextInt();
                System.out.print("Ingrese su nivel de dominio (1-10): ");
                int dominio = sc.nextInt();
                System.out.print("Ingrese su promedio de asistencias por partido: ");
                double promedio2 = sc.nextDouble();
                Jugadores J_M = new Medio(creatividad, dominio, promedio2, nombre, apellido, edad, estado, pais, pie, camiseta, precio, "");
                jugador.add(J_M);
                break;
            case 3:
                System.out.println("-> Defensa");
                System.out.print("Ingrese su nivel de agresividad (1-10): ");
                int agresividad = sc.nextInt();
                System.out.print("Ingrese su altura: ");
                double altura2 = sc.nextDouble();
                System.out.print("Ingrese su peso: ");
                double peso = sc.nextDouble();
                System.out.print("Ingrese su velocidad: ");
                double velocidad2 = sc.nextDouble();
                Jugadores J_D2 = new Defensa(agresividad, altura2, peso, velocidad2, nombre, apellido, edad, estado, pais, pie, camiseta, precio, "");
                jugador.add(J_D2);
                break;
            case 4:
                System.out.println("-> Portero");
                System.out.print("Ingrese su nivel de juego aereo (1-10): ");
                int aereo = sc.nextInt();
                System.out.print("Ingrese su nivel con los pies (1-10): ");
                int pies = sc.nextInt();
                Jugadores J_P = new Portero(aereo, pies, nombre, apellido, edad, estado, pais, pie, camiseta, precio, "");
                jugador.add(J_P);
                break;
        }
    }
}
