/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impl;

import adt.SortedQueue;

/**
 *
 * @author dias
 */
public class LinkedListSortedQueue<T extends Comparable> implements SortedQueue<T> {
    
    private Node<T> front;
    private int size;
    
    public LinkedListSortedQueue(){
        front = null;
        size = 0;
    }
    
    @Override
    public void insert(T value) {
        Node<T> n = new Node(value); 
        
        if (size == 0) {
            front = n;
        }
        else {
            
           if (value.compareTo(front.getValue()) <=0) {
              n.setLink(front);
              front = n;
           } 
           else {
               Node<T> x = front;
               Node<T> y = null;
               
               while (x !=null) {
                   
                   if (value.compareTo(x.getValue()) <=0) {
                       n.setLink(x);
                       y.setLink(n);                       
                       break;
                   }
                   y = x;
                   x = x.getLink();
               }

               if (x == null) {
                   y.setLink(n);
               }  
           }
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
        size = 0;
    }
    
    public String toString(){
        
        String s = "Queue: front[ ";
        Node<T> n = front;
        
        while (n != null) {
            s += n.getValue()+ " ";
            n = n.getLink();
        }
        s += "]back and its size is " + size;
        return s;
    }    
}