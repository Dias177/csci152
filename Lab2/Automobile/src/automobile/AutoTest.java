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
public class AutoTest {
    
    public static void main(String[] args) {
    
        Automobile car1 = new Automobile("Tesla");
        Automobile car2 = new Automobile("Toyota");
        
        car1.startCar();
        car2.startCar();
        
        car1.pressGasPedal();
        car1.pressGasPedal();
        car2.pressGasPedal();
        
        System.out.println(car1);
        System.out.println("Distance covered by the car1: " + car1.calculateDistance(17));
        System.out.println(car2);
        
        car1.shutdown();
        car2.pressBrake();
        car2.shutdown();
        
        System.out.println(car1);
        System.out.println(car2);
        
        System.out.println(car1.getModel());
    }
    
}
