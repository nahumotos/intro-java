/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia6;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class extra10 {

    /*
     */
    public static void main(String[] args) {
        /*Realice un programa para que el usuario adivine el resultado de una multiplicación entre
dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java.*/
        Scanner leer = new Scanner(System.in);
        
        int r1,r2,num;
        Random random = new Random();
        r1= random.nextInt(11); 
        r2= random.nextInt(11); 
        //System.out.println(r1+" "+r2);
        do {
           System.out.println("Adivine la multiplicacion: ");
           num= leer.nextInt();
        } while (num!=(r1*r2));
        if (num==(r1*r2)) {
            System.out.println("CORREECTO!!");
        }
    }
    
}
