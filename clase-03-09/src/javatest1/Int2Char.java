/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatest1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author 12
 */
public class Int2Char {
    public static void main(String[] args){
        // El buffer lector
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // Imprimiendo la tabla Ascii
        for(int i=0; i<=127; i++){
            //System.out.print((char)i+" ");
        }
        
        // Guardando la tabla Ascii en un arreglo
        // Tipo primitivo
        char[] arr1 = new char[127];
        // Tipo objeto
        ArrayList<String> arr2 = new ArrayList<>();
        for(int i=126; i>=0; i--){
            // Tipo primitivo
            arr1[i] = (char)i;
            // Tipo objeto
            arr2.add(String.valueOf((char)i));
        }
        
        // Guardando la tabla Ascii en una tabla 14*9
        // Tipo primitivo
        char[][] table1 = new char[14][9];
        // Tipo objeto
        ArrayList<ArrayList<String>> table2 = new ArrayList<>();
        
        // Primitivo
        int contador1 = 0;
        for(int i=0; i<14; i++){
            // esto sucede al principio de cada fila
            for(int j=0; j<9; j++){
                //esto sucede en cada celda
                table1[i][j] = arr1[contador1];
                contador1++;
            }
            // esto sucede al final de cada fila
        }
        // Objeto
        int contador2 = 0;
        for(int i=0; i<14; i++){
            // esto sucede al principio de cada fila
            table2.add(new ArrayList<>());
            for(int j=0; j<9; j++){
                //esto sucede en cada celda
                String val = String.valueOf(arr1[contador2]);
                table2.get(i).add(val);
                contador2++;
            }
            // esto sucede al final de cada fila
        }
        
        for(int i=0; i<14; i++){
            // esto sucede al principio de cada fila
            for(int j=0; j<9; j++){
                //esto sucede en cada celda
                System.out.print(table1[i][j]);
            }
            // esto sucede al final de cada fila
            System.out.println("");
        }
    }
}
