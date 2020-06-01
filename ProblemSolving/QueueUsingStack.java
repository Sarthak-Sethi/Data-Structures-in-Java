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
public class QueueUsingStack {
     public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Stack<Integer> enq = new Stack<>();
          Stack<Integer> deq = new Stack<>();
        int q = s.nextInt();
        for(int i=0;i<q;i++){
            int n = s.nextInt();
            if(n==1){
                int element = s.nextInt();
                enq.push(element);
            }
            if(n==2){
                if(deq.isEmpty()){
                    System.out.println("size is "+enq.size());
                    while(!enq.isEmpty()){
                        System.out.println(enq.peek()+" is added to deq");
                        deq.push(enq.pop());
                    }
                    System.out.println(enq);
                }
                deq.pop();
            }
            if(n==3){
                if(deq.isEmpty()){
                   while(!enq.isEmpty()){
                        System.out.println(enq.peek()+" is added to deq");
                        deq.push(enq.pop());
                    }
                }
               System.out.println(deq.peek());
            }
        }
    }
}
