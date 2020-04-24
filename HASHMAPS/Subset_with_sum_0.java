/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package HASHMAPS;

import Lecture2.sumofdigits;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author sarthak sethi
 */
public class Subset_with_sum_0 {
    public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<>();

		int size = scan.nextInt();
		for(int i = 0; i < size; i++)
			arr.add(scan.nextInt());

		System.out.println(lengthOfLongestSubsetWithZeroSum(arr));
		scan.close();
	}
    public static int lengthOfLongestSubsetWithZeroSum(ArrayList<Integer> arr) 
   	{
            HashMap<Integer,Integer> map  = new HashMap<>();
            int sum = 0;
            int ans =0,len=0;
        if(arr.size()<=1)
            return 1;
            for(int i=0;i<arr.size();i++)
            {
                 sum =arr.get(i)+sum;
                //System.out.println(sum);
                 if(map.containsKey(sum))
                 {
                     len = i-map.get(sum);
                     if(len>ans){
                         ans= len;
                     }
                 }
                 else
                 {map.put(sum, i);}   
            }
            return ans;
        }
        }
		

