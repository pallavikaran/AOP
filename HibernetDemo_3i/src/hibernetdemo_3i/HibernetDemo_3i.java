/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernetdemo_3i;


import java.util.Iterator;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Administrator
 */
public class HibernetDemo_3i {

    /**
     * @param args the command line arguments
     */ private static SessionFactory factory;
    public static void main(String[] args) {
      try{
     factory=new Configuration().configure().buildSessionFactory();
        Session session=factory.openSession();
        Transaction tx=session.beginTransaction();
        
        SQLQuery sQLQuery=session.createSQLQuery("select * from WORKERS") ;
        sQLQuery.addEntity(Employee.class) ;
        List allEmplList=sQLQuery.list();
         Iterator itr=allEmplList.iterator();
        while (itr.hasNext()) {
              Employee emp = (Employee) itr.next();
             System.out.println(emp);
            }
       // Employee e=new Employee(105, "Ankita",40000);
      // session.save(e) ;
        
      //  HibernetDemo_3i myObj=new HibernetDemo_3i();
      //  myObj.updateEmployee(103, 50000);
       // myObj.deleteEmployee(101);
       //String str=;
      // Query query=session.createQuery("FROM Employee D where D.empcode=104");
      //  List list=session.createQuery("FROM Employee D where D.empcode=104").list();
       // Iterator itr=list.iterator();
        //  while (itr.hasNext()) {
        //      Employee emp = (Employee) itr.next();
        //      System.out.println(emp);
       //     }
          Criteria cr=session.createCriteria(Employee.class);
          //adding restrictions...
            cr.setProjection(Projections.rowCount());
           List l=cr.list();
           System.out.println("No of Rows : "+l.get(0));
          cr=session.createCriteria(Employee.class);
           Criterion sal=Restrictions.gt("esal", 40300.00);
          Criterion name=Restrictions.like("ename", "_a_k%");
          
         LogicalExpression exp=Restrictions.or(sal,name);
         cr.add(exp);
         cr.addOrder(Order.asc("esal"));
          
          
          List list= cr.list();
           itr=list.iterator();
        while (itr.hasNext()) {
              Employee emp = (Employee) itr.next();
             System.out.println(emp);
            }
         
         tx.commit();
        session.close();
      }catch(Exception e)
      {
          System.out.println("ERROR="+e);
      }
    }
    private void deleteEmployee(Integer id)
    {        factory=new Configuration().configure().buildSessionFactory();
        Session session=factory.openSession();
        Transaction tx=session.beginTransaction();
        Employee e=(Employee) session.get(Employee.class, id);
      
        session.delete(e);
        tx.commit();
       }
    private void updateEmployee(Integer id, double sal)
    {   factory=new Configuration().configure().buildSessionFactory();
        Session session=factory.openSession();
        Transaction tx=session.beginTransaction();
        Employee e=(Employee) session.get(Employee.class,id);
        e.setEsal(sal);
        session.update(e);
        tx.commit();
        
    }
}
