/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beans;

import javax.ejb.Remote;

/**
 *
 * @author Administrator
 */
@Remote
public interface OtherBeanRemote {
    void display();
}
