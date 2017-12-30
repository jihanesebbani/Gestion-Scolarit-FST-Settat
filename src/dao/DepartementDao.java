/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.Departement;

/**
 *
 * @author lenovo
 */
public class DepartementDao extends AbstractDao<Departement>{

    public DepartementDao() {
        super(Departement.class);
    }
    public Departement findByNom(String nomDept) throws Exception{
        String requete="select * from Departement where nom='"+nomDept+"'";
        return  load(requete).get(0);
    }
}
