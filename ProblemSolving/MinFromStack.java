/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ProblemSolving.GFG;

import java.util.Stack;

/**
 *
 * @author sarthak sethi
 */
class GfG{
    Stack<Integer> min;
	public void push(int a,Stack<Integer> s)
	{
	    if(s.isEmpty()){
	        s.push(a);
	       min.push(a);
	    } 
	    else { 
	        if(a<min.peek()){
	        min.push(a);
	    }
	    s.push(a);
	    }
	   
	}
	public int pop(Stack<Integer> s)
        {
            int popped = s.pop();
            if(popped == min.peek()){
            min.pop();    
            }
            return popped;
	}
	public int min(Stack<Integer> s)
        {
         return min.peek();
	}
	public boolean isFull(Stack<Integer>s, int n)
        {
            return s.size() == n;
           
	}
	public boolean isEmpty(Stack<Integer>s)
        {
          return s.isEmpty();
	}
}