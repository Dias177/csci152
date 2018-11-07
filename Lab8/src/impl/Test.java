/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impl;

import adt.IntQueue;
import adt.IntStack;
import impl.Methods;
import impl.ArrayIntQueue;
import impl.ArrayIntStack; 

/**
 *
 * @author dias
 */
public class Test {
    
    public static void main(String[] args) {
        Methods helper = new Methods();
        
        ////
        System.out.println("The evenCount method, which returns the number of even-numbered integers:");
        ArrayIntStack stack = new ArrayIntStack();
        stack.push(12);
        stack.push(4);
        stack.push(5);
        stack.push(8);
        System.out.println(stack);
        System.out.println("even count:"+helper.evenCount(stack)); 
        
        /////
        System.out.println("\nThe copyStack method, which creates and returns a copy of the stack orig, where orig is “preserved”");
        System.out.println("copy of the stack:"+helper.copyStack(stack)); 
        
        ArrayIntQueue queue = new ArrayIntQueue();
        queue.enqueue(12);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(8);
        
        System.out.println("\nThe reverseQueue method, which reverses the order of the elements stored in the queue toRev.");
        System.out.println("original queue: "+queue);
        helper.reverseQueue(queue);
        System.out.println("reversed queue: "+queue);
        
        
        System.out.println("\n The isPalindrome method, which returns whether or not the given queue q represents a palindrome");
        queue.enqueue(12);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(8);
        System.out.println("queue is: "+queue);
        System.out.println("queue is palindrome: "+helper.isPalindrome(queue));
    }
        /*Methods methods = new Methods();
        
        // 1 Exercise
        IntStack stk = new ArrayIntStack();
        for (int i = 0; i < stk.getSize(); i++) {
            stk.push(i);
        }
        System.out.println(stk);
        System.out.println(methods.evenCount(stk));
        
        // 2 Exercise
        System.out.println(methods.copyStack(stk));
        
        // 5 Exercise
        //IntQueue qu = new ArrayIntQueue();
        
        /*for (int i = 0; i < qu.getSize(); i++) {
            qu.enqueue(i);
        }
        
        methods.reverseQueue(qu);
        
        // 6 Exercise
        System.out.println(methods.isPalindrome(qu));
    }*/
}

