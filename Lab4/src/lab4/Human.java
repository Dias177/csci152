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
public class Human {
    
    private String name;
    
    public Human(String n) {
        name = n;
    }
    
    /**
     * work(). This method displays a message "Let's work!".
     * It receives no input from the user.
     */
    public void work() {
        System.out.println("Let's work!");
    }
    
    /**
     * relax(). This method displays a message "Yeah....".
     * It receives no input from the user.
     */
    public void relax() {
        System.out.println("Yeah....");
    }
    
    /**
     * talk(). This method displays a message "bla bla bla".
     * It receives no input from the user.
     */
    public void talk() {
        System.out.println("bla bla bla");
    }
    
    /**
     * toString(). This method displays a message containing
     * the name of a human.
     * It receives no input from the user.
     */
    public String toString() {
        return "Human named " + getName();
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
}
