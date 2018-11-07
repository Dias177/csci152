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
        
        BSTSet<Integer> s = new BSTSet();
        
        // 1
        
        s.add(5);
        s.add(12);
        s.add(3);
        s.add(6);
        s.add(14);
        s.add(2);
        s.add(-6);
        s.add(8);
        s.add(0);
        System.out.println(s);
        
        s.add(14);
        s.add(-6);
        s.add(5);
        System.out.println(s);
        
        System.out.println(s.contains(12));
        System.out.println(s.contains(7));
        System.out.println(s.contains(2));
        System.out.println(s.contains(-8));
        System.out.println(s.contains(5));
        System.out.println(s);
        
//        s.remove(0);
//        s.remove(6);
//        s.remove(3);
//        System.out.println(s);
        
        s.add(6);
        s.add(13);
        s.add(99);
        s.add(11);
        System.out.println(s);
        
//        s.remove(12);
//        System.out.println(s);
//        
//        s.remove(5);
//        System.out.println(s);
//        
//        try {
//            s.removeAny();
//            s.removeAny();
//            s.removeAny();
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage());
//        }
//        System.out.println(s);
        
        s.clear();
        System.out.println(s);
        
        s.add(55);
        s.add(24);
        s.add(78);
        s.add(51);
        System.out.println(s);
        
        // 2
        Set<Student> ss = new BSTSet();
        
        Student s1 = new Student(13, "Dias");
        Student s2 = new Student(6, "Aigerim");
        Student s3 = new Student(9, "Ben");
        Student s4 = new Student(17, "Kon");
        Student s5 = new Student(13, "Eboy");
        Student s6 = new Student(23, "Aiym");
        Student s7 = new Student(6, "Aigerim");
        Student s8 = new Student(9, "Ben");
        Student s9 = new Student(24, "Aliy");
        Student s10 = new Student(25, "Talgat");
        Student s11 = new Student(77, "Putin");
        Student s12 = new Student(1, "Elbasy");
        
        ss.add(s1);
        ss.add(s2);
        ss.add(s3);
        ss.add(s4);
        ss.add(s5);
        System.out.println(ss);
        
        ss.add(s7);
        ss.add(s8);
        System.out.println(ss);
        
        ss.add(s9);
        ss.add(s10);
        ss.add(s6);
        System.out.println(ss);
        
        ss.clear();
        System.out.println(ss);
       
        ss.add(s11);
        ss.add(s12);
        System.out.println(ss);
        
        // 17 1
        
    }
}
