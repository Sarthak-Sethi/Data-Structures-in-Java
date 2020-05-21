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
public class Larrys_Array {
    public static void main(String[] args) {
        int[] a = {1,6,5,2,4,3};
        System.out.println(larrysArray(a));
    }
    static String larrysArray(int[] a) { 
     //   int inversion[] = new int[a.length];
        int inversion = 0;
            if(a.length<=2){
                if(a.length<=1)
                    return "YES";
                else{
                    if(a[1]<a[0])
                        return "NO";
                }
            } // after this main code
            else
            {
               
                for (int i = 0; i < a.length; i++) {
                    for (int j = i+1; j < a.length; j++) {
                      if(a[j]<a[i]){
                        inversion++;
                    }
                }
                 //   System.out.println("inversion for "+a[i]+" "+inversion[i]);
            }
            }  
            if(inversion%2==0)
                return "YES";
            else
                return "NO";
    }
    static int min(int[] a){
        Arrays.sort(a);
        return a[0];
    }
    
}
