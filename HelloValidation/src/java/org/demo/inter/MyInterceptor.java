
package org.demo.inter;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionProxy;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class MyInterceptor implements Interceptor {

    @Override
    public void destroy() {
        System.out.println("Destroy................");
    }

    @Override
    public void init() {
        System.out.println("Init................");
    }

    @Override
    public String intercept(ActionInvocation invocation) throws Exception {
        String result="";
       Object currentAction=invocation.getAction();
        ActionProxy proxy= invocation.getProxy();
        
        // pre processing
		System.out.println("before: "+proxy.getActionName()
				+" in method "+proxy.getMethod()+" of class "
				+ currentAction.getClass().getName()+
				" in Name space "+proxy.getNamespace());
         invocation.invoke();
        
        // post processing
		
		System.out.println("After: "+proxy.getActionName()
				+" in method "+proxy.getMethod()+
				" for result "+result);
               
        return result;    
    
    }
    
}
