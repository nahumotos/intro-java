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
 * @author Usuario
 */
public class ej16{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      /* Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido*/
     
      int n ;
      int[] vector;
      
      Scanner leer = new Scanner(System.in);
      
        System.out.println("Ingrese el tamaño del vector");
        n= leer.nextInt();
        vector= new int [n];
        
        Random numero = new Random();
        
        for (int i = 0; i < n; i++) {
            vector[i]=numero.nextInt(5);       
        }
   
        System.out.println("Ingrese un número a buscar");
        int num= leer.nextInt(); 
        int cont=0;
        
        for (int i = 0; i < n; i++) {
            if (num==vector[i]){
                cont++;
                System.out.println("El número ingresado se encontro en la posición: "+i );
            }        
        }
        if (cont==0){
            System.out.println("El número no se encontro");
            
        } else{
             System.out.println("El número de veces encontrado es= "+cont);    
        }
    }
}
