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
public class extra16terminar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String freno = "";
        int edad=0;
        String nombre="";
        do {            
            datosPersonas(nombre,edad);
            
            System.out.println("Quiere seguir mostrando personas? Ingrese (SI O NO)");
            freno = leer.next();
        } while (!freno.equalsIgnoreCase("NO"));
    }

    private static void datosPersonas(String nombre, int edad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}

    
    

