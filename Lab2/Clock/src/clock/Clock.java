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
public class Clock {

    // Fields
    private int hours;
    private int minutes;
    private int seconds;
 
    // Constructor
    public Clock(int h, int m, int s) {
        if (h >= 0 && h < 24 && m >= 0 && m < 60 && s >= 0 && s < 60) {
            hours = h; minutes = m; seconds = s;
        }
        else {
            hours = 0; minutes = 0; seconds = 0;
        }
    }
 
    // Reset method
    public void resetToMidnight() {
        hours = 0; minutes = 0; seconds = 0;
    }
 
    // Check if morning method
    public boolean isMorning() {
        return hours > 12;
    }
 
    // Advance one second method
    public void tick() {
        seconds++;
        if (seconds >= 60) {
            seconds = 0;
            minutes += 1;
        }
        if (minutes >= 60) {
            minutes = 0;
            hours += 1;
        }
        if (hours >=24) {
            hours = 0;
        }
    }
    
    // A
    public int getHours() {
    
        return hours;
    }
    
    public int getMinutes() {
    
        return minutes;
    }
    
    public int getSeconds() {
    
        return seconds;
    }
    
    public void setHours(int h) {
    
        if (h >= 0 && h < 24) hours = h;
    }
    
    public void setMinutes(int m) {
    
       if (m >= 0 && m < 60) minutes = m;
    }
    
    public void setSeconds(int s) {
    
       if (s >= 0 && s < 60) seconds = s;
    }
    
    // C
    public String toString() {
    
        return hours + ":" + minutes + ":" + seconds;
    }
    
}
