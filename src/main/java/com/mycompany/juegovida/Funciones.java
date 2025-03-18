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
     
    public static int[][] inicializarTablero(int num , double porcentaje){
       int tablero[][] = new int [num][num];
       int totalCasillas = num*num;
       int celulasVivas = (int)((porcentaje/100)* totalCasillas);
       Random rd  = new Random ();
       
       do{
           int columna = rd.nextInt(num);
           int fila = rd.nextInt(num);
          
           
       }while (celulasVivas>0);
       return null;
    }
}
