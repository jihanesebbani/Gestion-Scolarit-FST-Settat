/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import bean.PreRequis;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author lenovo
 */
public class PreRequisHelper extends AbstractHelper<PreRequis> {

    private static AbstractHelperItem[] titres;

    static {
        titres = new AbstractHelperItem[]{
            new AbstractHelperItem("Descriptipon", "descriptipon"),
            new AbstractHelperItem("Classement", "classement")
          
        };
    }

    public PreRequisHelper(JTable jTable, List<PreRequis> list) {
        super(titres, jTable, list);
    }

    public PreRequisHelper(JTable jTable) {
        super(titres, jTable);
    }

}
