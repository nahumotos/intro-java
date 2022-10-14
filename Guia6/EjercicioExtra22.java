/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg6;

import java.util.Scanner;

/**
 *
 * @author 2022
 */
public class EjercicioExtra22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios y 
muestre la suma de sus elementos.*/
        Scanner leer = new Scanner(System.in);
        int N, M, suma = 0;

        System.out.println("Ingrese el tamaño de las filas de la matriz");
        N = leer.nextInt();
        System.out.println("Ingrese el tamaño de las columnas de la matriz");
        M = leer.nextInt();

        int matriz[][] = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.println("Ingrese un numero");
                matriz[i][j] = leer.nextInt();
            }

        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print("[" + matriz[i][j] + "]");

            }
            System.out.println("");
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                suma = suma + matriz[i][j];

            }

        }
        System.out.println("La suma de todos los numeros ingresados en la matriz es " + suma);
    }

}
