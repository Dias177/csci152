/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impl;

import adt.Queue;
import adt.Stack;

/**
 *
 * @author dias
 */
public class Palindrome {
    
    public static boolean isPalindrome(Queue <Character> q) {
        
        Stack <Character> s = new LinkedListStack <Character> ();
        Queue <Character> q1 = new LinkedListQueue <Character> ();
	Queue <Character> q2 = new LinkedListQueue <Character> ();
		
	while (q.getSize() != 0) {
            char c;
                        
            try {
                c = q.dequeue();
                s.push(c);
                q1.enqueue(c);
                q2.enqueue(c);
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
			
	}
                
	q = q2;
                
	while (q1.getSize()!= 0) {
            try {
                char c1 = s.pop();
		char c2 = q1.dequeue();
		if (c1 != c2) {
                    return false;
		}
		} catch (Exception ex) {
                    System.out.println(ex.getMessage());
		}
	}
        return true;
		
    }
}
