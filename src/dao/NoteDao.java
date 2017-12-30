/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.Note;
import java.util.List;

/**
 *
 * @author lenovo
 */
public class NoteDao extends AbstractDao<Note>{

    public NoteDao() {
        super(Note.class);
    }
    
    public List<Note> findByExam(String idexam) throws Exception {
        String requete = "select * from note where exam='" + idexam + "'";
        System.out.println(requete);
        List<Note> notes = load(requete);
        return notes;
    } 
    public List<Note> findByEtudiant(int apogee) throws Exception {
        String requete = "select * from note where etudiant='" + apogee + "'";
        System.out.println(requete);
        List<Note> notes = load(requete);
        return notes;
    } 
    
}
