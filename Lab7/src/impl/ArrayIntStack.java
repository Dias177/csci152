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
public class ArrayIntStack implements IntStack {
    
    private int[] values;
    private int size;
    
    public ArrayIntStack() {
        values = new int[10];
        size = 0;
    }

    @Override
    public void push(int value) {
        
        if (size == values.length) {
            int[] a = new int[size * 2];
            for (int i = 0; i < size; i++) {
                a[i] = values[i];
            }
            values = a;
        }
        values[size] = value;
        size++;
    }

    @Override
    public int pop() throws Exception {
        if (size == 0) {
            throw new Exception("A stack is empty!");
        }
        
        int result = values[size - 1];
        size--;
        return result;
    }


    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void clear() {
        values = new int[10];
        size = 0;
    }
    
    public String toString() {
        String s = " ";
        
            for (int i = 0; i < size; i++) {
                s += values[i];
                s += " ";
            }

            return "Stack: bottom[" + s + "]top and its size: " + size;
     
    }
    
}
