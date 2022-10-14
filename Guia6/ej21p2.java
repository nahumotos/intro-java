/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia6;

/**
 *
 * @author Usuario
 */
public class ej21p2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que
se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una
que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna de
la matriz M en la cual empieza el primer elemento de la submatriz P.
         */

        boolean encontrado;
        encontrado = false;
        int cont = 0;
        int[][] MM = new int[10][10];
        int[][] MP = new int[3][3];

        ///Rellena la matriz MM
        for (int i = 0; i < MM.length; i++) {
            for (int j = 0; j < MM.length; j++) {
                MM[i][j] = (int) (Math.random() * 2);
                System.out.print(MM[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println(""); //Salto de linea

        //Rellena la matriz MP
        for (int i = 0; i < MP.length; i++) {
            for (int j = 0; j < MP.length; j++) {
                MP[i][j] = (int) (Math.random() * 2);
                System.out.print(MP[i][j] + " ");
            }
            System.out.println("");
        }

        //Se recorre la matriz MM
        for (int i = 0; i < MM.length - MP.length + 1; i++) {
            for (int j = 0; j < MM.length - MP.length + 1; j++) {

                if (MM[i][j] == MP[0][0]) { //Si el valor de la posicion es igual a la primera posicion de la Matriz MP
                    for (int k = i; k < i + 3; k++) { //Segundo bucle(doble) "for" donde se recorren ambas matrices comparando posiciones
                        for (int l = j; l < j + 3; l++) {
                            if (MM[k][l] == MP[k - i][l - j]) { //MP es k-i y l-j para que vaya desde 0 a 2.
                                cont++; //Si son iguales los valores se suma 1 al contador
                            } else {
                                break;
                            }
                        }
                    }

                    if (cont == 9) { //Si el contador es igual a la cantidad de posiciones, significa que encontro la matriz MP en MM
                        encontrado = true;
                        System.out.println("Se ah encontrado la matriz MP desde "
                                + "la posicion " + i + " " + j);
                    }
                    cont = 0; //Reinicia el contador
                }
            }
        }

        if (encontrado == false) {
            System.out.println("No se encontro la matriz MP en MM");
        }
    }

}
