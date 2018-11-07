/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impl;

import adt.Stack;
import java.util.Arrays;


/**
 *
 * @author dias
 */
public class ArrayStack<T> implements Stack<T> {
    
    private T[] values;
    private int size;
    
    public ArrayStack() {
        values = (T[]) new Object[10];
        size = 0;
    }
    
    @Override
    public void push(T value) {
        if (size == values.length) {
            values = Arrays.copyOf(values, size + 10);
        }
        values[size] = value;
        size++;
    }

    @Override
    public T pop() throws Exception {
        if (size == 0) {
            throw new Exception("A stack is empty!");
        }
        T x = values[size - 1];
        values = Arrays.copyOf(values, size - 1);
        size--;
        return x;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void clear() {
       values = (T[]) new Object[10];
       size = 0;
    }
    
    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < size; i++) {
            s += values[i] + " ";
        }
        return "Stack: bottom[ " + s + "]top and its size is " + size;
    }
}
