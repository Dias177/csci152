
package impl;

import adt.Stack;
import impl.ArrayStack;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TowerOfHanoi {

	private Stack<Integer>[] post = new ArrayStack[3];
	private int numMoves = 0;
	
	public TowerOfHanoi(int numDiscs) {

                post[0] = new ArrayStack();
                post[1] = new ArrayStack();
                post[2] = new ArrayStack();
                
                for (int i = numDiscs; i > 0; i--) {
                    post[0].push(i);
                }
                
	}
	
	public void moveDisc(int from, int to) throws Exception {

                if (from > 2 || from < 0 || to > 2 || to < 0 || 
                        post[from].getSize() == 0) {
                    throw new Exception("Error!");
                }
                int x = post[from].pop(), y = post[to].pop();
                post[from].push(x);
                post[to].push(y);
                if (x > y) {
                    throw new Exception("Error!");
                }
                post[to].push(post[from].pop());
		numMoves++;
	}
	
	public boolean isFinished() {

                if (post[0].getSize() == 0 && post[1].getSize() == 0) {
                    return true;
                }
		return false;
	}
	
	public int getNumMoves() {
		return numMoves;
	}
	
	public String toString() {
		String s = "";
                Stack<Integer> st = new ArrayStack();
//                int size0 = post[0].getSize(), size1 = post[1].getSize(),
//                        size2 = post[2].getSize();
                for (int j = 0; j < 3; j++) {
                    int size = post[j].getSize();
                    s += "Post " + j + ": ";
                    for (int i = 0; i < size; i++) {
                        try {
                            int x = post[i].pop();
                            st.push(x);
                            s += x + " ";
                        } catch (Exception ex) {
                            System.out.println(ex.getMessage());
                        }
                    }
                    while (st.getSize() != 0) {
                        try {
                            post[j].push(st.pop());
                        } catch (Exception ex) {
                            System.out.println(ex.getMessage());
                        }
                    }
                    s += "\n";
                }
		return s;
	}
	
}
