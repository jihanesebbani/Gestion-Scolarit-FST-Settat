/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.Etudiant;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.sf.jasperreports.engine.JRException;
import util.PdfUtil;

/**
 *
 * @author lenovo
 */
public class EtudiantDao extends AbstractDao<Etudiant>{

    public EtudiantDao() {
        super(Etudiant.class);
    }
    
    public List<Etudiant> findBycursus(String nom) throws Exception{
        String requete="select e.id,e.noteGenerale,e.annee, e.prenom, e.nom,e.tel, e.cursusEnseignant,e.mail from CursusEnseignant c,Etudiant e"
                + " where c.nom='"+nom+"' and c.id=e.cursusEnseignant "; 
        System.out.println(requete);
                return load(requete);
    }
    
    public Etudiant findById(int apogee) throws Exception {
        String requete = "select * from Etudiant  where id='" + apogee + "'";
        System.out.println(requete);
        return load(requete).get(0);
    } 
     public void generateFichesignaletique(Etudiant etudiant) throws JRException, IOException{
            Map<String, Object> params = new HashMap<>();
            params.put("nom1", "Nom De l'etudiant");
            params.put("nom", etudiant.getNom()+" "+etudiant.getPrenom());
            params.put("tel", etudiant.getTel()+"");
            params.put("email", etudiant.getMail());
             PdfUtil.generatePdf(new ArrayList(), params, "fiche signaletique etudiant\\"+etudiant.getNom()+" "+etudiant.getPrenom(), "/report/signaletique.jasper");
      }
}
