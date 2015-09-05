/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatest1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author 12
 */
public class EjercicioArreglos {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String menu = "Hola usuario, escoge una de las siguientes opciones"
                + "1. Destruir la tierra"
                + "2. Alcanzar el sol"
                + "3. Dormir";

        int numero;
        String seleccion;

        numero = 0;
        
        do {
            System.out.println("Ingresa una opcion valida.");
            System.out.println(menu);
            seleccion = br.readLine();
            numero = Integer.valueOf(seleccion);
        } while (numero > 3 || numero < 1);
        
        System.out.println("Usted ha seleccionado la opcion " + seleccion);
        
        
        
        switch(numero){
            case 2:
                break;
            case 1:
                break;
            case 3:
                break;
            default:
                System.out.println("No hay mensaje");
        }
        
        if (numero == 2){
            System.out.println("1'000.000 de grados centigrados");
        }
        if (numero == 1 || numero == 2){
            System.out.println("KABOOM!");
        }
        if (numero == 3){
            System.out.println("ZZZzzzZZZzzz...");
        }
    }
}
