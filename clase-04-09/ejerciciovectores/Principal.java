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
public class Principal {
    public static void main(String[] args) {
        Vector2D a = new Vector2D(850, 220);
        Vector2D b = new Vector2D(410, 123);
        Vector2D c = new Vector2D(-86, 77);
        
         /*
        double r = a.productoPunto(b);
        System.out.println("A.B es = "+r);
        
        b.invertir();
        b.imprimir();
        
        c.multiplicacionPorConstante(81);
        c.imprimir();
        
        b.suma(c);
        b.imprimir();
        
        c.invertir();
        c.imprimir();
                 */
        
        double r = Vector2D.productoPunto(a, b);
        System.out.println("A.B es = "+r);
        
        Vector2D.invertir(b).imprimir();
        
        Vector2D.multiplicacionPorConstante(c, 81).imprimir();
        
        Vector2D.suma(b, c).imprimir();
        
        Vector2D res = Vector2D.invertir(c);
        res.imprimir();
        
        Vector3D fuerza = new Vector3D(15, 25, 45);
        Vector3D gravedad = new Vector3D(0, -9.8, 0);
        
        fuerza.suma(gravedad);
        System.out.println(fuerza.toString());
        
        fuerza.suma(b);
    }
}
