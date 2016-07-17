/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aop;

import org.springframework.aop.MethodBeforeAdvice;

/**
 *
 * @author Administrator
 */
public interface SecurityAspect extends MethodBeforeAdvice{
    public boolean check(int accNo);
    
            
    
}
