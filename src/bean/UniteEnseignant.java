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
public class UniteEnseignant {
    private int id;
    private String nom;
    private int etat;
    private int nbEtudiant;
    private int supplementaire;
    private CursusEnseignant cursusEnseignant;
    private List <Cours> courss;

    public UniteEnseignant() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSupplementaire() {
        return supplementaire;
    }

    public void setSupplementaire(int supplementaire) {
        this.supplementaire = supplementaire;
    }

    
    
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getEtat() {
        return etat;
    }

    public void setEtat(int etat) {
        this.etat = etat;
    }

    public int getNbEtudiant() {
        return nbEtudiant;
    }

    public void setNbEtudiant(int nbEtudiant) {
        this.nbEtudiant = nbEtudiant;
    }

    public CursusEnseignant getCursusEnseignant() {
         if(cursusEnseignant==null){
            cursusEnseignant=new CursusEnseignant();
        }
        return cursusEnseignant;
    }

    public void setCursusEnseignant(CursusEnseignant cursusEnseignant) {
        this.cursusEnseignant = cursusEnseignant;
    }

    public List<Cours> getCourss() {
         if(courss==null){
            courss=new ArrayList<>();
        }
        return courss;
    }

    public void setCourss(List<Cours> courss) {
        this.courss = courss;
    }

    /*@Override
    public String toString() {
        return "UniteEnseignant{" + "id=" + id + ", nom=" + nom + ", etat=" + etat + ", nbEtudiant=" + nbEtudiant + ", cursusEnseignant=" + cursusEnseignant.getId() + '}';
    }*/
    
    
}
