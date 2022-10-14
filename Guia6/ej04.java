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
public class ej04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
        Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).*/
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una Tº en ºC: ");
        int cel = leer.nextInt();
        System.out.println(cel+"ºC = "+(32+ (9*cel/5)+"ºF"));
    } 
}
