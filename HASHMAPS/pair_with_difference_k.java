/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package HASHMAPS;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author sarthak sethi
 */
public class pair_with_difference_k {
    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int input[] = new int[n];
		for(int i = 0; i < n; i++) {
			input[i] = s.nextInt();
		}
		int k = s.nextInt();
		findPairsDifferenceK(input, k);
	}

    public static void findPairsDifferenceK(int[] input, int k) {
       HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<input.length;i++)
        {
            if(!map.containsKey(input[i]))
            {
                map.put(input[i],1);
            }
            else
            {
                int oldfreq=map.get(input[i]);
                map.put(input[i],oldfreq+1);
            }
        }
        for(int i=0;i<input.length;i++)
        {
            int temp=input[i]-k;
            if(map.containsKey(temp))
            {
                int freq1=map.get(input[i]);
                int freq2=map.get(temp);
                if(temp<input[i])
                {
                    for(int j=0;j<freq1*freq2;j++)
                    {
                        System.out.print(temp+" ");
                        System.out.println(input[i]);
                        map.put(input[i],0);
                        map.put(temp,0);
                    }
                }
//                else
//                {
//                    for(int j=0;j<freq1*freq2;j++)
//                    {
//
//                        System.out.print(input[i]+" ");
//                        System.out.println(temp);
//                        map.put(input[i],0);
//                        map.put(temp,0);
//                    }
//                }
            }

        }}
    
}
