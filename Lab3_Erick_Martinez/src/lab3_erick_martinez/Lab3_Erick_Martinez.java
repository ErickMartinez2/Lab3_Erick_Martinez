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
                    Modificar();
                    break;
                case 3:
                    
                    break;
            }
        } while (opcion != 10);
    }

    public static void Crear() {
        System.out.println();
        System.out.println("-> Crear Jugador");
        System.out.print("Ingrese el nombre: ");
        String nombre = sc.next();
        System.out.print("Ingrese el apellido: ");
        String apellido = sc.next();
        System.out.print("Ingrese la edad: ");
        int edad = sc.nextInt();
        System.out.print("Ingrese el pais de nacimiento: ");
        sc.nextLine();
        String pais = sc.nextLine();
        System.out.print("Ingrese el pie preferido: ");
        String pie = sc.next();
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
                Jugadores J_D = new Delantero(definicion, altura, velocidad, promedio, nombre, apellido, edad, 1, pais, pie, 0, precio, "");
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
                Jugadores J_M = new Medio(creatividad, dominio, promedio2, nombre, apellido, edad, 1, pais, pie, 0, precio, "");
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
                Jugadores J_D2 = new Defensa(agresividad, altura2, peso, velocidad2, nombre, apellido, edad, 1, pais, pie, 0, precio, "");
                jugador.add(J_D2);
                break;
            case 4:
                System.out.println("-> Portero");
                System.out.print("Ingrese su nivel de juego aereo (1-10): ");
                int aereo = sc.nextInt();
                System.out.print("Ingrese su nivel con los pies (1-10): ");
                int pies = sc.nextInt();
                Jugadores J_P = new Portero(aereo, pies, nombre, apellido, edad, 1, pais, pie, 0, precio, "");
                jugador.add(J_P);
                break;
        }
    }

    public static void Modificar() {
        System.out.println();
        System.out.println("-> Modificar Jugador");
        System.out.println(" Jugadores:");
        for (int i = 0; i < jugador.size(); i++) {
            System.out.println(i + ". " + jugador.get(i));
        }
        System.out.print("Ingrese el numero del jugador: ");
        int num = sc.nextInt();
        System.out.println(" Informacion General");
        System.out.println("1. Nombre");
        System.out.println("2. Apellido");
        System.out.println("3. Edad");
        System.out.println("4. Pais de Nacimiento");
        System.out.println("5. Pie Preferido");
        System.out.println("6. Precio");
        System.out.println("7. Informacion Detallada");
        System.out.print("Ingrese su opcion: ");
        int opcion2 = sc.nextInt();
        System.out.println(" Modificacion");
        switch (opcion2) {
            case 1:
                System.out.print("Ingrese el nombre: ");
                String nombre = sc.next();
                jugador.get(num).setNombre(nombre);
                break;
            case 2:
                System.out.print("Ingrese el apellido: ");
                String apellido = sc.next();
                jugador.get(num).setApellido(apellido);
                break;
            case 3:
                System.out.print("Ingrese la edad: ");
                int edad = sc.nextInt();
                jugador.get(num).setEdad(edad);
                break;
            case 4:
                System.out.print("Ingrese el pais de nacimiento: ");
                sc.nextLine();
                String pais = sc.nextLine();
                jugador.get(num).setPais(pais);
                break;
            case 5:
                System.out.print("Ingrese el pie preferido: ");
                String pie = sc.next();
                jugador.get(num).setPie(pie);
                break;
            case 6:
                System.out.print("Ingrese el precio: ");
                double precio = sc.nextDouble();
                jugador.get(num).setPrecio(precio);
                break;
            case 7:
                System.out.println();
                if (jugador.get(num) instanceof Delantero) {
                    System.out.println(" Delantero:");
                    System.out.println("1. Nivel de Definicion");
                    System.out.println("2. Altura");
                    System.out.println("3. Velocidad");
                    System.out.println("4. Promedio de Goles");
                    System.out.print("Ingrese su opcion: ");
                    int opcion3 = sc.nextInt();
                    System.out.println();
                    switch (opcion3) {
                        case 1:
                            System.out.print("Ingrese el nivel de definicion: ");
                            int definicion = sc.nextInt();
                            ((Delantero) jugador.get(num)).setNivel_definicion(definicion);
                            break;
                        case 2:
                            System.out.print("Ingrese la altura: ");
                            double altura = sc.nextDouble();
                            ((Delantero) jugador.get(num)).setAltura(altura);
                            break;
                        case 3:
                            System.out.print("Ingrese la velocidad: ");
                            double velocidad = sc.nextDouble();
                            ((Delantero) jugador.get(num)).setVelocidad(velocidad);
                            break;
                        case 4:
                            System.out.print("Ingrese el promedio de goles por partido: ");
                            double promedio = sc.nextDouble();
                            ((Delantero) jugador.get(num)).setPromedio(promedio);
                            break;
                    }
                } else {
                    if (jugador.get(num) instanceof Medio) {
                        System.out.println(" Medio:");
                        System.out.println("1. Nivel de Creatividad");
                        System.out.println("2. Nivel de Dominio");
                        System.out.println("3. Promedio de Asistencias");
                        System.out.print("Ingrese su opcion: ");
                        int opcion3 = sc.nextInt();
                        System.out.println();
                        switch (opcion3) {
                            case 1:
                                System.out.print("Ingrese el nivel de creatividad: ");
                                int creatividad = sc.nextInt();
                                ((Medio) jugador.get(num)).setNivel_creatividad(creatividad);
                                break;
                            case 2:
                                System.out.print("Ingrese el nivel de dominio: ");
                                int dominio = sc.nextInt();
                                ((Medio) jugador.get(num)).setNivel_dominio(dominio);
                                break;
                            case 3:
                                System.out.print("Ingrese el promedio de asistencias: ");
                                double promedio = sc.nextDouble();
                                ((Medio) jugador.get(num)).setPromedio(promedio);
                                break;
                        }
                    } else {
                        if (jugador.get(num) instanceof Defensa) {
                            System.out.println(" Defensa:");
                            System.out.println("1. Nivel de Agresividad");
                            System.out.println("2. Altura");
                            System.out.println("3. Peso");
                            System.out.println("4. Velocidad");
                            System.out.print("Ingrese su opcion: ");
                            int opcion3 = sc.nextInt();
                            System.out.println();
                            switch (opcion3) {
                                case 1:
                                    System.out.print("Ingrese el nivel de agresividad: ");
                                    int agresividad = sc.nextInt();
                                    ((Defensa) jugador.get(num)).setNivel_agresividad(agresividad);
                                    break;
                                case 2:
                                    System.out.print("Ingrese la altura: ");
                                    double altura = sc.nextDouble();
                                    ((Defensa) jugador.get(num)).setAltura(altura);
                                    break;
                                case 3:
                                    System.out.print("Ingrese el peso: ");
                                    double peso = sc.nextDouble();
                                    ((Defensa) jugador.get(num)).setPeso(peso);
                                    break;
                                case 4:
                                    System.out.print("Ingrese la velocidad: ");
                                    double velocidad = sc.nextDouble();
                                    ((Defensa) jugador.get(num)).setVelocidad(velocidad);
                                    break;
                            }
                        } else {
                            if (jugador.get(num) instanceof Portero) {
                                System.out.println(" Portero:");
                                System.out.println("1. Nivel de Juego Aereo");
                                System.out.println("2. Nivel de Juego con los Pies");
                                System.out.print("Ingrese su opcion: ");
                                int opcion3 = sc.nextInt();
                                System.out.println();
                                switch (opcion3) {
                                    case 1:
                                        System.out.print("Ingrese el nivel de juego aereo: ");
                                        int aereo = sc.nextInt();
                                        ((Portero) jugador.get(num)).setNivel_aereo(aereo);
                                        break;
                                    case 2:
                                        System.out.print("Ingrese el nivel de juego con los pies: ");
                                        int pies = sc.nextInt();
                                        ((Portero) jugador.get(num)).setNivel_pies(pies);
                                        break;
                                }
                            }
                        }
                    }
                }
                break;
        }
    }
}
