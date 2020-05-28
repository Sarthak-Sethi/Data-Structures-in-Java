/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ProblemSolving;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author sarthak sethi
 */
public class MaximumElement {
    public static void main(String[] args) {
    Stack<Integer> stack = new Stack<>();
    int n;
    Scanner s = new Scanner(System.in);
    n = s.nextInt();
    
    for(int i=0;i<n;i++){
        int no;
        no = s.nextInt();
        switch(no){
            case 1 :
            int input;
            input = s.nextInt();
            stack.push(input);
                break;
            case 2:
            stack.pop();
                break;
            case 3:
            if(stack.size()==1) {
            System.out.println(stack.pop());
            break;
            }
            else{
                int max=0;
            while(stack.size()>=2){
                max = stack.pop();
                if(stack.peek()>max){
                   max = stack.pop(); 
                }
            }
            System.out.println(max);
             break;
            }
        }
    }
    }
}
