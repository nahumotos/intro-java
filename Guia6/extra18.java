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
public class extra18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño
N, con los valores ingresados por el usuario.*/
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una dimension: ");
        int num = leer.nextInt(), suma=0;
        int [] vector= new int [num];
        
        for (int i = 0; i < num; i++) {

            System.out.println("ingrese valores: ");
            vector[i] = leer.nextInt();
            suma = suma + vector[i];

        }
        System.out.println("la suma de los valores ingresados es: "+suma);
    }
    
}
