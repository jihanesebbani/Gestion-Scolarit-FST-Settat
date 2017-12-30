/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.Cours;
import bean.PreRequis;
import java.util.List;

/**
 *
 * @author lenovo
 */
public class PreRequisDao extends  AbstractDao<PreRequis>{

    public PreRequisDao() {
        super(PreRequis.class);
    }
    public void addAll(List<PreRequis> preRequises) throws Exception{
        for (int i = 0; i < preRequises.size(); i++) {
            PreRequis preRequis = preRequises.get(i);
            save(preRequis);
        }
    }
    public List<PreRequis>findByCours(Cours cours) throws Exception{
        String requete="select * from PreRequis where cours="+cours.getId()+" order by classement";
        return load(requete);
    }
}
