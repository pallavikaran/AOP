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
public class MyCalcBean implements MyCalcBeanLocal {

    @Override
    public int addNum(int a, int b) {
        return(a+b);
    }

    @Override
    public int subNum(int a, int b) {
        return(a-b);
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
}
