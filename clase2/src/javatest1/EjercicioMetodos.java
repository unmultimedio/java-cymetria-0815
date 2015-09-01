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
public class EjercicioMetodos {
    public static void main(String[] args){
        double valorEnCOP = 650000;
        
        double valorEnUSD = convertirCOP2USD(valorEnCOP);
        double valorEnEUR = convertirCOP2EUR(valorEnCOP);
        double valorEnYEN = convertirCOP2YEN(valorEnCOP);
        
        System.out.println("COP$"+valorEnCOP+" = USD$"+valorEnUSD);
        System.out.println("COP$"+valorEnCOP+" = EUR$"+valorEnEUR);
        System.out.println("COP$"+valorEnCOP+" = YEN$"+valorEnYEN);
        
        double valEnUSD = conversorGeneral(valorEnCOP, "USD");
        double valEnEUR = conversorGeneral(valorEnCOP, "EUR");
        double valEnYEN = conversorGeneral(valorEnCOP, "YEN");
        System.out.println("COP$"+valorEnCOP+" = ---$"+valEnUSD);
        System.out.println("COP$"+valorEnCOP+" = ---$"+valEnEUR);
        System.out.println("COP$"+valorEnCOP+" = ---$"+valEnYEN);
    }
    
    static double conversorGeneral(double pesos, String moneda){
        if(moneda.equals("USD")){
            double dinero = convertirCOP2USD(pesos);
            return dinero;
        }else if(moneda.equals("EUR")){
            double dinero1 = convertirCOP2EUR(pesos);
            return dinero1;
        }else if(moneda.equals("YEN")){
            double dinero2 = convertirCOP2YEN(pesos);
            return dinero2;
        }else{
            return 0;
        }
    }
    
    /*
    static double conversorGeneral(double pesos, String moneda){
        //double dinero = 0;
        switch (moneda) {
            case "USD":
                return convertirCOP2USD(pesos);
                //break;
            case "EUR":
                return convertirCOP2EUR(pesos);
                //break;
            case "YEN":
                return convertirCOP2YEN(pesos);
                //break;
        }
        return 0;
    }
    */
    
    static double convertirCOP2USD(double pesos){
        double dolares = pesos * 0.000325;
        return dolares;
    }
    
    static double convertirCOP2EUR(double pesos){
        double euros = pesos * 0.00029;
        return euros;
    }
    
    static double convertirCOP2YEN(double pesos){
        double euros = pesos * 0.039413;
        return euros;
    }
}
