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
public class EtudiantUniteenseignant {
    private int id;
    private Etudiant etudiant;
    private UniteEnseignant uniteEnseignant;

    public EtudiantUniteenseignant() {
    }

    public EtudiantUniteenseignant(Etudiant etudiant, UniteEnseignant uniteEnseignant) {
        this.etudiant = etudiant;
        this.uniteEnseignant = uniteEnseignant;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Etudiant getEtudiant() {
        if(etudiant==null){
            etudiant=new Etudiant();
        }
        return etudiant;
    }

    public void setEtudiant(Etudiant etudiant) {
        this.etudiant = etudiant;
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
        return "EtudiantUniteenseignant{" + "id=" + id + ", etudiant=" + etudiant.getId() + ", uniteEnseignant=" + uniteEnseignant.getId() + '}';
    }
   
    
}
