/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author lenovo
 */
public class PreRequis {
    private int id;
    private String descriptipon;
    private int classement;
    private Cours cours;

    public PreRequis() {
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescriptipon() {
        return descriptipon;
    }

    public void setDescriptipon(String descriptipon) {
        this.descriptipon = descriptipon;
    }

    public int getClassement() {
        return classement;
    }

    public void setClassement(int classement) {
        this.classement = classement;
    }

    
    public Cours getCours() {
        if(cours==null){
            cours=new Cours();
        }
        return cours;
    }

    public void setCours(Cours cours) {
        this.cours = cours;
    }

    @Override
    public String toString() {
        return "PreRequis{" + "id=" + id + ", descriptipon=" + descriptipon + ", classement=" + classement + ", cours=" + cours + '}';
    }

   
    
}
