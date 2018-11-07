/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6.impl;

import lab6.adt.IntQueue;

/**
 *
 * @author dias
 */
public class Test1 {
    public static void main(String[] args) {
        
        IntQueue queue = new ArrayIntQueue(); 
        
        try { 
            System.out.println(queue.dequeue()); 
        } catch (Exception ex) { 
            System.out.println(ex.getMessage()); 
        } 
        
        for (int i = 0; i < 8; i++) { 
            queue.enqueue(i); 
        } 
        System.out.println(queue);
        System.out.println(queue.getSize()); 
        
        for (int i = 0; i < 4; i++) { 
            try { 
                System.out.println(queue.dequeue()); 
            } catch (Exception e) { 
                System.out.println(e); 
            } 
} 
    }
}
