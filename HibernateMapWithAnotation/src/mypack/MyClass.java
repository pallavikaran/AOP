/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mypack;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;
/**
 *
 * @author Administrator
 */
public class MyClass {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        try{
             Students s= new Students(101,"Pallavi",99.99);
            SessionFactory factory;
            factory =new AnnotationConfiguration().configure().addAnnotatedClass(mypack.Students.class).buildSessionFactory();
             Session session=factory.openSession();
            Transaction tx=session.beginTransaction();
           
            session.save(s);
            tx.commit();
            session.close();
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
