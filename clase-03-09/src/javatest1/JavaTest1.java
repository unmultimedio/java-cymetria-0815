/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
package javatest1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author 12
 */
public class JavaTest1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        
        int[] telefonos = new int[5];
        telefonos[0]=8520;
        telefonos[1]=0;
        telefonos[2]=8654;
        telefonos[3]=864;
        telefonos[4]=74123;
        
        imprimir(telefonos);
        
        String[] nombres = new String[5];
        nombres[0]="juan";
        nombres[1]="felipe";
        nombres[2]="jose";
        nombres[3]="helena";
        nombres[4]="camilo";
        
        imprimir(nombres);
        
        /*
        for(int i=0; i<10; i++){
            
        }
        
        while(age<18){
            
        }
        
        do{
            
        }while(age<18);
                */
        
        
        
        

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        imprimir("Porfavor dime como te llamas");
        String nombre1 = br.readLine();
        
        for(int i=0; i<nombres.length; i++){
            if(nombre1.equals(nombres[i])){
                imprimir("El tlefono de "+nombre1+" es:"+telefonos[i]);
            }
        }
        
        
        imprimir("Hola " + nombre1 + ", ¿cuánto $ tienes?");
        String plata1 = br.readLine();
        
        imprimir("Porfavor dime como te llamas");
        String nombre2 = br.readLine();
        imprimir("Hola " + nombre2 + ", ¿cuánto $ tienes?");
        String plata2 = br.readLine();

        int dineroTotal = 0;
        try {
            dineroTotal += Integer.valueOf(plata1);
            dineroTotal += Integer.valueOf(plata2);
        } catch (Exception e) {
            imprimir("Tipo de dato inválido");
        }

        if (dineroTotal >= 100000) {
            imprimir("Bienvenido a la fiesta");
        } else {
            imprimir("No te alcanza");
        }
    }

    public static void imprimir(String mensaje) {
        System.out.println(mensaje);
    }
    
    public static void imprimir(int[] arr) {
        for(int i=0; i<arr.length; i++){
            imprimir(String.valueOf(arr[i]));
        }
    }
    
    public static void imprimir(String[] arr) {
        for(int i=0; i<arr.length; i++){
            imprimir(String.valueOf(arr[i]));
        }
    }
}
