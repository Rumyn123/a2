/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BasedeDatos;

import javax.swing.JOptionPane;

/**
 *
 * @author Rumyn
 */
public class Metodos {
    
    public void mensaje_consola (String men){
        System.out.println(men);
    }
    
    public void mensaje(String mensa){
        JOptionPane.showMessageDialog(null, mensa);
    }
}

