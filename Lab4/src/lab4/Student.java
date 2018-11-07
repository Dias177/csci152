/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author dias
 */
public class Student extends Human{
    
    private double gpa;
    
    public Student(String s, double g) {
        super(s);
        gpa = g;
    }
    
    /**
     * work(). This method overrides the same method
     * from the parent class and displays a message 
     * "Where can I work?" if GPA is equal or greater 
     * than 3.67. Otherwise, it displays a message
     * "No, I have to study hard, but not work!".
     * It receives no input from the user.
     */
    public void work() {
        if (gpa >= 3.67) System.out.println("Where can I work?");
        else System.out.println("No, I have to study hard, but not work!");
    }
    
    /**
     * relax(). This method overrides the same method
     * from the parent class and displays a message 
     * "Woohoo!" if GPA is equal or greater than 3.67.
     * Otherwise, it displays a message
     * "No, I have to study hard, but not relax!".
     * It receives no input from the user.
     */
    public void relax() {
        if (gpa >= 3.67) System.out.println("WooHoo!!!");
        else System.out.println("No, I have to study hard, but not relax!");
    }
    
    /**
     * cheat(). This method displays a message
     * "Noooo, I will never do that! Kappa".
     * It receives no input from the user.
     */
    public void cheat() {
        System.out.println("Noooo, I will never do that! Kappa");
    }

    /**
     * @return the gpa
     */
    public double getGpa() {
        return gpa;
    }

    /**
     * @param gpa the gpa to set
     */
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    
    /**
     * toString(). This method overrides the same method
     * from the parent class and displays a message containing
     * the name of a student and his/her GPA.
     * It receives no input from the user.
     */
    public String toString() {
        return "Student's name: " + getName() + ". GPA: " + gpa;
    }
    
}
