/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egg.introjava;

import java.util.Scanner;

/**
 *
 * @author Santi
 */
public class extra01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
        //usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
        Scanner leer = new Scanner(System.in);
        int minutos;
        int dias;
        int horas;
        
        System.out.println("Ingrese los minutos a calcular");
        minutos = leer.nextInt();
        
        dias = minutos/1440;
        horas = (minutos%1440)/60;
        System.out.println("La cantidad de dias son: "+ dias + " y la cantidad de horas son: "+ horas);
        
        
    }
    
}
