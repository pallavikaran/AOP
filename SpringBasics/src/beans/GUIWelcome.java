/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class GUIWelcome implements  Welcome{

    public GUIWelcome() {
        System.out.println("GUI Ashita");
    }
    

    
    public void GUIwelcome() 
    {
        System.out.println("Welcome GUI");
    } 
    
    @Override
    public void welcome(String name) {
       JOptionPane.showMessageDialog(null,"Welcome"+name);
    }
    
}
