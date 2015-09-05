/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciovectores;

/**
 *
 * @author 12
 */
public class Vector2D {
    //producto punto, multiplicacion por constante, suma, inversion, impresion
    
    protected double x;
    protected double y;

    public Vector2D() {
    }

    public Vector2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    /////// Metodos Estaticos
    
    /**
     * Este metodo se encarga de recibir un vector
     * adicional y calcula el producto punto entre
     * el objeto y el vector recibido por el parametro
     * 
     * @param b Es el vector con el que se va a multiplicar
     * @return El valor resultado del producto punto
     */
    public double productoPunto(Vector2D b) {
        double c = x*b.getX() + y*b.getY();
        return c;
    }
    
    public void multiplicacionPorConstante(double c){
        x *= c;
        y *= c;
    }
    
    public void suma(Vector2D b){
        x += b.getX();
        y += b.getY();
    }
    
    public void invertir(){
        multiplicacionPorConstante(-1);
    }
    
    @Override
    public String toString(){
        return x+","+y;
    }
    
    public void imprimir(){
        System.out.println("("+x+","+y+")");
    }
    
    /////// Metodos Estaticos
    
    public static double productoPunto(Vector2D a, Vector2D b) {
        return a.getX()*b.getX() + a.getY()*b.getY();
    }
    
    public static Vector2D multiplicacionPorConstante(Vector2D a, double c){
        return new Vector2D(a.getX()*c, a.getY()*c);
    }
    
    public static Vector2D suma(Vector2D a, Vector2D b){
        return new Vector2D(a.getX()+b.getX(), a.getY()+b.getY());
    }
    
    public static Vector2D invertir(Vector2D a){
        return new Vector2D(a.getX()*-1, a.getY()*-1);
    }
}
