/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.ejb.Timeout;
import javax.ejb.Timer;
import javax.ejb.TimerService;

/**
 *
 * @author Administrator
 */
@Stateless
public class TimerBean implements TimerBeanLocal {
@Resource
    TimerService ts;
    Timer t=null;
    public void start() {
        t=ts.createTimer(1000, 1000*60, null);
    }
@Timeout
public void alarm()
{
    System.out.println("SNOOZEDDDD...");
}
    public void stop() {
        t.cancel();
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
}
