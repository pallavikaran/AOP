/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import entity.Students;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Administrator
 */
@Stateless
public class StudentBean implements StudentBeanLocal {
@PersistenceContext(unitName="JBossDataConn-ejbPU")
EntityManager mgr;
    public void addStudent(Students s) {
        mgr.persist(s);
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
}
