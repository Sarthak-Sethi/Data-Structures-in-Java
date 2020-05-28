/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author sarthak sethi
 */
public class Balanced_Parenthesis {
    public static boolean checkBalanced(String s) {
		// Write your code here

        Stack<Character> stack = new Stack<>();
        boolean ans = true;
        int i =0;
        while(i<s.length())
        {
        if(s.charAt(i) == '{' ||s.charAt(i) == '(' ||s.charAt(i) == '[')
        {
            stack.push(s.charAt(i));
            i++;
        }
        else if(s.charAt(i) == '}')
        {    if(stack.size()==0) {
            ans = false;break; }
            if(stack.peek() == '{') {
                stack.pop();
                i++;
            }
            else
            {   ans = false;
                break;
            }
        }
        else if(s.charAt(i)==')')
        {   if(stack.size()==0) {
            ans = false;break; }
            if(stack.peek() == '(') 
        {
                stack.pop(); 
                i++;
        }
        
                else
                {
                ans = false;
             break;
                }
           
        }
        else if(s.charAt(i)==']')
        {    if(stack.size()==0) {
            ans = false;break; }
           if(stack.peek() == '[') {
                stack.pop();
                i++;
           }
                else
                {
                ans = false;
             break;
                } 
        }
        else
            i++;

    }
        if(!stack.isEmpty())
           ans = false;
        return ans;
	}
    public static void main(String[] args) {
                Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(Balanced_Parenthesis.checkBalanced(input));
	}
    
}
