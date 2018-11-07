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
public class BSTHashTableMap<K extends Comparable, V> implements HashTableMap<K, V>{
    
    private BSTMap<K, V>[] buckets;
    private int size;
    
    public BSTHashTableMap(int k) {
        buckets = new BSTMap[k];
        size = 0;
    }
    @Override
    public void define(K key, V value) {
        int i = Math.abs(value.hashCode()) % buckets.length;
        
        if(buckets[i] == null){
            buckets[i] = new 
        }
        
        if(getValue(key)==null){
            buckets[i].enqueue(new KeyValuePair(key,value));
            size++;
            return;
        }        

        try{
            int count = buckets[i].getSize();
            while(count!=0){
                KeyValuePair<K,V> copy = buckets[i].dequeue();
                buckets[i].enqueue(copy);
                if(copy.getKey() == key){
                    copy.setValue(value);
                    return;
                }
                count--;
            }}catch(Exception ex){    
        }
        size++;
    }

    @Override
    public V getValue(K key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public V remove(K key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public KeyValuePair<K, V> removeAny() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void clear() {
        buckets = new BSTMap[buckets.length];
        size = 0;
    }

    @Override
    public int getNumberOfBuckets() {
        return buckets.length;
    }

    @Override
    public int getBucketSize(int index) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getLoadFactor() {
        return size / buckets.length;
    }

    @Override
    public double getBucketSizeStandardDev() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String bucketsToString() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
