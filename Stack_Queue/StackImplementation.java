/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack_Queue;

import java.util.Stack;

/**
 *
 * @author sarthak sethi
 */
public class StackImplementation {
    
    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
      
        for(int i=0;i<5;i++)
            stack1.push(i);
        System.out.println(stack1);
        for(int i=0;i<10*stack1.size();i++)
            stack2.push(stack1.pop());
        
        System.out.println(stack2);
    }}