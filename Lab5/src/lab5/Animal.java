/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

/**
 *
 * @author dias
 */
public interface Animal {
    
    /**
     * Returns the kind of the animal
     * 
     * @return the kind of the animal
     */
    public String animalKind();
    
    /**
     * Returns the current age of the animal
     * 
     * @return the age of the animal
     */
    public int getAge();
    
    /**
     * Returns true iff the animal can eat
     * the given kind of food
     * 
     * @param food the name of food
     * @return  whether or not the animal can
     * eat the given food
     */
    public boolean canEat(String food);
    
    /**
     * Increments the animal's age by one year
     */
    public void ageOneYear();
    
    /**
     * Returns true iff the animal is fast
     * 
     * @return whether or not the animal is fast
     */
    public boolean isFast();
    
    /**
     * Displays a message indicating that the animal
     * is sleeping
     */
    public void sleep();
    
    
}
