/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impl;

import adt.KeyValuePair;
import adt.Map;
import adt.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dias
 */
public class LLStackMap<K, V> implements Map<K, V> {
    
    private LinkedListStack<KeyValuePair<K, V>> pairs;
    
    public LLStackMap() {
        pairs = new LinkedListStack();
    }

    @Override
    public void define(K key, V value) {
        KeyValuePair<K, V> x = new KeyValuePair(key, value);
        KeyValuePair<K,V> y;
        Stack st = new LinkedListStack();
        int size = pairs.getSize();
        
        for (int i = 0; i < size; i++) {
            try {
                y = pairs.pop();
                if (x.getKey() == y.getKey()) {
                    break;
                }
                st.push(y);
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        
        int size1 = st.getSize();
        for (int i = 0; i < size1; i++) {
            try {
                pairs.push((KeyValuePair<K, V>) st.pop());
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        pairs.push(x);
    }

    @Override
    public V getValue(K key) {
        KeyValuePair<K, V> x;
        LinkedListStack<KeyValuePair> s = new LinkedListStack();
        int size = pairs.getSize();
        
        for (int i = 0; i < size; i++) {
            try {
                x = pairs.pop();
                s.push(x);
                if (x.getKey() == key) return x.getValue();
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        int size1 = s.getSize();
        for (int i = 0; i < size1; i++) try {
            pairs.push(s.pop());
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        return null;
    }

    @Override
    public V remove(K key) {
        KeyValuePair<K, V> x = null;
        LinkedListStack<KeyValuePair> s = new LinkedListStack();
        int k = 0;
        int size = pairs.getSize();
        
        for (int i = 0; i < size; i++) {
            try {
                x = pairs.pop();
                if (x.getKey() == key) {
                    k++;
                    break;
                }
                s.push(x);
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        int size1 = s.getSize();
        for (int i = 0; i < size1; i++) {
            try {
            pairs.push(s.pop());
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        if (k > 0) return x.getValue();
        return null;
    }

    @Override
    public KeyValuePair<K, V> removeAny() throws Exception {
        if (pairs.getSize() == 0) throw new Exception("A map is empty!");
        return pairs.pop();
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
