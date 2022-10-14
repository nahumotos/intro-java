/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia6;

import java.util.Random;

/**
 *
 * @author usuario
 */
public class extra20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*20. Crear una función rellene un vector con números aleatorios, pasándole un arreglo por
parámetro. Después haremos otra función o procedimiento que imprima el vector.*/
        int [] v =new int [5];
        llenar(v);
        mostrar(v);
        
    }
    public static int[] llenar(int v[]) {
        Random random = new Random();
        
        for (int i = 0; i < 5; i++) {
            v[i] = random.nextInt(5);
        }
        return v;
    }
    public static void mostrar (int v[]) {

        for (int i = 0; i < 5; i++) {
            System.out.print(v[i]+" ");
        } 
        System.out.println(" ");
    }
}