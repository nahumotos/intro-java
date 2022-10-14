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
public class extra14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de
hijos. Escriba un programa que pida la cantidad de familias y para cada familia la cantidad
de hijos para averiguar la media de edad de los hijos de todas las familias.
        */
        Scanner leer = new Scanner(System.in);
        int familias;
        int hijos;
        int edad;
        int sumaEdades = 0;
        double cantidadHijos = 0;
        System.out.println("Ingrese la cantidad de familias:");
        familias = leer.nextInt();
        
        for (int i = 1; i <= familias; i++) {
            System.out.println("Ingrese la cantidad de hijos de la familia "+i);
            hijos = leer.nextInt();
            cantidadHijos= cantidadHijos + hijos;
            for (int j = 1; j <= hijos; j++) {
                System.out.println("ingrese la edad del hijo "+j+ " de la familia "+i);
                edad = leer.nextInt();
               
                sumaEdades = sumaEdades + edad;
            }
        }
        
        System.out.println("El promedio de las edades de todos los hijos de todas las familias es: "+ (sumaEdades / cantidadHijos) );
        
    }
    
}
