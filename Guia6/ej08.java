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
public class ej08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si el
usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
Nota: investigar la función Lenght() en Java.*/
        Scanner leer = new Scanner(System.in);
        String frase;
        System.out.println("Ingrese un frase");
        frase= leer.next();
        if (frase.length()==8){
            System.out.println("CORRECTO");
            
        }else          
            System.out.println("INCORRECTO");
        
    }
    
}
