/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class WelcomeAction extends ActionSupport {

   
    @Override
    public String execute() throws Exception {
         System.out.println("THIS IS execute of WelcomeAction...");
        return Action.SUCCESS;
    }
    
    
}
