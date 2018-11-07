/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impl;

import adt.Deque;

/**
 *
 * @author dias
 */
public class MergeSort {
    
    public static Deque<Integer> merge(Deque<Integer> d1, Deque<Integer> d2) {
        
        int a, b;
        Deque<Integer> d = new LinkedListDeque();
        
        
        while (true) {
            try {
                a = d1.popFromFront();
                b = d2.popFromFront();
                
                if (a >= b) {
                    d.pushToBack(b);
                    d1.pushToFront(a);
                } else {
                    d.pushToBack(a);
                    d2.pushToFront(b);
                }
                
                if (d1.getSize() == 0 && d2.getSize() == 0) {
                    break;
                } else if (d1.getSize() == 0) {
                    while (d2.getSize() != 0) d.pushToBack(d2.popFromFront());
                    break;
                } else if (d2.getSize() == 0) {
                    while (d1.getSize() != 0) d.pushToBack(d1.popFromFront());
                    break;
                }
  
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
                break;
            }
            
        }
        return d;
    }
    
    public static Deque<Integer> mergeSort(Deque<Integer> deq) {
        
        Deque<Integer> d1 = new LinkedListDeque();
        Deque<Integer> d2 = new LinkedListDeque();
        
        if (deq.getSize() == 1) {
            return deq;
        }
        
        while (deq.getSize() != 0) {
            try {
                d1.pushToBack(deq.popFromFront());
                d2.pushToBack(deq.popFromFront());
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
                break;
            }
            
        }
        
        d1 = mergeSort(d1);
        d2 = mergeSort(d2);
        
        return merge(d1, d2);
        
    }
    
    
}
