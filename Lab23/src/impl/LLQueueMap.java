/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impl;

import adt.KeyValuePair;
import adt.Map;
import adt.Queue;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dias
 * @param <K>
 * @param <V>
 */

public class LLQueueMap<K, V> implements Map<K, V> {
    
    private LinkedListQueue<KeyValuePair<K, V>> pairs;
    
    public LLQueueMap() {
        pairs = new LinkedListQueue();
    }

    @Override
    public void define(K key, V value) {
        
        KeyValuePair<K, V> x = new KeyValuePair(key, value);
        KeyValuePair<K,V> y;
        
        for (int i = 0; i < pairs.getSize(); i++) {
            try {
                y = pairs.dequeue();
                if (x.getKey() == y.getKey()) {
                    break;
                }
                pairs.enqueue(y);
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        pairs.enqueue(new KeyValuePair(key, value));

    }

    @Override
    public V getValue(K key) {
        KeyValuePair x;
        
        for (int i = 0; i < pairs.getSize(); i++) {
            try {
                x = pairs.dequeue();
                pairs.enqueue(x);
                if (x.getKey() == key) return (V) x.getValue();
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        return null;
    }

    @Override
    public V remove(K key) {
        KeyValuePair x;
        int size ;
        
        for (int i = 0; i < pairs.getSize(); i++) {
            try {
                x = pairs.dequeue();
                if (x.getKey() == key) return (V) x.getValue();
                pairs.enqueue(x);
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        return null;
    }

    @Override
    public KeyValuePair<K, V> removeAny() throws Exception {
        if (pairs.getSize() == 0) throw new Exception("A map is empty!");
        return pairs.dequeue();
    }

    @Override
    public int getSize() {
        return pairs.getSize();
    }

    @Override
    public void clear() {
        pairs.clear();
     }
    
    public String toString() {
        return pairs.toString();
    }
}