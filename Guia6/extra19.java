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
public class extra19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
elementos).*/
        
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una dimension: ");
        int num = leer.nextInt();
        int[] v1= new int [num];
        int[] v2= new int [num];
        int cont=0;
        Random random = new Random();
        
        for (int i = 0; i < num; i++) {
                v1[i]= random.nextInt(2);
                v2[i]= random.nextInt(2);
                cont++;
        }
        for (int i = 0; i < num; i++) {
            System.out.print(v1[i]);
        }
        System.out.println("");
        for (int i = 0; i < num; i++) {
            System.out.print(v2[i]);
        }
        System.out.println("");
        for (int i = 0; i < num; i++) {
            if (v1[i] == v2[i]) {
                System.out.print("conciden en posicion" + (i + 1));

            } else {
                System.out.println("No coincide en posicion " + (i + 1));
                break;
            }
        }
    }

}
