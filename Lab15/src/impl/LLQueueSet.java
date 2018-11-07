/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impl;

import adt.Queue;
import adt.Set;

/**
 *
 * @author dias
 */
public class LLQueueSet<T> implements Set<T>{
    
    
    
    private LinkedListQueue<T> queue;
    
    public LLQueueSet() {
        queue = new LinkedListQueue();
    }

    @Override
    public void add(T value) {
        
        if (!contains(value)) {
            queue.enqueue(value);
        }
    }

    @Override
    public boolean contains(T value) {
        for (int i = 0; i < queue.getSize(); i++) {
            try {
                T x = queue.dequeue();
                queue.enqueue(x);
                
                if (x.equals(value)) {
                    return true;
                }
            } catch (Exception ex) {
                // This shouldn't happen
            }
        }
        return false;
    }

    @Override
    public boolean remove(T value) {
        
        if (!contains(value)) {
            
            return false;
            
        } else {
            
            Queue<T> q = new LinkedListQueue();
            T x = null;
            
            try {
                x = queue.dequeue();
                
            } catch (Exception ex) {
                
                System.out.println(ex.getMessage());
            }
            
            while (!value.equals(x)) {
                
                q.enqueue(x);
                
                try {
                    x = queue.dequeue();
                } catch (Exception ex) {
                    System.out.println(ex);
                }
            }
            
            int size = q.getSize();
            
            for (int i = 0; i < size; i++) {
                try {
                    queue.enqueue(q.dequeue());
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
            }
            return true;
        }
    }

    @Override
    public T removeAny() throws Exception {
        if (queue.getSize() == 0) {
            throw new Exception("The set is empty!");
        }
        
        return queue.dequeue();
    }

    @Override
    public int getSize() {
        return queue.getSize();
    }

    @Override
    public void clear() {
        queue.clear();
    }
    
    @Override
    public String toString() {
        return queue.toString();
    }
    
    
}
