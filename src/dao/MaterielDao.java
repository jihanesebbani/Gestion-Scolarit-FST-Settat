/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import bean.Enseignant;
import bean.Materiel;
import java.sql.Date;
import java.util.List;
/**
 *
 * @author MICRO
 */
public class MaterielDao extends AbstractDao<Materiel>{
    
    public MaterielDao() {
        super(Materiel.class);
    }
    
    public void updateMateriel (String lib,int id, Date datereserve) throws Exception {
        String requete="update materiel set statut='reserve',date_reservation='"+datereserve+"',enseignant='"+id+"' where id='"+lib+"' ";
        ConnectDB.exec(requete);
    }
    
    public void rendreMateriel (String lib) throws Exception {
        String requete="update materiel set statut='disponible',date_reservation=NULL,enseignant=NULL where id='"+lib+"' ";
        ConnectDB.exec(requete);
    }
    
    public List<Materiel>findByEnseignant(int id) throws Exception{
        String requete="select * from materiel where enseignant='"+id+"' ";
        return load(requete);
    }
    
    public List<Materiel>disponible() throws Exception{
        String requete="select * from materiel where statut='disponible' ";
        return load(requete);
    }
}
