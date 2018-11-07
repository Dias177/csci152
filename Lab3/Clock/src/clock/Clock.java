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
    
    private int hours;
    private int minutes;
    private int seconds;
    
    public Clock() {
        hours = 0;
        minutes = 0;
        seconds = 0;
    }
    
    
    /**
     * Constructor. It creates an object and sets initial values of its fields
     * which include hours, minutes and seconds. If any of them is not a valid
     * input, it will remain unchanged, and an exception will be thrown.
     * 
     * @param hours (required). The value of hours. Must be any int from 0 to 23 inclusive.
     * @param minutes (required). The value of minutes. Must be any int from 0 to 59 inclusive.
     * @param seconds (required). The value of seconds. Must be any int from 0 to 59 inclusive.
     * @throws Exception if any parameter is not in range.
     */
    public Clock(int hours, int minutes, int seconds) throws Exception {
        if (hours < 0 || hours > 23 || minutes < 0 || minutes > 59
                || seconds < 0 || seconds > 59) {
            throw new Exception("Parameter(s) is(are) not in range.");
        }

        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    /**
     * getter. It returns the value of hours.
     * 
     * @return the hours
     */
    public int getHours() {
        return hours;
    }

    /**
     * setter. It sets the value of hours which must be
     * in the valid range, int [0,23]. If it is not in 
     * this range, it will remain unchanged, and an 
     * exception will be thrown.
     * 
     * @param hours the hours to set. Any int from 0 to 23 inclusive.
     * @throws Exception if hours is not in range.
     */
    public void setHours(int hours) throws Exception {
        if (hours < 0 || hours > 23) {
            throw new Exception("hours is not in range.");
        }
        this.hours = hours;
    }

    /**
     * getter. It returns the value of minutes.
     * 
     * @return the minutes
     */
    public int getMinutes() {
        return minutes;
    }

    /**
     * setter. It sets the value of minutes, which must be
     * in the valid range, int [0,59]. If it is not in this
     * range, it will remain unchanged, and an exception 
     * will be thrown.
     * 
     * @param minutes the minutes to set. Any int from 0 to 59 inclusive.
     * @throws Exception if minutes is not in range.
     */
    public void setMinutes(int minutes) throws Exception {
        if (minutes < 0 || minutes > 59) {
            throw new Exception("minutes is not in range.");
        }
        this.minutes = minutes;
    }

    /**
     * getter. It returns the value of seconds.
     * 
     * @return the seconds
     */
    public int getSeconds() {
        return seconds;
    }

    /**
     * setter. It sets the value of seconds, which must be
     * in the valid range, int [0, 59]. If it is not in this
     * range, it will remain unchanged, and an exception will 
     * be thrown.
     * 
     * @param seconds the seconds to set. Any int from 0 to 59 inclusive.
     * @throws Exception if seconds is not in range.
     */
    public void setSeconds(int seconds) throws Exception{
        if (seconds < 0 || seconds > 59) {
            throw new Exception("seconds is not in range");
        }
        this.seconds = seconds;
    }
    
    /**
     * toString(). This method is a string representation of
     * the object, which returns the string.
     * 
     * @return the string in the following format: hours:minutes:seconds.
     */
    public String toString(){
        return hours + ":" + minutes + ":" + seconds;
    }
    
}
