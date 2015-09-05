/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatest1;

/**
 *
 * @author 12
 */
public class EjercicioString {
    public static void main(String[] args){
        String name = "Julian R Figueroa";
        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.charAt(0));
        for(int i=0; i<name.length(); i++){
            System.out.println(name.charAt(i));
        }
        System.out.println(name.indexOf("a"));
        String otherString = "Hola "+name+" bienvenido";
        System.out.println(otherString);
        
        otherString = otherString.replace("bienvenido", "que tengas buena noche");
        System.out.println(otherString);
        
        String[] words = otherString.split(" ");
        
        for(int i=0; i<words.length; i++){
            System.out.println("palabra "+i+": "+words[i]);
        }
    }
}
