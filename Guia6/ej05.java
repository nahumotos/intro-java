/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ej05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
/*Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().*/
    Scanner leer = new Scanner(System.in);
    int numero;
        System.out.println("Ingrese un número...");
        numero = leer.nextInt();
        System.out.println("El doble del número es: "+(numero *2)+ " el triple es: "+(numero*3)+
                " la raiz cuadrada es: "+ Math.round(Math.sqrt(numero)));
    }
    
}
