/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia6;

import java.util.Scanner;

/**
 *
 * @author Santi
 */
public class extra05{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Una obra social tiene tres clases de socios:
o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
todos los tipos de tratamientos.
o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para
los mismos tratamientos que los socios del tipo A.
o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
tratamientos.
o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
real que represente el costo del tratamiento (previo al descuento) y determine el
importe en efectivo a pagar por dicho socio.
        
        */
        Scanner leer = new Scanner(System.in);
        String letra;
       int costo;
       
        System.out.println("Ingrese un tipo de socio :");
        letra = leer.next();
        letra = letra.toUpperCase();
        System.out.println("Ingrese costo de los tratamientos:");
        costo = leer.nextInt();
        switch (letra) {
            
            case "A":
                    System.out.println("El costo total con un 50% de descuento es: "+ costo*0.50);
                break;
            case "B":
                    System.out.println("El costo total con un 35% de descuento es: "+ costo*0.65);
                break;
            case "C":
                    System.out.println("El costo total sin descuento es: "+ costo);
                break;
           
            default:
                throw new AssertionError("LETRA INCORRECTA");
                
        }
    }
    
}
