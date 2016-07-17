/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mybeans;

import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author Administrator
 */
@Stateless
@LocalBean
public class MyCalc {

    public int addNum(int a, int b) {
        return (a+b);
    }

    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
}
