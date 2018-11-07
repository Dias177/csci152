/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impl;

import adt.Stack;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author dias
 */
public class Test {
    public static void main(String[] args) {
        // 1
        
//        Stack<Integer> stack = new ArrayListStack();
//        try {
//            stack.pop();
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage());
//        }
//        
//        for (int i = 0; i < 12; i++) stack.push(i);
//        System.out.println(stack);
//        
//        try {
//            stack.pop();
//            stack.pop();
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage());
//        }
//        System.out.println(stack);
//        
//        stack.clear();
//        System.out.println(stack);
//        
//        for (int i = 0; i < 22; i++) {
//            stack.push(i);
//        }
//        System.out.println(stack);

// 2
        
//        HashSet<Integer> s = new HashSet();
//        
//        s.add(5);
//        s.add(12);
//        s.add(3);
//        s.add(6);
//        s.add(14);
//        s.add(2);
//        s.add(-6);
//        s.add(8);
//        s.add(0);
//        System.out.println(s);
//        
//        s.add(14);
//        s.add(-6);
//        s.add(5);
//        System.out.println(s);
//        
//        System.out.println(s.contains(12));
//        System.out.println(s.contains(7));
//        System.out.println(s.contains(2));
//        System.out.println(s.contains(-8));
//        System.out.println(s.contains(5));
//        System.out.println(s);
//        
////        s.remove(0);
////        s.remove(6);
////        s.remove(3);
////        System.out.println(s);
//        
//        s.add(6);
//        s.add(13);
//        s.add(99);
//        s.add(11);
//        System.out.println(s);
//        
//        s.remove(12);
//        System.out.println(s);
//        
//        s.remove(5);
//        System.out.println(s);
//        
//        try {
//            for (int j = 0; j < 3; j++) {
//            for (int i = -10000; i <= 10000; i++) {
//                if (s.contains(i)) {
//                    s.remove(i);
//                    break;
//                }
//            }}
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage());
//        }
//        System.out.println(s);
//        
//        s.clear();
//        System.out.println(s);
//        
//        s.add(55);
//        s.add(24);
//        s.add(78);
//        s.add(51);
//        System.out.println(s);
        
       
//        Set<Student> ss = new HashSet();
//        
//        Student s1 = new Student(13, "Dias");
//        Student s2 = new Student(6, "Aigerim");
//        Student s3 = new Student(9, "Ben");
//        Student s4 = new Student(17, "Kon");
//        Student s5 = new Student(13, "Eboy");
//        Student s6 = new Student(23, "Aiym");
//        Student s7 = new Student(6, "Aigerim");
//        Student s8 = new Student(9, "Ben");
//        Student s9 = new Student(24, "Aliy");
//        Student s10 = new Student(25, "Talgat");
//        Student s11 = new Student(77, "Putin");
//        Student s12 = new Student(1, "Elbasy");
//        
//        ss.add(s1);
//        ss.add(s2);
//        ss.add(s3);
//        ss.add(s4);
//        ss.add(s5);
//        System.out.println(ss);
//        
//        ss.add(s7);
//        ss.add(s8);
//        System.out.println(ss);
//        
//        ss.add(s9);
//        ss.add(s10);
//        ss.add(s6);
//        System.out.println(ss);
//        
//        ss.clear();
//        System.out.println(ss);
//       
//        ss.add(s11);
//        ss.add(s12);
//        System.out.println(ss);
        
        Map<Integer, String> obj = new TreeMap();
        
        obj.put(1, "a");
        obj.put(2, "b");
        obj.put(3, "c");
        obj.put(4, "d");
        obj.put(5, "e");
        System.out.println(obj);
        
        obj.remove(4);
        System.out.println(obj);
        
        obj.remove(6);
        System.out.println(obj);
        
        obj.put(2, "B");
        obj.put(3, "C");
        System.out.println(obj);
        
        obj.put(7, "f");
        obj.put(8, "g");
        obj.put(9, "h");
        System.out.println(obj);
        
        obj.clear();
        System.out.println(obj);
        
        obj.put(13, "Dias");
        obj.put(23, "Aiym");
        System.out.println(obj);

    }
}
