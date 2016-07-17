
package org.demo.action;

import com.opensymphony.xwork2.ActionSupport;
import org.demo.model.User;

public class LoginAction extends ActionSupport{
    
    private User userBean;

    public User getUserBean() {
        return userBean;
    }

    public void setUserBean(User userBean) {
        this.userBean = userBean;
    }
    

    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }

    @Override
    public void validate() {
        if(userBean.getUserName().length()==0){
            addFieldError("userBean.userName", "Please give username");
        }
        if(userBean.getPassword().length()==0){
            addFieldError("userBean.password", "Please enter Password");
        }
    }
    
    
}
