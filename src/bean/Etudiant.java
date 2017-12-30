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
import java.util.Date;
public class Etudiant {

    private int id;
    private String nom;
    private String prenom;
    private long tel;
    private Date annee;
    private int noteGenerale;
    private CursusEnseignant cursusEnseignant;
    private String mail;

    public Etudiant() {
        
    }
    public Etudiant(int id,String nom,String prenom,long tel,String mail,int noteGeneral,CursusEnseignant cursusEnseignant)
    {
        this.id=id;
        this.nom=nom;
        this.prenom=prenom;
        
        this.cursusEnseignant=cursusEnseignant;
        this.tel=tel;
        this.mail=mail;
        this.noteGenerale=noteGeneral;
            
            }
    public int getNoteGenerale() {
        return noteGenerale;
    }

    public void setNoteGenerale(int noteGenerale) {
        this.noteGenerale = noteGenerale;
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

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public long getTel() {
        return tel;
    }

    public void setTel(long tel) {
        this.tel = tel;
    }

    public Date getAnnee() {
        return annee;
    }

    public void setAnnee(Date annee) {
        this.annee = annee;
    }

    @Override
    public String toString() {
        return "Etudiant{" + "id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", tel=" + tel + ", annee=" + annee + '}';
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    
}
