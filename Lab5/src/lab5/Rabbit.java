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
public class Rabbit extends AnimalImpl{
    
    public String animalKind() {
        return "Rabbit";
    }
    
    public boolean canEat(String food) {
        if (food.equals("Carrot")) return true;
        return false;
    }
    
    public boolean isFast() {
        return true;
    }
    
    public String toString() {
        return "A rabbit who is " + getAge() + " years old";
    }
    
}
