/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impl;

/**
 *
 * @author dias
 */
public class Test {
    public static void main(String[] args) {
//        BSTMap<Integer, String> obj = new BSTMap();
//        try {
//            obj.removeAny();
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage());
//        }
//        System.out.println(obj);
//        
//        obj.define(4, "a");
//        obj.define(7, "b");
//        obj.define(9, "c");
//        obj.define(0, "d");
//        obj.define(1, "e");
//        System.out.println(obj);
//        
//        obj.remove(4);
//        System.out.println(obj);
//        
//        obj.remove(6);
//        System.out.println(obj);
//        
//        obj.define(2, "B");
//        obj.define(3, "C");
//        System.out.println(obj);
//        
//        obj.define(7, "f");
//        obj.define(8, "g");
//        obj.define(9, "h");
//        System.out.println(obj);
//        
//        try {
//            System.out.println(obj.removeAny());
//            System.out.println(obj.removeAny());
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage());
//        }
//        System.out.println(obj);
//        
//        obj.clear();
//        System.out.println(obj);
//        
//        obj.define(13, "Dias");
//        obj.define(23, "Aiym");
//        System.out.println(obj);
        
        LLQHashTableMap<Integer, String> obj = new LLQHashTableMap(5);
        try {
            obj.removeAny();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(obj);
        
        obj.define(1, "a");
        obj.define(2, "b");
        obj.define(3, "c");
        obj.define(4, "d");
        obj.define(5, "e");
        System.out.println(obj);
        
        obj.remove(4);
        System.out.println(obj);
        
        obj.remove(6);
        System.out.println(obj);
        
        obj.define(2, "B");
        obj.define(3, "C");
        System.out.println(obj);
        
        obj.define(7, "f");
        obj.define(8, "g");
        obj.define(9, "h");
        System.out.println(obj);
        
        try {
            System.out.println(obj.removeAny());
            System.out.println(obj.removeAny());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(obj);
        
        obj.clear();
        System.out.println(obj);
        
        obj.define(13, "Dias");
        obj.define(23, "Aiym");
        System.out.println(obj);
    }
}
