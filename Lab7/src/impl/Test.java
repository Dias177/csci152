/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impl;

import adt.IntStack;

/**
 *
 * @author dias
 */
public class Test {
    
    public static void main(String[] args) {
        
        IntStack st = new ArrayIntStack();
        
        try {
            st.pop();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        for (int i = 0; i < 12; i++) {
            st.push(i);
        }
        System.out.println(st);
        
        try {
            st.pop();
            st.pop();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(st);
        
        st.clear();
        System.out.println(st);
        
        for (int i = 0; i < 22; i++) {
            st.push(i);
        }
        System.out.println(st);
    }
}
