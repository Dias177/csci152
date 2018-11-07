/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impl;

import adt.HashTableMap;
import adt.KeyValuePair;

/**
 *
 * @author dias
 */
public class LLQHashTableMap<K, V> implements HashTableMap<K, V> {
    
    private LinkedListQueue<KeyValuePair<K, V>>[] buckets;
    private int size;
    private int k;
    
    public LLQHashTableMap(int k) {
        buckets = new LinkedListQueue[k];
        size = 0;
        this.k = k;
    }
    
    @Override
    public void define(K key, V value) {
        KeyValuePair x = new KeyValuePair(key, value);
        int i = Math.abs(x.getKey().hashCode()) % k;
       
        
        if (buckets[i] == null) {
            buckets[i] = new LinkedListQueue();
        }
        
        if (getValue((K) x.getKey()) == null) {
            buckets[i].enqueue(x);
            size++;
            return;
        }        

        try {
            int s = buckets[i].getSize();
            while (s != 0) {
                KeyValuePair<K, V> a = buckets[i].dequeue();
                buckets[i].enqueue(a);
                if (a.getKey() == key) {
                    a.setValue(value);
                    return;
                }
                s--;
            }
        } catch (Exception ex){    
            System.out.println(ex.getMessage());
        }
        size++;
    }

    @Override
    public V getValue(K key) {
        int i;
        i = Math.abs(key.hashCode()) % k;
        if (buckets[i] == null){
            return null;
        }
        try {
            int x = buckets[i].getSize();
            while (x != 0) {
                KeyValuePair<K,V> a = buckets[i].dequeue();
                buckets[i].enqueue(a);
                if (a.getKey() == key) {
                    return a.getValue();
                }
                x--;
            }
        } catch(Exception ex){    
            System.out.println(ex.getMessage());
        }
        return null;
    }

    @Override
    public V remove(K key) {
        if(getValue(key)==null){
            return null;
        }
        int i;
        i = Math.abs(key.hashCode())%k;
        KeyValuePair<K,V> a = null;
        try {
            while(true){
                a = buckets[i].dequeue();
                if (a.getKey() == key){
                    break;
                }
                buckets[i].enqueue(a);
            }
        } catch(Exception ex){ 
            System.out.println(ex.getMessage());
        }
        size--;
        return a.getValue();  
    }

    @Override
    public KeyValuePair<K, V> removeAny() throws Exception {
        if(size ==0){
            throw new Exception("The map is empty");
        }
        int i=0;
        while (buckets[i]==null || buckets[i].getSize() == 0){
            i++;    
        }
        size--;
        return buckets[i].dequeue();  
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void clear() {
        buckets = new LinkedListQueue[k];
        size = 0;
        
    }

    @Override
    public int getNumberOfBuckets() {
        return k;
    }

    @Override
    public int getBucketSize(int index) throws Exception {
        if(buckets[index] == null){
            throw new Exception("Error!");
        }
       return buckets[index].getSize();}

    @Override
    public double getLoadFactor() {
        return size / k;
    }

    @Override
    public double getBucketSizeStandardDev() {
        double mean = 0, var = 0;
        for (int i = 0; i < k; i++){
            if (buckets[i] == null){
                continue;
            }
            mean += buckets[i].getSize();
        }
        mean /= k;
        for(int i = 0; i < k; i++){
            if(buckets[i] == null){
                var += mean * mean;
                continue;
            }
        var += (buckets[i].getSize() - mean) * (buckets[i].getSize() - mean);
        }
        var /= k;
        return Math.sqrt(var);}

    @Override
    public String bucketsToString() {
         String s = "";         
            for(int i = 0; i < k; i++) {
            LinkedListQueue x = buckets[i];
            if (x == null){
                continue;
            }
            s = s + x.toString() + "\n";
        }
        return s;
    }
    
    public String toString() {
        String s = "";         
        for(int i = 0; i < k; i++){
            LinkedListQueue x = buckets[i];
            if (x == null){
                continue;
            }
            s = s + x.toString() + "\n";
        }
        return s;
    }
}
