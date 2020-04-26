/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ProblemSolving;

import java.io.*;
import java.util.*;

public class BunchOfMango {
static boolean []ispossible = new boolean[1000]; 
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = s.nextInt();
        }
        System.out.println(maxmangosold(n,a));
    }
    public static int maxmangosold(int n,int[] a){
        int totalmango =0;
        for(int i=0;i<n;i++){
            totalmango += a[i];    
        }
        if(totalmango%3==0)
            return totalmango;
        else{
             Arrays.sort(a);
            // for(int i=0;i<n;i++){
            //     //int temp = 
            // if((totalmango-a[i])%3==0)
            //     return totalmango-a[i];
            // } 
            int k=0;
            while(totalmango>a[0]){
            int multiple = closestMultiple(totalmango);
               
            check(a,totalmango-multiple);
            if (ispossible[totalmango-multiple]) {
                return multiple;
               // break;
            }
            else{
             totalmango = totalmango - a[k];
                k++;
            }
            }
    }
        return a[0];
    }
    static int closestMultiple(int n) 
    { 
        if(3>n) 
        return 3; 
        n = n - (n%3); 
        return n; 
    } 
static void check(int[] arr, int N) 
{   
    ispossible[0] = true; 
    Arrays.sort(arr); 

    for (int i = 0; i < N; ++i) { 
        int val = arr[i]; 

        // if it is already possible 
        if (ispossible[val] == true) 
            continue; 

        // make 1 to all it's next elements 
        for (int j = 0; j + val < 1000; ++j) 
            if (ispossible[j]) 
                ispossible[j + val] = true; 
    } 
}
 
}