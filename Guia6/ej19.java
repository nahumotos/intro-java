/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia6;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class ej19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
        matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
        signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
        denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).*/
        Scanner leer = new Scanner(System.in);
        /*System.out.println("Ingrese una dimension: ");
        int num = leer.nextInt();*/

        ///int[][] matriz = new int [num][num];
        ///Random random = new Random();
        int[][] matriz = {{0, -2, 4}, {2, 0, 2}, {-4, -2, 0}};
        int cont = 0;
        //MATRIZ 

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                ///matriz[i][j]= random.nextint(10));
                System.out.print(" " + matriz[i][j]);
            }
            System.out.println(" ");
        }

        //MATRIZ TRANSPUESTA
        System.out.println("Matriz transpuesta");
        int[][] matrizb = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizb[i][j] = matriz[j][i];
                System.out.print(" " + matrizb[i][j]);
            }
            System.out.println(" ");
        }
        //COMPARACION
         
        for (int i = 0; i < 3; i++) {
            
            for (int j = 0; j < 3; j++) {
                if ((-1)*(matriz[i][j]) == (matrizb[i][j])) {
                    cont++;
                }
            }      
        }
        System.out.println(cont);
        if (cont == 9) {
            System.out.println("es antisimetrica");

        } else {
            System.out.println("no es antisimetrica");
        }
    }
}
