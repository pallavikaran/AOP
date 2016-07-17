/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beans;

import javax.ejb.Local;

/**
 *
 * @author Administrator
 */
@Local
public interface MyCalcBeanLocal {
   int addNum(int a,int b);
   int subNum(int a,int b);
}
