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
public class Geometria {
    static double areaCuadrilatero(double base, double altura){
        double area = base * altura;
        return area;
    }
    static double areaTriangulo(double lado){
        double altura = Math.sqrt(3)*lado/2;
        double area = lado*altura/2;
        return area;
    }
    static double areaTriangulo2(double lado){
        double area = (Math.sqrt(3)/4)*Math.pow(lado, 2);
        return area;
    }
    static double areaCirculo(double radio){
        double area = Math.PI*Math.pow(radio, 2);
        return area;
    }
    public static void main(String[] args){
        double ac = areaCuadrilatero(187, 76);
        System.out.println("El area del cuadrado es: "+ac);
        System.out.println("El area del triangulo es: "+areaTriangulo(678));
        System.out.println("El area del triangulo es: "+areaTriangulo2(678));
        System.out.println("El area del circulo es: "+areaCirculo(475));
    }
}
