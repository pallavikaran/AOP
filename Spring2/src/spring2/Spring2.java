/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spring2;

import beans.Car;
import beans.Employee;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 *
 * @author Administrator
 */
public class Spring2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Resource res = new ClassPathResource("beans/spring.xml"); 
     // BeanFactory factory=new XmlBeanFactory(res);
     
       ApplicationContext factory=new ClassPathXmlApplicationContext("beans/spring.xml");
        //AbstractApplicationContext factory=new ClassPathXmlApplicationContext("beans/spring.xml");
     //  factory.registerShutdownHook();
       /* Employee emp=(Employee) factory.getBean("emp_3p");
        System.out.println("name"+emp.getName());
        System.out.println("Salary"+emp.getSalary());
        System.out.println("job"+emp.getJob());
        // TODO code application logic here
    
        */
        Car c1= (Car) factory.getBean("car");
        System.out.println("speed="+c1.getSpeed());
        System.out.println("speed="+c1.getEngine().getPower());
   
        }
}
