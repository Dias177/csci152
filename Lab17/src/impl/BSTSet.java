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
public class BSTSet<T extends Comparable> implements Set<T> {
    
    private TreeNode<T> root;
    private int size;
    
    public BSTSet() {
        root = null;
        size = 0;
    }

    @Override
    public void add(T value) {
        
        TreeNode<T> x = new TreeNode(value);
        
        if (root == null) {
            root = x;
            size++;
            return;
        }
        
        if (contains(value)) {
            return;
        }
        
        TreeNode<T> t = addHelper(root, value);
        
        if (value.compareTo(t.getValue()) < 0) {
            t.setLeft(x);
            size++;
        }
        else {
            t.setRight(x);
            size++;
        }
        
    }

    @Override
    public boolean contains(T value) {
        return containsHelper(root, value);
    }

    @Override
    public boolean remove(T value) {
//        if (!contains(value)) {
//            return false;
//        }
//        TreeNode<T> res = root;
//        boolean isLeftChild = false;
//        while (true) {
//            int compare = res.getValue().compareTo(value);
//
//            if (compare > 0) {
//
//                if (res.getLeft() == null) {
//                    return false;
//                }
//                res = res.getLeft();
//                isLeftChild = true;
//            } else if (compare < 0) {
//                isLeftChild = false;
//
//                if (res.getRight() == null) {
//                    return false;
//                }
//                res = res.getRight();
//            } else {
//
//                size--;
//                if (res.getLeft() == null && res.getRight() == null) {
//                    if (size == 0) {
//                        root = null;
//                        return true;
//                    }
//                    if (isLeftChild == true) {
//                        res.getParent().setLeft(null);
//                        return true;
//                    } else {
//                        res.getParent().setRight(null);
//                        return true;
//                    }
//                }
//
//                if (res.getLeft() == null) {
//                    if (size == 0) {
//                        root = null;
//                        root = res.getRight();
//                        return true;
//                    }
//                    if (isLeftChild == true) {
//                        res.getParent().setLeft(res.getRight());
//                        res = null;
//                        return true;
//                    } else {
//                        res.getParent().setRight(res.getRight());
//                        res = null;
//                        return true;
//                    }
//                } else if (res.getRight() == null) {
//                    if (size == 0) {
//                        root = res.getLeft();
//                        return true;
//                    }
//                    if (isLeftChild == true) {
//                        res.getParent().setLeft(res.getLeft());
//                        res = null;
//                        return true;
//                    } else {
//                        res.getParent().setRight(res.getLeft());
//                        res = null;
//                        return true;
//                    }
//                }
//
//                if (res.getLeft() != null && res.getRight() != null) {
//                    TreeNode<T> min = res.getRight();
//                    while (true) {
//                        if (min.getLeft() == null) {
//                            if (min.getRight() != null) {
//                                min.getParent().setLeft(min.getRight());
//                            }
//                            min.getParent().setLeft(null);
//                            min.setLeft(res.getLeft());
//                            min.setRight(res.getRight());
//                            if (isLeftChild == true) {
//                                res.getParent().setLeft(min);
//                                res = null;
//                                return true;
//                            } else {
//                                if (res.getParent() == null) {
//                                    root = min;
//                                } else {
//                                    res.getParent().setRight(min);
//                                }
//                                res = null;
//                                return true;
//                            }
//                        }
//                        min = min.getLeft();
//                    }
//                }
//
//            }
//        }
        
//        TreeNode<T> x = root;
//        TreeNode<T> y = x;
//        size--;
//        
//        while(!x.getValue().equals(value)) {
//            if (x.getValue().compareTo(value) > 0) {
//                y = x;
//                x = x.getLeft();
//            }
//            else if (x.getValue().compareTo(value) < 0) {
//                y = x;
//                x = x.getRight();
//            }
//            
//        }
//        
//        if (x.getLeft() == null) {
//            if (y.getValue().compareTo(value) < 0) {
//                y.setRight(x.getLeft());
//            }
//            else {
//                y.setLeft(x.getLeft());
//            }
//            return true;
//        }
//        
//        if (x.getRight() == null) {
//            if (y.getValue().compareTo(value) < 0) {
//                y.setRight(x.getLeft());
//            }
//            else {
//                y.setLeft(x.getLeft());
//            }
//            return true;
//        }
//        
//        if (x.getRight() == null && x.getLeft() == null) {
//            if (y.getValue().compareTo(value) < 0) {
//                y.setRight(null);
//            }
//            else {
//                y.setLeft(null);
//            }
//            return true;
//        }
//        
//        TreeNode<T> a = x.getRight();
//        TreeNode<T> b = x;
//        
//        if (x == y) {
//            while(!(a.getLeft() == null)) {
//                b = a;
//                a = a.getLeft();
//            }
//            b.setLeft(null);
//            a.setLeft(root.getLeft());
//            a.setRight(root.getRight());
//            root = a;
//            
//            return true;
//        }
//        
//        if (a.getLeft() == null) {
//            a.setLeft(x.getLeft());
//            if (y.getValue().compareTo(a.getValue()) < 0) {
//                y.setRight(a);
//            }
//            else {
//                y.setLeft(a);
//            }
//            return true;
//        }
//        
//        while (!(a.getLeft() == null)) {
//            b = a;
//            a = a.getLeft();
//        }
//        b.setLeft(null);
//        a.setLeft(y.getLeft());
//        a.setRight(y.getRight());
//        if (y.getValue().compareTo(a.getValue()) < 0) {
//            y.setRight(a);
//        } else {
//            y.setLeft(a);
//        }
//        
//        return true;
    }

    @Override
    public T removeAny() throws Exception {
        if (size == 0) {
            throw new Exception("A set is empty!");
        }
        T x = root.getValue();
        if (size == 1) {
            root = null;
            return x;
        } else {
            remove(x);
            return x;
        }
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
    
    @Override
    public String toString() {
        return "Set: " + toStringHelper(root) + "size: " + size;
    }
    
    private String toStringHelper(TreeNode<T> x) {
        if (x == null) {
            return "";
        }
        return toStringHelper(x.getLeft()) + x.getValue() + " " +
                toStringHelper(x.getRight());
    }
    
    private TreeNode<T> addHelper(TreeNode<T> n, T x) {
        if (n.getValue().compareTo(x) > 0) {
            if (n.getLeft() == null) {
                return n;
            }
            n = addHelper(n.getLeft(), x);
        }
        else if (n.getValue().compareTo(x) < 0) {
            if (n.getRight() == null) {
                return n;
            }
            n = addHelper(n.getRight(), x);
        }
        return n;
   
        
    }
    
    private boolean containsHelper(TreeNode<T> n, T x) {
        if (n.getValue().compareTo(x) == 0) {
            return true;
        }
        if (n.getValue().compareTo(x) < 0 && n.getRight() != null) {
            return containsHelper(n.getRight(), x);
        }
        else if (n.getValue().compareTo(x) > 0 && n.getLeft() != null) {
            return containsHelper(n.getLeft(), x);
        }
        else {
            return false;
        }
    }
    
}
