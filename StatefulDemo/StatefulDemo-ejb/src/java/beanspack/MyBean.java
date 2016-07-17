/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package beanspack;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Stateful;
import javax.ejb.LocalBean;

/**
 *
 * @author Administrator
 */
@Stateful
@LocalBean
public class MyBean {
    int value;
@PostConstruct
    public void init()
    {value=100;
        System.out.println("This is Init and POSTCONSTRUCT");
    }
 @PreDestroy
   public void destroy()
   {
        System.out.println("This is Destroy and PREDESTROY");
   }
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
  
public String doSomething()
{
    return "this is returning Value= "+value;
}
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
}
