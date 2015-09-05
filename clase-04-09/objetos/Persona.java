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
public class Persona extends LivingBeing {
    String id;
    String sex;
    String nationality;

    public Persona() {
        super();
        id = "N/A";
        sex = "N/A";
        nationality = "N/A";
    }
    
    public Persona(int age, String name, boolean alive, String id, String sex, String nationality){
        super(age, nationality, alive);
        
        this.id = id;
        this.sex = sex;
        this.nationality = nationality;
    }

    public Persona(String id, String sex, String nationality) {
        this.id = id;
        this.sex = sex;
        this.nationality = nationality;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    
}
