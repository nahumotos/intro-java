/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia6;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *
 * @author usuario
 */
public class ej03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.*/
        Scanner leer = new Scanner(System.in);
        String palabra;
        System.out.println("Ingrese una palabra: ");
        palabra = leer.nextLine();
        System.out.println("La palabra en mayusculas: "+ toUpperCase(palabra));
        System.out.println("La palabra en minusculas: "+ toLowerCase(palabra));
    }
    
}
