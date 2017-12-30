/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.Exam;
import java.util.List;

/**
 *
 * @author lenovo
 */
public class ExamDao extends AbstractDao<Exam>{

    public ExamDao() {
        super(Exam.class);
    }
  
    public List<Exam> findByUnite(int idunite) throws Exception {
        String requete = "select * from Exam e where e.uniteEnseignant='" + idunite + "'";
        System.out.println(requete);
        List<Exam> exams = load(requete);
        return exams;
    }  
    
    public Exam findById(String idex) throws Exception {
        String requete = "select * from Exam  where id='" + idex + "'";
        System.out.println(requete);
        return load(requete).get(0);
    } 
}
