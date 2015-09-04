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
public class Marciano {
    String nombre;
    Marciano hijo;

    public Marciano() {
        nombre = "N/A";
    }

    public Marciano(String nombre) {
        this.nombre = nombre;
    }

    public Marciano(String nombre, Marciano hijo) {
        this.nombre = nombre;
        this.hijo = hijo;
    }

    public Marciano getHijo() {
        return hijo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setHijo(Marciano hijo) {
        this.hijo = hijo;
    }
    
    public void imprimir(){
        System.out.println("Mi nombre es: "+nombre+" y el nombre de mi hijo es: "+hijo.getNombre());
    }
}
