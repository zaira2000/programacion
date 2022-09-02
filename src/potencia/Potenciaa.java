/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package potencia;

import javax.swing.JOptionPane;

/**
 *
 * @author zaira
 */
public class Potenciaa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double a, b, c;
        
        
        
        for (int i = 0; i < 3; i++) {
            
            a = Double.parseDouble(JOptionPane.showInputDialog("ingrese numero"));
            b = Double.parseDouble(JOptionPane.showInputDialog("ingrese numero"));
            c = Math.pow(a, b);
            
            if ( c >= 100) {
                System.out.println("Es mayor a 100");
                
            } else {
                System.out.println("Es menor a 100");
            }
            
            JOptionPane.showMessageDialog(null,c);
            System.out.println(c);
            
        }
    }
    
}
