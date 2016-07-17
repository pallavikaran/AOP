/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.Address;
import model.Emp;

/**
 *
 * @author Administrator
 */
public class Assoc {
    
     public static void main(String[] args) {
         
         EntityManagerFactory emf=Persistence.createEntityManagerFactory("InheritancePU");
        EntityManager mgr=emf.createEntityManager();
        mgr.getTransaction().begin();
        Address home= new Address();
        home.setStreetName("MG Road");
        home.setDistrict("Pune");
        home.setState("Mah");
        
        Address office=new Address();
        office.setStreetName("pedderRoad");
        office.setDistrict("Mumbai");
        office.setState("Mah");
        
        Emp emp= new Emp();
        emp.setName("Mohan");
        emp.getSetOfAdd().add(home);
        emp.getSetOfAdd().add(office);
        
        mgr.persist(emp);
         mgr.getTransaction().commit();
        
        
     }
}
