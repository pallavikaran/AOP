/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;



/**
 *
 * @author Administrator
 */
public class Car {
    private EngineClass engine;
    
    private int speed;
 public Car() {
    }
    public EngineClass getEngine() {
        return engine;
    }
//@Autowired
//@Qualifier(value="aaaa")
    @Resource(name="eng")
    public void setEngine(EngineClass engine) {
        this.engine = engine;
    }

    public int getSpeed() {
        return speed;
    }
    @Required
    public void setSpeed(int speed) {
        this.speed = speed;
    }

   
    @PostConstruct
            public void init()
    {
        System.out.println("Const build.... in Init");
    }
     @PreDestroy
            public void kill()
    {
        System.out.println("Const is going to destroy.... in kill");
    }
    
    
}
