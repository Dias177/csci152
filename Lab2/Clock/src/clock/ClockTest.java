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
    
    Clock clock = new Clock(3, 4, 5);
    
    System.out.println(clock.getHours());
    System.out.println(clock);
    
    clock.setHours(13);
    clock.setMinutes(11);
    clock.setHours(317);
    
    System.out.println(clock);
    
    clock.tick();
    clock.tick();
    
    System.out.println(clock);
    
    clock.setSeconds(59);
    clock.tick();
    
    System.out.println(clock);
    
    clock.resetToMidnight();
    
    System.out.println(clock);
    
    clock.setHours(21);
    clock.setMinutes(59);
    clock.setSeconds(59);
    clock.tick();
    
    System.out.println(clock);
    
    }
}
