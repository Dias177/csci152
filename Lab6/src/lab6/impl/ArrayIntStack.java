/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6.impl;

import java.util.Arrays;
import lab6.adt.IntStack;

/**
 *
 * @author dias
 */
public class ArrayIntStack implements IntStack {
    
    private int[] values;
    private int size;
    private int x;
    
    public ArrayIntStack() {
        values = new int[10];
        size = 0;
        x = 10;
        
    }

    @Override
    public void push(int value) {
        if (size == values.length) values = Arrays.copyOf(values, size * 2);
        values[size] = value;
        size++;
    }

    @Override
    public int pop() throws Exception {
        if (size < 1) {
            throw new Exception("There are no items on the stack!");
        }
        int result = values[size-1];
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
        String s = "";
        
        for (int i = 0; i < size; i++) s += values[i] + " ";
        return s;
    }
    
}
