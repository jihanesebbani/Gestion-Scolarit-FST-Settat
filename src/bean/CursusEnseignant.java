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
public class CursusEnseignant {
    private int id;
    private String nom;
    private Departement departement;
    private List<UniteEnseignant> uniteEnseignants;

    public CursusEnseignant() {
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

    public Departement getDepartement() {
         if(departement==null){
            departement=new Departement();
        }
        return departement;
    }

    public void setDepartement(Departement departement) {
        this.departement = departement;
    }

    public List<UniteEnseignant> getUniteEnseignants() {
         if(uniteEnseignants==null){
            uniteEnseignants=new ArrayList<>();
        }
        return uniteEnseignants;
    }

    public void setUniteEnseignants(List<UniteEnseignant> uniteEnseignants) {
        this.uniteEnseignants = uniteEnseignants;
    }

    @Override
    public String toString() {
        return "CursusEnseignant{" + "id=" + id + ", nom=" + nom + ", departement="+ '}';
    }
    
    
}
