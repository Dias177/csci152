/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impl;

import adt.Stack;

/**
 *
 * @author dias
 */
public class Test {
    
    public static int evenCount(Stack stk) { 

        Stack<Integer> t = new ArrayStack(); 
        t = stk; // new values for counting+size 
        int c = 0, size = t.getSize(); 

        for (int i = 0; i < size; i++){ 
        try { 
            int x = t.pop();
            if (x %2==0) c++; 
        } catch (Exception ex){ 
            System.out.println(ex); 
        } 
} 
return count; 
} 

public static Stack <Integer> copyStack(Stack orig){ 

Stack<Integer> tempo=new ArrayStack<Integer>(100); 
Stack<Integer> copy= new ArrayStack<Integer>(100); 

int size=orig.getSize(); 

for (int i=0;i<size;i++){ 
try { 
int value= orig.pop(); // Vytaskivaem is originala 
tempo.push(value); // Lozhim v temporary 
} catch (Exception ex){ 
System.out.println(ex.getMessage()); 
} 

int length= tempo.getSize(); 
for (int j=0;j<length;j++){ 
try { 
int val=tempo.pop(); // Vytaskivaem is originala 
copy.push(val); // Lozhim v temporary 
} catch (Exception ex){ 
System.out.println(ex.getMessage()); 
} 
} 
} 
return copy; 
} 

public static void reverseQueue(Queue toRev){ 
Stack tempo= new ArrayStack(100); // stack of integers 
int size=toRev.getSize(); 

for (int i=0;i<size;i++){ 
try { 
tempo.push(toRev.dequeue()); // vytaskivaem iz queue i lozhim v stack 
} catch (Exception ex){ 
System.out.println(ex.getMessage()); 
} 
} 
for (int j=0;j<size;j++){ 
try { 
toRev.enqueue(tempo.pop()); // is stacka vytaskivaem i lozhim obratno v queue 
} catch (Exception ex){ 
System.out.println(ex.getMessage()); 
} 
} 
} 

public static boolean isPalindrome(Queue q){ 
Queue temp = new ArrayQueue(); 

Stack stk = new ArrayStack(100); 

int size = q.getSize(); 

for (int i = 0; i < size; i++) { 

try { 

Object val = q.dequeue(); // vytaskivayem iz queue 
temp.enqueue(val); // lozhim v temp=enqueue 
stk.push(val); // lozhim v stk=push 
} catch (Exception ex) { 
System.out.println(ex.getMessage()); 
} 
} 
while (q.getSize() == 0) { // poka ne stanet empty my popaem 

try { 
if (temp.dequeue() != stk.pop()) { // ne ravno to false 
return false; 
} else { 
return true; 
} 
} catch (Exception ex) { 
System.out.println(ex.getMessage()); 
} 
} 
return true; 
} 
    public static void main(String[] args) {
    ArrayQueue<Integer> intQueue = new ArrayQueue();
        try {
            System.out.println(intQueue.dequeue());
        } catch (Exception e) {
            System.out.println(e);
        }
        
        
        for(int i = 0; i < 10; i++) intQueue.enqueue(i);
        System.out.println(intQueue+" and size:"+intQueue.getSize());
        
        for(int i =0; i<4; i++)
            try {
                System.out.println(intQueue.dequeue());
            } catch (Exception e) {
                System.out.println(e);
            }
        System.out.println(intQueue+" and size:"+intQueue.getSize());
        
        intQueue.clear();
        System.out.println(intQueue+" and size:"+intQueue.getSize());
        
        for(int i =0; i<22; i++) intQueue.enqueue(i);//(int) (Math.random()*50+1) );
        System.out.println(intQueue+" and size:"+intQueue.getSize());    
    }
}
