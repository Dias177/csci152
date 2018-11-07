/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impl;

import adt.Set;
import static impl.Intersection.intersection;
import static impl.IsSubset.isSubset;
import static impl.Union.union;

/**
 *
 * @author dias
 */
public class Test {
    
    public static void main(String[] args) {
        
        // 1
        Set<Student> s = new LLQueueSet();
        
        try {
            s.removeAny();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(s);
        
        Student s1 = new Student(13, "Dias");
        Student s2 = new Student(6, "Ben");
        Student s3 = new Student(9, "Aigerim");
        Student s4 = new Student(17, "Kon");
        Student s5 = new Student(23, "Aiym");
        
        s.add(s1);
        s.add(s2);
        s.add(s3);
        s.add(s4);
        s.add(s5);
        System.out.println(s);
        
        Student s0 = new Student(17, "Kon");
        s.remove(s0);
        System.out.println(s);
        
        Student s6 = new Student(001, "Azazaza");
        s.remove(s6);
        System.out.println(s);
        
        Student s7 = new Student(23, "Aiym");
        Student s8 = new Student(13, "Dias");
        s.add(s7);
        s.add(s8);
        System.out.println(s);
        
        Student s9 = new Student(24, "Aliy");
        Student s10 = new Student(25, "Talgat");
        s.add(s9);
        s.add(s10);
        s.add(s4);
        System.out.println(s);
        
        try {
            System.out.println(s.removeAny());
            System.out.println(s.removeAny());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(s);
        
        s.clear();
        System.out.println(s);
        
        Student s11 = new Student(6, "Bakhytzhan");
        Student s12 = new Student(7, "Adiy");
        s.add(s11);
        s.add(s12);
        System.out.println(s);
        
        //2
        Set<Student> set = new LLStackSet();
        
        try {
            
            set.removeAny();
            
        } catch (Exception ex) {
            
            System.out.println(ex.getMessage());
        }
        System.out.println(set);
        
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        set.add(s5);
        System.out.println(set);
        
        set.remove(s0);
        System.out.println(set);
        
        set.remove(s6);
        System.out.println(set);
        
        set.add(s7);
        set.add(s8);
        System.out.println(set);
        
        set.add(s9);
        set.add(s10);
        set.add(s4);
        System.out.println(set);
        
        try {
            
            System.out.println(set.removeAny());
            System.out.println(set.removeAny());
            
        } catch (Exception ex) {
            
            System.out.println(ex.getMessage());
        }
        System.out.println(set);
        
        set.clear();
        System.out.println(set);
        
        set.add(s11);
        set.add(s12);
        System.out.println(set);
        
        //3
        Set<Integer> set1 = new LLStackSet();
        Set<Integer> set2 = new LLStackSet();
        
        for (int i = 0; i < 5; i++) {
            
            set1.add(i);
        }
        for (int i = 0; i < 10; i++) {
            
            set2.add(i);
        }

        System.out.println(set1);
        System.out.println(set2);
        System.out.println(isSubset(set1, set2));
        System.out.println(set1);
        System.out.println(set2);
        System.out.println(isSubset(set2, set1));
        System.out.println(set1);
        System.out.println(set2);
        
        // 4
        Set<String> set3 = new LLQueueSet();
        Set<String> set4 = new LLQueueSet();
        
        set3.add("Ben");
        set3.add("Tyler");
        set4.add("Aigerim");
        set4.add("Yessenbayeva");
        
        System.out.println(set3);
        System.out.println(set4);
        System.out.println(union(set3, set4));
        System.out.println(set3);
        System.out.println(set4);
        
        // 5
        Set<Integer> set5 = new LLQueueSet();
        Set<Integer> set6 = new LLQueueSet();
        Set<Integer> set7 = new LLQueueSet();
        
        for (int i = 3; i < 7; i++) {
            set5.add(i);
        }
        for (int i = 0; i < 10; i++) {
            set6.add(i);
        }
        for (int i = 17; i < 27; i++) {
            set7.add(i);
        }
        System.out.println(set5);
        System.out.println(set6);
        System.out.println(intersection(set5, set6));
        System.out.println(set5);
        System.out.println(set6);
        
        System.out.println(set7);
        System.out.println(set6);
        System.out.println(intersection(set7, set6));
        System.out.println(set7);
        System.out.println(set6);
    }
}
