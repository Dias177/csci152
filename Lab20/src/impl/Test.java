/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impl;

import adt.HashTableSet;
import adt.Set;
import java.util.Random;

/**
 *
 * @author dias
 */
public class Test {
    
    public static void main(String[] args) {

     Random rand = new Random();
     
//     HashTableSet<Integer> set = new LLQHashTableSet(5000);
//
//     System.out.println("Starting timing tests...");
//     long time1, time2, duration;
//     time1 = System.currentTimeMillis();
//     
//     for (int i = 0; i < 50000; i++) {
//          set.add(rand.nextInt());
//     }
//   
//     time2 = System.currentTimeMillis();
//     duration = time2 - time1;
//
//     System.out.println("Time taken in ms: " + duration);
//     
//     System.out.println(set.getLoadFactor());
//     System.out.println(set.getBucketSizeStandardDev());
     
     HashTableSet<Integer> set = new BSTHashTableSet(5000);

     System.out.println("Starting timing tests...");
     long time1, time2, duration;
     time1 = System.currentTimeMillis();
     
     for (int i = 0; i < 50000; i++) {
          set.add(rand.nextInt());
     }
   
     time2 = System.currentTimeMillis();
     duration = time2 - time1;

     System.out.println("Time taken in ms: " + duration);
     
     System.out.println(set.getLoadFactor());
     System.out.println(set.getBucketSizeStandardDev());
}
    
    
    
}
