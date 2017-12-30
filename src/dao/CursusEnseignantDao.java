/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.CursusEnseignant;
import bean.Departement;
import java.util.List;

/**
 *
 * @author lenovo
 */
public class CursusEnseignantDao extends AbstractDao<CursusEnseignant> {

    DepartementDao departementDao = new DepartementDao();

    public CursusEnseignantDao() {
        super(CursusEnseignant.class);
    }

    public int ajouter(CursusEnseignant cursusEnseignant, String nomDepartemnt) throws Exception {
        String requete = "select * from Departement where nom='" + nomDepartemnt + "'";
        List<Departement> departements = departementDao.load(requete);
        cursusEnseignant.getDepartement().setId(departements.get(0).getId());
        return save(cursusEnseignant);
    }

    public List<CursusEnseignant> findByDepartement(String nomDepartement) throws Exception {
        String requete = "select c.id,c.nom,c.departement from Departement d,CursusEnseignant c where c.departement=d.id and d.nom='" + nomDepartement + "'";
        System.out.println(requete);
        return load(requete);

    }
    public CursusEnseignant findByNom(String nomCursus) throws Exception{
        String requete="select * from CursusEnseignant where nom='"+nomCursus+"'";
        return load(requete).get(0);
    }
}
