/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package HASHMAPS;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author sarthak sethi
 */
class returntwo{
    int maxlen;
    int curr;
}
public class Longest_consecutive_Sequence {
    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		int arr[] = new int[n];

		for(int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}

		ArrayList<Integer> ans = longestConsecutiveIncreasingSequence(arr);
		for(int num: ans) {
			System.out.println(num);
		}
	}

    public static ArrayList<Integer> longestConsecutiveIncreasingSequence(int[] arr) 
    {
          ArrayList<Integer> ans = new ArrayList<>();
          returntwo fans = help(arr);
          for(int i=0;i<fans.maxlen;i++)
          {
              ans.add(fans.curr+i);
          }
        return ans;  
    }
    private  static  returntwo help(int[] arr)
    {
        HashMap<Integer,Boolean> map = new HashMap<>();
        returntwo ans = new returntwo();
        for(int i=0;i<arr.length;i++)
         map.put(arr[i],true);   
        
      for(int i=0;i<arr.length;i++)
      {
          if(!map.containsKey(arr[i]-1))
          {
              int curr = arr[i];
              while(map.containsKey(curr))
                  curr++;
              if(ans.maxlen<curr-arr[i])
              {
                  ans.maxlen=curr-arr[i]; 
                  ans.curr = arr[i];
              }  
          }
      }
      return ans;
    }
   
    
}
