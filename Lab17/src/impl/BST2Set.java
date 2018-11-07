/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impl;

import adt.Set;

/**
 *
 * @author dias
 */
public class BST2Set<T extends Comparable> implements Set<T> {
    
    
    private OnOffTreeNode<T> root;
    private int size;
    
    @Override
    public void add(T value) {
        if ()
    }

    @Override
    public boolean contains(T value) {
        return containsHelper(root, value);
    }

    @Override
    public boolean remove(T value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public T removeAny() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        return "Set: " + toStringHelper(root) + "size: " + size;
    }
    
    private String toStringHelper(OnOffTreeNode<T> x) {
        if (x == null) {
            return "";
        } else if (x.isActive()) {
        return toStringHelper(x.getLeft()) + x + " " +
                toStringHelper(x.getRight());
        } else {
            return toStringHelper(x.getLeft()) + " " +
                toStringHelper(x.getRight());
        }
        
    }
    
    private boolean containsHelper(OnOffTreeNode<T> x, T v) {
        boolean result;
        if (x == null) {
            return false;
        }
        if (x.getValue().compareTo(v) < 0) {
            result = containsHelper(x.getRight(), v);
        } else {
            result = containsHelper(x.getLeft(), v);
        }

        if (x.getValue().compareTo(v) == 0) {
            result = true;
        }
        return result;
    }
    
    private void addHelper(OnOffTreeNode<T> x, T v) {
        
    }
        
    
}
