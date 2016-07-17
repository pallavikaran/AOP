/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aop;

/**
 *
 * @author Administrator
 */
public class BankImpl implements Bank{
    private int balance=10000;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    
    public int withdraw(int amount,int acc)
    {
        balance=balance-amount;
        return balance;
    }
    
}
