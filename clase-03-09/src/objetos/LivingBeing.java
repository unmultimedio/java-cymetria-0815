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
public class LivingBeing {
    int age;
    String name;
    boolean alive;

    public LivingBeing() {
        age = 0;
        name = "N/A";
        alive = false;
    }

    public LivingBeing(int ageInicial, String nameInicial, boolean aliveInicial) {
        age = ageInicial;
        name = nameInicial;
        alive = aliveInicial;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }
    
    
}
