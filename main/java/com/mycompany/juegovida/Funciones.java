/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.juegovida;

import java.util.Random;

/**
 *
 * @author rocio
 */
public class Funciones {

    public static int[][] inicializarTablero(int num, double porcentaje) {
        int tablero[][] = new int[num][num];
        int totalCasillas = num * num;
        int celulasVivas = (int) ((porcentaje / 100) * totalCasillas);
        Random rd = new Random();
        
        // bucle pa colorcar de manera aleatoria las vivas hasta que llegue a 0
        do {
            int columna = rd.nextInt(num);
            int fila = rd.nextInt(num);
            if (tablero[fila][columna] == 0) {
                tablero[fila][columna] = 1;
                celulasVivas--;
            }
            return tablero;
        } while (celulasVivas > 0);
    }

    // metodo para mostrar el tablero y enseñar las vivas (V)y muertas (M)
    public static void mostrarTablero(int[][] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if (tablero[i][j] == 1) {
                    System.out.print("V ");
                } else {
                    System.out.print("M ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
