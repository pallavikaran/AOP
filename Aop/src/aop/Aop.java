/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aop;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 *
 * @author Administrator
 */
public class Aop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Resource res=new ClassPathResource("aop/aop.xml") ;
        BeanFactory factory=new XmlBeanFactory(res) ;
       Bank bank = (Bank) factory.getBean("bankService");
        int bal = bank.withdraw(2000, -234);
        System.out.println("Balence= "+bal);
        // TODO code application logic here
    }
}
