/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impl;

import adt.IntQueue;
import adt.IntStack;

/**
 *
 * @author dias
 */
public class Methods {
    
    public Methods() {}
    
    public static int evenCount(IntStack stk){
        
        int c = 0, size = stk.getSize();
        IntStack temp = new ArrayIntStack();
        
        for (int i = 0; i < size; i++) {
            try {
                int x = stk.pop();
                temp.push(x);
                if(x % 2 == 0) c++;
            } catch (Exception ex) {
                System.out.println(ex);
            }            
        }
        for (int i = 0; i < size; i++)  
            try {
                stk.push(temp.pop());
            } catch (Exception ex) {
                System.out.println(ex);
            }
        return c;
    }
    
    public static IntStack copyStack(IntStack orig){
        
        IntStack stk = new ArrayIntStack(), t = new ArrayIntStack();
        int size = orig.getSize();
        for (int i = 0; i < size; i++) {
            try {
                t.push(orig.pop());
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
        for (int i = 0; i < size; i++) {
            try {
                int x = t.pop();
                orig.push(x);
                stk.push(x);
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
        
        return stk;
    } 
    public static void reverseQueue(IntQueue toRev){
       
        IntStack stack = new ArrayIntStack(); 
        int size = toRev.getSize();
        
        System.out.println("queue:"+toRev);
        
        for (int i = 0; i < size; i++) {
            try {
                stack.push(toRev.dequeue());
            } catch (Exception e) {
                System.out.println(e);
            }
        }
     
        for (int i = 0; i < size; i++) {
            try {
                toRev.enqueue(stack.pop());
                //System.out.println("queue:"+toRev);
            } catch (Exception ex) {
                System.out.println(ex);
            }
 
        }
    }
    
    public static boolean isPalindrome(IntQueue q){
        ArrayIntStack stack = new ArrayIntStack();
        ArrayIntQueue queue = new ArrayIntQueue();
        int size = q.getSize(); 
        for(int i = 0; i < size; i++){
            try {
                int c = q.dequeue();
                stack.push(c);
                queue.enqueue(c);
            } catch (Exception e) {
                System.out.println(e);
            }
            
        }
        
        while(queue.getSize()!=0){
            try {
                if(queue.dequeue() != stack.pop()) return false;
            } catch (Exception e) {
                System.out.println(e);
            }            
        } 
        return true;
    }
}
    
    /*public static int evenCount(IntStack stk) {
        
        IntStack temp = new ArrayIntStack();
        int counter = 0;
        
        for (int i = 0; i < stk.getSize(); i++) {
 
             try {
                int x = stk.pop();
                temp.push(x);
                if (x % 2 == 0) counter++;
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
        
        for (int i = 0; i < stk.getSize(); i++) {
            try {
                stk.push(temp.pop());
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
         return counter;
    }
    
    public static IntStack copyStack(IntStack orig) {
        
        IntStack stk = new ArrayIntStack();
        IntStack temp = new ArrayIntStack();
        
        for (int i = 0; i < orig.getSize(); i++) {
            try {
                temp.push(orig.pop());
            } catch (Exception ex) {
                System.out.println(ex);
                
            }
        }
        
        for (int i = 0; i < orig.getSize(); i++) {
            try {
                
                int x = temp.pop();
                stk.push(x);
                orig.push(x);
                
            } catch (Exception ex) {
                System.out.println(ex);
            }         
            
        }
        
        return stk;
    }
    
    public static void reverseQueue(IntQueue toRev) {
      
        IntStack stk = new ArrayIntStack();
        
        System.out.println("The original queue is " + toRev);
        
        for (int i = 0; i < toRev.getSize(); i++) {
            try {
                stk.push(toRev.dequeue());
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
        System.out.println("The reversed queue is " + stk);
        
        for (int i = 0; i < toRev.getSize(); i++) {
            try {
                toRev.enqueue(stk.pop());
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
        
        System.out.println("An original queue after the modification is " + toRev);
    }
    
    public static boolean isPalindrome(IntQueue q) {
    
        IntStack stk = new ArrayIntStack();
        IntQueue qu = new ArrayIntQueue();
        
        for (int i = 0; i < q.getSize(); i++) {
            try {
                int x = q.dequeue();
                stk.push(x);
                qu.enqueue(x);
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
        
        while (qu.getSize() != 0) {
            try {
                if (qu.dequeue() != stk.pop()) return false;
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
        return true;
    }
}*/
