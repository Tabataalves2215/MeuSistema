/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meusistema;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author silvanio
 */
public class MeuSistema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date relogio = new Date ();
        System.out.println("A hora do sistema é");
        System.out.println(relogio.toString());
        Locale loc = Locale.getDefault();
        System.out.println("O idioma do sistema é");
        System.out.println(loc.getDisplayLanguage());//imprime "Potruguês"
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        System.out.println("A resolução do sistema é:"+ d.width + "x" + d.height);
        
        
        // TODO code application logic here
    }
    
}
