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
public class extra13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Crear un programa que dibuje una escalera de números, donde cada línea de números
comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al
usuario al comenzar. Ejemplo: si se ingresa el número 3:*/
        
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un numero: ");
        int numero = leer.nextInt();
        String aux = "";
        for (int i = 1; i < numero+1; i++) {
            aux= aux +" "+ i;
            System.out.println(aux);
            
        }
        
    }
   public static void hola(int aux){//subprograma
    
  }   
   public static int holaa(int aux){//funcion
       aux =3;
       return aux;
  }   
}
