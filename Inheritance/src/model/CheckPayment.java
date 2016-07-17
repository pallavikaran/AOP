/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Administrator
 */
@Entity
@DiscriminatorValue(value="Check")
public class CheckPayment extends Payment implements Serializable {
    private static final long serialVersionUID = 1L;
   
    private int checknumber;

    public int getChecknumber() {
        return checknumber;
    }

    public void setChecknumber(int checknumber) {
        this.checknumber = checknumber;
    }
    
}
