/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 *
 * @author Administrator
 */
//@Component(value="Student")
@Service(value="Student")
public class Student {
    private String name;
    private int marks;

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
