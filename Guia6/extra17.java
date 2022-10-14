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
public class extra17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos
por parámetro para que nos indique si es o no un número primo, debe devolver true si es
primo, sino false.*/
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num = leer.nextInt();
        System.out.println("el numero es primo?: "+primo(num));
    }
    
    public static boolean primo(int num){//funcion
        int cont=0;
        boolean aux=false;
        for (int i = 1; i <= num; i++) {
            if ((num%i)==0){
               cont++;
            }
        }
        if (cont==2) {
            aux=true;
        }
       return aux;
  }   
}