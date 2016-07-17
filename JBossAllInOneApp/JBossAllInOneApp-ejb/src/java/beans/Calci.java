/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.ejb.Stateless;

/**
 *
 * @author Administrator
 */
@Stateless
public class Calci implements CalciLocal {

    public int sum(int x, int y) {
        return (x+y);
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
}
