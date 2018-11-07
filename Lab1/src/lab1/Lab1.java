/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author dias
 */
public class Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // A
        int l = 1, w = 2, h = 3, vol = l * w * h, sa = 2 * (l * w + w * h + h * l);
        
        System.out.println("The volume is " + vol + ". The surface area is " + sa + ".");
        
        // B
        double pi = 3.1415, r = 1, circ = 2 * pi * r, area = pi * r * r;
        
        System.out.println("The circumference is " + circ + ". The area is " + area + ".");
        
        // C
        System.out.println("X   X   X    X   XXXXX ");
        System.out.println(" X X      X X       X  ");
        System.out.println("  X        X       X   ");
        System.out.println(" X X      X       X    ");
        System.out.println("X   X    X       XXXXX ");
    
    }
    
}
