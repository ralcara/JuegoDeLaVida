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
    }
}
