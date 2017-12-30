/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lenovo
 */
public class Departement {
    private int id;
    private String nom;
    private Enseignant responsable;
    private List<Enseignant> enseignants;

    public Departement() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Enseignant getResponsable() {
         if(responsable==null){
            responsable=new Enseignant();
        }
        return responsable;
    }

    public void setResponsable(Enseignant responsable) {
        this.responsable = responsable;
    }

   

    public List<Enseignant> getEnseignants() {
         if(enseignants==null){
            enseignants=new ArrayList<>();
        }
        return enseignants;
    }

    public void setEnseignants(List<Enseignant> enseignants) {
        this.enseignants = enseignants;
    }

    @Override
    public String toString() {
        return "Departement{" + "id=" + id + ", nom=" + nom + ", responsableId=" + responsable.getId() + '}';
    }
    
     
}
