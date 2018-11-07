/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impl;

import adt.IntQueue;

/**
 *
 * @author dias
 */
public class ArrayIntQueue implements IntQueue {
    
    private int[] values;
    private int front;
    private int back;
    private int size;
    
    
    public ArrayIntQueue() {
        values = new int[5];
        front = 0;
        back = 0;
        size = 0;
    }
    @Override
    public void enqueue(int value) {
        values[back] = value;
        back++;
        size++;
    }

    @Override
    public int dequeue() throws Exception {
        if (size == 0) {
            throw new Exception("A queue is empty!");
        }
        int result = values[front];
        front++;
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
    
    public String toString() {
        String s = "Queue: "
    }
}
