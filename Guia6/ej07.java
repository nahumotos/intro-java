/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia6;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;

/**
 *
 * @author Nahuel
 */
public class ej07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
la función equals() en Java.*/
        Scanner leer = new Scanner(System.in);
        String frase;
        System.out.println("Ingrese un frase");
        frase = toLowerCase(leer.next());
        if (frase.equals("eureka")){
            System.out.println("CORRECTO");
            
        }else          
            System.out.println("INCORRECTO");
            
         
    }
    
}
