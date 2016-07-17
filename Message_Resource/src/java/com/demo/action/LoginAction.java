/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.action;

import com.demo.model.User;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
    private User userBean=new User();

    public User getUserBean() {
        return userBean;
    }

    public void setUserBean(User userBean) {
        this.userBean = userBean;
    }

   
    
    @Override
 public String execute()throws Exception{
    
     
     return SUCCESS;
 }    
     @Override
    public void validate() {
        if(userBean.getUsername().length()==0){
            addFieldError("userBean.username", "Please enter user name");
        }
    }
    
}
