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
public class Vector3D extends Vector2D {
    
    protected double z;

    public Vector3D() {
    }

    public Vector3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public void suma(Vector2D b) {
        super.suma(b);
        try{
            z += ((Vector3D)b).getZ(); 
        }catch(Exception e){
            System.out.println("El vector con el que se esta intentando sumar no es Vector3D");
        }
    }

    @Override
    public String toString() {
        String r = super.toString()+","+z;
        return r;
    }
    
    
    
}
