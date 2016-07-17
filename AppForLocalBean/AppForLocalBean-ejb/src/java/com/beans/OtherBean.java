/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beans;

import javax.ejb.Stateless;

/**
 *
 * @author Administrator
 */
@Stateless
public class OtherBean implements OtherBeanRemote {

    @Override
    public void display() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
}
