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
public class Test {
    
    public static void main(String[] args) {
        AnimalImpl cow = new Cow();
        AnimalImpl tiger = new Tiger();
        AnimalImpl rabbit = new Rabbit();
        
        System.out.println(cow.canEat("Carrot"));
        System.out.println(tiger.canEat("Meat"));
        System.out.println(rabbit.canEat("Carrot"));
        
        for (int i = 0; i < 17; ++i) {rabbit.ageOneYear();}
        
        cow.ageOneYear();
        cow.ageOneYear();
        
        tiger.ageOneYear();
        
        System.out.println(cow);
        System.out.println(tiger);
        System.out.println(rabbit);
    }
    
}
