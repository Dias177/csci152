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
public class Cow extends AnimalImpl {
    
    public String animalKind() {
        return "Cow";
    }

    public boolean canEat(String food) {
        if (food.equals("Grass")) {
            return true;
        }
        return false;
    }

    public boolean isFast() {
        return false;
    }
    
    public String toString() {
        return "A cow who is " + getAge() + " years old";
    }
    
}
