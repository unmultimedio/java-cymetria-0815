/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testclass;

/**
 *
 * @author estudiantes8
 */
public class Matriz {

    public static void main(String[] args) {

        int[][] matriz = { {3, 4, 26, 34}, {5, 6, 9, 1}, {7}, {14, 56} };
        
        for(int x=0; x<matriz.length; x++){
            for(int y=0; y<matriz[x].length; y++){
                System.out.print("| "+matriz[x][y]+" |");
            }
            System.out.print("\n");
        }
        
        
        
    }

}
