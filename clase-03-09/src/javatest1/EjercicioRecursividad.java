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
public class EjercicioRecursividad {
    public static void main(String[] args){
        imprimirMensaje(500);
        int resultado = factorial(5);
        System.out.println("Factorial de 5: "+resultado);
    }
    
    static int factorial(int n){
        int nFact;
        if(n>1){
            nFact = n * factorial(n-1);
        }else if(n==1){
            nFact = 1;
        }else{
            nFact = -1;
        }
        return nFact;
    }
    
    static void imprimirMensaje(int veces){
        veces--;
        System.out.println(veces);
        if(veces > 0){
          imprimirMensaje(veces);
        }
    }
}
