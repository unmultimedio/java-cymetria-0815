/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

/**
 *
 * @author 12
 */
public class Circulo {
    
    // Atributos globales (variables)
    double radio;
    
    // Constructor por defecto
    public Circulo(){
        radio = 1;
    }
    
    // Constructores sobrecargados
    public Circulo(double radioInicial){
        radio = radioInicial;
    }
    
    // Getter y setter
    public double getRadio(){
        return radio;
    }
    
    public void setRadio(double nuevoRadio){
        radio = nuevoRadio;
    }
    
    public double getArea(){
        double area = Math.PI * Math.pow(radio, 2);
        return area;
    }
    
}
