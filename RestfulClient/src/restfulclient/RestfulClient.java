/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package restfulclient;

import client.HelloW;


/**
 *
 * @author Administrator
 */
public class RestfulClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       HelloW hw= new HelloW();
        System.out.println(hw.getHtml());
        hw.putHtml("This is Restful put data");
    }
}
