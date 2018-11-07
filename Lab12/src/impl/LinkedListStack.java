/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impl;

import adt.Stack;

/**
 *
 * @author dias
 */
public class LinkedListStack<T> implements Stack<T> {

    private Node<T> top;
    private int size;
    
    public LinkedListStack() {
        top = null;
        size = 0;
    }
   
    @Override
    public void push(T value) {
        
        Node<T> t = new Node(value);
        
        if (size > 0) {
            t.setLink(top);
        }
        top = t;
        size++;
    }

    @Override
    public T pop() throws Exception {
        
       if (size == 0) {
           throw new Exception("The stack is empty!");
       }
       T x = top.getValue();
       
       if (size == 1) {
           top = null;
       }
       else {
           top.setValue(top.getLink().getValue());
           top.setLink(top.getLink().getLink());
        }
       size--;
       return x;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void clear() {
        top = null;
        size = 0;
    }
    
    public String toString() {
        String s = "Stack: top[";
        
        Node n = top;
        while (n != null) {
            s += n + " ";
            n = n.getLink();
        }
        s += "]bottom and its size is " + size;
        return s;
    }  
}
