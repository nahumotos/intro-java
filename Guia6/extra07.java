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
public class extra07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio
de n números (n>0). El valor de n se solicitará al principio del programa y los números
serán introducidos por el usuario. Realice dos versiones del programa, una usando el
bucle “while” y otra con el bucle “do - while”.*/
        Scanner leer = new Scanner(System.in);
        System.out.println("Cuantos numeros quiere ingresar?: ");
        int num = leer.nextInt();
        int max=0;
        int cont=0;
        int n=0;
        int min=n;
        double prom=0;
         
        //DO_WHILE
       /*    do {
                
              System.out.println("ingrese un numero:");
            n = leer.nextInt();
            if (cont==0) {
                   min=n; 
                }
            if (n<min) {
                min=n;
            }else if (n>max) {
                max = n;
            }
            cont++;
            prom = prom +n;
        } while (cont!=num);*/
        
        //WHILE
        while(cont!=num){
             System.out.println("ingrese un numero:");
            n = leer.nextInt();
            if (cont==0) {
                   min=n; 
                }
            if (n<min) {
                min=n;
            }else if (n>max) {
                max = n;
            }
            cont++;
            prom = prom +n;

        }
        
            System.out.println("Max: "+max);
            System.out.println("Min: "+min);
            System.out.println("Promedio: "+prom/cont); 
          
    }

}
