/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impl;

/**
 *
 * @author dias
 */
public class Node<T> {
    private T value;
    private Node<T> link;
    
    /**
     * This is a constructor which creates a node and sets the 
     * initial field values 
     * 
     * @param val to set on the node 
     */
    public Node(T val) {
        value = val;
    }

    /**
     * This getter returns the value of the node.
     * 
     * @return the value of the node
     */
    public T getValue() {
        return value;
    }

    /**
     * This setter sets the given value to value.
     *
     * @param value is the given value
     */
    public void setValue(T value) {
        this.value = value;
    }

    /**
     * This getter returns the value of link
     * 
     * @return the link
     */
    public Node<T> getLink() {
        return link;
    }

    /**
     * This setter sets the given link to link.
     * 
     * @param link is the given link
     */
    public void setLink(Node<T> link) {
        this.link = link;
    }
    
    /**
     * This methods returns a string which represents
     * the given node.
     * 
     * @return a string representation of the node
     */
    public String toString() {
        return value.toString();
    }
}
