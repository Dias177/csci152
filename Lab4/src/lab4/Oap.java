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
public class Oap extends Human{
    
    public Oap(String s) {
        super(s);
    }
    
     /**
     * relax(). This method overrides the same method
     * from the parent class and displays a message 
     * "Yeah, I'm already doing that." 
     * It receives no input from the user.
     */
    public void relax() {
        System.out.println("Yeah, I'm already doing that.");
    }

    /**
     * toString(). This method overrides the same method
     * from the parent class and displays a message containing
     * the name of an OAP.
     * It receives no input from the user.
     */
    public String toString() {
        return "OAP's name: " + getName() + ".";
    }
    
}
