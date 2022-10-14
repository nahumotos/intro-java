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
public class extra08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y
la cantidad de números impares. Al igual que en el ejercicio anterior los números
negativos no deben sumarse. Nota: recordar el uso de la sentencia break.*/
        Scanner leer = new Scanner(System.in);
        int num, cont=0,par=0,impar=0;
        
        do {
           System.out.println("Ingrese un numero: ");
           num = leer.nextInt();
            if (num>=0) {
                 if (num%2==0) {
                par++;
                 }else{
                impar++;
                }   
                 cont++;
            }
          
        } while (!(num%5==0));
        System.out.println("pares: "+par);
        System.out.println("impares: "+impar);
        System.out.println("cantidad de numeros ingresados: "+cont);
    }
     
}
