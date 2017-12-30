/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import bean.CursusEnseignant;
import bean.UniteEnseignant;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author lenovo
 */
public class UniteHelper extends AbstractHelper<UniteEnseignant> {

    private static AbstractHelperItem[] titres;

    static {
        titres = new AbstractHelperItem[]{
            new AbstractHelperItem("Nom", "nom"),
            new AbstractHelperItem("Nombre D'etudiants", "nbEtudiant"),
            new AbstractHelperItem("Etat", "etat")
          
        };
    }

    public UniteHelper(JTable jTable, List<UniteEnseignant> list) {
        super(titres, jTable, list);
    }

    public UniteHelper(JTable jTable) {
        super(titres, jTable);
    }

}
