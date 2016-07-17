/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernetdemo_3i;

/**
 *
 * @author Administrator
 */
public class Employee {
    private int empcode;
    private String ename;
    private double esal;

    public Employee(int empcode, String ename, double esal) {
        this.empcode = empcode;
        this.ename = ename;
        this.esal = esal;
    }

    public Employee() {
    }

    
    
    public int getEmpcode() {
        return empcode;
    }

    public void setEmpcode(int empcode) {
        this.empcode = empcode;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public double getEsal() {
        return esal;
    }

    public void setEsal(double esal) {
        this.esal = esal;
    }

    @Override
    public String toString() {
        return "Employee{" + "empcode=" + empcode + ", ename=" + ename + ", esal=" + esal + '}';
    }
    
        
}
