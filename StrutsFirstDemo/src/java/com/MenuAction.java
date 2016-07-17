/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Action;

/**
 *
 * @author Administrator
 */
public class MenuAction extends ActionSupport{
    public String isMenu()
    {
        return "showmenu";
    }
     public String isMobile()
    {
        return "showmobile";
    }
}
