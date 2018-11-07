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
    
    public Automobile(String mod) {
        
        engineRunning = false;
        speed = 0.0;
        model = mod;
    }
    
    public void startCar() {
        
        engineRunning = true;
    }
    
    public void pressGasPedal() {
        
        if (engineRunning) {
        speed += 10;
        }
    }
    
    public void pressBrake() {
    
        speed = 0;
    }
    
    public void shutdown() {
    
        engineRunning = false;
    }
    
    public boolean isEngineRunning() {
    
        return engineRunning;
    }
    
    public double getSpeed() {
    
        return speed;
    }
    
    public String getModel() {
    
        return model;
    }
    
    public double calculateDistance(double time) {
    
        return time * speed;
    }
    
    public String toString() {
    
        return "Engine Running: " + engineRunning + ". Speed: " + speed
                + ". Model: " + model;
    }
}
