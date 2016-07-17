/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hphibernate1;

import java.io.Serializable;
import java.sql.Connection;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Administrator
 */
public class HpHibernate1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SessionFactory factory=new Configuration().configure().buildSessionFactory();
        Session session=factory.openSession();
        Transaction tx=session.beginTransaction();
        //Students s1=new Students(5,"Salman",78.78, "Mah-Mum");
       //  session.save(s1);
        Students student=(Students)session.get(Students.class,5);
        //student.setAddress("Mah-Mumbai");
        //student.setScore(68.68);
       // session.update(student);
        session.delete(student);
        tx.commit();
        List<Students> stds=session.createQuery("From Students").list();
        
        for (Students s:stds) {
            System.out.println(s);
        }
        
        
       
         session.close();
      //  System.out.println(s1+"Data Saved in Table");
        
    }
}
