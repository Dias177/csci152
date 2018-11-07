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
public class IsSubset {
    
    public static boolean isSubset(Set<Integer> set1, Set<Integer> set2) {
        
        int size = set1.getSize();
        
        for (int i = 0; i < size; i++) {
            
            try {
                
                int x = set1.removeAny();
                set1.add(x);
                
                if (!set2.contains(x)) {
                
                    return false;
                }  
            } catch (Exception ex) {
                
                System.out.println(ex.getMessage());
            }
        }
        return true;
    }
}
