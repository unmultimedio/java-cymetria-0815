/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciofamilia;

/**
 *
 * @author 12
 */
public class Principal {
    public static void main(String[] args) {
        
        Marciano marc1 = new Marciano("Pepe");
        Marciano marc2 = new Marciano("Jose");
        Marciano marc3 = new Marciano("Camila");
        Marciano marc4 = new Marciano("Andres");
        
        marc1.setHijo(marc2);
        marc2.setHijo(marc3);
        marc3.setHijo(marc4);
        
        marc1.imprimir();
        
    }
}
