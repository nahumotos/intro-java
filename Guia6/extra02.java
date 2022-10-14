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
public class extra02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C
tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.*/ 
        String a,b,c,d,aux;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese A: ");
        a = leer.next();
        System.out.println("Ingrese B: ");
        b = leer.next();
        System.out.println("Ingrese C: ");
        c = leer.next();
        System.out.println("Ingrese D: ");
        d = leer.next();
        aux =a;
        
        System.out.println("B "+(b=c));
        System.out.println("C "+(c=a));
        System.out.println("A "+(a=d));
        System.out.println("D "+(d=aux));
        
    }
    
}
