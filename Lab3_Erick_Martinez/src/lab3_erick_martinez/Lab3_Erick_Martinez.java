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
            System.out.println("5. Modificar Equipo");
            System.out.println("6. Eliminar Equipo");
            System.out.println("7. Hacer Compras");
            System.out.println("8. Organizar Equipo");
            System.out.println("9. Listar Equipo");
            System.out.println("10. Listar Jugadores");
            System.out.println("11. Salir");
            System.out.print("Ingrese su opcion: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    Crear();
                    System.out.println("Jugador Creado!");
                    break;
                case 2:
                    if (!jugador.isEmpty()) {
                        Modificar();
                        System.out.println("Jugador Modificado!");
                    } else {
                        System.out.println("No hay jugadores para modificar!");
                    }
                    break;
                case 3:
                    if (!jugador.isEmpty()) {
                        Eliminar();
                        System.out.println("Jugador Eliminado!");
                    } else {
                        System.out.println("No hay jugadores para eliminar!");
                    }
                    break;
                case 4:
                    Crear2();
                    System.out.println("Equipo Creado!");
                    break;
                case 5:
                    if (!equipos.isEmpty()) {
                        Modificar2();
                        System.out.println("Equipo Modificado!");
                    } else {
                        System.out.println("No hay equipos que modificar!");
                    }
                    break;
                case 6:
                    if (!equipos.isEmpty()) {
                        Eliminar2();
                        System.out.println("Equipo Eliminado!");
                    } else {
                        System.out.println("No hay equipos que eliminar!");
                    }
                    break;
                case 7:
                    if (!equipos.isEmpty() && !jugador.isEmpty()) {
                        Comprar();
                    } else {
                        System.out.println("No hay suficientes equipos o jugadores para realizar una compra!");
                    }
                    break;
                case 8:
                    if (!equipos.isEmpty() && !jugador.isEmpty()) {
                        Organizar();
                    } else {
                        System.out.println("No hay suficientes equipos o jugadores para organizar un equipo!");
                    }
                    break;
                case 9:
                    if (!equipos.isEmpty()) {
                        System.out.println();
                        System.out.println("-> Listar Equipos");
                        for (int i = 0; i < equipos.size(); i++) {
                            System.out.println("- " + equipos.get(i));
                        }
                    } else {
                        System.out.println("No hay equipos para listar!");
                    }
                    break;
                case 10:
                    if (!jugador.isEmpty()) {
                        System.out.println();
                        System.out.println("-> Listar Jugadores");
                        for (int i = 0; i < jugador.size(); i++) {
                            System.out.println("- " + jugador.get(i));
                        }
                    } else {
                        System.out.println("No hay suficientes jugadores para listar!");
                    }
                    break;
                case 11:
                    System.out.println();
                    System.out.println("-> Titulares y Suplentes");
                    System.out.println(" Equipos");
                    for (int i = 0; i < equipos.size(); i++) {
                        System.out.println(i + ". " + equipos.get(i).getNombre());
                    }
                    System.out.print("Ingrese el numero del equipo: ");
                    int Equipo1 = sc.nextInt();
                    System.out.println("Titulares:");
                    for (int i = 0; i < equipos.get(Equipo1).getLista().size(); i++) {
                        if (equipos.get(Equipo1).getLista().get(i).getEstado() == 3) {
                            System.out.println(equipos.get(Equipo1).getLista().get(i));
                        }
                    }
                    System.out.println("Suplentes:");
                    for (int i = 0; i < equipos.get(Equipo1).getLista().size(); i++) {
                        if (equipos.get(Equipo1).getLista().get(i).getEstado() != 3) {
                            System.out.println(equipos.get(Equipo1).getLista().get(i));
                        }
                    }
                    break;
            }
            System.out.println();
        } while (opcion != 11);
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
        System.out.print("Ingrese su opcion: ");
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
        System.out.println();
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

    public static void Eliminar() {
        System.out.println();
        System.out.println("-> Eliminar Jugador");
        System.out.println(" Jugadores");
        for (int i = 0; i < jugador.size(); i++) {
            System.out.println(i + ". " + jugador.get(i));
        }
        System.out.print("Ingrese el numero del jugador: ");
        int num = sc.nextInt();
        jugador.remove(num);
    }

    public static void Crear2() {
        System.out.println();
        System.out.println("-> Crear Equipo");
        System.out.print("Ingrese el nombre: ");
        sc.nextLine();
        String nombre = sc.nextLine();
        System.out.print("Ingrese palmares: ");
        int palmares = sc.nextInt();
        System.out.print("Ingrese la ciudad: ");
        sc.nextLine();
        String ciudad = sc.nextLine();
        System.out.print("Ingrese el presupuesto: ");
        double presupuesto = sc.nextDouble();
        equipos.add(new Equipo(nombre, palmares, ciudad, presupuesto));
    }

    public static void Modificar2() {
        System.out.println();
        System.out.println("-> Modificacion Equipo");
        for (int i = 0; i < equipos.size(); i++) {
            System.out.println(i + ". " + equipos.get(i).getNombre());
        }
        System.out.print("Ingrese el numero del equipo: ");
        int num2 = sc.nextInt();
        System.out.println();
        System.out.println(" Informacion General");
        System.out.println("1. Nombre");
        System.out.println("2. Palmares");
        System.out.println("3. Ciudad");
        System.out.println("4. Presupuesto");
        System.out.print("Ingrese su opcion: ");
        int num3 = sc.nextInt();
        System.out.println();
        switch (num3) {
            case 1:
                System.out.print("Ingrese el nombre: ");
                sc.nextLine();
                String nombre2 = sc.nextLine();
                equipos.get(num2).setNombre(nombre2);
                break;
            case 2:
                System.out.print("Ingrese palmares: ");
                int palmares2 = sc.nextInt();
                equipos.get(num2).setPalmares(palmares2);
                break;
            case 3:
                System.out.print("Ingrese la ciudad: ");
                sc.nextLine();
                String ciudad2 = sc.nextLine();
                equipos.get(num2).setCiudad(ciudad2);
                break;
            case 4:
                System.out.print("Ingrese presupuesto: ");
                double presupuesto2 = sc.nextInt();
                equipos.get(num2).setPresupuesto(presupuesto2);
                break;
        }
    }

    public static void Eliminar2() {
        System.out.println();
        System.out.println("-> Eliminar Equipo");
        for (int i = 0; i < equipos.size(); i++) {
            System.out.println(i + ". " + equipos.get(i).getNombre());
        }
        System.out.print("Ingrese el numero del equipo: ");
        int num4 = sc.nextInt();
        equipos.remove(num4);
    }

    public static void Comprar() {
        System.out.println();
        System.out.println("-> Hacer Compras");
        System.out.println(" Equipos");
        for (int i = 0; i < equipos.size(); i++) {
            System.out.println(i + ". " + equipos.get(i).getNombre());
        }
        System.out.print("Ingrese el numero de su equipo: ");
        int Numero = sc.nextInt();
        System.out.println();
        System.out.println(" Jugadores");
        for (int i = 0; i < jugador.size(); i++) {
            if (jugador.get(i).getEstado() == 1) {
                System.out.println(i + ". " + jugador.get(i));
            }
        }
        System.out.print("Ingrese el numero del jugador: ");
        int Numero2 = sc.nextInt();
        System.out.print("Desea comprar el jugador? [s/n]");
        char resp = sc.next().charAt(0);
        if (resp == 's' || resp == 'S') {
            if (equipos.get(Numero).getPresupuesto() >= jugador.get(Numero2).getPrecio()) {
                double nuevo_presupuesto = equipos.get(Numero).getPresupuesto() - jugador.get(Numero2).getPrecio();
                equipos.get(Numero).setPresupuesto(nuevo_presupuesto);
                jugador.get(Numero2).setEstado(2);
                int contador, camiseta;
                do {
                    contador = 0;
                    System.out.print("Ingrese el numero de la camiseta del jugador: ");
                    camiseta = sc.nextInt();
                    for (int i = 0; i < equipos.get(Numero).getLista().size(); i++) {
                        if (equipos.get(Numero).getLista().get(i).getNumero() == camiseta) {
                            contador++;
                        }
                    }
                    if (contador != 0) {
                        System.out.println("Numero de Camiseta Ocupado!");
                    }
                } while (contador != 0);
                jugador.get(Numero2).setNumero(camiseta);
                jugador.get(Numero2).setEquipo(equipos.get(Numero).getNombre());
                equipos.get(Numero).getLista().add(jugador.get(Numero2));
                System.out.println("Compra Realizada!");
            } else {
                System.out.println("Fondos Insuficientes!");
            }
        }
    }

    public static void Organizar() {
        System.out.println();
        System.out.println("-> Organizar Equipo");
        System.out.println(" Equipos");
        for (int i = 0; i < equipos.size(); i++) {
            System.out.println(i + ". " + equipos.get(i).getNombre());
        }
        System.out.print("Ingrese el numero de su equipo: ");
        int Numero1 = sc.nextInt();
        int cont_Delantero = 0,
                cont_Medio = 0,
                cont_Defensa = 0;
        for (int i = 0; i < equipos.get(Numero1).getLista().size(); i++) {
            if (equipos.get(Numero1).getLista().get(i) instanceof Delantero) {
                cont_Delantero++;
            } else {
                if (equipos.get(Numero1).getLista().get(i) instanceof Medio) {
                    cont_Medio++;
                } else {
                    if (equipos.get(Numero1).getLista().get(i) instanceof Defensa) {
                        cont_Defensa++;
                    }
                }
            }
        }
        if (equipos.get(Numero1).getLista().size() >= 11) {
            int defensa = 0;
            if (cont_Defensa != 0) {
                int cont1 = 0;
                do {
                    System.out.print("Ingrese el numero de defensas: ");
                    defensa = sc.nextInt();
                    if (cont_Defensa >= defensa) {
                        cont1++;
                    } else {
                        System.out.println("Defensas Insuficientes!");
                    }
                } while (cont1 == 0);
            } else {
                System.out.println("No tiene defensas!");
            }
            int medio = 0;
            if (cont_Medio != 0) {
                int cont1 = 0;
                do {
                    System.out.print("Ingrese el numero de medios: ");
                    medio = sc.nextInt();
                    if (cont_Medio >= medio) {
                        cont1++;
                    } else {
                        System.out.println("Medios Insuficientes!");
                    }
                } while (cont1 == 0);
            } else {
                System.out.println("No tiene medios!");
            }
            int delantero = 0;
            if (cont_Delantero != 0) {
                int cont1 = 0;
                do {
                    System.out.print("Ingrese el numero de delanteros: ");
                    delantero = sc.nextInt();
                    if (cont_Delantero >= delantero) {
                        cont1++;
                    } else {
                        System.out.println("Delantero Insuficientes!");
                    }
                } while (cont1 == 0);
            } else {
                System.out.println("No tiene delanteros!");
            }
            System.out.println(" Defensas");
            for (int i = 0; i < equipos.get(Numero1).getLista().size(); i++) {
                if (equipos.get(Numero1).getLista().get(i) instanceof Defensa) {
                    System.out.println(i + ". " + equipos.get(Numero1).getLista().get(i));
                }
            }
            for (int i = 0; i < defensa; i++) {
                System.out.print("Ingrese el numero del defensa: ");
                int def = sc.nextInt();
                equipos.get(Numero1).getLista().get(def).setEstado(3);
            }
            System.out.println(" Medios");
            for (int i = 0; i < equipos.get(Numero1).getLista().size(); i++) {
                if (equipos.get(Numero1).getLista().get(i) instanceof Medio) {
                    System.out.println(i + ". " + equipos.get(Numero1).getLista().get(i));
                }
            }
            for (int i = 0; i < medio; i++) {
                System.out.print("Ingrese el numero del medio: ");
                int med = sc.nextInt();
                equipos.get(Numero1).getLista().get(med).setEstado(3);
            }
            System.out.println(" Delanteros");
            for (int i = 0; i < equipos.get(Numero1).getLista().size(); i++) {
                if (equipos.get(Numero1).getLista().get(i) instanceof Delantero) {
                    System.out.println(i + ". " + equipos.get(Numero1).getLista().get(i));
                }
            }
            for (int i = 0; i < medio; i++) {
                System.out.print("Ingrese el numero del delantero: ");
                int del = sc.nextInt();
                equipos.get(Numero1).getLista().get(del).setEstado(3);
            }
            System.out.println(" Portero");
            for (int i = 0; i < equipos.get(Numero1).getLista().size(); i++) {
                if (equipos.get(Numero1).getLista().get(i) instanceof Portero) {
                    System.out.println(i + ". " + equipos.get(Numero1).getLista().get(i));
                }
            }
            System.out.print("Ingrese el numero del portero: ");
            int por = sc.nextInt();
            equipos.get(Numero1).getLista().get(por).setEstado(3);
            System.out.println("Organizacion Terminada!");
        } else {
            System.out.println("No tiene suficientes jugadores para organizar un equipo!");
        }
    }
}
