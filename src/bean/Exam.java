/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.util.Date;

/**
 *
 * @author lenovo
 */
public class Exam {
    private String id;
    private Date date;
    private String lieu;
    private int coefficient;
    private UniteEnseignant uniteEnseignant;

    public Exam() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public int getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(int coefficient) {
        this.coefficient = coefficient;
    }

    public UniteEnseignant getUniteEnseignant() {
         if(uniteEnseignant==null){
            uniteEnseignant=new UniteEnseignant();
        }
        return uniteEnseignant;
    }

    public void setUniteEnseignant(UniteEnseignant uniteEnseignant) {
        this.uniteEnseignant = uniteEnseignant;
    }

    @Override
    public String toString() {
        return "Exam{" + "id=" + id + ", date=" + date + ", lieu=" + lieu + ", coefficient=" + coefficient + ", uniteEnseignant=" + uniteEnseignant + '}';
    }

    
    
}
