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
public class Matrix {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] input = new int[n];
        for(int i=0;i<n;i++){
           input[i] = s.nextInt(); 
        }
        convert(n,input);
    }
    static void convert(int n, int[] arr){
        int k=0;
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<n;i++)
            s.push(arr[i]);
        int[][] ans = new int[n][n];       
        for(int i=0;i<n;i++){
            ans[0][i] = arr[k];  
            k++;
        }
        for(int i=1;i<n;i++){
                ans[i][0]= s.pop();
                int j=0;
                while(j!=n-1){
                    ans[i][j+1] = ans[i-1][j];
                    j++;
                } 
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(ans[i][j]+" "); 
            }
            System.out.println();
        }
    }   
}
