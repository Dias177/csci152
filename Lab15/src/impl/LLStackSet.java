/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impl;

import adt.Set;
import adt.Stack;

/**
 *
 * @author dias
 */
public class LLStackSet<T> implements Set<T> {
    
    private LinkedListStack<T> st;
    
    public LLStackSet() {
        st = new LinkedListStack();
    }

    @Override
    public void add(T value) {
        
        if (!contains(value)) {
            st.push(value);
        }
    }

    @Override
    public boolean contains(T value) {
        
        int size = st.getSize();
        Stack<T> s = new LinkedListStack();
        
        for (int i = 0; i < size; i++) {
            try {
                
                T x = st.pop();
                s.push(x);
                
                if (x.equals(value)) {
                    
                    int si = s.getSize();
                    
                    for (int j = 0; j < si; j++) {
                        
                        st.push(s.pop());
                    }
                    return true;
                    
                } else if (st.getSize() == 0) {
                    
                    int s1 = s.getSize();
                    
                    for (int j = 0; j < s1; j++) {
                    
                        st.push(s.pop());
                    }
                }
                    
                } catch (Exception ex) {
                    
                    System.out.println(ex.getMessage());
            }
        }
        return false;
    }

    @Override
    public boolean remove(T value) {
        
        if (!contains(value)) {
            
            return false;
        
        } else {
            
            Stack<T> s = new LinkedListStack();
            T x = null;
            
            try {
                
                x = st.pop();
                
            } catch (Exception ex) {
                
                System.out.println(ex.getMessage());
            }
            
            while(!value.equals(x)) {
            
                s.push(x);
                
                try {
                    
                    x = st.pop();
                    
                } catch (Exception ex) {
                    
                    System.out.println(ex.getMessage());
                }
            }
            
            int size = s.getSize();
            
            for (int i = 0; i < size; i++) {
            
                try {
                    
                    st.push(s.pop());
                    
                } catch (Exception ex) {
                    
                    System.out.println(ex.getMessage());
                }
            }
            return true;
                    
        }    
    }

    @Override
    public T removeAny() throws Exception {
        
        if (st.getSize() == 0) {
            
            throw new Exception("The stack is empty!");
        }
        
        T x = st.pop();
        
        return x;
    }

    @Override
    public int getSize() {
        return st.getSize();
    }

    @Override
    public void clear() {
        st.clear();
    }
    
    public String toString() {
        return st.toString();
    }
    
}
