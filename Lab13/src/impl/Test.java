/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impl;

import adt.Deque;
import static impl.MergeSort.merge;
import static impl.MergeSort.mergeSort;


public class Test {
    
    public static void main (String [] args) {
       
       Deque<Integer> d = new LinkedListDeque();
       
       // 1
       try {
           d.popFromBack();
       } catch (Exception ex) {
           System.out.println(ex.getMessage());
       }
       System.out.println(d);
       
       try {
           d.popFromFront();
       } catch (Exception ex) {
           System.out.println(ex.getMessage());
       }
       System.out.println(d);
       
       for (int i = 0; i < 5; i++) {
           d.pushToFront(i);
           System.out.println(d);
       }

       for (int i = 0; i < 5; i++) {
           try {
               d.popFromFront();
           } catch (Exception ex) {
               System.out.println(ex.getMessage());
           }
           System.out.println(d);
       }
       
       for (int i = 0; i < 6; i++) {
           d.pushToFront(i);
           System.out.println(d);
       }
       
       for (int i = 0; i < 6; i++) {
           try {
               d.popFromBack();
           } catch (Exception ex) {
               System.out.println(ex.getMessage());
           }
           System.out.println(d);
       }
       
       for (int i = 0; i < 7; i++) {
           d.pushToBack(i);
           System.out.println(d);
       }
       for (int i = 0; i < 7; i++) {
           try {
               d.popFromBack();
           } catch (Exception ex) {
               System.out.println(ex.getMessage());
           }
           System.out.println(d);
       }
       
       for (int i = 0; i < 8; i++) {
           d.pushToBack(i);
           System.out.println(d);
       }
       for (int i = 0; i < 8; i++) {
           try {
               d.popFromFront();
           } catch (Exception ex) {
               System.out.println(ex.getMessage());
           }
           System.out.println(d);
       }
       
       for (int i = 0; i < 10; i++) {
           d.pushToFront(i);
           d.pushToBack(i);
           System.out.println(d);
       }
       
       for (int i = 0; i < 8; i++) {
           try {
               d.popFromFront();
               d.popFromBack();
           } catch (Exception ex) {
               System.out.println(ex.getMessage());
           }
           System.out.println(d);
       }
       
       d.clear();
       System.out.println(d);
       
       d.pushToFront(13);
       d.pushToBack(17);
       System.out.println(d);
       
       //2
       Deque<Integer> d1 = new LinkedListDeque();
       Deque<Integer> d2 = new LinkedListDeque();
       
       for (int i = 0; i < 10; i += 3) {
           d2.pushToBack(i);
       }
       
       System.out.println(d2);
       
       for (int i = 100; i > 50; i -= 10) {
           d1.pushToFront(i);
       }
       System.out.println(d1);
       
       System.out.println(merge(d1, d2));

    }
}
