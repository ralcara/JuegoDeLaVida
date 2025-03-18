/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.juegovida;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author rocio
 */
public class JuegoVida {

    public static final int tamañoMaximo = 25;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        double porcentaje;
        int num = 0;
        int numCelulasVivas;
        int casillas;
        int[][] tablero = new int[num][num];

        do {
            System.out.println("Introduce el tamaño del table");
            num = sc.nextInt();
            if (num > 25 || num <= 0) {
                System.out.println("Vuelve a introducir los datos");
            }
        } while (num > 25 || num <= 0);

        System.out.println("Introduce el porcentaje de celulas vivas");
        porcentaje = sc.nextDouble();

        tablero = Funciones.inicializarTablero(num, porcentaje);
        Funciones.mostrarTablero(tablero);

        String opcion;
        do {
            System.out.println("""
          Menu
    1. Mostrar siguiente generacion
    2. Salir
    Elige una opcion: 
                     """);
            opcion = sc.nextLine();
            switch (opcion) {
                case "1":

                    Funciones.mostrarTablero(tablero);
                    break;
                case "2":
                    System.out.println("Saliendo...");
                    break;
            }
        } while (!opcion.equals("2"));
    }
}
