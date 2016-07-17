/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.demo.inter;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class LogInterceptor implements Interceptor{

    @Override
    public void destroy() {
       
    }

    @Override
    public void init() {
        
    }

    @Override
    public String intercept(ActionInvocation ai) throws Exception {
        String result="";
        System.out.println("before....----.......");
        ai.invoke();
        System.out.println("after....----...........");
        return result;
    }
    
}
