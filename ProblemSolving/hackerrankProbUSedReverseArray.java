/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ProblemSolving;

/**
 *
 * @author sarthak sethi
 */
public class hackerrankProbUSedReverseArray {
      public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        reverse(arr);
        //System.out.println(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void reverse(int[] input) { 
        int last = input.length - 1;
     int middle = input.length / 2;
     for (int i = 0; i <= middle; i++) 
     { int temp = input[i]; 
     input[i] = input[last - i]; 
     input[last - i] = temp; 
    } 
}
}
