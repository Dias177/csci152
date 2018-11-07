/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6.impl;

import java.util.Arrays;
import lab6.adt.IntQueue;

/**
 *
 * @author dias
 */
public class ArrayIntQueue implements IntQueue {
    
    private int[] values;
    private int size;
    private int front;
    private int back;
    
    public ArrayIntQueue() {
        values = new int[5];
        size = 0;
        front = 0;
        back = 0;
    }
    
    @Override
    public void enqueue(int value) {
        if (size == 0) {
            values[size] = value;
            size++;
        }
        else if (size == values.length) {
            int[] arr = new int[values.length * 2];
            int f = front;
            for (int i = 0; i < values.length; i++) {
                arr[i] = values[j % values.length];
                f++;
            }
            size++;
            arr[size] = value;
            values = arr;
            
            front = 0;
            back = size;
        }
        else {
            int i = (back + 1) % values.length;
            values[i] = value;
            size++;
            back = (back + 1) % values.length;
        }
    }
    
    @Override
    public int dequeue() throws Exception {
        if (size < 1) throw new Exception("There are no items in the queque.");
        int result = values[front];
        front = (front + 1) % values.length;
        size--;
        return result;
    }
    
    @Override
    public int getSize() {
        return size;
    }
    
    @Override
    public void clear() {
        values = new int[5];
        size = 0;
        front = 0;
        back = 0;
    }
    
    @Override
    public String toString() {
        String s = "";
        int j = front;
        for (int i = 0; i < size; i++) {
            s += values[j % values.length] + " ";
            j++;
        }
        return s;
    }
    
}
