/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import bean.Cours;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author MICRO
 */
public class CoursHelper extends AbstractHelper<Cours>{
    
    private static AbstractHelperItem[] titres;

    static {
        titres = new AbstractHelperItem[]{
            new AbstractHelperItem("Titre", "titre"),
            new AbstractHelperItem("VH", "vh")
          
        };
    }

    public CoursHelper(JTable jTable, List<Cours> list) {
        super(titres, jTable, list);
    }

    public CoursHelper(JTable jTable) {
        super(titres, jTable);
    }
    
}
