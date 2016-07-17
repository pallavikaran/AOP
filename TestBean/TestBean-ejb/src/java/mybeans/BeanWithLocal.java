/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mybeans;

import javax.ejb.Stateless;

/**
 *
 * @author Administrator
 */
@Stateless
public class BeanWithLocal implements BeanWithLocalLocal {

    public String callBeanWithLocal()
    {
        return "This bean with Local";
    }
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
}
