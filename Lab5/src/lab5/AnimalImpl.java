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
public class AnimalImpl implements Animal{
    
    private int age;
    private int maxAge;
    private boolean isAlive;
    
    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void ageOneYear() {
        if (age <= maxAge) {
            age++;
        }
        else isAlive = false;
    }

    @Override
    public void sleep() {
        System.out.println("Sleeeep....");}

    @Override
    public String animalKind() {
        return "Animal";
    }

    @Override
    public boolean canEat(String food) {
        return false;
    }

    @Override
    public boolean isFast() {
        return false;
    }
   
}
