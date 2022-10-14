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
public class extra21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Los profesores del curso de programación de Egg necesitan llevar un registro de las notas
adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados y
desaprobados. Durante el periodo de cursado cada alumno obtiene 4 notas, 2 por trabajos
prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final del
programa los profesores necesitan obtener por pantalla la cantidad de aprobados y
desaprobados, teniendo en cuenta que solo aprueban los alumnos con promedio mayor o
igual al 7 de sus notas del curso.*/
        
        Scanner leer = new Scanner(System.in);
        double[] promedio = new double [4];
        int alumnos=1;
        double notas=0;
        int cont=0;
        Random random = new Random();
        do {
            System.out.println("ALUMNO "+alumnos);
            for (int i = 1; i < 5; i++) {
                
                System.out.println("Ingrese la nota Nº: " + i);
                
                switch (i) {
                    case 1:
                        System.out.println("1ºtp");
                        notas = random.nextInt(11);
                        notas = notas*0.1;
                        break;
                    case 2:
                        System.out.println("2ºtp");
                        notas = random.nextInt(11);
                        notas = notas*0.15;
                        break;
                    case 3:
                        System.out.println("1ºintegrador");
                        notas = random.nextInt(11);
                        notas = notas*0.25;
                        break;
                    case 4:
                        System.out.println("2ºintegrador");
                        notas = random.nextInt(11);
                        notas = notas*0.5;
                        break;   
                }
                cont++;
                promedio[i]= (promedio[i]+notas);
                System.out.println(promedio[1]);
                
                        
            }
            alumnos++;
        } while (alumnos <= 2);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
