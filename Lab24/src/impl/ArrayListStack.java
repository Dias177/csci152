/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impl;

import adt.Stack;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dias
 */
public class ArrayListStack<T> implements Stack<T> {
    
    private ArrayList<T> values;
    
    public ArrayListStack() {
        values = new ArrayList();
    }
    
    @Override
    public void push(T value) {
        values.ensureCapacity(values.size());
        values.add(value);
    }

    @Override
    public T pop() throws Exception {
        if (values.size() == 0) throw new Exception("A stack is empty!");
        return values.remove(values.size() - 1);
    }

    @Override
    public int getSize() {
        return values.size();
    }

    @Override
    public void clear() {
        values.clear();
    }
    
    public String toString() {
        String s = "";
        for (int i = 0; i < values.size(); i++) {
            s += values.get(i) + " ";
        }
        return "Stack: bottom[ " + s + "]top and its size is " + values.size();
    }
    
}
