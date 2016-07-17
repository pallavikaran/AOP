/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hqldemo;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
/**
 *
 * @author Administrator
 */
public class HQLDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            SessionFactory factory;
     factory=new Configuration().configure().buildSessionFactory();
        Session session=factory.openSession();
        Transaction tx=session.beginTransaction();
        //Employee e=new Employee(107, "Mangesh",52300);
      // session.save(e);
//       String hql="UPDATE Employee set esal=:salery WHERE empcode=:ecode";
//       Query query=session.createQuery(hql);
//       query.setParameter("salery", 60000.0);
//       query.setParameter("ecode",106);
//       query.executeUpdate();
       
     Criteria cr=session.createCriteria(Employee.class);
    
     cr.add(Restrictions.gt("esal", 50000.8));
            List list = cr.list();
           
            Iterator itr=list.iterator();
            while (itr.hasNext()) {
                System.out.println((Employee) itr.next());
                //System.out.println(object);
               }
            
        tx.commit();
        session.close();
      }catch(Exception e)
      {
          System.out.println("ERROR="+e);
      }
    }
}
