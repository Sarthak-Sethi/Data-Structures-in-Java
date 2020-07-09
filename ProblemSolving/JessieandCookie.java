/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ProblemSolving;

import java.util.*;

/**
 *
 * @author sarthak sethi
 */
public class JessieandCookie {
    public static void main(String[] args) {
        int[] a = {13 ,47, 74, 12, 89, 74, 18, 38};
        System.out.println(cookies(90, a));
    }
     static int cookies(int k, int[] A) {
         int count = 0;
        TreeSet<Integer> hs = new TreeSet<>();
        for(int i=0;i<A.length;i++){
            hs.add(A[i]);
        }
      //   System.out.println(hs);
         System.out.println(hs.first());
       while(hs.first()<k){
           count++;
        
           int fmin = hs.pollFirst();   System.out.println("1 "+fmin);
           int smin = hs.pollFirst();    System.out.println("2 "+smin);
            int newcookie = fmin+(2*smin);
            System.out.println("new cookie "+newcookie);
            hs.add(newcookie);
            System.out.println(hs);
            
       }
         return count;
    }

}
