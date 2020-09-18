/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ProblemSolving;

import java.util.Scanner;
import java.util.Stack;

/*
 * author sarthak sethi
 */
public class MaximumElement {
  public static Stack<Integer> maxValues = new Stack<>();
    public static Stack<Integer> s2 = new Stack<>();
	    
	    public static Integer max(){
	        if (maxValues.isEmpty()){
	            return Integer.MIN_VALUE;
	        }
	        else{
	            return maxValues.peek();
	         }
	    }
	    
	    public static void push(int d){
	        
	        if(d>=max()){
	            maxValues.push(d);
	        }
	        s2.push(d);
	    }
	    
	    public static void pop(){
	        int value = s2.pop();
	        if(value == max()){
	            maxValues.pop();
	        }
	    }
	    
	    public static void main(String[] args)  {
	     Scanner s = new Scanner(System.in);
             int n = s.nextInt();
	        for(int i=0;i<n;i++){
	            int no = s.nextInt();
                    
	            if(no == 1){
	            	int num = s.nextInt();
	                push(num);
	            }
	            else if(no == 2){
	                pop();
	            }
	            else if(no ==3){
	            	System.out.println(max());
                    }
	        }  
	    }
}
