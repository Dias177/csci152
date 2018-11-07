/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impl;

import adt.Deque;

/**
 *
 * @author dias
 */
public class LinkedListDeque<T> implements Deque<T> {
    
    private DoublyLinkedNode<T> front;
    private DoublyLinkedNode<T> back;
    private int size;
    
    public LinkedListDeque() {
        front = null;
        back = null;
        size = 0;
    }

    @Override
    public void pushToFront(T value) {
        DoublyLinkedNode<T> n = new DoublyLinkedNode(value);
        
        if (size == 0) {
            front = n;
            back = n;
        } else {
            n.setNext(front);
            front.setPrevious(n);
            front = n;
        }
        size++;
    }

    @Override
    public void pushToBack(T value) {
        DoublyLinkedNode<T> n = new DoublyLinkedNode(value);
        
        if (size == 0) {
            front = n;
            back = n;
        } else {
            n.setPrevious(back);
            back.setNext(n);
            back = n;
        }
        size++;
    }

    @Override
    public T popFromFront() throws Exception {
        if (size == 0) {
            throw new Exception("The deque is empty!");
        }
        
        T t = front.getValue();
        
        if (size == 1) {
            front = null;
            back = null;
        } else {
            front = front.getNext();
            front.setPrevious(null);
        }
        size--;
        
        return t;
    }

    @Override
    public T popFromBack() throws Exception {
        if (size == 0) {
            throw new Exception("The deque is empty!");
        }
        
        T t = back.getValue();
        
        if (size == 1) {
            front = null;
            back = null;
        } else {
            back = back.getPrevious();
            back.setNext(null);
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
    
    public String toString() {
        String s = "Deque: front[ ";
        
        DoublyLinkedNode<T> x = front;
        
        while (x != null) {
            s += x.getValue() + " ";
            x = x.getNext();
        }
        
        s += " ]back and its size: " + size;
        return s;
    }
}
