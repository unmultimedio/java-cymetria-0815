/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatest1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author 12
 */
public class MenuRestaurante {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static String[] menus = {"Comidas", "Bebidas", "Entradas"};
    static String[] categoriaComidas = {"Carnes", "Pescados", "Pastas"};
    static String[] categoriaBebidas = {"Alcohol", "Jugos", "Gaseosa"};
    static String[] categoriaEntradas = {"Sal", "Dulce", "Vegetales y frutas"};
    static String[] itemCarnes = {"Bistec", "Churrasco", "Lomo"};
    static String[] itemPescados = {"Robalo", "Trucha", "Bagre"};
    static String[] itemPastas = {"Spaghetti", "Lasagna", "Ravioli"};
    static String[] itemAlcohol = {"Cerveza", "Ron", "Whisky"};
    static String[] itemJugos = {"Maracuya", "Lulo", "Mora"};
    static String[] itemGaseosas = {"Cocacola", "Pepsi", "7up"};
    static String[] itemSal = {"Empanadas", "Arepa con chorizo", "Nachos"};
    static String[] itemDulce = {"Fresas con crema", "Cupcakes", "Galletas oreo"};
    static String[] itemVegetalesYFrutas = {"Ensalada Cesar", "Ensalada frutas", "Salpicon"};

    public static void imprimirArreglo(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println((i + 1) + ". " + arr[i]);
        }
    }

    public static void main(String[] args) throws IOException {
        imprimirMenuGeneral();
    }

    static void imprimirMenuGeneral() throws IOException {
        imprimirArreglo(menus);
        int eleccion = Integer.valueOf(br.readLine());
        imprimirCategoriasGenerales(eleccion);
    }

    static void imprimirCategoriasGenerales(int cbe) throws IOException {
        int eleccion;
        switch (cbe) {
            case 1:
                imprimirArreglo(categoriaComidas);
                eleccion = Integer.valueOf(br.readLine());
                switch (eleccion) {
                    case 1:
                        imprimirArreglo(itemCarnes);
                        break;
                    case 2:
                        imprimirArreglo(itemPescados);
                        break;
                    case 3:
                        imprimirArreglo(itemPastas);
                        break;
                }
                break;
            case 2:
                imprimirArreglo(categoriaBebidas);
                eleccion = Integer.valueOf(br.readLine());
                switch (eleccion) {
                    case 1:
                        imprimirArreglo(itemAlcohol);
                        break;
                    case 2:
                        imprimirArreglo(itemJugos);
                        break;
                    case 3:
                        imprimirArreglo(itemGaseosas);
                        break;
                }
                break;
            case 3:
                imprimirArreglo(categoriaEntradas);
                
                eleccion = Integer.valueOf(br.readLine());
                switch (eleccion) {
                    case 1:
                        imprimirArreglo(itemSal);
                        break;
                    case 2:
                        imprimirArreglo(itemDulce);
                        break;
                    case 3:
                        imprimirArreglo(itemVegetalesYFrutas);
                        break;
                }
                break;
        }
    }
}
