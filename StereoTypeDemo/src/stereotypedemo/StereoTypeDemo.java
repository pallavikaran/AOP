/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stereotypedemo;

import model.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Administrator
 */
public class StereoTypeDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ApplicationContext ctx=new ClassPathXmlApplicationContext("stereotypedemo/spring.xml");
        Student st=(Student) ctx.getBean("Student");
        st.setMarks(99);
        st.setName("Ashish");
        System.out.println("Name= "+st.getName()+"  Marks= "+st.getMarks());
    }
}
