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
public class Kid extends Human {
    
    private int age;
    
    public Kid(String s, int a) {
        super(s);
        age = a;
    }
    
    /**
     * talk(). This method overrides the same method from 
     * the parent class and displays a message "Where can I play?".
     * It receives no input from the user.
     */
    public void talk() {
        System.out.println("When can I play?");
    }
    
    /**
     * play(). This method displays a message "I'm so happy!!!".
     * It receives no input from the user.
     */
    public void play() {
        System.out.println("I'm so happy!!!");
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }
    
    /**
     * toString(). This method overrides the same method
     * from the parent class and displays a message containing
     * the name of a kid and his/her age.
     * It receives no input from the user.
     */
    public String toString() {
        return "Kid's name: " + getName() + ". Age: " + age;
    }
    
    
}
