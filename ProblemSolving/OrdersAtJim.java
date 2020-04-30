/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ProblemSolving;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author sarthak sethi
 */
public class OrdersAtJim {
    static int[] jimOrders(int[][] arr) {
         int n = arr.length;      
           ArrayList<Integer> sum = new ArrayList<>();
           int[] ans = new int[n];
        for(int i=0;i<n;i++){
            sum.add(arr[i][0]+arr[i][1]);
        }
       System.out.println(sum);
        for(int i=0;i<n;i++){
            ans[i] = sum.indexOf(java.util.Collections.min(sum))+1;
          //  sum.remove(sum.indexOf(Collections.min(sum)));
            //sum.add(sum.indexOf(Collections.min(sum)),Integer.MAX_VALUE);
            sum.set(sum.indexOf(java.util.Collections.min(sum)), Integer.MAX_VALUE);
            System.out.println(sum);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[][] arr = new int[5][2];
      for(int i=0;i<arr.length;i++){
          arr[i][0] = s.nextInt();
          arr[i][1] = s.nextInt();
      }
        int[] ans = jimOrders(arr);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
    
}
