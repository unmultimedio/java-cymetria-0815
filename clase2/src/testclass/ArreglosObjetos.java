/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testclass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author estudiantes8
 */
public class ArreglosObjetos {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> arr2 = new ArrayList();
        
        System.out.print("¿Cuántos nombres va a ingresar?");
        int cantidad = Integer.valueOf(br.readLine());

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese el nombre "+i+": ");
            arr2.add(br.readLine());
        }
        
        
        /*
        for(int i=0; i<arr2.size(); i++){
            System.out.println("Nombre "+i+": "+arr2.get(i));
        }
                */
        
        System.out.println(arr2.toString());

    }

}
