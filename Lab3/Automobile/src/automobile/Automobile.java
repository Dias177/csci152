/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automobile;

/**
 *
 * @author dias
 */
public class Automobile {

    private boolean engineRunning;
    private double speed;
    private String model;
    
    /**
     * Constructor. It creates an object and sets initial
     * values of the fields (engineRunning and speed by default
     * , and model as a parameter)
     * 
     * @param mod is a string representing the model of a car
     */
    public Automobile(String mod) {
        
        engineRunning = false;
        speed = 0.0;
        model = mod;
    }
    
    /**
     * startCar(). This method turns the engine of a car
     * by making the value of engineRunning true
     * 
     */
    public void startCar() {
        
        engineRunning = true;
    }
    
    /**
     * pressGasPedal(). This method increases the speed 
     * of a car by 10.0 units if the engine is turned,
     * that is, engineRunning has the value of true. If
     * it is not, the value of speed remains unchanged.
     * 
     */
    public void pressGasPedal() {
        
        if (engineRunning) {
        speed += 10;
        }
    }
    
    /**
     * pressBrake(). This method makes the value of speed
     * 0.0.
     */
    public void pressBrake() {
    
        speed = 0;
    }
    
    /**
     * shutdown(). This method shutdowns the engine of a car
     * by making the value of engineRunning false.
     */
    public void shutdown() {
    
        engineRunning = false;
    }
    
    /**
     * getter. It returns the value of engineRunning, that is,
     * whether engine is turned or not.
     * 
     * @return engineRunning which is either true or false.
     */
    public boolean isEngineRunning() {
    
        return engineRunning;
    }
    
    /**
     * getter. It returns the value of speed, that is,
     * what the current speed of a car is.
     * 
     * @return speed which is the current speed of a car.
     */
    public double getSpeed() {
    
        return speed;
    }
    
    /**
     * getter. It returns the value of model, that is,
     * what the model of a car is.
     * 
     * @return model which is a string representing the 
     * model of a car
     */
    public String getModel() {
    
        return model;
    }
    
    /**
     * calculateDistance(). This method calculated the distance
     * covered by a car and takes time as a parameter, which
     * obviously is equal or greater than zero. If it is not,
     * an exception will be thrown.
     * 
     * @param time which must be >= 0.
     * @return time * speed which is the distance.
     * @throws Exception if time is negative.
     */
    public double calculateDistance(double time) throws Exception {
        if (time < 0) {
            throw new Exception("The value of time has to be positive");
        }
        return time * speed;
    }
    
    /**
     * toString(). This method is a string representation of the object.
     * Namely, it returns the values of engineRunning, speed and model.
     * 
     * @return the string which gives us the information regarding a car.
     */
    public String toString() {
    
        return "Engine Running: " + engineRunning + ". Speed: " + speed
                + ". Model: " + model;
    }
    
}
