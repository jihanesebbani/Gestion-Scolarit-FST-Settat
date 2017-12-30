/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.sql.Date;

/**
 *
 * @author lenovo
 */
public class Enseignant {

    private int id;
    private String nom;
    private String prenom;
    private long tel;
    private String mail;
    private Departement departement;
    private Date dateFonction;
    private int statut;//1 enseignant principal 0 enseignant contractuel
    private Date fin;

    public Enseignant() {
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

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
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

    public Date getDateFonction() {
        
        return dateFonction;
    }

    public void setDateFonction(Date dateFonction) {
        this.dateFonction = dateFonction;
    }

    public int getStatut() {
        return statut;
    }

    public void setStatut(int statut) {
        this.statut = statut;
    }

    public Date getFin() {
        return fin;
    }

    public void setFin(Date fin) {
        this.fin = fin;
    }

    
}
