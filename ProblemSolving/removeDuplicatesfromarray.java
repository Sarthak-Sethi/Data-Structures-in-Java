/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ProblemSolving;

import java.util.Arrays;

/**
 *
 * @author sarthak sethi
 */
public class removeDuplicatesfromarray {
    public void removeduplicate(int[] input){
        Arrays.sort(input);
        for(int i=0;i<input.length-1;i++){
            if(input[i]!= input[i+1])
                System.out.println(input[i]);
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,5,4,5,5,5,5,4,4,6,7,5,2};
        removeDuplicatesfromarray s = new removeDuplicatesfromarray();
        s.removeduplicate(arr);
    }
}
