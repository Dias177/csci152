/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clock;

/**
 *
 * @author dias
 */
public class ClockTest {
    
    public static void main(String[] args) {
        
        try {
            Clock clock = new Clock(23, 340, 122);
            System.out.println(clock);
        } catch (Exception ex) {
            System.out.println("Oooops!!!");
            System.out.println(ex.getMessage());
        }
        
        try {
            Clock clock = new Clock(23, 34, 22);
            System.out.println(clock);
        } catch (Exception ex) {
            System.out.println("Oooops!!!");
            System.out.println(ex.getMessage());
        }
        
        Clock clock = new Clock();
        
        try {
            clock.setMinutes(17);
            System.out.println(clock);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        try {
            clock.setSeconds(170);
            System.out.println(clock);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        System.out.println(clock);
    
    }
    
}
