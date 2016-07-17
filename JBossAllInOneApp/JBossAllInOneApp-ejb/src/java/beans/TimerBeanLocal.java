/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.ejb.Remote;

/**
 *
 * @author Administrator
 */
@Remote
public interface TimerBeanLocal {
    public void start();
    public void stop();
}
