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
public class extra03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.*/
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una letra: ");
        String letra = leer.next();
        if (letra.equals("a")||letra.equals("e")||letra.equals("i")||letra.equals("o")||letra.equals("u")) {
            System.out.println("La letra ingresada es una vocal");
        }else{
            System.out.println("La letra ingresada NO es una vocal");
        }
    }

}
