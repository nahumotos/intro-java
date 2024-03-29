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
public class ej12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().*/
      
        String cadena;
        int numcaracteres, correctas = 0, incorrectas = 0;
        
        do{
            System.out.println("Ingrese una cadena");
            Scanner c = new Scanner(System.in);
            cadena = c.nextLine();    
            numcaracteres = cadena.length();
            if (numcaracteres <= 5 && cadena.substring(0,1).equals("X") && cadena.endsWith("O")){
                correctas++;
            } else {
                incorrectas++;
            }
        } while (!"&&&&&".equals(cadena));
        
        System.out.println("Cantidad de lecturas correctas " + correctas);
        System.out.println("Cantidad de lecturas incorrectas " + (incorrectas-1));

    }
}
