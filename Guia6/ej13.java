/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia6;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class ej13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
        cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
        
        ****
        *  *
        *  *
        ****
        */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una dimension : ");
        int n = leer.nextInt();
        String[][] matriz = new String [n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i==0 || i==(n-1) || (j==0) || (j==(n-1))                       ) {
                    matriz[i][j]= "*";
                }else{
                    matriz[i][j]= " ";
                }
            }
        }  
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println(" ");
        }  
    }
}
    

