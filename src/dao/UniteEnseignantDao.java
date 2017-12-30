/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.CursusEnseignant;
import bean.UniteEnseignant;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import util.PdfUtil;

/**
 *
 * @author lenovo
 */
public class UniteEnseignantDao extends AbstractDao<UniteEnseignant> {

    CursusEnseignantDao cursusEnseignantDao = new CursusEnseignantDao();

    public UniteEnseignantDao() {
        super(UniteEnseignant.class);
    }

    public int ajouter(UniteEnseignant uniteEnseignant, String nomCursusEnseignant) throws Exception {
        String requete = "select * from CursusEnseignant where nom='" + nomCursusEnseignant + "'";
        System.out.println(requete);
        List<CursusEnseignant> cursusEnseignants = cursusEnseignantDao.load(requete);
        uniteEnseignant.getCursusEnseignant().setId(cursusEnseignants.get(0).getId());
        return save(uniteEnseignant);

    }

    public List<UniteEnseignant> findByCursus(String nomCursus) throws Exception {
        String requete = "select u.id,u.nbEtudiant,u.nom,u.etat,u.cursusEnseignant,u.supplementaire from UniteEnseignant u,CursusEnseignant c where c.id=u.CursusEnseignant and c.nom='" + nomCursus + "'  order by supplementaire";
        System.out.println(requete);
        List<UniteEnseignant> uniteEnseignants = load(requete);
        return uniteEnseignants;
    }

    public UniteEnseignant findByNomUnite(String nomUnite) throws Exception {
        String requete = "select * from UniteEnseignant where nom='" + nomUnite + "'";
        return load(requete).get(0);
    }

    public UniteEnseignant findById(int idunite) throws Exception {
        String requete = "select * from UniteEnseignant where id='" + idunite + "'";
        return load(requete).get(0);
    }

    public void genereteFicheInscription() throws Exception {
        List<CursusEnseignant> cursusEnseignants = cursusEnseignantDao.findAll();
        for (int i = 0; i < cursusEnseignants.size(); i++) {
            CursusEnseignant cursusEnseignant = cursusEnseignants.get(i);
            List<UniteEnseignant> uniteEnseignants = findByCursus(cursusEnseignant.getNom());
            for (int j = 0; j < uniteEnseignants.size(); j++) {
                
                UniteEnseignant uniteEnseignant = uniteEnseignants.get(j);
                if(uniteEnseignant.getSupplementaire()==1){
                uniteEnseignant.setNom(uniteEnseignant.getNom()+"(*)");}
                
            }
            Map<String, Object> params = new HashMap<>();
            params.put("nomCursus", cursusEnseignant.getNom());
            params.put("vide", " ");
            PdfUtil.generatePdf(uniteEnseignants, params, "fiche inscription\\" + cursusEnseignant.getNom(), "/report/fiche.jasper");
        }
    }
}

