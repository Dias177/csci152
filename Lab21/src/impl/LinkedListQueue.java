/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impl;

import adt.Queue;

/**
 *
 * @author dias
 */
public class LinkedListQueue<T> implements Queue<T> {
    
    private Node<T> front;
    private Node <T> back;
    private int size;
    
    public LinkedListQueue(){
        front = null;
        back = null;
        size = 0;
    }
    
    @Override
    public void enqueue(T value) {
        
        Node<T> n = new Node(value); 
        
        if (size == 0) {
            front = n;
            back = front;
        }
        else {
            back.setLink(n);
            back = n;            
        }
        
        size++;
    }

    @Override
    public T dequeue() throws Exception {
        if (size == 0) {
            throw new Exception("The queue is empty!");
        }
        
        T t = front.getValue();
        
        if (size == 1) {
            front = null; 
            back= null;
        } 
        else {
            front = front.getLink();
        }
        size--;
        return t;
    }

    @Override
    public int getSize() {  
        return size;
    }

    @Override
    public void clear() {
        front = null;
        back = null;
        size = 0;
    }
    
    @Override
    public String toString(){
        String s = "";
        
        Node<T> n = front;
        
        while (n != null) {
            s += n.getValue() + " ";
            n = n.getLink();
        }
        
        return "Queue: front[ " + s + "]back and its size is " + size;
    }   
}