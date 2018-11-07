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
public class LLQHashTableSet<T> implements Set<T> {
    
    private LinkedListQueue<T>[] buckets;
    private int size;
    
    public LLQHashTableSet(int k) {
        buckets = new LinkedListQueue[k];
        size = 0;
    }
    
    @Override
    public void add(T value) {
        int x = Math.abs(value.hashCode()) % buckets.length;
        
        if (contains(value)) {
            return;
        } else {
            if (buckets[x] == null) {
                buckets[x] = new LinkedListQueue();
                buckets[x].enqueue(value);
            } else {
                buckets[x].enqueue(value);
            }
            size++;
        }
        
    }

    @Override
    public boolean contains(T value) {

        int x = Math.abs(value.hashCode()) % buckets.length;
        
        if (buckets[x] == null) {
            return false;
        }
        
        return buckets[x].contains(value);
    }
    @Override
    public boolean remove(T value) {
        if (!contains(value)) {
            return false;
        } else {
            int x = Math.abs(value.hashCode()) % buckets.length;
            size--;
            return buckets[x].remove(value);
        }
    }

    @Override
    public T removeAny() throws Exception {
        if (size == 0) {
            throw new Exception("A set is empty!");
        }
        
        T x = null;
        
        for (int i = 0; i < buckets.length; i++) {
            if (buckets[i].getSize() > 0) {
                x = buckets[i].dequeue();
                size--;
                return x;
            }
        }
        
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void clear() {
        for (int i = 0; i < buckets.length; i++) {
            buckets[i].clear();
        }
        size = 0;
            
    }
    
    public String toString() {
        String s = "";
        
        for (int i = 0; i < buckets.length; i++) {
            s += buckets[i].toString() + " ";
        }
        
        return s;
    }
}
