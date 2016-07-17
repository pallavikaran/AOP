/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author Administrator
 */
public class ConsoleWelcome implements Welcome {
    
private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    

    public ConsoleWelcome() {
        System.out.println(" Console Ashita");
        
    }
    
    public void Consolewelcome() 
    {
        System.out.println("Welcome Console");
    }

    @Override
    public void welcome(String name) {
        System.out.println("Welcome User" +" "+name +"  " +message);
              
    }
    
}
