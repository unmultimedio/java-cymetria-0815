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
public class Principal {
    public static void main(String[] args){
        
    }
    
    public void clase1(){
        Circulo domo;
        domo = new Circulo();
        System.out.println("El radio del domo es: "+domo.getRadio());
        System.out.println("El area del domo es: "+domo.getArea());
        
        Circulo unDomoMasGrande;
        unDomoMasGrande = new Circulo(2);
        System.out.println("El radio del domo2 es: "+unDomoMasGrande.getRadio());
        System.out.println("El area del domo2 es: "+unDomoMasGrande.getArea());
        
        domo.setRadio(25);
        System.out.println("El radio del domo es: "+domo.getRadio());
        System.out.println("El area del domo es: "+domo.getArea());
        
        Cuadrado estadioElCampin;
        estadioElCampin = new Cuadrado(84, 67);
    }
}
