/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.Cours;
import bean.Enseignant;
import bean.UniteEnseignant;
import java.util.List;

/**
 *
 * @author lenovo
 */
public class CoursDao extends AbstractDao<Cours> {

    public CoursDao() {
        super(Cours.class);
    }

    public Cours findByTitre(String titreCours) throws Exception{
        String requete="select * from cours where titre='"+titreCours+"'";
        return load(requete).get(0);
    }
     public List< Cours> findByEnseignant(int id_enseignant) throws Exception{
        String requete="select * from cours where enseignant='"+id_enseignant+"'";
        return (List<Cours>) load(requete).get(0);
    }
     public List< Cours> findByEnseignantName(String nom_enseignant) throws Exception{
        String requete="select c.id,c.titre,c.enseignant,c.uniteEnseignant,c.vh from Cours c,Enseignant e where e.nom='"+nom_enseignant+"' and e.id=c.enseignant ";
        return load(requete);
    }
    public List<Cours> findByNomUnite(String nomUnite) throws Exception {
        String requete = "select c.id,c.titre,c.enseignant,c.uniteEnseignant,c.vh from cours c,UniteEnseignant u where u.id=c.uniteEnseignant and u.nom='" + nomUnite + "'";
        return load(requete);
    }

    public int findMaxId() throws Exception {
        String requete = " select * from cours where id=(select Max(id) from cours)";
        List<Cours> courses = load(requete);
        if (!courses.isEmpty()) {
            Cours cours = courses.get(0);
            return cours.getId() + 1;
        }

        return 1;

    }
    public List<Cours> findByUnite(UniteEnseignant uniteEnseignant) throws Exception{
        String requete="select * from cours where uniteEnseignant="+uniteEnseignant.getId();
        return load(requete);
    }
  
    public List<Cours> findBydepartement(String nomDepartement) throws Exception{
        String requete="select c.id,c.enseignant,c.titre,c.uniteEnseignant,c.vh from Departement d,UniteEnseignant u, CursusEnseignant cr,Cours c"
                + " where d.nom='"+nomDepartement+"' and d.id=cr.departement and cr.id=u.cursusEnseignant and u.id=c.uniteEnseignant "; 
        System.out.println(requete);
                return load(requete);
    }
    
    public void updateVH (String titre, String newvh) throws Exception {
        String requete="update cours set vh='"+newvh+"' where titre='"+titre+"' ";
        ConnectDB.exec(requete);
    }
}
