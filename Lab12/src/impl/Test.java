/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impl;

import adt.SortedQueue;

/**
 *
 * @author dias
 */
public class Test {
    
    public static void main(String[] args) {
        
        // 1
        SortedQueue<Integer> q = new LinkedListSortedQueue();
        
        for (int i = 90; i >= 10; i -= 10) {
            q.insert(i);
        }
        
        System.out.println(q);
        
        try {
            q.dequeue();
            q.dequeue();
            q.dequeue();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        for (int i = 100; i <= 900; i += 100) {
            q.insert(i);
        }
        System.out.println(q);
        
        try {
            q.dequeue();
            q.dequeue();
            q.dequeue();
            q.dequeue();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(q);
        
        for (int i = 5; i <= 915; i += 10) {
            q.insert(i);
        }
        
        System.out.println(q);
        
        int size = q.getSize();
        
        for (int i = 0; i < size; i++) {
            try {
                q.dequeue();
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        
        System.out.println(q);
        
        q.insert(13);
        q.insert(17);
        q.insert(11);
        
        System.out.println(q);
        
        q.clear();
        System.out.println(q);
        
        q.insert(13);
        q.insert(17);
        q.insert(11);
        q.insert(117);
        System.out.println(q);
        
        // 2
        
        Student s3 = new Student(13, "Dias");
        Student s1 = new Student(6, "Ben");
        Student s2 = new Student(9, "Aigerim");
        
        SortedQueue sq = new LinkedListSortedQueue();
        
        sq.insert(s1);
        sq.insert(s2);
        sq.insert(s3);
        
        System.out.println(sq);
        
        try {
            sq.dequeue();
            sq.dequeue(); 
            sq.dequeue();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(sq);
    }
}
