/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mypack;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Administrator
 */
@Entity
@Table(name="STUDENTS")
public class Students implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name="s_roll")
    private int id;
    @Column(name="s_name")
private String name;
    @Column(name="s_score")
private double score;

    public Students(Integer id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public Students() {
    }

    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

   

    @Override
    public String toString() {
        return "Students{" + "id=" + id + ", name=" + name + ", score=" + score + '}';
    }

    
    
}
