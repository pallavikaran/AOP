/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package springbasics;


import beans.Welcome;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

/**
 *
 * @author Administrator
 */
public class SpringBasics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Resource res=new ClassPathResource("spring.xml");
      //  Resource res=new FileSystemResource("c:\\spring.xml");
        
        BeanFactory factory= new XmlBeanFactory(res) ;
        
        Welcome wel= (Welcome) factory.getBean("console");
        Welcome well= (Welcome) factory.getBean("console");
        well.welcome("talentedge");
        wel.welcome("Ashish");
        
        // TODO code application logic here
    }
}
