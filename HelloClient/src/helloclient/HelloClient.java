/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package helloclient;

import service.Hello;
import service.Hello_Service;

/**
 *
 * @author Administrator
 */
public class HelloClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Hello_Service service= new Hello_Service();
        Hello h=service.getHelloPort();
        System.out.println(h.hello("Ashish"));
        
        
    }
}
