/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import bean.CursusEnseignant;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author lenovo
 */
public class CursusHelper extends AbstractHelper<CursusEnseignant> {

    private static AbstractHelperItem[] titres;

    static {
        titres = new AbstractHelperItem[]{
           
          
        };
    }

    public CursusHelper(JTable jTable, List<CursusEnseignant> list) {
        super(titres, jTable, list);
    }

    public CursusHelper(JTable jTable) {
        super(titres, jTable);
    }

}
