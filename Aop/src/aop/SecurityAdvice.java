/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aop;

import java.lang.reflect.Method;

/**
 *
 * @author Administrator
 */
public class SecurityAdvice implements SecurityAspect{

    @Override
    public boolean check(int accNo) {
        if(accNo<0)
        
            return false;
            else
            return true;
        
    }

    @Override
    public void before(Method method, Object[] os, Object o) throws Throwable {
        System.out.println("executed before ="+method.getName());
        Integer ac=(Integer)os[1];
        if(check(ac)==false)
        {
            throw new RuntimeException("Security Check exeption");
        }
    }
    
    
}
