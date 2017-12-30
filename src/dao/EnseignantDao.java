/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.Enseignant;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.sf.jasperreports.engine.JRException;
import util.DaoEngigne;
import util.PdfUtil;

/**
 *
 * @author lenovo
 */
public class EnseignantDao extends AbstractDao<Enseignant>{

    public EnseignantDao() {
        super(Enseignant.class);
    }
    public List<Enseignant> findBydepartement(String nomDepartement) throws Exception{
        String requete="select e.id, e.nom,e.prenom,e.tel,e.mail,e.dateFonction,e.departement,e.statut,e.fin from Departement d,Enseignant e"
                + " where d.nom='"+nomDepartement+"' and d.id=e.departement "; 
        System.out.println(requete);
                return load(requete);
    }

      
      public Enseignant findByName(String name) throws Exception{
        String requete="select * from enseignant where nom='"+name+"'";
        return load(requete).get(0);
    }
      public void generateFichesignaletique(Enseignant enseignant) throws JRException, IOException{
            Map<String, Object> params = new HashMap<>();
            params.put("nom1", "Nom De l'enseignant");
            params.put("nom", enseignant.getNom()+" "+enseignant.getPrenom());
            params.put("tel", enseignant.getTel()+"");
            params.put("email", enseignant.getMail());
             PdfUtil.generatePdf(new ArrayList(), params, "fiche signaletique enseignant\\"+enseignant.getNom()+" "+enseignant.getPrenom(), "/report/signaletique.jasper");
      }
}