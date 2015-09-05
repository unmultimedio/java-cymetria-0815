/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatest1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


/**
 *
 * @author 12
 */
public class DiaDeLaSemana {
    
    public static void main(String[] args) throws IOException{
        // El buffer lector
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // El arreglo que va a guardar los dias de la semana
        ArrayList<String> days = new ArrayList<>();
        // Se insertan los datos del arreglo
        days.add("Lunes");
        days.add("Martes");
        days.add("Miercoles");
        days.add("Jueves");
        days.add("Viernes");
        days.add("Sabado");
        days.add("Domingo");
        // Se le pregunta al usuario el numero de dia
        System.out.println("Ingrese un numero de dia:");
        // Guardamos la respuesta del usuario
        int answer = Integer.valueOf(br.readLine());
    
        System.out.println("Manera de solucionarlo #1");
        if(answer >= 1 && answer <= 7){
            System.out.println("dia: "+days.get(answer-1));
        }
        
        System.out.println("Manera de solucionarlo #2");
        switch(answer){
            case 1:
                System.out.println("dia: "+days.get(0));
                break;
            case 2:
                System.out.println("dia: "+days.get(1));
                break;
            case 3:
                System.out.println("dia: "+days.get(2));
                break;
            default:
                System.out.println("El dia que usted ingreso no es valido");
        }
        
        System.out.println("Manera de solucionarlo #3");
        if(answer < days.size() && answer > 0){
            System.out.println("dia: "+days.get(answer-1));
        }
        
        System.out.println(days.indexOf("Diciembre"));
    }
    
}
