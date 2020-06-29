/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ProblemSolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

/**
 *
 * @author sarthak sethi
 */
public class CutTheSticks {
    public static void main(String[] args) {
        
    }
    static int[] cutTheSticks(int[] arr) {
        Arrays.sort(arr);
        int[] ans = new int[arr.length];
        int k=0;
        while(arr[arr.length-1]!=0){
      
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                arr[j]-=arr[i];
            }
        }
            }
        return arr;
    }
}
