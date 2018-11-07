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
public class Intersection {
    
    public static Set<Integer> intersection(Set<Integer> set1, Set<Integer> set2) {
        
        Set<Integer> s = new LLQueueSet();
        int size = set1.getSize(), x;
        
        
        for (int i = 0; i < size; i++) {
            
            try {
                
                x = set1.removeAny();
                set1.add(x);
                
                if (set2.contains(x)) {
                    
                    s.add(x);
                }
            } catch (Exception ex) {
                
                System.out.println(ex.getMessage());
            }
        }
        return s;
    }
}
