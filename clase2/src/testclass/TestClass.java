/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testclass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author estudiantes8
 */
public class TestClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        /*
         System.out.print("Hola Usuario, ingresa un número: ");
         String userInput = br.readLine();
        
         //String loQueElUsuarioIngreso = "10.56438";
         //double valor = Double.valueOf(loQueElUsuarioIngreso);
        
        
         double var1 = Double.valueOf(userInput);
        
         int var2 = (int) var1;
         float var3 = (float) var1;
        
         System.out.println("Double: "+var1+"\n"
         + "Int: "+var2+"\n"
         + "Float: "+var3);
         */
        
        
        String[] nombres = new String[5];
        
        for(int i=0; i<5; i++) {
            System.out.print("Ingrese el nombre "+i+": ");
            nombres[i] = br.readLine();
        }
        
        System.out.println("Los nombres son:");
        
        for(int i=0; i<5; i++) {
            System.out.print(nombres[i]+"\n");
        }
        
        
        
        
        
        
        
        

        
        
        
        
        
        /*
        
        
        System.out.println("Señor usuario, por favor deme 5 nombres:");
        for (int i = 0; i < 5; i++) {
            System.out.format("\nIngrese el nombre %d:", i);
            nombres[i] = br.readLine();
        }
        for (int i = 0; i < 5; i++) {
            System.out.format("\nEl nombre %d es: %s", i, nombres[i]);
        }

                */
    }

}
