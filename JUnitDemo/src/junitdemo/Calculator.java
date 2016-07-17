/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package junitdemo;

/**
 *
 * @author Administrator
 */
public class Calculator {

    public Calculator() {
        System.out.println("Const called.");
    }

    public int sum(int x, int y) {
        return (x + y);
    }
    public int product(int x,int y)
    {
        return x*y;
    }
}
