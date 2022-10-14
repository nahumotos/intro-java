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
public class ej10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial.*/
        
        Scanner leer = new Scanner(System.in);
        int num;
        System.out.println("Ingrese un maximo positivo: ");
        int max = leer.nextInt();
        int suma =0;
        do {
            System.out.println("Ingrese dos nmeros a sumar para superar el max");
            num = leer.nextInt(); 
            suma= suma+num;
        }while(suma < max);
    }  
   
}
