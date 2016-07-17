/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author Administrator
 */
public class Employee {
    private String name;
    private String job;
    private float salary;

    public Employee() {
        System.out.println("hello default");
    }

    public Employee(String name, String job, float salary) {
        this.name = name;
        this.job = job;
        this.salary = salary;
        System.out.println("hello all");
    }

    public Employee(String name) {
        this.name = name;
        System.out.println("hello"+name);
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
    
}
