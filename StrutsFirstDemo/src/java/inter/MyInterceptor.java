/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inter;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

/**
 *
 * @author Administrator
 */
public class MyInterceptor implements Interceptor{
String result="";
    @Override
    public void destroy() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void init() {
        System.out.println("THIS IS INIT...");
    }

    @Override
    public String intercept(ActionInvocation ai) throws Exception {
        System.out.println("THIS IS BEFORE");
        ai.invoke();
         System.out.println("THIS IS AFTER.");
         return result;
    }
    
}
