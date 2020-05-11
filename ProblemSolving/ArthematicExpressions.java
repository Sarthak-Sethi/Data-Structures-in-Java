/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ProblemSolving;

/**
 *
 * @author sarthak sethi
 * NOT YET WORKING
 */
public class ArthematicExpressions {
    public static void main(String[] args) {
        int[] arr = {22 ,79, 21};
            System.out.println(arithmeticExpressions(arr,0,arr.length-1));
    }
     static int arithmeticExpressions(int[] arr,int si,int ei) {
         String[] ans = new String[arr.length];
         if(si>=ei)
            return arr[si];
          if(arr[si]+arithmeticExpressions(arr, si+1, ei)%101==0)
              ans[si] = "+";
          else if(arr[si]-arithmeticExpressions(arr, si+1, ei)%101==0)
               ans[si] = "-";
          else if(arr[si]*arithmeticExpressions(arr, si+1, ei)%101==0)
               ans[si] = "*";
          
         return  
    }

    
}
