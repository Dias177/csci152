/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impl;

import adt.HashTableSet;

/**
 *
 * @author dias
 */
public class BSTHashTableSet<T extends Comparable> implements HashTableSet<T> {
    
    private BSTSet<T>[] buckets;
    private int size;

    public BSTHashTableSet(int a){
        buckets = new BSTSet[a];
        size=0;
    }       
    
    @Override
    public void add(T value) {
        int ind = Math.abs(value.hashCode()) % buckets.length;
        
        if(!contains(value)){
            if(buckets[ind] == null){
                buckets[ind] = new BSTSet();
                buckets[ind].add(value);
            }else {
                buckets[ind].add(value);
            }
            size++;
        }
    }

    @Override
    public boolean contains(T value) {
        int ind = Math.abs(value.hashCode()) % buckets.length;
        
        if(buckets[ind] == null) return false;    
        
        return buckets[ind].contains(value);
    }

    @Override
    public boolean remove(T value) {
        if(!contains(value)) return false;
        
        int ind = Math.abs(value.hashCode()) % buckets.length;
        
        size--;

        return buckets[ind].remove(value);
        
        
    }

    @Override
    public T removeAny() throws Exception {
        if(size == 0 ) throw new Exception("buckets are empty");
        
        T result = null;
        
        for (int j = 0; j < buckets.length; j++) { 
            if(buckets[j].getSize() >0) {
                result = buckets[j].removeAny();
                size--;      
                break;
            }                       
        }
        
        return result;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void clear() {
        size=0;       
        for (int i = 0; i < buckets.length; i++) {
            buckets[i].clear();            
        }
    }
    
    public String toString(){
        String result = "";
        if(size == 0 ) return "Set Is empty"; 
        
        for (int i = 0; i < buckets.length; i++) {
            if(buckets[i] == null) continue; 
            result += buckets[i].toString()+" "; 
            
        }
        return result+" size:"+size;        
    }

    @Override
    public int getNumberOfBuckets() {
        return buckets.length;
    }

    @Override
    public int getBucketSize(int index) throws Exception {
        if(buckets[index] == null) throw new Exception("this bucket is empty");
        return buckets[index].getSize();
    }

    @Override
    public double getLoadFactor() {
        return size/buckets.length;
    }

    @Override
    public double getBucketSizeStandardDev() {
        int mean , sum = 0;
        for (int i = 0; i < buckets.length; i++) {
            if(buckets[i] != null)
            sum += buckets[i].getSize();
        }
        mean = sum/buckets.length;
        
        int sumOfSquares = 0;
        
        for (int i = 0; i < buckets.length; i++) {
            int s = 0;
            if(buckets[i]!=null) s = buckets[i].getSize(); 
            sumOfSquares += Math.pow(s - mean , 2);
        }
        
        return Math.sqrt(sumOfSquares/buckets.length);
    }

    @Override
    public String bucketsToString() {
        return toString();
    }
    
}