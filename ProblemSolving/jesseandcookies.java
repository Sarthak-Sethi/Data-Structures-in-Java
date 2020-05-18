/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ProblemSolving;

import java.util.PriorityQueue;

/**
 *
 * @author sarthak sethi
 */
public class jesseandcookies {
    static int count =0;
    public static void main(String[] args) {
        int[] a = {1,1,1};
        int k= 10;
        System.out.println(cookies(k, a));
    }
      static int cookies(int k, int[] a) {
       PriorityQueue<Integer> heap = new PriorityQueue<>();
       for(int i=0;i<a.length;i++)
           heap.add(a[i]);
       if(heap.peek()>=k)
           return 0;
       else{
           System.out.println("peak element is"+heap.peek());
           try{
       while(heap.peek()<k){
           count++;
       int fmin =heap.poll();
       int smin = heap.poll();
       int newcookie = fmin+(2*smin);
       System.out.println("eq formed "+fmin+"+2*"+smin+" = "+newcookie);
       heap.add(newcookie);
       }
       }
           catch(NullPointerException ne){
               return -1;
           }
       }
       return count;
    }
    
}
