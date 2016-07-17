/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import entity.Students;
import javax.ejb.Local;

/**
 *
 * @author Administrator
 */
@Local
public interface StudentBeanLocal {
    public void addStudent(Students s);
}
