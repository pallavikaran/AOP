/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hphibernate1;

/**
 *
 * @author Administrator
 */
public class Students {

    int roll;
    String std_name;
    double score;
    String address;

    public Students() {
    }

    public Students(int roll, String std_name, double score, String address) {
        this.roll = roll;
        this.std_name = std_name;
        this.score = score;
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getStd_name() {
        return std_name;
    }

    public void setStd_name(String std_name) {
        this.std_name = std_name;
    }

    @Override
    public String toString() {
        return "Students{" + "roll=" + roll + ", std_name=" + std_name + ", score=" + score + ", address=" + address + '}';
    }
}
