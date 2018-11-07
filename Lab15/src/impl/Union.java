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
public class Union {
    
    public static Set<String> union(Set<String> set1, Set<String> set2) {
        
        Set<String> s = new LLQueueSet();
        int size1 = set1.getSize();
        int size2 = set2.getSize();
        String str;
        
        for (int i = 0; i < size1; i++) {
        
            try {
                str = set1.removeAny();
                s.add(str);
                set1.add(str);
                
            } catch (Exception ex) {
                
                System.out.println(ex.getMessage());
            }
            
        }
        for (int i = 0; i < size2; i++) {
        
            try {
                str = set2.removeAny();
                s.add(str);
                set2.add(str);
                
            } catch (Exception ex) {
                
                System.out.println(ex.getMessage());
            }
            
        }
        return s;
    }
}
