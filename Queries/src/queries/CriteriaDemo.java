/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package queries;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import pojo.Students;

/**
 *
 * @author Administrator
 */
public class CriteriaDemo {
    public static void main(String[] args) {
        
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("QueriesPU");
        EntityManager mgr=emf.createEntityManager();
        mgr.getTransaction().begin();
        Students s1= new Students("11", "Ashish", 88);
        Students s2= new Students("12", "Anshul", 83);
         Students s3= new Students("13", "Anish", 70);
         Students s4= new Students("14", "Ashish", 88);
        Students s5= new Students("15", "A1", 83);
         Students s6= new Students("16", "A2", 70);
         Students s7= new Students("17", "A3", 88);
        Students s8= new Students("18", "A4", 83);
         Students s9= new Students("19", "A5", 70);
         
         mgr.persist(s1);
         mgr.persist(s2);
         mgr.persist(s3);
         mgr.persist(s4);
         mgr.persist(s5);
         mgr.persist(s6);
         mgr.persist(s7);
         mgr.persist(s8);
         mgr.persist(s9);
           
    }
}
