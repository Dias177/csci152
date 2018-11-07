/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adt;

/**
 *
 * @author dias
 */
public interface Stack<T> {
    
    /**
     * This method adds the input value on the top of the stack.
     * 
     * @param value is an input which is added on the top of the stack
     */
    public void push(T value);
    
    /**
     * This methods removes and returns the very last value from 
     * the top of the stack.
     * 
     * @return the very last value from the top of the stack.
     * @throws an exception if the stack is empty
     */
    public T pop() throws Exception;
        
    /**This getter returns the size of the stack.
     * 
     * @return the size of the stack
     */
    public int getSize();

    /**
     * This method removes all the elements of the stack.
     */
    public void clear();
       
    /**
     * This methods returns a string which describes the stack,
     * including the location of the top and bottom as well as 
     * the values of elements of the given stack.
     * 
     * @return a string representation of the stack
     */
    @Override
    public String toString();
 
}
