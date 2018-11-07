/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impl;

import adt.Queue;
import adt.Stack;
import static impl.Palindrome.isPalindrome;


public class Test {
    
    public static void main (String [] args) {
        
        // 1
	Queue <Integer> qi = new LinkedListQueue <Integer> ();
		
	try {
            qi.dequeue();
	} catch (Exception ex) {
            System.out.println(ex.getMessage());
	}
	
        for (int i = 0; i < 8; i++) {
            qi.enqueue(i);
	}
		
	System.out.println(qi);
		
	try {	
            qi.dequeue();
            qi.dequeue();
            qi.dequeue();
	} catch (Exception ex) {
            System.out.println(ex.getMessage());
	}
        
        System.out.println(qi);
        
	for (int i = 0; i < 9; i++) {
            qi.enqueue(i);
            qi.enqueue(i+1);
            
            try {
		qi.dequeue();
		qi.dequeue();
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            System.out.println(qi);
        }
	qi.clear();
	System.out.println(qi);
		
	for (int i = 0; i < 22; i++) {
            qi.enqueue(i);
	}
	System.out.println(qi);
        
        //2
        Queue <Character> qc = new LinkedListQueue<Character> ();
		
	qc.enqueue('x');
	qc.enqueue('y');
	qc.enqueue('z');
	qc.enqueue('z');
	qc.enqueue('y');
        qc.enqueue('x');
        
        System.out.println("Before: " + qc);
        System.out.println(isPalindrome(qc));
	System.out.println("After: " + qc);
	}
	
}
