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
public class Cours {
    private int id;
    private String titre;
    private Enseignant enseignant;
    private UniteEnseignant uniteEnseignant;
    private List<PreRequis> preRequises;
    private String vh;

    public Cours() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public Enseignant getEnseignant() {
         if(enseignant==null){
            enseignant=new Enseignant();
        }
        return enseignant;
    }

    public void setEnseignant(Enseignant enseignant) {
        this.enseignant = enseignant;
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

    public List<PreRequis> getPreRequises() {
        if(preRequises==null){
            preRequises=new ArrayList<>();
        }
        return preRequises;
    }

    public void setPreRequises(List<PreRequis> preRequises) {
        this.preRequises = preRequises;
    }

    
    @Override
    public String toString() {
        return "Cours{" + "id=" + id + ", titre=" + titre + ", enseignant=" + enseignant + ", uniteEnseignant=" + uniteEnseignant + ", vh=" + vh + '}';
    }

    public String getVh() {
        return vh;
    }

    public void setVh(String vh) {
        this.vh = vh;
    }
    
    
    
}
