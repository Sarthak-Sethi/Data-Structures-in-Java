/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ProblemSolving;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author sarthak sethi
 */
public class BreakInteger { 
    final static int MAX_CHAR = 256;
    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int input = s.nextInt();
			System.out.println(help(input));
	}
	public static int help(int no){
            String s = String.valueOf(no);
            if(uniqueCharacters(s) && check(no))
            {
	        return no;
	    }
	    else
	    return help(no-1);
	}
    public static boolean check(int temp) {
        int k=0;
        String s = String.valueOf(temp);
        int digit;
        int a[] = new int[s.length()];
        while(temp > 0)
        {
            digit = temp % 10;
           a[k] = digit;
           k++;
            temp = temp / 10;   
        }   
        
        return arraySortedOrNot(a, a.length);
    }

   
   static  boolean uniqueCharacters(String str) 
    { 
        if (str.length() > MAX_CHAR) 
            return false; 
        boolean[] chars = new boolean[MAX_CHAR]; 
        Arrays.fill(chars, false); 
        for (int i = 0; i < str.length(); i++) { 
            int index = (int)str.charAt(i); 
            if (chars[index] == true) 
                return false; 
            chars[index] = true; 
        } 
        return true; 
    } 
    static boolean arraySortedOrNot(int arr[], int n) 
    { 
        if (n == 0 || n == 1) 
            return true; 
         for (int i = 1; i < n; i++) 
            if (arr[i - 1] < arr[i]) 
                return false; 
        return true; 
    }
    
    
}
