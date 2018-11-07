/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impl;

import adt.Set;

/**
 *
 * @author dias
 */
public class Test {
    public static void main(String[] args) {
//        Set<Integer> set = new LLQHashTableSet(1);
//        
//        try {
//            set.removeAny();
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage());
//        }
//        
//        for (int i = 1; i < 21; i++) set.add(i);
//        System.out.println(set);
//        
//        for (int i = 2; i < 21; i+=2) set.remove(i);
//        System.out.println(set);
//        
//        System.out.println(set.remove(10));
//        System.out.println(set.remove(100));
//        
//        System.out.println(set);
//        
//        for (int i = 1; i < 31; i++) set.add(i);
//        System.out.println(set);
//        
//        try {
//            for (int i = 0; i < 10; i++) {
//                set.removeAny();
//            }
//        } catch (Exception ex) {System.out.println("asdasd");}
//        
//        System.out.println(set);
//        
//        set.clear();
//        System.out.println(set);
//        
//        for (int i = 51; i < 80; i += 2) set.add(i);
//        System.out.println(set);
     
     Set<Integer> set = new LLQHashTableSet(5000);

     System.out.println("Starting timing tests...");
     long time1, time2, duration;
     time1 = System.currentTimeMillis();
     
     for (int i = 0; i < 500000; i++) {
          set.add(i);
     }
   
     time2 = System.currentTimeMillis();
     duration = time2 - time1;

     System.out.println("Time taken in ms: " + duration);
}
    
    
    
}
