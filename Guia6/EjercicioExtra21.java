/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg6;

import java.util.Scanner;

/**
 *
 * @author 2022
 */
public class EjercicioExtra21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* Los profesores del curso de programación de Egg necesitan llevar un registro de las notas 
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

        double trabajo1 = 0, trabajo2 = 0, integrador1 = 0, integrador2 = 0, nota = 0;
        double vector[] = new double[10];
        int contador1 = 0, contador2 = 0;

        for (int i = 0; i < 10; i++) {

            System.out.println("Ingrese la nota del primer trabajo practico");
            trabajo1 = leer.nextInt();
            System.out.println("Ingrese la nota del segundo trabajo practico");
            trabajo2 = leer.nextInt();
            System.out.println("Ingrese la nota del primer integrador");
            integrador1 = leer.nextInt();
            System.out.println("Ingrese la nota del segundo integrador");
            integrador2 = leer.nextInt();

            nota = (trabajo1 * 0.10) + (trabajo2 * 0.15) + (integrador1 * 0.25) + (integrador2 * 0.50);

            System.out.println("El promedio de la nota numero es " + (i + 1) + " / " + nota);

            System.out.println("");
            
            vector[i] = (double) nota;
            
            if (vector[i] >= 7) {
                contador1++;
                
            } else {
                contador2++;
            }
        }
        System.out.println("");
        for (int i = 0; i < 10; i++) {
            System.out.println("Nota numero " + (i + 1) + " / " + vector[i]);
        }

        System.out.println("La cantidad total de aprobados fue de " + contador1);
        System.out.println("La cantidad total de desaprobados fue de " + contador2);
    }

}
