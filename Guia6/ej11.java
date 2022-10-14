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
public class ej11 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        int n1,n2,opcion;
        System.out.println("Ingrese dos numeros: ");
        n1 = leer.nextInt();
        n2 = leer.nextInt();
        String res;
        res = "n4";
        do{
            System.out.println("MENU:");
            System.out.println("1.SUMAR");
            System.out.println("2.RESTAR");
            System.out.println("3.MULTIPLICAR");
            System.out.println("4.DIVIDIR");
            System.out.println("5.SALIR");
             opcion = leer.nextInt();
            switch (opcion){
                case 1: 
                    System.out.println("suma: "+(n1+n2));
                    break;
                case 2: 
                    System.out.println("resta: "+(n1-n2));
                    break;
                case 3: 
                    System.out.println("multiplicacion: "+(n1*n2));
                    break;
                case 4: 
                    System.out.println("division: "+(n1/n2));
                    break;
                case 5:
                    do {
                        System.out.println("Esta seguro que deasea salir del programa? (S/N)");
                        res = leer.next();
                        res  = res.toUpperCase();
                    } while (!"S".equals(res) && !"N".equals(res));
                    break;
                default:
                    System.out.println("Opcion no valida");
            } 
        }while(res.equals("n")); 
    }    
}      