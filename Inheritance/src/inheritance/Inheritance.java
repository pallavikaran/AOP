/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.Address;
import model.CardPayment;
import model.CheckPayment;
import model.Emp;
import model.Payment;

/**
 *
 * @author Administrator
 */
public class Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("InheritancePU");
        EntityManager mgr=emf.createEntityManager();
        mgr.getTransaction().begin();
        Payment pay=new Payment();
        pay.setAmount(10000);
        mgr.persist(pay);
        CardPayment cardPay= new CardPayment();
        cardPay.setAmount(20000);
        cardPay.setCardNumber(123456);
        CheckPayment chkPay= new CheckPayment();
        chkPay.setAmount(32000);
        chkPay.setChecknumber(98765432);
        mgr.persist(cardPay);
        mgr.persist(chkPay);
        
        Emp e= new Emp();
        Address add= new Address();
        add.setDistrict("Thane");
        add.setState("Maharashtra");
        add.setStreetName("LBS");
        e.setName("Ashish");
      //  e.setHome(add);
      //  mgr.persist(e);
        
        mgr.getTransaction().commit();
        
    }
}
