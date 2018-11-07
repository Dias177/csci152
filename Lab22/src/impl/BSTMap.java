/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impl;

import adt.Map;
import adt.KeyValuePair;

/**
 *
 * @author dias
 */

public class BSTMap<K extends Comparable, V> implements Map<K, V> {
    
    private TreeNode<KeyValuePair<K, V>> root;
    private int size;
    
    public BSTMap() {
        root = null;
        size = 0;
    }

    @Override
    public void define(K key, V value) {
        KeyValuePair<K, V> x = new KeyValuePair(key, value);
        
        root = defineHelper(root, x.getKey(), x.getValue());
    }


    @Override
    public V getValue(K key) {
        return getValueHelper(root, key);
    }

    @Override
    public V remove(K key) {
        if(getValue(key)!=null){  
            TreeNode<KeyValuePair<K,V>> count = root;
            TreeNode<KeyValuePair<K,V>> parent = count;  
            
            if(size==1){
                V valueofroot = root.getValue().getValue();
                clear();
                return valueofroot;
            }
            if(root.getValue().getKey()==key && !(root.getLeft()!=null && root.getRight()!=null)){

                if(root.getLeft()==null){
                    root = root.getRight();
                }else{
                    root=root.getLeft();             
                    }
                size--; 
                return count.getValue().getValue();
            }
                      
            
            while(count.getValue().getKey()!= key){
                parent = count;
                if(key.compareTo(count.getValue().getKey())>0){
                    count = count.getRight();
                }else{
                    count = count.getLeft();
                }
            }
            if(count.getLeft() == null){
                if(count.getRight() == null){
                    if(parent.getLeft() == count){
                        parent.setLeft(null); 
                    }else{
                        parent.setRight(null);
                    }
                }else{
                    if(parent.getLeft() == count){
                        parent.setLeft(count.getRight());
                    }else{
                        parent.setRight(count.getRight());
                    }
                }
                
            }else if(count.getRight() ==null){
                if(parent.getLeft() == count){
                    parent.setLeft(count.getLeft());
                }else{
                    parent.setRight(count.getLeft());
                }
            }else{
                TreeNode<KeyValuePair<K,V>> smallestnode = count.getRight();
                parent = count;                
                while(smallestnode.getLeft()!= null){
                    parent = smallestnode;
                    smallestnode = smallestnode.getLeft();
                }
                count.setValue(smallestnode.getValue());
                if(smallestnode.getRight()== null){
                    if(parent == count){
                        parent.setRight(null);
                    }else{                    
                    parent.setLeft(null);}
                }else{
                    if(parent == count){
                        parent.setRight(smallestnode.getRight());
                    }else{
                    parent.setLeft(smallestnode.getRight());}
                }
                
            }size--;
            return count.getValue().getValue();
        }
        return null;
    }

    @Override
    public KeyValuePair<K, V> removeAny() throws Exception {
        if (size == 0) {
            throw new Exception("A map is empty!");
        }
        return new KeyValuePair<K, V> (root.getValue().getKey(),remove(root.getValue().getKey()));
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void clear() {
        root = null;
        size = 0;
    }
    
    public String toString() {
        return toStringHelper(root) + "Size: " + size;
    }
    
    private String toStringHelper(TreeNode node) {
        if (node == null) {
            return " ";
        }
        return (node.getValue() + toStringHelper(node.getLeft()) +
        toStringHelper(node.getRight()));
    } 
    
    private TreeNode defineHelper(TreeNode<KeyValuePair<K, V>> x, K key, V value) {
        KeyValuePair<K, V> y = new KeyValuePair(key, value);
        
        if (x == null) {
            size++;
            x = new TreeNode(y);
            return x;
        }
        
        if (((K)y.getKey()).compareTo(x.getValue().getKey()) < 0) {
            x.setLeft(defineHelper(x.getLeft(), y.getKey(), y.getValue()));
        }
        else if (((K)y.getKey()).compareTo(x.getValue().getKey()) > 0) {
            x.setRight(defineHelper(x.getRight(), y.getKey(), y.getValue()));
        }
        else {
            x.setValue(y);
        }
        return x;
    }
    
    private V getValueHelper(TreeNode<KeyValuePair<K, V>> x, K key) {
        if (x == null) {
            return null;
        }
        
        if (key.compareTo(x.getValue().getKey()) < 0) {
            return getValueHelper(x.getLeft(), key);
        }
        else if (key.compareTo(x.getValue().getKey()) > 0) {
            return getValueHelper(x.getRight(), key);
        }
        return x.getValue().getValue();
    }

}
